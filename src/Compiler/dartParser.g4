parser grammar dartParser;

options { tokenVocab=dartLexer; }
prog : (file_syntax | function  )+ EOF
;

file_syntax:  declear_var ;
//declear_var:  TYPE? Q_MARK?  VAR_NAME  (EQUAL  val )?( COLON  VAR_NAME  (EQUAL  val )?)*SIMICOLON;



//تم التعديل
string_val:  STRING_OPEN STRING_VAL? STRING_CLOSE ;

emit:EMIT OPEN_HEAD VAR_NAME OPEN_HEAD CLOSE_HEAD CLOSE_HEAD SIMICOLON;

declear_var:  TYPE? Q_MARK? VAR_NAME  ((EQUAL  val )?( COLON  declear_vars )*SIMICOLON) |(emit);

declear_vars:VAR_NAME  (EQUAL  val )?;


object_value:VAR_NAME (DOT GET OPEN_HEAD CONTEXT CLOSE_HEAD DOT VAR_NAME)?(OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR)?;

val: string_val |NUM_VAL |BOOL_VAL|VAR_NAME|object_value;

ifdart:
(VAR_NAME DOT GET OPEN_HEAD CONTEXT CLOSE_HEAD DOT VAR_NAME|
 VAR_NAME) EQUAL EQUAL string_val Q_MARK widget D_DOT widget
;

arguments: OPEN_HEAD  TYPE?  (VAR_NAME|INDEX)?  ( arguments1)*CLOSE_HEAD ;
arguments1:COLON TYPE  VAR_NAME ;
block:OPEN_BODY  declear_var*  CLOSE_BODY;

function:(TYPE|VOID)  VAR_NAME   arguments*   block;
// NEW RULE ======
object_cubit:STATIC VAR_NAME GET OPEN_HEAD CONTEXT CLOSE_HEAD Return BLOC_PROVIDER DOT OF OPEN_HEAD CONTEXT CLOSE_HEAD SIMICOLON;
class_definition:CLASS VAR_NAME EXTENDS VAR_NAME (BIGER VAR_NAME SMALLER)?;
constructor: VAR_NAME OPEN_HEAD(constructor1)? CLOSE_HEAD (D_DOT SUPER OPEN_HEAD VAR_NAME OPEN_HEAD CLOSE_HEAD CLOSE_HEAD SIMICOLON|
OPEN_BODY THIS DOT VAR_NAME EQUAL VAR_NAME (constructor2)* SIMICOLON CLOSE_BODY
);
constructor1:OPEN_BODY VAR_NAME (COLON VAR_NAME)* CLOSE_BODY;
constructor2:SIMICOLON THIS DOT VAR_NAME EQUAL VAR_NAME;
class1:ABSTRACT CLASS VAR_NAME OPEN_BODY CLOSE_BODY;
class2: imporT* class1? (class3)* ;
class3:class_definition OPEN_BODY (constructor? object_cubit (class4)* )? CLOSE_BODY;
class4:(declear_var | function | list);
bloc_provider:BLOC_PROVIDER OPEN_HEAD CREATE D_DOT OPEN_HEAD CONTEXT CLOSE_HEAD Return VAR_NAME OPEN_HEAD CLOSE_HEAD COLON child CLOSE_HEAD;
bloc_consumer:BLOC_CONSUMER BIGER VAR_NAME COLON VAR_NAME SMALLER OPEN_HEAD listner COLON builder CLOSE_HEAD ;
listner: LISTNER D_DOT OPEN_HEAD CONTEXT COLON STATE1 CLOSE_HEAD OPEN_BODY CLOSE_BODY;
builder:BUILDER D_DOT OPEN_HEAD CONTEXT COLON STATE1 CLOSE_HEAD OPEN_BODY RETURN widget SIMICOLON CLOSE_BODY;
material_page_route:MATERIAL_PAGE_ROUTE OPEN_HEAD BUILDER D_DOT OPEN_HEAD CONTEXT CLOSE_HEAD Return VAR_NAME OPEN_HEAD (VAR_NAME D_DOT VAR_NAME (COLON VAR_NAME D_DOT VAR_NAME)*)? CLOSE_HEAD CLOSE_HEAD;
navigator:NAVIGATOR DOT PUSH OPEN_HEAD CONTEXT COLON material_page_route CLOSE_HEAD;
on_long_press:ON_LONG_PRESS D_DOT OPEN_HEAD CLOSE_HEAD OPEN_BODY declear_var* (navigator SIMICOLON)? CLOSE_BODY;
tool_bar_height:TOOL_BAR_HEIGHT D_DOT NUM_VAL;
flexible_space:FLEXIBLE_SPACE D_DOT widget;
spacer:SPACER OPEN_HEAD CLOSE_HEAD;
//==========



for:
FOR OPEN_HEAD TYPE VAR_NAME EQUAL val SIMICOLON
VAR_NAME OPERATION  val SIMICOLON VAR_NAME OPERATION CLOSE_HEAD
OPEN_BODY declear_var? CLOSE_BODY;




//FLUTTER BUILDER PROJECT//

flutter : imporT* main (classs)* (list)*;

//import//
imporT:IMPORT  string_val SIMICOLON;
/////////////////////////////

// MAIN FUNCTION //
main:VOID MAIN OPEN_HEAD CLOSE_HEAD OPEN_BODY runapp CLOSE_BODY ;
runapp:RUNAPP OPEN_HEAD VAR_NAME OPEN_HEAD CLOSE_HEAD CLOSE_HEAD SIMICOLON;
///////////////////////////

// CLASSES //
//تم التعديل
classs:imporT * (class_less|class_full);
//====
class_less:CLASS  VAR_NAME  EXTENDS  LESS OPEN_BODY class4* constructor? OVERRIDE build CLOSE_BODY;
class_full:class_full1 class_full2 ;
class_full1:
CLASS  VAR_NAME  EXTENDS  FULL OPEN_BODY const? OVERRIDE state CLOSE_BODY ;

const:CONST VAR_NAME OPEN_HEAD OPEN_BODY KEY Q_MARK KEY CLOSE_BODY CLOSE_HEAD
      D_DOT SUPER OPEN_HEAD KEY D_DOT KEY CLOSE_HEAD SIMICOLON;

state:STATE  BIGER VAR_NAME SMALLER CREATSTATE OPEN_HEAD CLOSE_HEAD Return VAR_NAME OPEN_HEAD CLOSE_HEAD SIMICOLON
;

class_full2:CLASS  VAR_NAME  EXTENDS STATE  BIGER VAR_NAME SMALLER OPEN_BODY declear_var*
 OVERRIDE initstate OVERRIDE build CLOSE_BODY;


initstate:
VOID INITSTATE OPEN_HEAD CLOSE_HEAD OPEN_BODY SUPER DOT INITSTATE OPEN_HEAD CLOSE_HEAD SIMICOLON CLOSE_BODY ;
build:WIDGET BUILD  OPEN_HEAD BUILDCONTEXT CONTEXT CLOSE_HEAD OPEN_BODY RETURN widget SIMICOLON CLOSE_BODY;
//////////////////////////////////////////////////////////////////////////

// WIDGETS//

widget: text|image|column|row|scaffold|materialapp|container|listview|expanded|gestureDetector|padding|sizedbox|bloc_consumer|bloc_provider|material_page_route|spacer;


child:CHILD D_DOT widget;

//MaterialApp Declerationa and components//
materialapp:MATERIALAPP OPEN_HEAD (title COLON)? (theme COLON)? (debugshowmode COLON)? home CLOSE_HEAD;
home:HOME D_DOT VAR_NAME OPEN_HEAD CLOSE_HEAD ;
title:TITLE D_DOT string_val;
theme:THEME D_DOT ThemeData OPEN_HEAD PrimarySwatch D_DOT colors COLON  CLOSE_HEAD ;
debugshowmode:DEBUGSHOWMODE D_DOT BOOL_VAL ;
////////////////////////////////////////////

column:COLUMN  OPEN_HEAD (MAINAXIS MAINAXIS1 DOT CENTER COLON|  CROSS_AXIS_ALIGNMENT_1 D_DOT CROSS_AXIS_ALIGNMENT_2 DOT START COLON)? children  CLOSE_HEAD;

row:ROW OPEN_HEAD children CLOSE_HEAD;
children:CHIS D_DOT  OPEN_PR ((ifdart(COLON widget COLON ifdart)*)?|( widget  (COLON widget)*)?)CLOSE_PR;
//تم التعديل
text:TEXT OPEN_HEAD
(
(string_val|
 (VAR_NAME DOT GET OPEN_HEAD CONTEXT CLOSE_HEAD DOT )? VAR_NAME EXCLAMATION? (OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR)?)(COLON style)?
)  CLOSE_HEAD ;
style: STYLE D_DOT TEXT_STYLE OPEN_HEAD FONT_WEIGHT D_DOT FONT_WEIGHT1 DOT W600 COLON FONT_SIZE D_DOT NUM_VAL CLOSE_HEAD;
//=====
//تم التعديل
image:IMAGE ASSET   OPEN_HEAD  (
 string_val|
 ( OPEN_HEAD VAR_NAME CLOSE_HEAD |
 VAR_NAME OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR|
 image2) |
 VAR_NAME DOT GET OPEN_HEAD CONTEXT CLOSE_HEAD DOT VAR_NAME( OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR)?
 )
 (image1)? CLOSE_HEAD;
 image1:COLON FIT BOXFIT DOT ( FILL|COVER);
 image2:VAR_NAME EXCLAMATION?;
 //========
////////////////////////////////////////////////////////////
//SCAFFOLD//
scaffold:SCAFFOLD OPEN_HEAD (appbar  COLON) ?  body  CLOSE_HEAD;
//تم التعديل
appbar:APPBAR2 D_DOT APPBAR OPEN_HEAD (BACK  D_DOT colors|tool_bar_height COLON flexible_space)? CLOSE_HEAD;
body:BODY D_DOT widget ;
//========
/////////////////////////////////
padding1:
PADDING1 EDGE ALL OPEN_HEAD NUM_VAL CLOSE_HEAD;
padding:PADDING OPEN_HEAD  padding1  (COLON child)? CLOSE_HEAD;
expanded:EXPANDED OPEN_HEAD child  CLOSE_HEAD;
sizedbox: SIZEDBOX OPEN_HEAD (( (hieght COLON)? (width?)) |((width COLON)? (hieght?)) )? CLOSE_HEAD ;
hieght: HEIGHT D_DOT NUM_VAL;
width: WIDTH D_DOT (NUM_VAL |DOUBLE DOT INFINITY);


//LISTVIEW DECLERATION AND COMPONENET//
listview:LISTVIEW DOT SEPARATED OPEN_HEAD
(itb widget COLON sb  widget COLON ic )
CLOSE_HEAD ;

itb:ItemBuilder D_DOT OPEN_HEAD CONTEXT COLON INDEX CLOSE_HEAD Return;
sb:SeparatorBuilder D_DOT OPEN_HEAD CONTEXT COLON INDEX CLOSE_HEAD Return;
// تم التعديل
ic:ItemCount D_DOT NUM_VAL|ItemCount D_DOT VAR_NAME DOT VAR_NAME|ItemCount D_DOT VAR_NAME DOT GET OPEN_HEAD CONTEXT CLOSE_HEAD DOT VAR_NAME DOT VAR_NAME;
//===

//CONTAINAR DECLERATION AND COMPONENT//

container:
CONTAINER OPEN_HEAD (padding1 COLON )? (width COLON )? (child )? COLON? decoration? CLOSE_HEAD;

//container:
//CONTAINER OPEN_HEAD (padding1 COLON )? (  (child) ?| hieght ?|width? |decoration?
//(child COLON hieght COLON width COLON decoration )?|
//(child COLON  decoration )?
//| (child COLON hieght COLON width  )?
//|(hieght COLON width COLON decoration )?|
//(  hieght COLON decoration )?|
//( width COLON decoration )?|
//(  hieght COLON width )?|
//(   width  COLON hieght  )|
//child?
//) CLOSE_HEAD;


bord_rad:BORDERRADIUS D_DOT BORDER2 DOT CIRCULAR OPEN_HEAD NUM_VAL CLOSE_HEAD
;

///////////////////////////////////////////////////////////////////////



color :COLOR D_DOT colors;
colors:COLORS DOT COL;

decoration: DECORATION D_DOT BD OPEN_HEAD WS*  (color| (color  COLON bord_rad)|bord_rad ) ?WS* CLOSE_HEAD;









//LIST//
list:LIST VAR_NAME EQUAL OPEN_PR object ( COLON object)* CLOSE_PR SIMICOLON;
object:OPEN_BODY varible (COLON varible)* CLOSE_BODY;
varible:string_val D_DOT string_val;


//ON_TAP//
gestureDetector:GestureDetector OPEN_HEAD on_long_press COLON  ontap COLON child    CLOSE_HEAD   ;
//تم التعديل
ontap:ONTAP D_DOT OPEN_HEAD CLOSE_HEAD OPEN_BODY VAR_NAME DOT GET OPEN_HEAD CONTEXT CLOSE_HEAD DOT VAR_NAME OPEN_HEAD INDEX CLOSE_HEAD SIMICOLON CLOSE_BODY   ;




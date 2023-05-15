lexer grammar dartLexer;


//kewywords for dart  && operations && pracets

INITSTATE:
'initState';
TITLE:
'title'
;
THEME:
'theme'
;
DEBUGSHOWMODE:
'debugShowCheckedModeBanner';
ThemeData:
'ThemeData';
PrimarySwatch:
'primarySwatch'
;
BIGER:'<';

SMALLER:'>';

//TODO: changes to parser
//TODO: sorting
OPERATION: BIGER|SMALLER|'+'|'-'|'*'|'%'|'/'|'<='|'>='|'++'|'--'|'$';

SCAFFOLD:'Scaffold';
Q_MARK:'?';
STATE:'State';

CREATSTATE:'createState';


KEY:'key';

FULL:'StatefulWidget ';

LESS :'StatelessWidget';

FOREACH:'forEach';

FOR    :    'for'    ;

TEXT:'Text';

CHIS:'children';

OPEN_PR:'[';

CLOSE_PR:']';

COLUMN:'Column';

ROW:'Row';

FIT:
'fit:';
BOXFIT:'BoxFit';
FILL:
'fill';

WS    : (' '|'\t'|'\r' | '\n')->skip;

//----

EMIT:'emit';

BLOC_PROVIDER:'BlocProvider';

BLOC_CONSUMER:'BlocConsumer';

LISTNER:'listener';

BUILDER:'builder';

CREATE:'create';

STATE1:'state';

NAVIGATOR:'Navigator';

PUSH:'push';

MATERIAL_PAGE_ROUTE:'MaterialPageRoute';

ON_LONG_PRESS:'onLongPress';

EXCLAMATION:'!';

TOOL_BAR_HEIGHT:'toolbarHeight';

FLEXIBLE_SPACE:'flexibleSpace';

DOUBLE:'double';

INFINITY:'infinity';

COVER:'cover';

CROSS_AXIS_ALIGNMENT_1:'crossAxisAlignment';

CROSS_AXIS_ALIGNMENT_2:'CrossAxisAlignment';

START:'start';

SPACER:'Spacer';

FONT_SIZE:'fontSize';

FONT_WEIGHT:'fontWeight';

FONT_WEIGHT1:'FontWeight';

W600:'w600';

STYLE:'style';

TEXT_STYLE:'TextStyle';





//-------

ASSET:'asset';

IMAGE:'Image''.';

APPBAR2:'appBar';

APPBAR:'AppBar';

BACK:'backgroundColor';

MAIN:'main';

BODY:'body';

RUNAPP:'runApp';

LIST:'List';

BUILD:'build';

OVERRIDE:'@override';

SETSTATE:'setState';

ONTAP:'onTap';

GestureDetector:'GestureDetector';

WIDGET:'Widget';

BUILDCONTEXT:'BuildContext';

PADDING:'Padding';

PADDING1:'padding:';

EDGE:'EdgeInsets.';

ALL:'all';


VOID  :    'void';

TYPE
    : 'int'
    | 'String'
    | 'bool'
    ;


HEIGHT:'height';

WIDTH:'width';

BOOL_VAL:'true'|'false';

SIZEDBOX :'SizedBox';

CONTAINER:'Container';

CHILD:'child';

COLORS:'Colors' ;

COL:'red'|'blue'|'black'|'white'|'amber'|'transperant'|'teal'|'green';

COLOR:'color' ;

D_DOT:':';

DOT:'.';

BORDER2:'BorderRadius';

EXPANDED:'Expanded';

CIRCULAR:'circular';

BORDERRADIUS:'borderRadius';

DECORATION:'decoration' ;

BD:'BoxDecoration';

LISTVIEW:'ListView';

SEPARATED:'separated';

ItemBuilder:'itemBuilder';

SeparatorBuilder:'separatorBuilder';

ItemCount:'itemCount';

Return:'=>';
MAINAXIS:
'mainAxisAlignment:'
;
MAINAXIS1:'MainAxisAlignment';

CENTER:
'center';

CONTEXT:'context';

INDEX:'index';

EQUAL: '='    ;

NUM_VAL: [0-9]+    | [0-9]* '.' [0-9]+    ;

SIMICOLON    : ';';

COLON: ','   ;

OPEN_HEAD:'(';

CLOSE_HEAD:')' ;

OPEN_BODY:'{';

CLOSE_BODY:'}';

FINAL:'final'   ;

CONST:    'const';

VAR:    'var' ;


ASYNC:    'async'    ;

THIS:    'this';

ABSTRACT:    'abstract';

AS:    'as';

SYNC:    'sync';

CLASS:    'class'    ;

WITH:    'with'    ;

STATIC:    'static'    ;

DYNAMIC:    'dynamic'    ;

EXTERNAL:    'external'    ;

GET:    'get';

SET:    'set';

OPERATOR:    'operator';

SUPER:    'super';

FACTORY:    'factory';

EXTENDS:    'extends';

IMPLEMENTS:    'implements';

ENUM:    'enum';

NULL:    'null';

THROW:    'throw';

NEW:    'new';

AWAIT:    'await';

DEFERRED:    'deferred';

EXPORT:    'export';

IMPORT:    'import';

LIBRARY:    'library'    ;

PART:    'part';

TYPEDEF:    'typedef';

IS:    'is';

IF:    'if';

ELSE:    'else';

WHILE:    'while';

IN:    'in';

DO:    'do';

SWITCH:    'switch';

CASE:    'case';

DEFAULT:    'default';

RETHROW:    'rethrow';

TRY:    'try';

ON:    'on';

CATCH:    'catch';

FINALLY:    'finally';

RETURN:    'return';

BREAK:    'break';

CONTINUE:    'continue';

YIELD:    'yield';

SHOW:    'show';

HIDE:    'hide';

OF:    'of'    ;

ASSERT:    'assert';

MATERIALAPP:'MaterialApp';

HOME: 'home';

VAR_NAME: [a-zA-Z_] [a-zA-Z_0-9]*;

STRING_OPEN
    : '\'' -> pushMode(STRING)
    ;


mode STRING;

//
STRING_VAL
   : '"' (~[\n\r])*? '"'
   ;
CHAR_VAL
   : '\'' (~[\n\r])*? '\''
   ;

STRING_CLOSE
    : '\'' -> popMode
    ;

PRACET:
'{'->pushMode(PR);
mode PR;
CLOSE_PRACET:
'}'->popMode;




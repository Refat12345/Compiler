// Generated from java-escape by ANTLR 4.11.1
package Compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(dartParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(dartParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#file_syntax}.
	 * @param ctx the parse tree
	 */
	void enterFile_syntax(dartParser.File_syntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#file_syntax}.
	 * @param ctx the parse tree
	 */
	void exitFile_syntax(dartParser.File_syntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#string_val}.
	 * @param ctx the parse tree
	 */
	void enterString_val(dartParser.String_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#string_val}.
	 * @param ctx the parse tree
	 */
	void exitString_val(dartParser.String_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#emit}.
	 * @param ctx the parse tree
	 */
	void enterEmit(dartParser.EmitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#emit}.
	 * @param ctx the parse tree
	 */
	void exitEmit(dartParser.EmitContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declear_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclear_var(dartParser.Declear_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declear_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclear_var(dartParser.Declear_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declear_vars}.
	 * @param ctx the parse tree
	 */
	void enterDeclear_vars(dartParser.Declear_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declear_vars}.
	 * @param ctx the parse tree
	 */
	void exitDeclear_vars(dartParser.Declear_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#object_value}.
	 * @param ctx the parse tree
	 */
	void enterObject_value(dartParser.Object_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#object_value}.
	 * @param ctx the parse tree
	 */
	void exitObject_value(dartParser.Object_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(dartParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(dartParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ifdart}.
	 * @param ctx the parse tree
	 */
	void enterIfdart(dartParser.IfdartContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ifdart}.
	 * @param ctx the parse tree
	 */
	void exitIfdart(dartParser.IfdartContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(dartParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(dartParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#arguments1}.
	 * @param ctx the parse tree
	 */
	void enterArguments1(dartParser.Arguments1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#arguments1}.
	 * @param ctx the parse tree
	 */
	void exitArguments1(dartParser.Arguments1Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(dartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(dartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(dartParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(dartParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#object_cubit}.
	 * @param ctx the parse tree
	 */
	void enterObject_cubit(dartParser.Object_cubitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#object_cubit}.
	 * @param ctx the parse tree
	 */
	void exitObject_cubit(dartParser.Object_cubitContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(dartParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(dartParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(dartParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(dartParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructor1}.
	 * @param ctx the parse tree
	 */
	void enterConstructor1(dartParser.Constructor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructor1}.
	 * @param ctx the parse tree
	 */
	void exitConstructor1(dartParser.Constructor1Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructor2}.
	 * @param ctx the parse tree
	 */
	void enterConstructor2(dartParser.Constructor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructor2}.
	 * @param ctx the parse tree
	 */
	void exitConstructor2(dartParser.Constructor2Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class1}.
	 * @param ctx the parse tree
	 */
	void enterClass1(dartParser.Class1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class1}.
	 * @param ctx the parse tree
	 */
	void exitClass1(dartParser.Class1Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class2}.
	 * @param ctx the parse tree
	 */
	void enterClass2(dartParser.Class2Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class2}.
	 * @param ctx the parse tree
	 */
	void exitClass2(dartParser.Class2Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class3}.
	 * @param ctx the parse tree
	 */
	void enterClass3(dartParser.Class3Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class3}.
	 * @param ctx the parse tree
	 */
	void exitClass3(dartParser.Class3Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class4}.
	 * @param ctx the parse tree
	 */
	void enterClass4(dartParser.Class4Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class4}.
	 * @param ctx the parse tree
	 */
	void exitClass4(dartParser.Class4Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#bloc_provider}.
	 * @param ctx the parse tree
	 */
	void enterBloc_provider(dartParser.Bloc_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#bloc_provider}.
	 * @param ctx the parse tree
	 */
	void exitBloc_provider(dartParser.Bloc_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#bloc_consumer}.
	 * @param ctx the parse tree
	 */
	void enterBloc_consumer(dartParser.Bloc_consumerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#bloc_consumer}.
	 * @param ctx the parse tree
	 */
	void exitBloc_consumer(dartParser.Bloc_consumerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listner}.
	 * @param ctx the parse tree
	 */
	void enterListner(dartParser.ListnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listner}.
	 * @param ctx the parse tree
	 */
	void exitListner(dartParser.ListnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#builder}.
	 * @param ctx the parse tree
	 */
	void enterBuilder(dartParser.BuilderContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#builder}.
	 * @param ctx the parse tree
	 */
	void exitBuilder(dartParser.BuilderContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#material_page_route}.
	 * @param ctx the parse tree
	 */
	void enterMaterial_page_route(dartParser.Material_page_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#material_page_route}.
	 * @param ctx the parse tree
	 */
	void exitMaterial_page_route(dartParser.Material_page_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 */
	void enterNavigator(dartParser.NavigatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 */
	void exitNavigator(dartParser.NavigatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#on_long_press}.
	 * @param ctx the parse tree
	 */
	void enterOn_long_press(dartParser.On_long_pressContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#on_long_press}.
	 * @param ctx the parse tree
	 */
	void exitOn_long_press(dartParser.On_long_pressContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#tool_bar_height}.
	 * @param ctx the parse tree
	 */
	void enterTool_bar_height(dartParser.Tool_bar_heightContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#tool_bar_height}.
	 * @param ctx the parse tree
	 */
	void exitTool_bar_height(dartParser.Tool_bar_heightContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#flexible_space}.
	 * @param ctx the parse tree
	 */
	void enterFlexible_space(dartParser.Flexible_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#flexible_space}.
	 * @param ctx the parse tree
	 */
	void exitFlexible_space(dartParser.Flexible_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#spacer}.
	 * @param ctx the parse tree
	 */
	void enterSpacer(dartParser.SpacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#spacer}.
	 * @param ctx the parse tree
	 */
	void exitSpacer(dartParser.SpacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(dartParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(dartParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#flutter}.
	 * @param ctx the parse tree
	 */
	void enterFlutter(dartParser.FlutterContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#flutter}.
	 * @param ctx the parse tree
	 */
	void exitFlutter(dartParser.FlutterContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#imporT}.
	 * @param ctx the parse tree
	 */
	void enterImporT(dartParser.ImporTContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#imporT}.
	 * @param ctx the parse tree
	 */
	void exitImporT(dartParser.ImporTContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(dartParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(dartParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#runapp}.
	 * @param ctx the parse tree
	 */
	void enterRunapp(dartParser.RunappContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#runapp}.
	 * @param ctx the parse tree
	 */
	void exitRunapp(dartParser.RunappContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classs}.
	 * @param ctx the parse tree
	 */
	void enterClasss(dartParser.ClasssContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classs}.
	 * @param ctx the parse tree
	 */
	void exitClasss(dartParser.ClasssContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_less}.
	 * @param ctx the parse tree
	 */
	void enterClass_less(dartParser.Class_lessContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_less}.
	 * @param ctx the parse tree
	 */
	void exitClass_less(dartParser.Class_lessContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_full}.
	 * @param ctx the parse tree
	 */
	void enterClass_full(dartParser.Class_fullContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_full}.
	 * @param ctx the parse tree
	 */
	void exitClass_full(dartParser.Class_fullContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_full1}.
	 * @param ctx the parse tree
	 */
	void enterClass_full1(dartParser.Class_full1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_full1}.
	 * @param ctx the parse tree
	 */
	void exitClass_full1(dartParser.Class_full1Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(dartParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(dartParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(dartParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(dartParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_full2}.
	 * @param ctx the parse tree
	 */
	void enterClass_full2(dartParser.Class_full2Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_full2}.
	 * @param ctx the parse tree
	 */
	void exitClass_full2(dartParser.Class_full2Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#initstate}.
	 * @param ctx the parse tree
	 */
	void enterInitstate(dartParser.InitstateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#initstate}.
	 * @param ctx the parse tree
	 */
	void exitInitstate(dartParser.InitstateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuild(dartParser.BuildContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuild(dartParser.BuildContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(dartParser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(dartParser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(dartParser.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(dartParser.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#materialapp}.
	 * @param ctx the parse tree
	 */
	void enterMaterialapp(dartParser.MaterialappContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#materialapp}.
	 * @param ctx the parse tree
	 */
	void exitMaterialapp(dartParser.MaterialappContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(dartParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(dartParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(dartParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(dartParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(dartParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(dartParser.ThemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#debugshowmode}.
	 * @param ctx the parse tree
	 */
	void enterDebugshowmode(dartParser.DebugshowmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#debugshowmode}.
	 * @param ctx the parse tree
	 */
	void exitDebugshowmode(dartParser.DebugshowmodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(dartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(dartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(dartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(dartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(dartParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(dartParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(dartParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(dartParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(dartParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(dartParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(dartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(dartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#image1}.
	 * @param ctx the parse tree
	 */
	void enterImage1(dartParser.Image1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#image1}.
	 * @param ctx the parse tree
	 */
	void exitImage1(dartParser.Image1Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#image2}.
	 * @param ctx the parse tree
	 */
	void enterImage2(dartParser.Image2Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#image2}.
	 * @param ctx the parse tree
	 */
	void exitImage2(dartParser.Image2Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#appbar}.
	 * @param ctx the parse tree
	 */
	void enterAppbar(dartParser.AppbarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#appbar}.
	 * @param ctx the parse tree
	 */
	void exitAppbar(dartParser.AppbarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(dartParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(dartParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#padding1}.
	 * @param ctx the parse tree
	 */
	void enterPadding1(dartParser.Padding1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#padding1}.
	 * @param ctx the parse tree
	 */
	void exitPadding1(dartParser.Padding1Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 */
	void enterPadding(dartParser.PaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 */
	void exitPadding(dartParser.PaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 */
	void enterExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 */
	void exitExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#sizedbox}.
	 * @param ctx the parse tree
	 */
	void enterSizedbox(dartParser.SizedboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#sizedbox}.
	 * @param ctx the parse tree
	 */
	void exitSizedbox(dartParser.SizedboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#hieght}.
	 * @param ctx the parse tree
	 */
	void enterHieght(dartParser.HieghtContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#hieght}.
	 * @param ctx the parse tree
	 */
	void exitHieght(dartParser.HieghtContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(dartParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(dartParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 */
	void enterListview(dartParser.ListviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 */
	void exitListview(dartParser.ListviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#itb}.
	 * @param ctx the parse tree
	 */
	void enterItb(dartParser.ItbContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#itb}.
	 * @param ctx the parse tree
	 */
	void exitItb(dartParser.ItbContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#sb}.
	 * @param ctx the parse tree
	 */
	void enterSb(dartParser.SbContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#sb}.
	 * @param ctx the parse tree
	 */
	void exitSb(dartParser.SbContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ic}.
	 * @param ctx the parse tree
	 */
	void enterIc(dartParser.IcContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ic}.
	 * @param ctx the parse tree
	 */
	void exitIc(dartParser.IcContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(dartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(dartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#bord_rad}.
	 * @param ctx the parse tree
	 */
	void enterBord_rad(dartParser.Bord_radContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#bord_rad}.
	 * @param ctx the parse tree
	 */
	void exitBord_rad(dartParser.Bord_radContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(dartParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(dartParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#colors}.
	 * @param ctx the parse tree
	 */
	void enterColors(dartParser.ColorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#colors}.
	 * @param ctx the parse tree
	 */
	void exitColors(dartParser.ColorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#decoration}.
	 * @param ctx the parse tree
	 */
	void enterDecoration(dartParser.DecorationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#decoration}.
	 * @param ctx the parse tree
	 */
	void exitDecoration(dartParser.DecorationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(dartParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(dartParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(dartParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(dartParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#varible}.
	 * @param ctx the parse tree
	 */
	void enterVarible(dartParser.VaribleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#varible}.
	 * @param ctx the parse tree
	 */
	void exitVarible(dartParser.VaribleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 */
	void enterGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 */
	void exitGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 */
	void enterOntap(dartParser.OntapContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 */
	void exitOntap(dartParser.OntapContext ctx);
}
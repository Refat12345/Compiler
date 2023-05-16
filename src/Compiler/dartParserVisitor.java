// Generated from java-escape by ANTLR 4.11.1
package Compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(dartParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#file_syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_syntax(dartParser.File_syntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#string_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_val(dartParser.String_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#emit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmit(dartParser.EmitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declear_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclear_var(dartParser.Declear_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declear_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclear_vars(dartParser.Declear_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#object_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_value(dartParser.Object_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(dartParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ifdart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdart(dartParser.IfdartContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(dartParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#arguments1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments1(dartParser.Arguments1Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(dartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(dartParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#object_cubit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_cubit(dartParser.Object_cubitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(dartParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(dartParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor1(dartParser.Constructor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor2(dartParser.Constructor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass1(dartParser.Class1Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass2(dartParser.Class2Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass3(dartParser.Class3Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass4(dartParser.Class4Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#bloc_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc_provider(dartParser.Bloc_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#bloc_consumer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc_consumer(dartParser.Bloc_consumerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListner(dartParser.ListnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#builder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilder(dartParser.BuilderContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#material_page_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterial_page_route(dartParser.Material_page_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigator(dartParser.NavigatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#on_long_press}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_long_press(dartParser.On_long_pressContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#tool_bar_height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTool_bar_height(dartParser.Tool_bar_heightContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#flexible_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexible_space(dartParser.Flexible_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#spacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacer(dartParser.SpacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(dartParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(dartParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#flutter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutter(dartParser.FlutterContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#imporT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporT(dartParser.ImporTContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(dartParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#runapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunapp(dartParser.RunappContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasss(dartParser.ClasssContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_less(dartParser.Class_lessContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_full(dartParser.Class_fullContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_full1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_full1(dartParser.Class_full1Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(dartParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(dartParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_full2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_full2(dartParser.Class_full2Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#initstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitstate(dartParser.InitstateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild(dartParser.BuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(dartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(dartParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#materialapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialapp(dartParser.MaterialappContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(dartParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(dartParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(dartParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#debugshowmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugshowmode(dartParser.DebugshowmodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(dartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(dartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(dartParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(dartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(dartParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(dartParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#image1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage1(dartParser.Image1Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#image2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage2(dartParser.Image2Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#appbar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppbar(dartParser.AppbarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(dartParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#padding1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding1(dartParser.Padding1Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(dartParser.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#sizedbox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedbox(dartParser.SizedboxContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#hieght}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHieght(dartParser.HieghtContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(dartParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListview(dartParser.ListviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#itb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItb(dartParser.ItbContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#sb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSb(dartParser.SbContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIc(dartParser.IcContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(dartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#bord_rad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBord_rad(dartParser.Bord_radContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(dartParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#colors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColors(dartParser.ColorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoration(dartParser.DecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(dartParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(dartParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#varible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarible(dartParser.VaribleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntap(dartParser.OntapContext ctx);
}
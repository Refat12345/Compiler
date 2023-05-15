package Visit;

import AST.*;
import AST.bloc_brovider.BlocProvider;
import AST.bloc_consumer.BlocConsumer;
import AST.builder.builder;
import AST.classdefinition.classdefinition;
import AST.constructor.constructor;
import AST.constructor.constructor1;
import AST.constructor.constructor2;
import AST.emit.emit;
import AST.flexible_space.FlexibleSpace;
import AST.function.arguments;
import AST.function.arguments1;
import AST.function.block;
import AST.function.function;
import AST.image.image;
import AST.image.image1;
import AST.image.image2;
import AST.material_page_route.MaterialPageRoute;
import AST.navigator.Navigator;
import AST.object_value.*;
import AST.objectcubit.objectcupit;
import AST.on_long_press.OnLongPress;
import AST.spacer.Spacer;
import AST.text.Style;
import AST.tool_bar_height.ToolBarHeight;
import AST.varname;
import AST.Class.*;
import AST.Class.Classs;
import AST.Import.Import;
import AST.List.List;
import AST.List.Objects;
import AST.List.Varible;
import AST.Row.Row;
import AST.appBar.AppBar;
import AST.body.body;
import AST.build.build;
import AST.child.Child;
import AST.children.Children;
import AST.column.COLUMN;
import AST.container.Container;
import AST.decoration.border;
import AST.decoration.col;
import AST.decoration.decoration;
import AST.expanded.Expanded;
import AST.gesture.gestureDetector;
import AST.ifDart.IfDart;
import AST.listview.ic;
import AST.listview.itb;
import AST.listview.listview;
import AST.listview.sb;
import AST.main.main;
import AST.main.runapp;
import AST.material_app.debugmode;
import AST.material_app.home;
import AST.material_app.materialapp;
import AST.ontap.ontap;
import AST.padding.Padding;
import AST.padding.Padding1;
import AST.scaffold.Scaffold;
import AST.sizedBox.SizedBox;
import AST.sizedBox.height;
import AST.sizedBox.width;
import AST.string_val.stringval;
import AST.text.Text;
import AST.val.boolval;
import AST.val.numval;
import AST.val.val;

import AST.widget.wid;
import Compiler.dartParserBaseVisitor;
import Compiler.dartParser;
import sympoletable.SymboleTable;

public class visit extends dartParserBaseVisitor {
    SymboleTable symboleTable = new SymboleTable();

    @Override
    public Import visitImporT(dartParser.ImporTContext ctx) {

        Import I=new Import();
        I.addchild(visitString_val(ctx.string_val()));
        sympoletable.Row row1 = new sympoletable.Row();
        row1.setType("import");
        row1.setVal(visitString_val(ctx.string_val()).toString());
        symboleTable.getRows().add(row1);
        symboleTable.Print();
        return I;
    }


    @Override
    public List visitList(dartParser.ListContext ctx) {
        List list=new List();
        list.setVal(ctx.VAR_NAME().getText());
        for(int i=0;i<ctx.object().size();i++)
        {
            list.addChild(visitObject(ctx.object(i)));
        }
        return list;
    }

    @Override
    public Objects visitObject(dartParser.ObjectContext ctx) {
        Objects objects=new Objects();
        for (int i=0;i<ctx.varible().size();i++)
        {
            objects.addChild(visitVarible(ctx.varible(i)));
        }
        return objects;
    }

    @Override
    public Varible visitVarible(dartParser.VaribleContext ctx) {
        Varible varible=new Varible();
        for (int i=0;i<ctx.string_val().size();i++)
        {
            varible.addChild(visitString_val(ctx.string_val(i)));
        }
        return varible;
    }

    @Override
    public stringval visitString_val(dartParser.String_valContext ctx) {
        if(ctx.STRING_VAL()!=null){

            stringval stringval = new stringval();

            stringval.addArrayList(ctx.STRING_VAL().toString());
            return stringval;}
        return null;

    }



    @Override
    public SizedBox visitSizedbox(dartParser.SizedboxContext ctx) {
        SizedBox sizedBox=new SizedBox();
        sympoletable.Row row1 = new sympoletable.Row();
        sympoletable.Row row2 = new sympoletable.Row();

        if(ctx.hieght()!=null){
            row2.setType("SizedBox ");
            row2.setVal(visitHieght(ctx.hieght()).toString());
            symboleTable.getRows().add(row2);
            sizedBox.addChild(visitHieght(ctx.hieght()));}
        if(ctx.width()!=null){
            row1.setType("SizedBox ");
            row1.setVal(visitWidth(ctx.width()).toString());
            symboleTable.getRows().add(row1);

            sizedBox.addChild2(visitWidth(ctx.width()));}
        symboleTable.Print();
        return sizedBox;

    }

    @Override
    public height visitHieght(dartParser.HieghtContext ctx) {
        height height=new height();
        height.addChild(ctx.NUM_VAL().toString());
        return height;
    }

    @Override
    public width visitWidth(dartParser.WidthContext ctx) {
        width width=new width();
        width.addChild(ctx.NUM_VAL().toString());
        return width;
    }

    @Override
    public Expanded visitExpanded(dartParser.ExpandedContext ctx) {

        Expanded expanded=new Expanded();

//        sympoletable.Row row1 = new sympoletable.Row();
//        row1.setType("Expanded");
//        row1.setVal(visitChild(ctx.child()).toString());
//        symboleTable.getRows().add(row1);

        expanded.addChild(visitChild(ctx.child()));
        return expanded;
    }

    @Override
    public wid visitWidget(dartParser.WidgetContext ctx) {
        wid w=new wid();

        if(ctx.text()!=null)
        {
            w.addChild(visitText(ctx.text()));
        }else if(ctx.expanded()!=null)
        {
            w.addChild(visitExpanded(ctx.expanded()));
        }else if (ctx.column()!=null)
        {
            w.addChild(visitColumn(ctx.column()));
        }
        else  if (ctx.padding()!=null)
        {
            w.addChild(visitPadding(ctx.padding()));
        }
        else if(ctx.spacer()!=null)
        {
            w.addChild(visitSpacer(ctx.spacer()));
        }
        else if(ctx.image() !=null)
        {
            w.addChild(visitImage(ctx.image()));
        }
        else if(ctx.row()!=null)
        {
            w.addChild(visitRow(ctx.row()));
        }
        else if(ctx.scaffold()!=null)
        {
            w.addChild(visitScaffold(ctx.scaffold()));
        }
        else if(ctx.materialapp()!=null)
        {
            w.addChild(visitMaterialapp(ctx.materialapp()));
        }
        else if(ctx.container()!=null)
        {
            w.addChild(visitContainer(ctx.container()));
        }
        else if(ctx.listview()!=null)
        {
            w.addChild(visitListview(ctx.listview()));
        }
        else if(ctx.sizedbox()!=null)
        {
            w.addChild(visitSizedbox(ctx.sizedbox()));
        }
        else if(ctx.gestureDetector()!=null)
        {
            w.addChild(visitGestureDetector(ctx.gestureDetector()));
        }
        else if(ctx.bloc_consumer()!=null)
        {
            w.addChild(visitBloc_consumer(ctx.bloc_consumer()));
        }
        else if(ctx.bloc_provider()!=null)
        {
            w.addChild(visitBloc_provider(ctx.bloc_provider()));
        }
        return w;
    }


    @Override
    public COLUMN visitColumn(dartParser.ColumnContext ctx) {
        COLUMN colo = new COLUMN();
        if(ctx.CROSS_AXIS_ALIGNMENT_1()!=null)
            colo.setCross(true);
        if (ctx.MAINAXIS()!=null)
            colo.setMain(true);
        if(ctx.children()!=null)
            colo.addchild( visitChildren(ctx.children()));
        return colo;
    }

    @Override
    public IfDart visitIfdart(dartParser.IfdartContext ctx) {
        IfDart id=new IfDart();
        for (int i = 0; i <ctx.VAR_NAME().size() ; i++) {
            varname v=new varname();
            v.setString(ctx.VAR_NAME().get(i).toString());
            id.addchild1(v);
        }
        id.setString(visitString_val(ctx.string_val()));
        for(int i=0;i<ctx.widget().size();i++)
            id.getChild2().add(visitWidget(ctx.widget(i)));
        return id;
    }





    @Override
    public Text visitText(dartParser.TextContext ctx) {

        Text text=new Text();
        if(ctx.VAR_NAME()==null&&ctx.string_val()==null)
        {
            return text;
        }
        if(ctx.VAR_NAME()==null)
        {
            text.addChild(visitString_val(ctx.string_val()));
        }
        else if(ctx.EXCLAMATION()!=null&&ctx.style()==null)
        {

            text.aBoolean=true;
            text.setString(ctx.VAR_NAME(0).getText());
            text.setString(ctx.EXCLAMATION().getText());
        }
        else if(ctx.string_val()==null&&ctx.style()==null)
        {

            for (int i = 0; i <ctx.VAR_NAME().size() ; i++) {
                text.setString(ctx.VAR_NAME().get(i).getText());
            }
        }
        else if(ctx.style()!=null)
        {

            text.addStyle(visitStyle(ctx.style()));
            text.setString(ctx.VAR_NAME(0).getText());
            text.setString(ctx.EXCLAMATION().getText());
        }
        else if(ctx.INDEX()!=null)
        {

            text.setIndex(ctx.INDEX().getText());
            text.addChild(visitString_val(ctx.string_val()));
            System.out.println(ctx.VAR_NAME().size());
            for (int i = 0; i < ctx.VAR_NAME().size(); i++) {
                text.setString(ctx.VAR_NAME().get(i).getText());
            }
        }
        else
        {

            text.addChild(visitString_val(ctx.string_val()));
            for (int i = 0; i < ctx.VAR_NAME().size(); i++) {
                text.setString(ctx.VAR_NAME().get(i).getText());
            }
        }
        return text;
    }

    @Override
    public Child visitChild(dartParser.ChildContext ctx) {

        Child child=new Child();
        child.addChild(visitWidget(ctx.widget()));
        return child;
    }

    @Override
    public Padding1 visitPadding1(dartParser.Padding1Context ctx) {
        Padding1 padding1=new Padding1();
        sympoletable.Row row1 = new sympoletable.Row();
        row1.setType("Padding ");
        row1.setVal(ctx.NUM_VAL().getText());
        symboleTable.getRows().add(row1);
        symboleTable.Print();
        padding1.addChild(ctx.NUM_VAL().getText());
        return padding1;
    }

    @Override
    public Padding visitPadding(dartParser.PaddingContext ctx) {
        Padding padding=new Padding();
        padding.addChild(visitChild(ctx.child()),visitPadding1(ctx.padding1()));
        return padding;
    }






    @Override
    public ontap visitOntap(dartParser.OntapContext ctx) {
        ontap s = new ontap();
        for (int i = 0; i <ctx.VAR_NAME().size() ; i++) {
            varname v=new varname();
            v.setString(ctx.VAR_NAME().get(i).getText());
            s.addSting(v);
        }
        return s;

    }

    @Override
    public gestureDetector visitGestureDetector(dartParser.GestureDetectorContext ctx) {
        gestureDetector s = new gestureDetector();
        s.addchild(visitOntap(ctx.ontap()));
        s.setChild(visitChild(ctx.child()));
        return s;

    }


//    @Override
//    public Object visitBlock(dartParser.BlockContext ctx) {
//        for (int i = 0; i < 8; i++) {
//
//        }
//    }

    @Override
    public Container visitContainer(dartParser.ContainerContext ctx) {
        Container container=new Container();
        container.addChild(visitPadding1(ctx.padding1()),visitChild(ctx.child()),visitDecoration(ctx.decoration()));
        return container;
    }

    @Override
    public image visitImage(dartParser.ImageContext ctx) {
        image im=new image();
        for (int i = 0; i < ctx.VAR_NAME().size(); i++) {
            varname v=new varname();
            v.setString(ctx.VAR_NAME().get(i).toString());
            im.addvarname(v);

        }
        if (ctx.string_val()!=null)
            im.setStringval(visitString_val(ctx.string_val()));
        if (ctx.image1()!=null)
            im.setImage1(visitImage1(ctx.image1()));
        if (ctx.image2()!=null)
            im.setImage2(visitImage2(ctx.image2()));
        return im;

    }

    @Override
    public image1 visitImage1(dartParser.Image1Context ctx) {
        image1 i=new image1();
        if (ctx.FILL()!=null)
            i.setFill(true);
        return i;
    }

    @Override
    public image2 visitImage2(dartParser.Image2Context ctx) {
        image2 i=new image2();
        if (ctx.EXCLAMATION()!=null)
            i.setEx(true);
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        i.setVarname(v);
        return i;
    }

    @Override
    public border visitBord_rad(dartParser.Bord_radContext ctx) {
        border border = new border();
        sympoletable.Row row1 = new sympoletable.Row();
        row1.setType("BorderRadius ");
        row1.setVal(ctx.NUM_VAL().toString());
        symboleTable.getRows().add(row1);
        symboleTable.Print();

        border.addmode(ctx.BORDER2().getText(),ctx.CIRCULAR().getText(),Integer.parseInt(ctx.NUM_VAL().toString()));

        return border;
    }


    @Override
    public col visitColors(dartParser.ColorsContext ctx) {
        col Col=new col();
        sympoletable.Row row1 = new sympoletable.Row();
        row1.setType("Color ");
        row1.setVal(ctx.COL().getText());
        symboleTable.getRows().add(row1);
        symboleTable.Print();
        Col.setCol(ctx.COL().getText());
        return Col;
    }

    @Override
    public decoration visitDecoration(dartParser.DecorationContext ctx) {
        decoration decoration = new decoration();
        sympoletable.Row row1 = new sympoletable.Row();
        row1.setType("Decoration ");
        row1.setVal("BoxDecoration");
        symboleTable.getRows().add(row1);
        symboleTable.Print();

        decoration.addchild(visitColors(ctx.color().colors()),visitBord_rad(ctx.bord_rad()));

        return decoration;
    }

    @Override
    public Scaffold visitScaffold(dartParser.ScaffoldContext ctx) {

        Scaffold scaffold=new Scaffold();
        scaffold.addChild(visitBody(ctx.body()),visitAppbar(ctx.appbar()));
        return scaffold;
    }

    @Override
    public AppBar visitAppbar(dartParser.AppbarContext ctx) {
        AppBar appBar=new AppBar();
       if(ctx.colors()!=null)
       {
           appBar.addChild(visitColors(ctx.colors()));
       }
       else
       {
           appBar.addChild1(visitFlexible_space(ctx.flexible_space()));
           appBar.addChild2(visitTool_bar_height(ctx.tool_bar_height()));
       }
        return appBar;
    }

    @Override
    public body visitBody(dartParser.BodyContext ctx) {
        body body=new body();
        body.addChild(visitWidget(ctx.widget()));
        return body;
    }

    @Override
    public Row visitRow(dartParser.RowContext ctx) {
        Row ro = new Row();
        if(ctx.children()!=null)
            ro.addchild((Children) visitChildren(ctx.children()));
        return ro;
    }
    @Override
    public Children visitChildren(dartParser.ChildrenContext ctx) {
        Children chis = new Children();
        for(int i=0;i<ctx.ifdart().size();i++){
            if(ctx.ifdart()!=null)
                chis.getChild1().add(visitIfdart(ctx.ifdart(i)));

        }
        for(int i=0;i<ctx.widget().size();i++){
            if(ctx.widget()!=null)
                chis.getChild2().add(visitWidget(ctx.widget(i)));

        }
        return chis;
    }

    //----------
    @Override
    public main visitMain(dartParser.MainContext ctx) {
        runapp r=visitRunapp(ctx.runapp());
        main m=new main();
        m.setchild(r);
        return m;

    }

    @Override
    public runapp visitRunapp(dartParser.RunappContext ctx) {
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        runapp r=new runapp();
        r.setchild(v);
        return r;
    }

    @Override
    public state visitState(dartParser.StateContext ctx) {
        varname v1=new varname();
        varname v2=new varname();
        state s=new state();
        v1.setString(ctx.VAR_NAME(0).toString());
        v2.setString(ctx.VAR_NAME(1).toString());
        s.setChild1(v1);
        s.setChild2(v2);
        return s;
    }

    @Override
    public ClassFull1 visitClass_full1(dartParser.Class_full1Context ctx) {
        varname v=new varname();
        state s=new state();
        v.setString(ctx.VAR_NAME().toString());
        s=visitState(ctx.state());
        ClassFull1 c=new ClassFull1();
        c.setChild1(v);
        c.setChild2(s);
        return c;
    }

    @Override
    public val visitVal(dartParser.ValContext ctx) {
        val v=new val();
        if (ctx.string_val()!=null){
            v.setV(visitString_val(ctx.string_val()));
        }
        else if (ctx.BOOL_VAL()!=null){
            boolval b=new boolval();
            b.setChild(ctx.BOOL_VAL().toString());
            v.setV(b);}else if (ctx.NUM_VAL()!=null){
            numval b=new numval();
            b.setString(ctx.NUM_VAL().toString());
            v.setV(b);}
        else if(ctx.object_value()!=null)
        {
            ObjectValue objectValue=new ObjectValue();
          objectValue=visitObject_value(ctx.object_value());
          v.setV(objectValue);
        }



        return v;
    }

    @Override
    public declarevar visitDeclear_var(dartParser.Declear_varContext ctx) {
        declarevar v=new declarevar();
        if(ctx.emit()==null){
            if (ctx.TYPE()!=null)
                v.setType(ctx.TYPE().toString());
            v.setQmark(ctx.Q_MARK()!=null);
            varname va=new varname();
            va.setString(ctx.VAR_NAME().toString());
            v.setVarname(va);
            if (ctx.val()!=null){
                val val=visitVal(ctx.val());
                v.setVal(val);}
            for (int i = 0; i <ctx.declear_vars().size() ; i++) {
                v.addval(visitDeclear_vars(ctx.declear_vars().get(i)));

            }
            return v;


        }
        v.setEmit(visitEmit(ctx.emit()));
        return v;

    }


    @Override
    public declarevars visitDeclear_vars(dartParser.Declear_varsContext ctx) {
        declarevars d=new declarevars();
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        d.setVarname(v);
        if (ctx.val()!=null){
            d.setVal(visitVal(ctx.val()));
        }
        return d;


    }
    @Override
    public emit visitEmit(dartParser.EmitContext ctx) {
        emit e=new emit();
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        e.setVarname(v);
        return e;
    }

    @Override
    public itb visitItb(dartParser.ItbContext ctx) {
        itb i=new itb();
        return i;
    }

    @Override
    public ic visitIc(dartParser.IcContext ctx) {
        ic IC=new ic();
        if(ctx.NUM_VAL()!=null){
            numval n=new numval();
            n.setString(ctx.NUM_VAL().toString());
            IC.setChild2(n);
            return IC;
        }else if(ctx.VAR_NAME().size()==2){
            varname v=new varname();
            v.setString(ctx.VAR_NAME(0).toString());
            IC.addchild1(v);
            v=new varname();
            v.setString(ctx.VAR_NAME(1).toString());
            IC.addchild1(v);
            return IC;
        }else
        {
            varname v=new varname();
            v.setString(ctx.VAR_NAME(0).toString());
            IC.addchild1(v);

            v=new varname();
            v.setString(ctx.VAR_NAME(1).toString());
            IC.addchild1(v);

            v=new varname();
            v.setString(ctx.VAR_NAME(2).toString());
            IC.addchild1(v);
            return IC;
        }


    }

    @Override
    public sb visitSb(dartParser.SbContext ctx) {
        sb s=new sb();
        return s;
    }


    //----------


    @Override
    public listview visitListview(dartParser.ListviewContext ctx) {
        listview listview=new listview();
        listview.setIc(visitIc(ctx.ic()));
        listview.setItb(visitItb(ctx.itb()));
        listview.setWidget(visitWidget(ctx.widget(0)));
        listview.setWidget2(visitWidget(ctx.widget(1)));
        listview.setSb(visitSb(ctx.sb()));
        sympoletable.Row row1 = new sympoletable.Row();
        row1.setType("ItemBuilder");
        row1.setVal(visitWidget(ctx.widget(0)).toString());

        symboleTable.getRows().add(row1);
        symboleTable.Print();


        return listview;

    }


    @Override
    public materialapp visitMaterialapp(dartParser.MaterialappContext ctx) {
        materialapp materialapp = new materialapp();
        materialapp.addchild(visitHome(ctx.home()),visitDebugshowmode(ctx.debugshowmode()));
        return materialapp;
    }

    @Override
    public debugmode visitDebugshowmode(dartParser.DebugshowmodeContext ctx) {
        debugmode debugmode = new debugmode();
        sympoletable.Row row1 = new sympoletable.Row();
        row1.setType("debugShowCheckedModeBanner ");
        row1.setVal(ctx.BOOL_VAL().toString());
        symboleTable.getRows().add(row1);
        symboleTable.Print();
        debugmode.addmode(ctx.BOOL_VAL().toString());
        return debugmode;
    }

    @Override
    public home visitHome(dartParser.HomeContext ctx) {
        home home = new home();
        home.addmode(ctx.VAR_NAME().toString());
        return home;
    }


    @Override
    public build visitBuild(dartParser.BuildContext ctx) {
        build build=new build();
        build.setWid(visitWidget(ctx.widget()));
        return build;
    }

    @Override
    public ClassLess visitClass_less(dartParser.Class_lessContext ctx) {
        ClassLess c=new ClassLess();
        for (int i = 0; i < ctx.class4().size(); i++) {
            c.addclass4(visitClass4(ctx.class4().get(i)));
        }
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        c.setVarname(v);
        if (ctx.constructor()!=null)
            c.setConstructor(visitConstructor(ctx.constructor()));
        c.setBuild(visitBuild(ctx.build()));
        return c;
        }







    @Override
    public initState visitInitstate(dartParser.InitstateContext ctx) {
        initState initState=new initState();
        return initState;
    }

    @Override
    public ClassFull2 visitClass_full2(dartParser.Class_full2Context ctx) {
        ClassFull2 classFull2=new ClassFull2();
        varname v=new varname();
        v.setString(ctx.VAR_NAME(0).toString());
        sympoletable.Row row1 = new sympoletable.Row();
        row1.setType("Class State");
        row1.setVal(ctx.VAR_NAME(0).toString());
        symboleTable.getRows().add(row1);
        symboleTable.Print();
        sympoletable.Row row2 = new sympoletable.Row();
        row2.setType("Class Stateful");
        row2.setVal(ctx.VAR_NAME(1).toString());
        symboleTable.getRows().add(row2);
        symboleTable.Print();

        classFull2.addvarname(v);
        v=new varname();
        v.setString(ctx.VAR_NAME(1).toString());
        classFull2.addvarname(v);
        classFull2.setBuild(visitBuild(ctx.build()));
        for (int i = 0; i < ctx.declear_var().size(); i++) {
            classFull2.adddeclarevar((visitDeclear_var(ctx.declear_var(i))));
        }
        classFull2.setInitState(visitInitstate(ctx.initstate()));
        return classFull2;
    }

    @Override
    public ClassFull visitClass_full(dartParser.Class_fullContext ctx) {
        ClassFull classFull=new ClassFull();
        classFull.setClassFull1(visitClass_full1(ctx.class_full1()));
        classFull.setClassFull2(visitClass_full2(ctx.class_full2()));
        return classFull;

    }


    @Override
    public Classs visitClasss(dartParser.ClasssContext ctx) {
        Classs c=new Classs();

        for (int i = 0; i < ctx.imporT().size(); i++) {

            c.setImports(visitImporT(ctx.imporT().get(i)));
        }
        if (ctx.class_full()!=null)
            c.setClassFull(visitClass_full(ctx.class_full()));
        if (ctx.class_less()!=null)
            c.setClassLess(visitClass_less(ctx.class_less()));
        return c;
    }

    @Override
    public flutter visitFlutter(dartParser.FlutterContext ctx) {
        flutter flutter=new flutter();

        for (int i = 0; i < ctx.imporT().size(); i++) {
            flutter.addimport(visitImporT(ctx.imporT().get(i)));
        }
        for (int i = 0; i < ctx.classs().size(); i++) {
            flutter.addclass(visitClasss(ctx.classs().get(i)));
        }
        for (int i = 0; i < ctx.list().size(); i++) {
            flutter.addlist(visitList(ctx.list().get(i)));
        }
        flutter.setMain(visitMain(ctx.main()));
        return flutter;

    }

    @Override
    public ObjectValue visitObject_value(dartParser.Object_valueContext ctx) {
        ObjectValue objectValue=new ObjectValue();
        objectValue.addString(visitString_val(ctx.string_val()));
        for (int i = 0; i <ctx.VAR_NAME().size() ; i++) {
            varname v=new varname();
            v.setString(ctx.VAR_NAME(i).getText());
            objectValue.addVarName(v);
        }
return objectValue;
    }

    @Override
    public BlocProvider visitBloc_provider(dartParser.Bloc_providerContext ctx) {
        BlocProvider blocProvider=new BlocProvider();
        blocProvider.addChild(visitChild(ctx.child()));
        varname varname=new varname();
        varname.setString(ctx.VAR_NAME().getText());
        blocProvider.addString(varname);
        return blocProvider;
    }

    @Override
    public builder visitBuilder(dartParser.BuilderContext ctx) {
       builder builder=new builder();
       builder.addChild(visitWidget(ctx.widget()));
       return builder;
    }

    @Override
    public BlocConsumer visitBloc_consumer(dartParser.Bloc_consumerContext ctx) {
     BlocConsumer blocConsumer=new BlocConsumer();
     blocConsumer.addChild(visitBuilder(ctx.builder()));
        for (int i = 0; i < ctx.VAR_NAME().size(); i++) {
            varname varname=new varname();
            varname.setString(ctx.VAR_NAME(i).getText());
            blocConsumer.addString(varname);
        }
        return blocConsumer;
    }

    @Override
    public MaterialPageRoute visitMaterial_page_route(dartParser.Material_page_routeContext ctx) {
        MaterialPageRoute materialPageRoute=new MaterialPageRoute();
        for (int i = 0; i <ctx.VAR_NAME().size() ; i++) {
            varname varname=new varname();
               varname.setString(ctx.VAR_NAME().get(i).getText());
               materialPageRoute.addString(varname);
        }
        return  materialPageRoute;
    }

    @Override
    public Navigator visitNavigator(dartParser.NavigatorContext ctx) {
        Navigator navigator=new Navigator();

        navigator.addChild(visitMaterial_page_route(ctx.material_page_route()));
        return  navigator;
    }

    @Override
    public OnLongPress visitOn_long_press(dartParser.On_long_pressContext ctx) {

        OnLongPress onLongPress=new OnLongPress();
        onLongPress.addChild1(visitNavigator(ctx.navigator()));
        for (int i = 0; i <ctx.declear_var().size() ; i++) {
            onLongPress.addChild2(visitDeclear_var(ctx.declear_var(i)));
        }
       return onLongPress;
    }

    @Override
    public ToolBarHeight visitTool_bar_height(dartParser.Tool_bar_heightContext ctx) {
        ToolBarHeight toolBarHeight=new ToolBarHeight();
        toolBarHeight.addChild(ctx.NUM_VAL().getText());
        return toolBarHeight;
    }

    @Override
    public FlexibleSpace visitFlexible_space(dartParser.Flexible_spaceContext ctx) {
        FlexibleSpace flexibleSpace=new FlexibleSpace();
        flexibleSpace.addChild(visitWidget(ctx.widget()));
        return flexibleSpace;
    }

    @Override
    public Spacer visitSpacer(dartParser.SpacerContext ctx) {
         Spacer spacer=new Spacer();
         spacer.addChild(ctx.SPACER().getText());
         return  spacer;
    }
    @Override
    public constructor1 visitConstructor1(dartParser.Constructor1Context ctx) {
        constructor1 c=new constructor1();
        for (int i = 0; i <ctx.VAR_NAME().size() ; i++) {
            varname v=new varname();
            v.setString(ctx.VAR_NAME().get(i).toString());
            c.setVarname(v);
        }

        return c;
    }

    @Override
    public constructor2 visitConstructor2(dartParser.Constructor2Context ctx) {
        constructor2 c=new constructor2();
        varname v=new varname();
        v.setString(ctx.VAR_NAME().get(0).toString());
        c.addvarname(v);
        v=new varname();
        v.setString(ctx.VAR_NAME().get(1).toString());
        c.addvarname(v);
        return c;
    }

    @Override
    public constructor visitConstructor(dartParser.ConstructorContext ctx) {
        constructor c=new constructor();
        if (ctx.constructor1()!=null)
            c.setConstructor1(visitConstructor1(ctx.constructor1()));
        for (int i = 0; i < ctx.constructor2().size(); i++) {
            c.setConstructor2(visitConstructor2(ctx.constructor2().get(i)));

        }
        for (int i = 0; i < ctx.VAR_NAME().size(); i++) {
            varname v=new varname();
            v.setString(ctx.VAR_NAME().get(i).toString());
            c.addvarname(v);

        }
        return c;
    }

    @Override
    public classdefinition visitClass_definition(dartParser.Class_definitionContext ctx) {
        classdefinition c=new classdefinition();
        for (int i = 0; i < ctx.VAR_NAME().size(); i++) {
            varname v=new varname();
            v.setString(ctx.VAR_NAME().get(i).toString());
            c.addvarname(v);

        }
        return c;
    }
    @Override
    public objectcupit visitObject_cubit(dartParser.Object_cubitContext ctx) {
        objectcupit o=new objectcupit();
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        o.setVarname(v);
        return o;

    }

    @Override
    public Style visitStyle(dartParser.StyleContext ctx) {

        Style style=new Style();
        style.addString(ctx.W600().getText());
        style.addString(ctx.NUM_VAL().getText());
        return style;
    }

    @Override
    public class1 visitClass1(dartParser.Class1Context ctx) {
        class1 c=new class1();
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        c.setVarname(v);
        return c;
    }


    @Override
    public class2 visitClass2(dartParser.Class2Context ctx) {
        class2 c=new class2();
        for (int i = 0; i < ctx.imporT().size(); i++) {
            c.setImports(visitImporT(ctx.imporT().get(i)));
        }
        if (ctx.class1()!=null)
            c.setClass1(visitClass1(ctx.class1()));
        for (int i = 0; i < ctx.class3().size(); i++) {
            c.setClass3s(visitClass3(ctx.class3().get(i)));
        }
        return c;
    }

    @Override
    public class3 visitClass3(dartParser.Class3Context ctx) {
        class3 c=new class3();
        c.setClassdefinition(visitClass_definition(ctx.class_definition()));
        if (ctx.object_cubit()!=null){
            if (ctx.constructor()!=null)
                c.setConstructor(visitConstructor(ctx.constructor()));
            c.setObjectcupit(visitObject_cubit((ctx.object_cubit())));
            for (int i = 0; i < ctx.class4().size(); i++) {
                c.setClass4s(visitClass4(ctx.class4(i)));

            }

        }
        return c;
    }

    @Override
    public class4 visitClass4(dartParser.Class4Context ctx) {
        class4 c=new class4();
        if (ctx.declear_var()!=null){
            c.setDeclarevar(visitDeclear_var(ctx.declear_var()));
            return c;
        }
        if (ctx.function()!=null) {
            c.setFunction(visitFunction(ctx.function()));
            return c;
        }
        c.setList(visitList(ctx.list()));
        return c;
    }
    @Override
    public arguments1 visitArguments1(dartParser.Arguments1Context ctx) {
        arguments1 a=new arguments1();
        a.setType(ctx.TYPE().toString());
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        a.setVarname(v);
        return a;
    }

    @Override
    public arguments visitArguments(dartParser.ArgumentsContext ctx) {
        arguments a=new arguments();
        if (ctx.TYPE()!=null)
            a.setType(ctx.TYPE().toString());
        if (ctx.VAR_NAME()!=null){
            varname v=new varname();
            v.setString(ctx.VAR_NAME().toString());
            a.setVarname(v);
        }
        if (ctx.INDEX()!=null)
            a.setIndex(true);
        for (int i = 0; i < ctx.arguments1().size(); i++) {
            a.setArguments1s(visitArguments1(ctx.arguments1().get(i)));

        }
        return a;
    }

    @Override
    public block visitBlock(dartParser.BlockContext ctx) {
        block b=new block();
        for (int i = 0; i < ctx.declear_var().size(); i++) {
            b.setDeclarevars(visitDeclear_var(ctx.declear_var(i)));

        }
        return b;
    }

    @Override
    public function visitFunction(dartParser.FunctionContext ctx) {
        function f=new function();
        if (ctx.TYPE()!=null)
            f.setType(ctx.TYPE().toString());
        varname v=new varname();
        v.setString(ctx.VAR_NAME().toString());
        f.setVarname(v);
        for (int i = 0; i < ctx.arguments().size(); i++) {
            f.setArguments(visitArguments(ctx.arguments(i)));

        }
        f.setBlock(visitBlock(ctx.block()));
        return f;
    }
}




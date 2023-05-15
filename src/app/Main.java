package app;



import AST.Class.*;
import AST.Row.Row;
import AST.appBar.AppBar;
import AST.bloc_brovider.BlocProvider;
import AST.bloc_consumer.BlocConsumer;
import AST.builder.builder;
import AST.declarevar;
import AST.flexible_space.FlexibleSpace;
import AST.image.image;
import AST.listview.ic;
import AST.material_page_route.MaterialPageRoute;
import AST.navigator.Navigator;
import AST.object_value.ObjectValue;
import AST.on_long_press.OnLongPress;
import AST.ontap.ontap;
import AST.text.Text;
import Visit.*;
import AST.ifDart.IfDart;
import Compiler.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import sympoletable.SymboleTable;

import static org.antlr.v4.runtime.CharStreams.fromFileName;





public class Main {
    public static void main(String []args) {
      try{
          String source="Files/ss.txt";
          CharStream charStream=fromFileName(source);
          dartLexer lexer=new dartLexer(charStream);
          CommonTokenStream commonTokenStream=new CommonTokenStream(lexer);
          dartParser parser=new dartParser(commonTokenStream);
          dartParser.Class_lessContext parseTree=parser.class_less();
          visit v=new visit();
          ClassLess imp= (ClassLess) v.visit(parseTree);
          System.out.println("-------------------------\n\n\n");
          System.out.println(imp);





      }catch (Exception exception){}
    }




}

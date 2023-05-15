package AST.Class;
import AST.*;
import AST.build.*;
import java.util.ArrayList;
import java.util.List;
import AST.constructor.*;
public class ClassLess {
    varname varname;
    List<class4>class4s=new ArrayList<>();
    constructor constructor;
    build build;
    public ClassLess (){


    }

    public void setVarname(varname varname) {
        this.varname = varname;
    }

    public void setBuild(build build) {
        this.build = build;
    }
    public void addclass4(class4 class4 ){
        this.class4s.add(class4);

    }

    public void setConstructor(AST.constructor.constructor constructor) {
        this.constructor = constructor;
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("class "+varname+" extends StatelessWidget\n{\n");
        for (int i = 0; i < class4s.size(); i++) {
            s.append(class4s.get(i));
        }
        if (constructor!=null);
        s.append("\n"+constructor);
        s.append("\n@override\n"+build+"\n}");

    return s.toString();
    }
}

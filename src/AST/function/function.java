package AST.function;
import AST.varname;

import java.util.ArrayList;
import java.util.List;

public class function {
    String type=new String("void");
    varname varname;
    List<arguments> arguments;
    block block;

    public function() {
        arguments=new ArrayList<>();


    }

    public void setType(String type) {
        this.type = new String(type);
    }

    public void setVarname(AST.varname varname) {
        this.varname = varname;
    }

    public void setArguments(arguments arguments) {
        this.arguments.add(arguments);
    }

    public void setBlock(AST.function.block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();

           s.append(type+" ");
        s.append(varname);
        for (int i = 0; i < arguments.size(); i++) {
            s.append(arguments.get(i));

        }
       s.append(" "+block);
        return s.toString();
    }
}

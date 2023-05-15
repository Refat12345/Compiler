package AST.function;
import AST.varname;

import java.util.ArrayList;
import java.util.List;

public class arguments {
    String type;
    varname varname;
    boolean index=false;
    List<arguments1>arguments1s=new ArrayList<>();

    public void setVarname(AST.varname varname) {
        this.varname = varname;
    }

    public void setType(String type) {
        this.type = new String(type);
    }

    public void setArguments1s(arguments1 arguments1s) {
        this.arguments1s.add(arguments1s);
    }

    public void setIndex(boolean index) {
        this.index = index;
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("(");
        if (type!=null)
            s.append(type);
        if (varname!=null)
            s.append(" " +varname);
            if (index)
                s.append(" index");
        for (int i = 0; i < arguments1s.size(); i++) {
            s.append(arguments1s.get(i).toString());

        }
        s.append(")");
        return s.toString();
    }
}

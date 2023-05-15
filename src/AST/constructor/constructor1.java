package AST.constructor;
import AST.*;

import java.util.ArrayList;
import java.util.List;

public class constructor1 {
    List<varname> varnames;

    public constructor1() {
        this.varnames = new ArrayList<>();
    }

    public void setVarname(varname varname) {
        varnames.add(varname);
    }

    @Override
    public String toString() {
        if (varnames.size()==1)
        return "{"+varnames.get(0)+"}";
        else {
            StringBuilder s = new StringBuilder();
            s.append("{"+varnames.get(0));
            for (int i = 1; i <varnames.size() ; i++) {
                s.append(","+varnames.get(i));
            }
            s.append("}");
            return s.toString();
        }

    }
}

package AST.Class;

import AST.varname;

public class class1 {
    varname varname;
    public void setVarname(varname varname) {
        this.varname = varname;
    }


    @Override
    public String toString() {
        return "abstract class "+varname+" {}";
    }
}

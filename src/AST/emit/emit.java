package AST.emit;

import AST.*;

public class emit {
    varname varname=new varname();

    public void setVarname(varname varname) {
        this.varname = varname;
    }

    @Override
    public String toString() {
        return "emit("+varname+"());";
    }
}

package AST.image;

import AST.varname;

public class image2 {
AST.varname varname;
boolean ex;

    public void setVarname(AST.varname varname) {
        this.varname = varname;
    }

    public void setEx(boolean ex) {
        this.ex = ex;
    }

    @Override
    public String toString() {
        if (ex)
            return varname+"!";
        return varname+"";
    }
}

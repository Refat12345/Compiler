package AST;

import AST.val.val;

import java.util.ArrayList;

public class declarevars {
    varname varname;
    val val;


    public void setVarname(varname varname) {
        this.varname = varname;
    }

    public void setVal(val val) {
        this.val = val;
    }

    @Override
    public String toString() {
        if(val==null){
            return varname+"";
        }else {
            return varname+" = "+val;
        }
    }
}

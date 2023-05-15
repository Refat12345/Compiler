package AST.constructor;

import AST.varname;

import java.util.ArrayList;
import java.util.List;

public class constructor2 {
    List<varname>varnames;

    public constructor2() {
        this.varnames = new ArrayList<>();
    }
    public void addvarname(varname varname){
        varnames.add(varname);
    }

    @Override
    public String toString() {
        return ";\nthis."+varnames.get(0)+"="+varnames.get(1);
    }
}

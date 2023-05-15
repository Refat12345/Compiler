package AST.classdefinition;

import AST.varname;

import java.util.ArrayList;
import java.util.List;

public class classdefinition {
    List<varname>varnames;

    public classdefinition() {
        this.varnames = new ArrayList<>();
    }
    public void addvarname(varname varname){
        varnames.add(varname);
    }

    @Override
    public String toString() {
        if (varnames.size()==2)
        return "class "+varnames.get(0)+" extends "+varnames.get(1);
        return "class "+varnames.get(0)+" extends "+varnames.get(1)+" <"+varnames.get(2)+"> ";

    }
}

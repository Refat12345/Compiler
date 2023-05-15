package AST.ontap;

import AST.varname;

import java.util.ArrayList;
import java.util.List;

public class ontap {
    List<varname> string=new ArrayList<AST.varname>();


    public ontap() {
        this.string = new ArrayList<>();
    }
    public void addSting(varname ee) {
        this.string.add(ee);
    }

    @Override
    public String toString() {
        return "onTap:(){" +string.get(0).toString()+ ".get(context)."+string.get(1).toString()+"(index);"
                 +"}"
                ;
    }
}

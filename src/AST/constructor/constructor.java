package AST.constructor;

import AST.varname;

import java.util.ArrayList;
import java.util.List;

public class constructor {
    List<varname> varnames;
    constructor1 constructor1;
    List<constructor2> constructor2;

    public constructor() {
        this.varnames = new ArrayList<>();
        constructor2=new ArrayList<>();
    }
    public void addvarname(varname varname){
        varnames.add(varname);
    }

    public void setConstructor1(AST.constructor.constructor1 constructor1) {
        this.constructor1 = constructor1;
    }

    public void setConstructor2(AST.constructor.constructor2 constructor2) {
          this.constructor2.add(constructor2);
    }

    @Override
    public String toString() {

    StringBuilder s=new StringBuilder();
    s.append(varnames.get(0)+"(");
    if (constructor1!=null)
        s.append(constructor1);
    s.append(")");
    if (varnames.size()==2){
        s.append(":super("+varnames.get(1)+"());");
    }else {
        s.append("\n{\nthis."+varnames.get(1)+"="+varnames.get(2));
        for (int i = 0; i < constructor2.size(); i++) {
            s.append(constructor2.get(i));
        }
        s.append(";\n}");

    }
return s.toString();
}}

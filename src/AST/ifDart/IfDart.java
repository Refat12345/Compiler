package AST.ifDart;

import AST.string_val.stringval;
import AST.widget.wid;

import java.util.ArrayList;
import java.util.List;
import  AST.varname;
public class IfDart {
    List<varname> child1=new ArrayList<varname>();
    List<wid> child2= new ArrayList<wid>()  ;
    stringval stringval;



    public void setChild2(List<wid> child2) {
        this.child2 = child2;
    }

    public List<wid> getChild2() {
        return child2;
    }

    public void addchild1(varname text)
    {
        child1.add( text);

    }

    public void setString(stringval string) {
        this.stringval = string;
    }

    @Override
    public String toString() {
        if(child1.size()==1){
            return child1.get(0)+" == "+stringval+" ? "+ child2.get(0)+" : "+child2.get(1) ;
        }
        return child1.get(0)+".get(context)." + child1.get(1)
                +" == "+stringval+" ? "+ child2.get(0)+" : "+child2.get(1) ;

    }
}
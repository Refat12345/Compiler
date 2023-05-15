package AST.bloc_consumer;

import AST.builder.builder;
import AST.varname;
import AST.widget.Widget;
import AST.widget.wid;

import java.util.ArrayList;
import java.util.List;


public class BlocConsumer extends Widget {
    AST.builder.builder builder;
    List<AST.varname> varname;

    public BlocConsumer()
    {
        this.varname=new ArrayList<>();
    }

    public  void addChild(builder builder){
        this.builder=builder;
    }
    public void addString(varname v)
    {
        this.varname.add(v);
    }

    @Override
    public String toString() {
        return "BlocConsumer<"+varname.get(0).toString() +","+varname.get(1).toString()+">"+
                "(\n listener: (context,state) {} , \n" + builder  +
                ')';
    }
}

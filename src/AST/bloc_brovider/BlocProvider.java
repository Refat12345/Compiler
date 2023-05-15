package AST.bloc_brovider;

import AST.child.Child;
import AST.varname;
import AST.widget.Widget;

public class BlocProvider extends Widget {
    Child child;
    varname varname;

    public BlocProvider()
    {
        this.child=new Child();
        this.varname=new varname();
    }
public void addChild(Child child)
{
    this.child=child;
}
public void addString(varname varname)
{
    this.varname=varname;
}

    @Override
    public String toString() {
        return "BlocProvider( \n create: (context) =>" +varname.toString()+"(), \n "+child;
    }
}

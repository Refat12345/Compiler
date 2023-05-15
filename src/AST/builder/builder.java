package AST.builder;

import AST.widget.wid;

public class builder {
AST.widget.wid wid;

public void addChild(wid wid)
{
    this.wid=wid;
}

    @Override
    public String toString() {
        return "builder:(context,state){" +
                "return " + wid +";"+
                '}';
    }
}

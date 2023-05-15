package AST.spacer;

import AST.widget.Widget;

public class Spacer extends Widget {
    String string;

    public void addChild(String s)
    {
        this.string=new String(s);
    }

    @Override
    public String toString() {
        return "Spacer()" ;
    }
}

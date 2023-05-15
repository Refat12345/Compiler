package AST.flexible_space;

import AST.widget.wid;

public class FlexibleSpace {
    AST.widget.wid wid;

    public void addChild(wid wid)
    {
        this.wid=wid;
    }

    @Override
    public String toString() {
        return "flexibleSpace:" + wid ;
    }
}

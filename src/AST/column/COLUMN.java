package AST.column;


import AST.children.Children;
import AST.widget.Widget;

public class COLUMN extends Widget {
    Children child;
    boolean main=false;
    boolean cross=false;

    public void setCross(boolean cross) {
        this.cross = cross;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public void addchild(Children text) {
        child = text;
    }

    @Override
    public String toString() {
        if (cross)
            return "Column (crossAxisAlignment:CrossAxisAlignment.start,\n"+child+")";
        if (main)
            return "Column (mainAxisAlignment:MainAxisAlignment.center,\n"+child+")";

        return "Column(" + child +
                ')';
    }
}
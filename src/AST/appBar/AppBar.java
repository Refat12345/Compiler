package AST.appBar;

import AST.decoration.col;
import AST.flexible_space.FlexibleSpace;
import AST.tool_bar_height.ToolBarHeight;

public class AppBar {
    col color;
    FlexibleSpace flexibleSpace;
    ToolBarHeight toolBarHeight;
    public AppBar()
    {
        this.color=new col();
    }
    public void addChild(col color)
    {
        this.color=color;
    }
    public void addChild1(FlexibleSpace flexibleSpace)
    {
        this.flexibleSpace=flexibleSpace;
    }

    public void addChild2(ToolBarHeight toolBarHeight)
    {
        this.toolBarHeight=toolBarHeight;
    }

    @Override
    public String toString() {
       if(flexibleSpace!=null)
       {
           return "appBar:AppBar(" +toolBarHeight +",\n"+ flexibleSpace+
                   ")";

       }else
           return "appBar:AppBar(" +
                   "backgroundColor:"+ color +
                   ")";
    }
}


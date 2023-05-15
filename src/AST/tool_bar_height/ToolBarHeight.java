package AST.tool_bar_height;

public class ToolBarHeight {
      String number;

    public  ToolBarHeight()
    {
        this.number=new String();
    }
    public void addChild(String text)
    {
        this.number=new String(text);
    }

    @Override
    public String toString() {
        return "" +
                "toolbarHeight:" + number  ;
    }
}

package AST.text;

import AST.string_val.stringval;
import AST.widget.Widget;

import java.util.ArrayList;

public class Text  extends Widget {
ArrayList<stringval> text;
 ArrayList<String> string;
 Style style;
 public boolean aBoolean=false;
 String index;

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public Text()
{

    this.text=new ArrayList<>();
    this.string=new ArrayList<>();
}


    public void addChild(stringval s)

{
text.add(s);
}


    public void setString(String string) {
        this.string.add(string);
    }

    public void addStyle(Style style)
    {
        this.style=style;
    }

    @Override
    public String toString() {

        if(string.size()==0)
        {

            if (text.get(0)==null)
                return "Text('') ";
            return "Text("+text.get(0)+")";
        }

        else if(text.size()==0)
        {
            if(string.size()==2&&style==null)
            {

               if(aBoolean==false){
                   return "Text("+string.get(0)+ ".get(context)."+string.get(1)+")";

               }
               else  { return "Text("+string.get(0)+string.get(1)+")";}
            } else if(style!=null)
            {
                return "Text("+string.get(0)+ string.get(1)+","+style;
            }
            return "Text("+string.get(0)+")";
        }

        else{
            return "Text("+string.get(0)+".get(context)."+string.get(1)+"[index]"+"["+text.get(0)+"])";}

    }
}

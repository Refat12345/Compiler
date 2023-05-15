package AST.text;

import java.util.ArrayList;
import java.util.List;

public class Style {
    List<String> stringList=new ArrayList<>();

    public void addString(String string)
    {
        stringList.add(string);
    }

    @Override
    public String toString() {
        return "style: TextStyle( fontWeight:FontWeight."+ stringList.get(0) +",fontSize:"+stringList.get(1)+
                ')';
    }
}

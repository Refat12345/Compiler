package AST.object_value;

import AST.string_val.stringval;
import AST.value;
import AST.varname;

import java.util.ArrayList;
import java.util.List;

public class ObjectValue extends value {
List<varname> varnameList;
    stringval stringval;
    public ObjectValue()
    {
        this.stringval=new stringval();
        this.varnameList=new ArrayList<>();
    }

   public void addString(stringval stringval)
    {
        this.stringval=stringval;
    }
   public void addVarName(varname text)
    {
        this.varnameList.add(text);
    }

    @Override
    public String toString() {
      if(varnameList.size()==1)
      {
          return varnameList.get(0).toString()+"[index]["+stringval+"]";
      }
      else
          return varnameList.get(0).toString()+".get(context)."+varnameList.get(1).toString() +"[index]["+stringval+"]";
    }
}

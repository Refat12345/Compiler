package AST.material_page_route;

import AST.varname;

import java.util.ArrayList;
import java.util.List;

public class MaterialPageRoute {
    List<varname> varname=new ArrayList<>();

    public void addString(varname varname)
    {
        this.varname.add(varname);
    }

    @Override
    public String toString() {
        if(varname.size()==1)
            return "MaterialPageRoute(builder: (context)=>" + varname.get(0).toString() +"()"
                    +')';
        else
        {
          StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(varname.get(1).toString()+":"+varname.get(2).toString());
            for(int i=3;i<varname.size();i+=2){
                stringBuilder.append(","+varname.get(i).toString()+":"+varname.get(i+1).toString());
            }

             return "MaterialPageRoute(builder: (context)=>" + varname.get(0).toString() +"("+stringBuilder.toString() +")"
                +')';
        }
    }
}

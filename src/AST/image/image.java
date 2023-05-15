package AST.image;

import java.util.*;
import AST.string_val.*;
import AST.varname;
import AST.widget.Widget;

public class image extends Widget {
    stringval stringval;
    ArrayList <varname>varnames;
    image1 image1;
    image2 image2;

    public image(){

        varnames=new ArrayList<>();

    }

    public void setStringval(stringval stringval) {
        this.stringval = stringval;
    }

    public void addvarname(varname v){
        varnames.add(v);
    }

    public void setImage1(image1 image1) {
        this.image1 = image1;
    }

    public void setImage2(AST.image.image2 image2) {
        this.image2 = image2;
    }

    @Override
    public String toString() {
       if (varnames.size()==0){
           if (image2!=null) {
               if (image1 != null)
                   return "Image.asset(" + image2  + image1+ ")";
           return "Image.asset(" + image2 + ")";
           }
           if (image1!=null)
               return "Image.asset("+stringval+image1+ ")";
           return "Image.asset("+stringval+")";
       }else if (varnames.size()==1){
           if (stringval!=null){
               if (image1!=null)
               return "Image.asset("+varnames.get(0)+"[index]["+stringval+"]"+image1+ ")";
               return "Image.asset("+varnames.get(0)+"[index]["+stringval+"]";
           }else {
               if (image1!=null)
                   return "Image.asset(("+varnames.get(0)+")"+image1+ ")";
               return "Image.asset(("+varnames.get(0)+"))";
           }

       }else {
           if (stringval!=null){
               if (image1!=null)
                   return "Image.asset("+varnames.get(0)+".get(context)."+varnames.get(1)+"[index]["+stringval+"]"+image1+ ")";
               return "Image. asset("+varnames.get(0)+".get(context)."+varnames.get(1)+"[index]["+stringval+"])";
           }
           else {
               if (image1!=null)
                   return "Image.asset("+varnames.get(0)+".get(context)."+varnames.get(1)+image1+ ")";
               return "Image.asset("+varnames.get(0)+".get(context)."+varnames.get(1)+")";
           }
       }





    }
}

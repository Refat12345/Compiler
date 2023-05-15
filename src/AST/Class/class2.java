package AST.Class;
import AST.Import.*;

import java.util.ArrayList;
import java.util.List;

public class class2 {

List<Import>imports=new ArrayList<>();
class1 class1;
List<class3>class3s=new ArrayList<>();

    public void setClass1(AST.Class.class1 class1) {
        this.class1 = class1;
    }

    public void setImports(Import imports) {
        this.imports.add(imports);
    }

    public void setClass3s(class3 class3s) {
        this.class3s.add( class3s);
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < imports.size(); i++) {
            s.append(imports.get(i)+"\n");
        }
        if (class1!=null)
            s.append(class1+"\n");
        for (int i = 0; i < class3s.size(); i++) {
            s.append(class3s.get(i)+"\n");
        }
        return s.toString();
    }
}

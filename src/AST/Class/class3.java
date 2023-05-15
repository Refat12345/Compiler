package AST.Class;
import AST.classdefinition.*;
import AST.constructor.*;
import AST.Class.*;
import AST.objectcubit.objectcupit;

import java.util.ArrayList;
import java.util.List;

public class class3 {
    classdefinition classdefinition;
    constructor constructor;
    AST.objectcubit.objectcupit objectcupit;
    List<class4>class4s=new ArrayList<>();

    public void setClass4s(class4 class4s) {
        this.class4s.add(class4s);
    }

    public void setClassdefinition(AST.classdefinition.classdefinition classdefinition) {
        this.classdefinition = classdefinition;
    }

    public void setConstructor(constructor constructor) {
        this.constructor = constructor;
    }

    public void setObjectcupit(objectcupit objectcupit) {
        this.objectcupit = objectcupit;
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append(classdefinition+" {\n");
        if (objectcupit!=null){
            if (constructor!=null)
                s.append(constructor+"\n");
            s.append(objectcupit+"\n");
            for (int i = 0; i < class4s.size(); i++) {
                s.append(class4s.get(i)+"\n");

            }

        }
        s.append("\n}");
        return s.toString();

    }
}

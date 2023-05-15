package AST.Class;

import AST.Import.Import;

import java.sql.SQLOutput;
import java.util.ArrayList;


public class Classs {
    ArrayList<Import> imports=new ArrayList<>();
    ClassLess classLess;
    ClassFull classFull;

    public void p(){
        System.out.println('a');
    }
    public void setClassFull(ClassFull classFull) {
        this.classFull = classFull;
    }

    public void setClassLess(ClassLess classLess) {
        this.classLess = classLess;
    }

    public void setImports(Import imports) {
        this.imports.add(imports);
    }

    @Override
    public String toString() {
        System.out.println('a');
       StringBuilder s=new StringBuilder();

        for (int i = 0; i < imports.size(); i++) {
           s.append(imports.get(i)) ;
        }
        if (classFull!=null)
            s.append(classFull);
        if (classLess!=null)
            s.append(classLess);
        return s.toString();
    }
}

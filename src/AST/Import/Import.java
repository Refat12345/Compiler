package AST.Import;

import AST.string_val.stringval;

public class Import   {

    stringval child;

    public Import() {
        child=new stringval();
    }

    public void addchild(stringval text) {
        child=text;
    }

    @Override
    public String toString() {
        return "import " + child + ";\n";
    }
}
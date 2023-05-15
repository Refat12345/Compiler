package AST.function;
import AST.*;
public class arguments1 {
    varname varname;
    String type;

    public void setType(String type) {
        this.type =new String( type);
    }

    public void setVarname(AST.varname varname) {
        this.varname = varname;
    }

    @Override
    public String toString() {
        return ","+type+" "+varname;
    }
}

package AST.objectcubit;
import AST.*;
public class objectcupit {

varname varname;

    public void setVarname(varname varname) {
        this.varname = varname;
    }

    @Override
    public String toString() {
        return "static "+ varname+" get(context)=>BlocProvider.of(context);";
    }
}

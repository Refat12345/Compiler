package AST;

import AST.emit.emit;
import AST.val.*;
import AST.string_val.*;
import java.util.ArrayList;
import java.util.List;

public class declarevar {
    String type;
    boolean qmark;
    varname varname;
    val val;
    List<declarevars>declarevars;
    emit emit;
    public declarevar(){
        declarevars=new ArrayList<>();
        qmark=false;

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQmark(boolean qmark) {
        this.qmark = qmark;
    }

    public void setVarname(AST.varname varname) {
        this.varname = varname;
    }

    public void setVal(AST.val.val val) {
        this.val = val;
    }

    public void setEmit(AST.emit.emit emit) {
        this.emit = emit;
    }

    public void addval(declarevars v) {
        declarevars.add(v);
    }



    @Override
    public String toString() {
        if (emit!=null)
            return emit+"";
        StringBuilder s=new StringBuilder();
        if (type!=null){
            s.append(type+' ');
            if (qmark)
                s.append("? ");}
        else s.append("var ");
        s.append(varname);
        if(val!=null) {
            s.append(" = " + val.toString() + ' ');
        }
        for (int i = 0; i < declarevars.size(); i++) {
            s.append(","+declarevars.get(i));
        }
        s.append(";");
        return s.toString()+ "\n";



    }
}

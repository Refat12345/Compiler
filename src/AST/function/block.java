package AST.function;

import AST.declarevar;

import java.util.ArrayList;
import java.util.List;

public class block {
    List<declarevar>declarevars;

    public block() {
        this.declarevars = new ArrayList<>();
    }

    public void setDeclarevars(declarevar declarevars) {
        this.declarevars.add(  declarevars);
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("{\n ");
        for (int i = 0; i < declarevars.size(); i++) {
            s.append(declarevars.get(i)+"");
        }
        s.append(" \n}");
        return s.toString();
    }
}

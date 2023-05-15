package AST.image;

public class image1 {
    boolean fill=false;

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        if (fill)
            return ",fit:BoxFit.fill";
        return ",fit:BoxFit.cover";
    }
}

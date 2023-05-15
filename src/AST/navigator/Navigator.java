package AST.navigator;

import AST.material_page_route.MaterialPageRoute;

public class Navigator {
    MaterialPageRoute materialPageRoute;

    public Navigator()
    {
        this.materialPageRoute=new MaterialPageRoute();
    }

    public void addChild(MaterialPageRoute materialPageRoute)
    {
        this.materialPageRoute=materialPageRoute;
    }

    @Override
    public String toString() {
        return "Navigator.push(context,"+materialPageRoute +
                ')';
    }
}

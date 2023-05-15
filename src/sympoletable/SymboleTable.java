package sympoletable;

import java.util.ArrayList;

public class SymboleTable {
    ArrayList<Row> rows = new ArrayList<>();

    public SymboleTable() {
        Row row = new Row();
        row.setType("KEY");
        row.setVal("     Value");
        Row row1 = new Row();
        row1.setType("");
        row1.setVal("");


        this.getRows().add(row);
        this.getRows().add(row1);

    }

    public ArrayList<Row> getRows() {


        return rows;
    }

    public void setRows(ArrayList<Row> rows) {

        this.rows = rows;
    }

    public void Print(){
        if(rows.size()<30)
            return;
        for(int i=0;i<rows.size();i++){
            if(rows.get(i)!=null)
            {
                System.out.println(rows.get(i).getType() + "\t\t\t\t" + rows.get(i).getVal());
            }
        }
        //System.out.println(rows.size());

    }
}

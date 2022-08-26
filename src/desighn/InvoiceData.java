
package desighn;

import java.util.ArrayList;


public class InvoiceData {
    private int no;
    private String date;
    private String customername;
    private ArrayList<InvoiceItemData> items;

    public InvoiceData(int no, String date, String customername) {
        this.no = no;
        this.date = date;
        this.customername = customername;
     
    }
    

    public InvoiceData() {
    }

    public InvoiceData(int no, String date, String customername, ArrayList<InvoiceItemData> items) {
        this.no = no;
        this.date = date;
        this.customername = customername;
        this.items = items;
    }
    


    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<InvoiceItemData> getItems() {
         if(items == null)
        {
           items = new ArrayList<>();
        }
        return items;
    }

    public void setItems(ArrayList<InvoiceItemData> items) {
        this.items = items;
    }

    public double getInvoiceTotal()
    {
    double sum=0;
    for(InvoiceItemData item :getItems())
    {
        sum=sum+item.getItemTotal();
    }
    return sum;
    }
    
     public String getCSV() {
        return no + "," + date + "," + customername;
    }
    
    
    
}

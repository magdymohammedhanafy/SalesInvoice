
package desighn;


public class InvoiceItemData {
    private int no;
    private String itemname;
    private double itemprice;
    private double count;
    private InvoiceData invoicedata;

    public InvoiceItemData(int no, String itemname, double itemprice, double count, InvoiceData invoicedata) {
        this.no = no;    

        this.itemname = itemname;
        this.itemprice = itemprice;
        this.count = count;
        this.invoicedata = invoicedata;
    }

    public InvoiceItemData() {
    }

    public InvoiceItemData(String itemname, double itemprice, double count, InvoiceData invoicedata) {
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.count = count;
        this.invoicedata = invoicedata;
    }

    public InvoiceItemData(int no, String itemname, double itemprice, double count) {
        this.no = no;
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }
    
     public double getItemTotal()
    {
    return itemprice*count;    
    }
     
       public String getCSV() {
        return invoicedata.getNo() + "," + itemname + "," + itemprice + "," + count;
    }

   
    
    
}

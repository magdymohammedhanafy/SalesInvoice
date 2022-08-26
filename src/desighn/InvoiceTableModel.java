
package desighn;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoiceTableModel extends AbstractTableModel {
    
    private ArrayList<InvoiceData> invoices ;
    private String[] col={"No.","Date","Customer","Total"};

    public InvoiceTableModel(ArrayList<InvoiceData> invoices) {
        this.invoices = invoices;
    }
    

    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        
    return col.length;    
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceData invoice=invoices.get(rowIndex);
        
        switch(columnIndex){
            case 0:return invoice.getNo();
                
            case 1:return invoice.getDate();
                
            case 2:return  invoice.getCustomername();
             
            case 3:return  invoice.getInvoiceTotal();
            
            default :return "NO";
                
        }
        
    }
      
    @Override
   public String getColumnName(int column)
   {
       return col[column];
   }
   
    
}

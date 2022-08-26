/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desighn;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ItemsTableModel extends AbstractTableModel {
    
    private ArrayList<InvoiceItemData> items ;
    private String[] col={"No.","Item Name","Price","Count","Total"};

    public ItemsTableModel(ArrayList<InvoiceItemData> items) {
        this.items = items;
    }
    

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceItemData item=items.get(rowIndex);
        
             switch(columnIndex){
            case 0:return item.getNo();
                
            case 1:return item.getItemname();
                
            case 2:return  item.getItemprice();
            
            case 3:return  item.getCount();
             
            case 4:return  item.getItemTotal();
            
            default :return "NO";
                
        }
        
    }
   public String getColumnName(int column)
   {
       return col[column];
   }
    
}

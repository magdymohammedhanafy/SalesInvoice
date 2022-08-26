
package control;

//import java.awt.List;
import desighn.InvoiceData;
import desighn.InvoiceItemData;
import desighn.InvoiceTableModel;
import desighn.ItemsTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import screen.GUI;

import screen.InvoiceAddition;
import screen.ItemAddition;



 public class Control implements ActionListener,ListSelectionListener {
     private GUI gui;
     private InvoiceAddition invoiceAdd;
     private ItemAddition invoiceItemAdd;
     
     public Control (GUI gui){
         this.gui=gui;
     }
             

    @Override
    public void actionPerformed(ActionEvent e) {
       String actionCommand=e.getActionCommand();
       switch(actionCommand)
       {
           case "LoadFile":
               loadFile();
             // System.out.println("magdy");
               break;
           case "SaveFile":
               saveFile();
               break;
           case  "Creat New Invoice":
               createNewInvoice();
               break;
           case  "Delete Invoice":
               deleteInvoice();
               break;
           case  "Creat New Item":
               creatNewItem();
               break;
           case "Delete Item":
               deleteItem();
               break;
           case "InvoiceOK":
               invoiceOk();
               break;
           case "InvoiceCancel":
               invoiceCancel();
               break;
           case "LineOK":
               lineOK();
               break;
           case "LineCancel":
               lineCancel();
               break;
               
       }
    }
    
      @Override
    public void valueChanged(ListSelectionEvent e) {
        
        int selectedIn=gui.getInvoicetable().getSelectedRow();
        if(selectedIn>-1)
        {
        InvoiceData cuInvoice=gui.getInvoicedata().get(selectedIn);
        gui.getInvoicenumberlabel().setText(""+cuInvoice.getNo());
        gui.getInvoicedatelabel().setText(cuInvoice.getDate());
        gui.getInvoicetotallabel().setText(""+cuInvoice.getInvoiceTotal());
        gui.getCustomernamelabel().setText(cuInvoice.getCustomername());
        ItemsTableModel  itemsTableModel=new  ItemsTableModel(cuInvoice.getItems());
        gui.getInvoiceitemtable().setModel(itemsTableModel);
        itemsTableModel.fireTableDataChanged();
        }
    }   
    private void loadFile() {
         System.out.println("Acti");
     JFileChooser chooser=new JFileChooser();
    try{
     int ret=chooser.showOpenDialog(gui);
     if(ret==JFileChooser.APPROVE_OPTION)
     {
         File selectedFile =chooser.getSelectedFile();
         Path selectedPath =Paths.get(selectedFile.getAbsolutePath());
         List<String> lines=Files.readAllLines(selectedPath);
         ArrayList<InvoiceData> arr=new ArrayList<>();
         for(String line:lines)
         {
             String[] invoiceComponenet=line.split(",");
             int num= Integer.parseInt(invoiceComponenet[0]);
             String date=invoiceComponenet[1];
             String customer=invoiceComponenet[2];
             InvoiceData Invoice=new InvoiceData( num,date,customer);
             arr.add(Invoice);   
         }
         ret=chooser.showOpenDialog(gui);
         if(ret==JFileChooser.APPROVE_OPTION)
         {
         File selectedFileItem =chooser.getSelectedFile();
         Path selectedPathItem =Paths.get(selectedFileItem.getAbsolutePath());
         List<String> LinesItem=Files.readAllLines(selectedPathItem);
         ArrayList<InvoiceItemData> ArrItem=new ArrayList<>();
         for(String lineIem:LinesItem)
         {
             String[] itemComponenet=lineIem.split(",");
             int num= Integer.parseInt(itemComponenet[0]);
             String name=itemComponenet[1];
             double price=Double.parseDouble(itemComponenet[2]);
             double count=Double.parseDouble(itemComponenet[3]);
             InvoiceData fInvoice=null;
             for(InvoiceData invoice:arr){
                 if(invoice.getNo()== num){
                  fInvoice= invoice;
                 }
                          
             } 
              InvoiceItemData invoiceItem= new InvoiceItemData(num,  name,  price,  count,  fInvoice);
              fInvoice.getItems().add(invoiceItem);
            
         }
     
     }
                gui.setInvoicedata(arr);
                InvoiceTableModel invoiceTableModel=new InvoiceTableModel(arr) ;
                gui.setInvoiceTable(invoiceTableModel);
                gui.getInvoicetable().setModel(invoiceTableModel);
                gui.getInvoiceTable().fireTableDataChanged();
                
                //gui.getInvoiceTable()
         
     }
    }catch(IOException exception)
    {
        exception.printStackTrace();
    }
    }



    private void saveFile() {
         System.out.println("magdy");
              ArrayList<InvoiceData> invoices = gui.getInvoicedata();
        String headers = "";
        String lines = "";
        for (InvoiceData invoice : invoices) {
            String invCSV = invoice.getCSV();
            headers += invCSV;
            headers += "\n";

            for (InvoiceItemData item : invoice.getItems()) {
                String lineCSV = item.getCSV();
                lines += lineCSV;
                lines += "\n";
            }
        }
     
        try {
            JFileChooser fc = new JFileChooser();
            int result = fc.showSaveDialog(gui);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                FileWriter hfw = new FileWriter(headerFile);
                hfw.write(headers);
                hfw.flush();
                hfw.close();
                result = fc.showSaveDialog(gui);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File lineFile = fc.getSelectedFile();
                    FileWriter lfw = new FileWriter(lineFile);
                    lfw.write(lines);
                    lfw.flush();
                    lfw.close();
                }
            }
        } catch (Exception ex) {

        }
    }

    private void createNewInvoice() {
        invoiceAdd=new InvoiceAddition(gui);
        invoiceAdd.setVisible(true);
    }

    private void deleteInvoice() {
        int selectedInvoiceRow=gui.getInvoicetable().getSelectedRow();
        if(selectedInvoiceRow>-1)
        {
            gui.getInvoicedata().remove(selectedInvoiceRow);
            gui.getInvoiceTable().fireTableDataChanged();
        }
    }

    private void creatNewItem() {
        invoiceItemAdd = new ItemAddition(gui);
        invoiceItemAdd.setVisible(true);
       
        
    }

    private void deleteItem() {
        int selectedInvoice=gui.getInvoicetable().getSelectedRow();
        int selectedInvoiceRow=gui.getInvoiceitemtable().getSelectedRow();
        if((selectedInvoice!=-1)&&(selectedInvoiceRow!=-1))
        {
            InvoiceData invoice=gui.getInvoicedata().get(selectedInvoice);
            invoice.getItems().remove(selectedInvoiceRow);
           ItemsTableModel itemsTableModel=new ItemsTableModel(invoice.getItems());
           gui.getInvoiceitemtable().setModel(itemsTableModel);
           itemsTableModel.fireTableDataChanged();
        }
    }

    private void invoiceOk() {
        System.out.println("Acti");
            String date = invoiceAdd.getInvoiceDate().getText();
        String customer = invoiceAdd.getCustName().getText();
        int num = gui.getNextInvoiceNo();
        try {
            String[] dateParts = date.split("-");  
            if (dateParts.length < 3) {
                JOptionPane.showMessageDialog(gui, "Wrong date format", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int day = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);
                if (day > 31 || month > 12) {
                    JOptionPane.showMessageDialog(gui, "Wrong date format", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    InvoiceData invoice = new  InvoiceData(num, date, customer);
                    gui.getInvoicedata().add(invoice);
                    gui.getInvoiceTable().fireTableDataChanged();
                    invoiceAdd.setVisible(false);
                    invoiceAdd.dispose();
                    invoiceAdd = null;
                }
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(gui, "Wrong format", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void invoiceCancel() {
        invoiceAdd.setVisible(false);
        invoiceAdd.dispose();
        invoiceAdd = null;
    }

    private void lineOK() {
        System.out.println("Act");
        String itemname = invoiceItemAdd.getItemName().getText();
        String countS = invoiceItemAdd.getItemCount().getText();
        String priceS = invoiceItemAdd.getItemPrice().getText();
        int count = Integer.parseInt(countS);
        double itemprice = Double.parseDouble(priceS);
        int selectedInvoice = gui.getInvoicetable().getSelectedRow();
        if (selectedInvoice != -1) {
            InvoiceData invoicedata = gui.getInvoicedata().get(selectedInvoice);
            InvoiceItemData line = new InvoiceItemData( itemname,  itemprice,  count,  invoicedata);
            invoicedata.getItems().add(line);
            ItemsTableModel itemsTableModel = (ItemsTableModel) gui.getInvoiceitemtable().getModel();
            itemsTableModel.fireTableDataChanged();
            gui.getInvoiceTable().fireTableDataChanged();
        }
        invoiceItemAdd.setVisible(false);
        invoiceItemAdd.dispose();
        invoiceItemAdd = null;
        
    }

    private void lineCancel() {
        invoiceItemAdd.setVisible(false);
        invoiceItemAdd.dispose();
        invoiceItemAdd = null;
    }

    

    
    
}

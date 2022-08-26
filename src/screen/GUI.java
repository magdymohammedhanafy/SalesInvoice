/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import control.Control;
import desighn.InvoiceData;
import desighn.InvoiceTableModel;
import static java.awt.SystemColor.control;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author CompuCity
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoicetable = new javax.swing.JTable();
        invoicetable.getSelectionModel().addListSelectionListener(control);
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceitemtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invoicenumberlabel = new javax.swing.JLabel();
        invoicedatelabel = new javax.swing.JLabel();
        customernamelabel = new javax.swing.JLabel();
        invoicetotallabel = new javax.swing.JLabel();
        creatnewinvoicebutton = new javax.swing.JButton();
        deleteinvoicebutton = new javax.swing.JButton();
        deleteinvoicebutton.addActionListener(control);
        creatnewitembutton = new javax.swing.JButton();
        deleteitembutton = new javax.swing.JButton();
        deleteitembutton.addActionListener(control);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadfile = new javax.swing.JMenuItem();
        loadfile.addActionListener(control);
        savefile = new javax.swing.JMenuItem();
        savefile.addActionListener(control);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(invoicetable);

        invoiceitemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(invoiceitemtable);

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        creatnewinvoicebutton.setText("Creat New Invoice");
        creatnewinvoicebutton.addActionListener(control);

        deleteinvoicebutton.setText("Delete Invoice");

        creatnewitembutton.setText("Creat New Item");
        creatnewitembutton.addActionListener(control);

        deleteitembutton.setText("Delete Item");
        deleteitembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitembuttonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        loadfile.setText("LoadFile");
        loadfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadfileActionPerformed(evt);
            }
        });
        jMenu1.add(loadfile);

        savefile.setText("SaveFile");
        jMenu1.add(savefile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoicetotallabel)
                                    .addComponent(customernamelabel)
                                    .addComponent(invoicedatelabel)
                                    .addComponent(invoicenumberlabel)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(creatnewinvoicebutton)
                        .addGap(179, 179, 179)
                        .addComponent(deleteinvoicebutton)
                        .addGap(48, 48, 48)
                        .addComponent(creatnewitembutton)
                        .addGap(115, 115, 115)
                        .addComponent(deleteitembutton)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invoicenumberlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invoicedatelabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customernamelabel))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invoicetotallabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatnewinvoicebutton)
                    .addComponent(deleteinvoicebutton)
                    .addComponent(creatnewitembutton)
                    .addComponent(deleteitembutton))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadfileActionPerformed

    private void deleteitembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitembuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteitembuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creatnewinvoicebutton;
    private javax.swing.JButton creatnewitembutton;
    private javax.swing.JLabel customernamelabel;
    private javax.swing.JButton deleteinvoicebutton;
    private javax.swing.JButton deleteitembutton;
    private javax.swing.JLabel invoicedatelabel;
    private javax.swing.JTable invoiceitemtable;
    private javax.swing.JLabel invoicenumberlabel;
    private javax.swing.JTable invoicetable;
    private javax.swing.JLabel invoicetotallabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadfile;
    private javax.swing.JMenuItem savefile;
    // End of variables declaration//GEN-END:variables
    private ArrayList<InvoiceData>invoicedata;
    private Control control=new Control(this);
    private InvoiceTableModel invoiceTable;

    public ArrayList<InvoiceData> getInvoicedata() {
        return invoicedata;
    }

    public void setInvoicedata(ArrayList<InvoiceData> invoicedata) {
        this.invoicedata = invoicedata;
    }

    public InvoiceTableModel getInvoiceTable() {
        return invoiceTable;
    }

    public void setInvoiceTable(InvoiceTableModel invoiceTable) {
        this.invoiceTable = invoiceTable;
    }

    public JTable getInvoicetable() {
        return invoicetable;
    }

    public javax.swing.JTable getInvoiceitemtable() {
        return invoiceitemtable;
    }

    public JLabel getCustomernamelabel() {
        return customernamelabel;
    }

    public JLabel getInvoicedatelabel() {
        return invoicedatelabel;
    }

    public JLabel getInvoicenumberlabel() {
        return invoicenumberlabel;
    }

    public JLabel getInvoicetotallabel() {
        return invoicetotallabel;
    }

    public Control getControl() {
        return control;
    }

    public int getNextInvoiceNo() {
            int no = 0;
        
        for (InvoiceData invoice : getInvoicedata()) {
            if (invoice.getNo() > no) 
                no = invoice.getNo();
        }
        
        return ++no;
    }
      public int getInvoiceNo() {
            int no = 0;
        
        for (InvoiceData invoice : getInvoicedata()) {
            if (invoice.getNo() > no) 
                no = invoice.getNo();
        }
        
        return no;
    }
    
    

    

  
}

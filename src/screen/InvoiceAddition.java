package screen;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import screen.GUI;

/**
 *
 * @author DELL
 */
public class InvoiceAddition extends JDialog {
    private JTextField custName;
    private JTextField invoiceDate;
    private JLabel customerNameLable;
    private JLabel invoiceDateLable;
    private JButton okButton;
    private JButton cancelButton;

    public InvoiceAddition(GUI gui) {
        customerNameLable = new JLabel("Customer Name:");
        custName = new JTextField(20);
        invoiceDateLable = new JLabel("Invoice Date:");
        invoiceDate = new JTextField(20);
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("InvoiceOK");
        cancelButton.setActionCommand("InvoiceCancel");
        
        okButton.addActionListener(gui.getControl());
        cancelButton.addActionListener(gui.getControl());
        setLayout(new GridLayout(3, 2));
        
        add(invoiceDateLable);
        add(invoiceDate);
        add(customerNameLable);
        add(custName);
        add(okButton);
        add(cancelButton);
        
        pack();
        
    }

    public JTextField getCustName() {
        return custName;
    }

    public JTextField getInvoiceDate() {
        return invoiceDate;
    }
    
}

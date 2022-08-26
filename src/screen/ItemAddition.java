/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class ItemAddition extends JDialog{
    private JTextField itemName;
    private JTextField itemCount;
    private JTextField itemPrice;
    private JLabel itemNameLable;
    private JLabel itemCountLable;
    private JLabel itemPriceLable;
    private JButton okButton;
    private JButton cancelButton;
    
    public ItemAddition(GUI gui) {
        itemName = new JTextField(20);
        itemNameLable = new JLabel("Item Name");
        
        itemCount = new JTextField(20);
        itemCountLable = new JLabel("Item Count");
        
        itemPrice = new JTextField(20);
        itemPriceLable = new JLabel("Item Price");
        
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("LineOK");
        cancelButton.setActionCommand("LineCancel");
        
        okButton.addActionListener(gui.getControl());
        cancelButton.addActionListener(gui.getControl());
        setLayout(new GridLayout(5, 3));
        
        add(itemNameLable);
        add(itemName);
        add(itemCountLable);
        add(itemCount);
        add(itemPriceLable);
        add(itemPrice);
        add(okButton);
        add(cancelButton);
        
        pack();
    }

    public JTextField getItemName() {
        return itemName;
    }

    public JTextField getItemCount() {
        return itemCount;
    }

    public JTextField getItemPrice() {
        return itemPrice;
    }
}

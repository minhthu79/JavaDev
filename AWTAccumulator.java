/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Pham Thanh
 */
import java.awt.*;
import java.awt.event.*;
public class AWTAccumulator  extends Frame implements ActionListener {
   private Label lblInput;     
   private Label lblOutput;    
   private TextField tfInput;  
   private TextField tfOutput; 
   private int sum = 0;
 
   // Constructor to setup the GUI components and event handlers
   public AWTAccumulator() {
      setLayout(new FlowLayout());
         // "super" Frame (container) sets layout to FlowLayout, which arranges
         // the components from left-to-right, and flow to next row from top-to-bottom.
 
      lblInput = new Label("Enter an Integer: "); // Construct Label
      add(lblInput);               // "super" Frame container adds Label component
 
      tfInput = new TextField(10); // Construct TextField
      add(tfInput);                // "super" Frame adds TextField
 
      tfInput.addActionListener(this);
         // "tfInput" is the source object that fires an ActionEvent upon entered.
         // The source add "this" instance as an ActionEvent listener, which provides
         //  an ActionEvent handler called actionPerformed().
         // Hitting "enter" on tfInput invokes actionPerformed().
 
      lblOutput = new Label("The Accumulated Sum is: ");  // allocate Label
      add(lblOutput);               // "super" Frame adds Label
 
      tfOutput = new TextField(10); // allocate TextField
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);                // "super" Frame adds TextField
 
      setTitle("AWT Accumulator");  // "super" Frame sets title
      setSize(350, 120);  // "super" Frame sets initial window size
      setVisible(true);   // "super" Frame shows
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor to setup the GUI, by allocating an anonymous instance
      new AWTAccumulator();
   }
 
   // ActionEvent handler - Called back upon hitting "enter" key on TextField
   @Override
   public void actionPerformed(ActionEvent evt) {
      // Get the String entered into the TextField tfInput, convert to int
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      // Accumulate numbers entered into sum
      tfInput.setText("");  // Clear input TextField
      tfOutput.setText(sum + ""); // Display sum on the output TextField
                                  // convert int to String
   }
}

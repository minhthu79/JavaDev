
import java.awt.*;
import java.awt.event.*;
public class tong extends Frame implements ActionListener
{
    Label lblso1=new Label("Nhập số thứ nhất");
    Label lblso2=new Label("Nhập số thứ hai");
    Label lbltong=new Label("Tổng hai số là");
    TextField txtso1=new TextField();
    TextField txtso2=new TextField();
    TextField txttong=new TextField();
    public tong()
    {
        this.add(lblso1);
        this.add(txtso1);
        this.add(lblso2);
        this.add(txtso2);
        this.add(lbltong);
        this.add(txttong);
        txtso2.addActionListener(this);
        txttong.setEditable(false);
        this.setLayout(new FlowLayout());
    }   
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==txtso2)
        {
            int a=Integer.parseInt(txtso1.getText());
            int b=Integer.parseInt(txtso2.getText());
            int c=a+b;
            txttong.setText(c + ""); 
        }
}
    public static void main(String[] args) 
    {
        tong t=new tong();
        t.setTitle("tong");
       
        t.setSize(300,200);
        t.setVisible(true);
    }
}    


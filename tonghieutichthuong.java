/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THU
 */
import java.awt.*;
import java.awt.event.*;
public class tonghieutichthuong extends Frame implements ActionListener{
    Label lblA=new Label("A=");
    Label lblB=new Label("B=");
    Label lblKQ=new Label("KQ");
    TextField txtA=new TextField();
    TextField txtB=new TextField();
    TextField txtKQ=new TextField();
    Button btnTong=new Button("Tong");
    Button btnHieu=new Button("Hieu");
    Button btnTich=new Button("Tich");
    Button btnThuong=new Button("Thuong");
    public tonghieutichthuong()
    {
        this.add(lblA);
        this.add(txtA);
        this.add(lblB);
        this.add(txtB);
        this.add(btnTong);
        btnTong.addActionListener(this);
        this.add(btnHieu);
        btnHieu.addActionListener(this);
        this.add(btnTich);
        btnTich.addActionListener(this);
        this.add(btnThuong);
        btnThuong.addActionListener(this);
        this.add(lblKQ);
        this.add(txtKQ);
        txtKQ.setEditable(false);
        this.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnTong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c + ""); 
        }
         if(e.getSource()==btnHieu)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a-b;
            txtKQ.setText(c + ""); 
            

        }
          if(e.getSource()==btnTich)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a*b;
            txtKQ.setText(c + ""); 
            

        }
           if(e.getSource()==btnThuong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            float c=(float)a/b;
            txtKQ.setText(c + ""); 
            

        }
    }
    public static void main(String[] args) {
        tonghieutichthuong thtt=new tonghieutichthuong();
        thtt.setTitle("tonghieutichthuong");
        thtt.setSize(350,200);
        thtt.setVisible(true);
    }
}

    


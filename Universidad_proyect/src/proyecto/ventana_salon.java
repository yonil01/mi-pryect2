package proyecto;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lnno
 */
public class ventana_salon extends JFrame implements ActionListener{
    JPanel panel;
    JLabel lblide,lblnombtre,lblnrodesillas;
    JTextField txtide,txtnombre,txtnrodesillas;
    JButton btnatras;
     ventana_facultad v2;
    public ventana_salon(){
        this.setSize(400, 400);
        this.setTitle("ventana salon");
        this.setLocationRelativeTo(this);
        panel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void panel(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
             label(); 
             texto();
            
    }
    void label(){
        lblide=new JLabel("Ide:");
        lblide.setBounds(20, 20, 50, 20);
        panel.add(lblide);
        
        lblnombtre=new JLabel("Nombre:");
        lblnombtre.setBounds(20, 50, 50, 20);
        panel.add(lblnombtre);
        
        lblnrodesillas=new JLabel("Nro. sillas:");
        lblnrodesillas.setBounds(20, 80, 70, 20);
        panel.add(lblnrodesillas);
        
        
    }
    void texto(){
        txtide=new JTextField();
        txtide.setBounds(100, 20, 100, 20);
        panel.add(txtide);
        
        txtnombre=new JTextField();
        txtnombre.setBounds(100, 50, 100, 20);
        panel.add(txtnombre);
        
        txtnrodesillas=new JTextField();
        txtnrodesillas.setBounds(100, 80, 100, 20);
        panel.add(txtnrodesillas);
        
        btnatras=new JButton("Atras");
        btnatras.setBounds(300, 300, 70, 30);
        btnatras.addActionListener(this);
        panel.add(btnatras);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btnatras){
            v2=new ventana_facultad();
            dispose();
            v2.setVisible(true);
        }
    }
    
}

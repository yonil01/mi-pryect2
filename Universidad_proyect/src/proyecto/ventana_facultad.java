package proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author ALUMNO - FIIS
 */
public class ventana_facultad extends JFrame implements ActionListener{
    JPanel panel;
        JLabel lblnombre,lblselec;
        JTextField txtnombre,txtide;
        JComboBox combo;
        JButton boton;
        ventana_salon v1=new ventana_salon();
        ventana_oficina v2;
    public ventana_facultad (){
        this.setSize(400, 400);
        this.setTitle("ventana facultad");
        this.setLocationRelativeTo(this);
        panel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void panel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        label();
        texto();
        boton();
                
    }
    void label(){
        lblnombre=new JLabel("Nombre");
        lblnombre.setBounds(20, 20, 50, 20);
        panel.add(lblnombre);
        
        lblselec=new JLabel("Select");
        lblselec.setBounds(20, 50, 50, 20);
        panel.add(lblselec);
    
    }
    void texto(){
        txtnombre=new JTextField();
        txtnombre.setBounds(80, 20, 80, 20);
        panel.add(txtnombre);
        
        combo=new JComboBox();
        combo.addItem("select");
        combo.addItem("Oficina");
        combo.addItem("Salon");
        combo.setBounds(80, 50, 80, 20);
        combo.addActionListener(this);
        panel.add(combo);
        
       
    }
    void boton(){
        boton = new JButton("Siguiente");
        boton.setBounds(30, 100, 100, 30);
        boton.addActionListener(this);
        panel.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int nu1=combo.getSelectedIndex();
        if(e.getSource()==boton){
        switch(nu1){
            case 0:
                JOptionPane.showMessageDialog(null, "selecciona una opccion");
                break;
            case 1:
                v2=new ventana_oficina();
                v2.setVisible(true);
                this.dispose();
                    
                
                break;
            default:
                v1.setVisible(true);
                    this.dispose();
        }
        }
    }
    void combo1(){
        
    }
    
}

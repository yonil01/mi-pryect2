package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaEmpleado extends JFrame implements ActionListener {
    JPanel panel;
    JButton registrar;
    JButton volver;
    JLabel lblnombre,lblapellido,lbledad,lbldni,lblsueldo,lblcategoria; 
    JTextField txtnombre,txtapellido,txtedad,txtdni,txtsueldo;
    JComboBox bxcategoria;
    public VentanaEmpleado(){
        this.setSize(400,400);
        this.setTitle("ventana empleado");
        this.setLocationRelativeTo(this);
        panel();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        public void panel(){
            panel=new JPanel();
            panel.setLayout(null);
            this.getContentPane().add(panel);
            label();
            texto();
            opcion();
            botones();
            
        }
                    
        
        void label(){
            lblnombre=new JLabel("Nombre:");
            lblnombre.setBounds(20, 20, 60, 20);
            panel.add(lblnombre);
            
            lblapellido=new JLabel("Apellidos:");
            lblapellido.setBounds(20,50,60,20);
            panel.add(lblapellido);
            
            lbledad=new JLabel("Edad:");
            lbledad.setBounds(20, 80, 60, 20);
            panel.add(lbledad);
            
            lbldni=new JLabel("Dni:");
            lbldni.setBounds(20, 110, 60, 20);
            panel.add(lbldni);
            
            lblsueldo=new JLabel("Sueldo:");
            lblsueldo.setBounds(20, 140, 60, 20);
            panel.add(lblsueldo);
            
            lblcategoria=new JLabel("Categoria:");
            lblcategoria.setBounds(20, 170, 70, 20);
            panel.add(lblcategoria);
            
           
            
        }
        void texto(){
            txtnombre=new JTextField();
            txtnombre.setBounds(120, 20, 100, 20);
            panel.add(txtnombre);
            txtnombre.addActionListener(this);
            
            txtapellido=new JTextField();
            txtapellido.setBounds(120, 50, 100, 20);
            panel.add(txtapellido);
            txtapellido.addActionListener(this);
            
            txtedad=new JTextField();
            txtedad.setBounds(120, 80, 100, 20);
            panel.add(txtedad);
            txtedad.addActionListener(this);
            
            txtdni=new JTextField();
            txtdni.setBounds(120, 110, 100, 20);
            panel.add(txtdni);
            txtdni.addActionListener(this);
            
            txtsueldo=new JTextField();
            txtsueldo.setBounds(120, 140, 100, 20);
            panel.add(txtsueldo);
            txtsueldo.addActionListener(this);
        }
        
        void opcion(){
            bxcategoria=new JComboBox();
            bxcategoria.addItem("Administrativo");
            bxcategoria.addItem("No Administrativo");
            bxcategoria.setBounds(120, 170, 100, 20);
            panel.add(bxcategoria);
            
        }
        
        void botones(){
            registrar =new JButton("Registrar");
            registrar.setBounds(250,20,100,20);
            panel.add(registrar);
            registrar.addActionListener(this);
            volver =new JButton("Volver");
            volver.setBounds(250,50,100,20);
            volver.addActionListener(this);
            panel.add(volver);
        }  
        

        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==volver){
            System.exit(0);
        }
        if(e.getSource()==registrar){
               JOptionPane.showMessageDialog(null, "Fue registrado");
        }
    }
    
}

package proyecto;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ventana_trabajador extends JFrame implements ActionListener{
    JPanel panel;
    JComboBox combo;
    JButton btnsiguiente;
    VentanaEmpleado v1;
    public ventana_trabajador(){
        this.setSize(300,300);
        this.setTitle("ventana ");
        this.setLocationRelativeTo(this);
        panel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void panel(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        
        
        combo=new JComboBox();
        combo.addItem("select");
        combo.addItem("profesor");
        combo.addItem("empleado");
        combo.addActionListener(this);
        combo.setBounds(50, 100, 150, 30);
        panel.add(combo);
        
        btnsiguiente=new JButton("Siguiente");
        btnsiguiente.setBounds(150, 200, 100, 30);
        btnsiguiente.addActionListener(this);
        panel.add(btnsiguiente);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       int numero=combo.getItemCount();
       if(e.getSource()==btnsiguiente){
           switch(numero){
           case 0:
               JOptionPane.showMessageDialog(null, "seleciona una opcion");
               break;
           case 1:
               
               break;
           default:
               v1=new VentanaEmpleado();
               v1.setVisible(true);
               dispose();
          
       }
       }
    }
    
}

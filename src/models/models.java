package models;

import curp.controllers;

public class principal extends javax.swing.JFrame {


    public principal() {
        initComponents();
    }

    controllers c=new controllers();
    String s = "";
    String a = "Hombre";
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        c.getNombrecompleto(name.getText(), apellidoP.getText(), apellidoM.getText());
        c.getFecha(dia.getValue().toString(), mes.getValue().toString(), año.getValue().toString());
        c.getEstado(estado.getSelectedItem().toString());
        c.getSexo(getsexo());
        c.curpGen();
        this.curpG.setText(c.curpg);
    }                                        

    private void hombreMouseClicked(java.awt.event.MouseEvent evt) {                                    
       
        a = hombre.getLabel(); 
    }                                   

    private void mujerMouseClicked(java.awt.event.MouseEvent evt) {                                   
       
        a = mujer.getLabel(); 
    }                                  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    public String getsexo(){
        if (a.equals("Hombre")) {
            s = a;
            a = "";
        } 
        if(a.equals("Mujer")){
            s = a;
            a= "";
        }
        
        return s;
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JTextField apellidoM;
    private javax.swing.JTextField apellidoP;
    private javax.swing.JSpinner año;
    private javax.swing.JTextField curpG;
    private javax.swing.JSpinner dia;
    public static javax.swing.JComboBox estado;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner mes;
    private javax.swing.JRadioButton mujer;
    private javax.swing.JTextField name;
    public static javax.swing.ButtonGroup sexo;
    // End of variables declaration                   

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

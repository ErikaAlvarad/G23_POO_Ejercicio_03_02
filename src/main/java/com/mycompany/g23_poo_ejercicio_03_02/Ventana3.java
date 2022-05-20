/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author erika
 */
public class Ventana3 extends JFrame {
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JComboBox> jComboBoxList;
    
    
    public Ventana3(String title) throws HeadlessException {
        super(title);
        this.setSize(500,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
    }
    
    public void iniciarComponentes(){
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarCombo();
        this.iniciarBotones();
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new GridLayout(9,2));
        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
  
        this.jPanelList.get(1).setBackground(Color.BLUE);
        this.jPanelList.get(2).setBackground(Color.BLUE);
   
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(0).add(this.jPanelList.get(10));
        this.jPanelList.get(0).add(this.jPanelList.get(11));
        this.jPanelList.get(0).add(this.jPanelList.get(12));
        this.jPanelList.get(0).add(this.jPanelList.get(13));
        this.jPanelList.get(0).add(this.jPanelList.get(14));
        this.jPanelList.get(0).add(this.jPanelList.get(15));
        this.jPanelList.get(0).add(this.jPanelList.get(16));
        this.jPanelList.get(0).add(this.jPanelList.get(17));
        this.jPanelList.get(0).add(this.jPanelList.get(18));
              
   }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INFORMACION DE CARRERA"));
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Jornada: "));
        this.jLabelList.add(new JLabel("Fecha Registro: "));
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(3).add(this.jLabelList.get(1));
        this.jPanelList.get(5).add(this.jLabelList.get(2));
        this.jPanelList.get(7).add(this.jLabelList.get(3));
        this.jPanelList.get(9).add(this.jLabelList.get(4));
        this.jPanelList.get(11).add(this.jLabelList.get(5));
        this.jPanelList.get(13).add(this.jLabelList.get(6));
        this.jPanelList.get(15).add(this.jLabelList.get(7));
        
       
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
     
        this.jTextFieldList.get(0).setColumns(10);
        this.jTextFieldList.get(1).setColumns(10);

        this.jPanelList.get(4).add(this.jTextFieldList.get(0));
        this.jPanelList.get(16).add(this.jTextFieldList.get(1));
       
    }
    
   
     public void iniciarCombo(){
        
        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        
        this.jComboBoxList.get(0).addItem("ARQUITECTURA");
        this.jComboBoxList.get(0).addItem("ADMINISTRACION DE EMPRESAS");
        this.jComboBoxList.get(0).addItem("BIOTECNOLOGIA");
        this.jComboBoxList.get(0).addItem("COMUNICACION");
        this.jComboBoxList.get(0).addItem("COMPUTACION");
        this.jComboBoxList.get(0).addItem("CONTABILIDAD");
        this.jComboBoxList.get(0).addItem("DERECHO");
        this.jComboBoxList.get(0).addItem("ELECTRONICA Y AUTOMATIZACION");
        this.jComboBoxList.get(0).addItem("ELECTRICIDAD");
        this.jComboBoxList.get(0).addItem("MECATRONICA");
        this.jComboBoxList.get(0).addItem("PSICOLOGIA");
        this.jComboBoxList.get(0).addItem("TELECOMUNICACIONES");
        this.jPanelList.get(6).add(this.jComboBoxList.get(0));
        
        this.jComboBoxList.get(1).addItem("PRESENCIAL");
        this.jComboBoxList.get(1).addItem("DUAL");
        this.jComboBoxList.get(1).addItem("EN LINEA");
        this.jPanelList.get(8).add(this.jComboBoxList.get(1));
        
        this.jComboBoxList.get(2).addItem("MATRIZ CUENCA");
        this.jComboBoxList.get(2).addItem("GUAYAQUIL");
        this.jComboBoxList.get(2).addItem("QUITO");
        this.jPanelList.get(10).add(this.jComboBoxList.get(2));
        
        this.jComboBoxList.get(3).addItem("EL VECINO");
        this.jComboBoxList.get(3).addItem("GIRON");
        this.jComboBoxList.get(3).addItem("MARIA AUXILIADORA");
        this.jComboBoxList.get(3).addItem("SUR");
        this.jPanelList.get(12).add(this.jComboBoxList.get(3));
        
        this.jComboBoxList.get(4).addItem("DIURNA");
        this.jComboBoxList.get(4).addItem("NOCTURNA");
        this.jComboBoxList.get(4).addItem("MIXTA");
        this.jPanelList.get(14).add(this.jComboBoxList.get(4));
    }
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));  
        this.jPanelList.get(18).add(this.jButtonList.get(0));
        
    }
}

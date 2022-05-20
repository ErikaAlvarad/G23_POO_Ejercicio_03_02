/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
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
public class Ventana4 extends JFrame {
    private JCheckBox jCheckBox;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JComboBox> jComboBoxList;
   
    
    public Ventana4(String title){
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
        this.iniciarChecks();
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new GridLayout(15,2));
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
        this.jPanelList.get(3).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(3).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(5).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(5).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(7).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(7).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(9).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(9).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(11).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(11).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(13).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(13).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(15).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(15).setBackground(Color.LIGHT_GRAY);
        
        this.jPanelList.get(17).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(17).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(19).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(19).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(21).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(21).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(23).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(23).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(25).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(25).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(27).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(27).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(4).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        
        this.jPanelList.get(6).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(8).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(10).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(12).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
         this.jPanelList.get(14).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(16).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(18).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(20).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
         this.jPanelList.get(22).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(24).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(26).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(28).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
         
    
        
        
        
        
        
        
  
        
   
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
        this.jPanelList.get(0).add(this.jPanelList.get(19));
        this.jPanelList.get(0).add(this.jPanelList.get(20));
        this.jPanelList.get(0).add(this.jPanelList.get(21));
        this.jPanelList.get(0).add(this.jPanelList.get(22));
        this.jPanelList.get(0).add(this.jPanelList.get(23));
        this.jPanelList.get(0).add(this.jPanelList.get(24));
        this.jPanelList.get(0).add(this.jPanelList.get(25));
        this.jPanelList.get(0).add(this.jPanelList.get(26));
        this.jPanelList.get(0).add(this.jPanelList.get(27));
        this.jPanelList.get(0).add(this.jPanelList.get(28));
        this.jPanelList.get(0).add(this.jPanelList.get(29));
        this.jPanelList.get(0).add(this.jPanelList.get(30));
    
              
   }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("CREAR GRUPO"));
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Codigo de Proyecto: "));
        this.jLabelList.add(new JLabel("Asignatura: "));
        this.jLabelList.add(new JLabel("Nombre de grupo: "));
        this.jLabelList.add(new JLabel("Cupos por grupo "));
        this.jLabelList.add(new JLabel("Autorizacion calificacion sobre 100: "));
        this.jLabelList.add(new JLabel("Seleccionaar Jornada del Grupo: "));
        this.jLabelList.add(new JLabel("Oferta para estudiantes: "));
        this.jLabelList.add(new JLabel("Aplica Cambio de grupo: "));
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(3).add(this.jLabelList.get(1));
        this.jPanelList.get(5).add(this.jLabelList.get(2));
        this.jPanelList.get(7).add(this.jLabelList.get(3));
        this.jPanelList.get(9).add(this.jLabelList.get(4));
        this.jPanelList.get(11).add(this.jLabelList.get(5));
        this.jPanelList.get(13).add(this.jLabelList.get(6));
        this.jPanelList.get(15).add(this.jLabelList.get(7));
        this.jPanelList.get(17).add(this.jLabelList.get(8));
        this.jPanelList.get(19).add(this.jLabelList.get(9));
        this.jPanelList.get(21).add(this.jLabelList.get(10));
        this.jPanelList.get(23).add(this.jLabelList.get(11));
        this.jPanelList.get(25).add(this.jLabelList.get(12));
        this.jPanelList.get(27).add(this.jLabelList.get(13));
       
        
       
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
     
        this.jTextFieldList.get(0).setColumns(15);
        this.jTextFieldList.get(1).setColumns(15);
        this.jTextFieldList.get(2).setColumns(15);
        this.jTextFieldList.get(3).setColumns(15);
        this.jTextFieldList.get(4).setColumns(15);
        this.jTextFieldList.get(5).setColumns(15);
        this.jTextFieldList.get(6).setColumns(15);
        this.jTextFieldList.get(7).setColumns(15);
        this.jTextFieldList.get(8).setColumns(15);

        this.jPanelList.get(4).add(this.jTextFieldList.get(0));
        this.jPanelList.get(6).add(this.jTextFieldList.get(1));
        this.jPanelList.get(8).add(this.jTextFieldList.get(2));
        this.jPanelList.get(10).add(this.jTextFieldList.get(3));
        this.jPanelList.get(12).add(this.jTextFieldList.get(4));
        this.jPanelList.get(14).add(this.jTextFieldList.get(5));
        this.jPanelList.get(16).add(this.jTextFieldList.get(6));
        this.jPanelList.get(18).add(this.jTextFieldList.get(7));
        this.jPanelList.get(20).add(this.jTextFieldList.get(8));
    }
    
   
     public void iniciarCombo(){
        
        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        
        
        this.jComboBoxList.get(0).addItem("NO");
        this.jComboBoxList.get(0).addItem("SI");
        this.jPanelList.get(22).add(this.jComboBoxList.get(0));
        
        this.jComboBoxList.get(1).addItem("Jornadas Disponibles");
        this.jComboBoxList.get(1).addItem("Diurna");
        this.jComboBoxList.get(1).addItem("Nocturna");
        this.jPanelList.get(24).add(this.jComboBoxList.get(1));
        
        this.jComboBoxList.get(2).addItem("NO");
        this.jComboBoxList.get(2).addItem("SI");
        this.jPanelList.get(28).add(this.jComboBoxList.get(2));
        
       
    }
     
     
    public void iniciarChecks(){
        this.jCheckBox = new JCheckBox("Nuevos");
        this.jPanelList.get(26).add(this.jCheckBox);
    
       
   }
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));  
        this.jPanelList.get(29).add(this.jButtonList.get(0));
        this.jButtonList.add(new JButton("Cancelar"));  
        this.jPanelList.get(29).add(this.jButtonList.get(1));
        
    }
}


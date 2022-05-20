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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author erika
 */
public class Ventana5 extends JFrame {
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private List<JComboBox> jComboBoxList;
    
    public Ventana5(String title){
        super(title);
        this.setSize(1000,200);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
    }
    
    public void iniciarComponentes(){
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new GridLayout(3,3));
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
        
        
        this.jPanelList.get(1).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder()));
        this.jPanelList.get(6).setBackground(Color.WHITE);
        
        this.jPanelList.get(7).setBackground(Color.WHITE);
        
        this.jPanelList.get(8).setBackground(Color.WHITE);
        
        this.jPanelList.get(9).setBackground(Color.WHITE);
        
        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        
              
   }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Codigo de Proyecto: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Fecha Inicio Clases: 28/03/22 al 06/08/22"));
        
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(6).add(this.jLabelList.get(5));
        this.jPanelList.get(7).add(this.jLabelList.get(6));
       
    }
   
     public void iniciarCombo(){
        
        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        
        
        this.jComboBoxList.get(0).addItem("MATRIZ CUENCA");
        this.jComboBoxList.get(0).addItem("GUAYAQUIL");
        this.jComboBoxList.get(0).addItem("QUITO");
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        
        this.jComboBoxList.get(1).addItem("EL VECINO");
        this.jComboBoxList.get(1).addItem("GIRON");
        this.jComboBoxList.get(1).addItem("MARIA AUXILIADORA");
        this.jComboBoxList.get(1).addItem("SUR");
        this.jPanelList.get(2).add(this.jComboBoxList.get(1));
        
        this.jComboBoxList.get(2).addItem("ARQUITECTURA");
        this.jComboBoxList.get(2).addItem("ADMINISTRACION DE EMPRESAS");
        this.jComboBoxList.get(2).addItem("BIOTECNOLOGIA");
        this.jComboBoxList.get(2).addItem("COMUNICACION");
        this.jComboBoxList.get(2).addItem("COMPUTACION");
        this.jComboBoxList.get(2).addItem("CONTABILIDAD");
        this.jComboBoxList.get(2).addItem("DERECHO");
        this.jComboBoxList.get(2).addItem("ELECTRONICA Y AUTOMATIZACION");
        this.jComboBoxList.get(2).addItem("ELECTRICIDAD");
        this.jComboBoxList.get(2).addItem("MECATRONICA");
        this.jComboBoxList.get(2).addItem("PSICOLOGIA");
        this.jComboBoxList.get(2).addItem("TELECOMUNICACIONES");
        this.jPanelList.get(3).add(this.jComboBoxList.get(2));
        
        this.jComboBoxList.get(3).addItem("ARQUITECTURA[REDISEÑO]");
        this.jComboBoxList.get(3).addItem("ADMINISTRACION DE EMPRESAS[REDISEÑO]");
        this.jComboBoxList.get(3).addItem("BIOTECNOLOGIA [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("COMUNICACION [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("COMPUTACION [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("CONTABILIDAD [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("DERECHO [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("ELECTRONICA Y AUTOMATIZACION [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("ELECTRICIDAD [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("MECATRONICA [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("PSICOLOGIA [REDISEÑO]");
        this.jComboBoxList.get(3).addItem("TELECOMUNICACIONES [REDISEÑO]");
        this.jPanelList.get(4).add(this.jComboBoxList.get(3));
        
        this.jComboBoxList.get(4).addItem("PRESENCIAL");
        this.jComboBoxList.get(4).addItem("DUAL");
        this.jComboBoxList.get(4).addItem("EN LINEA");
        this.jPanelList.get(5).add(this.jComboBoxList.get(4));
        
        this.jComboBoxList.get(5).addItem("2019-2020");
        this.jComboBoxList.get(5).addItem("2021-2021");
        this.jComboBoxList.get(5).addItem("2022-2022");
        this.jPanelList.get(6).add(this.jComboBoxList.get(5));
       
    }

}



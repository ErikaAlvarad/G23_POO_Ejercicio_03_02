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
public class Ventana2 extends JFrame {
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    
    
    public Ventana2(String title) throws HeadlessException {
        super(title);
        this.setSize(400,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
    }
    
    public void iniciarComponentes(){
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new GridLayout(11,2));
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
        this.jPanelList.get(0).add(this.jPanelList.get(19));
        this.jPanelList.get(0).add(this.jPanelList.get(20));
        this.jPanelList.get(0).add(this.jPanelList.get(21));
        this.jPanelList.get(0).add(this.jPanelList.get(22));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("DATOS PERSONALES"));
        this.jLabelList.add(new JLabel("Personal"));
        this.jLabelList.add(new JLabel("Apellidos: "));
        this.jLabelList.add(new JLabel("Nombres: "));
        this.jLabelList.add(new JLabel("Nacionalidad: "));
        this.jLabelList.add(new JLabel("Genero: "));
        this.jLabelList.add(new JLabel("Correo Electronico: "));
        this.jLabelList.add(new JLabel("Fecha Nacimiento: "));
        this.jLabelList.add(new JLabel("Telefono Domicilio: "));
        this.jLabelList.add(new JLabel("Telefono Celular: "));
        this.jLabelList.add(new JLabel("Whatsapp: "));
        
        
        
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
        this.jTextFieldList.get(0).setColumns(12);
        this.jTextFieldList.get(1).setColumns(12);
        this.jTextFieldList.get(2).setColumns(12);
        this.jTextFieldList.get(3).setColumns(12);
        this.jTextFieldList.get(4).setColumns(12);
        this.jTextFieldList.get(5).setColumns(12);
        this.jTextFieldList.get(6).setColumns(12);
        this.jTextFieldList.get(7).setColumns(12);
        this.jTextFieldList.get(8).setColumns(12);
        this.jPanelList.get(6).add(this.jTextFieldList.get(0));
        this.jPanelList.get(8).add(this.jTextFieldList.get(1));
        this.jPanelList.get(10).add(this.jTextFieldList.get(2));
        this.jPanelList.get(12).add(this.jTextFieldList.get(3));
        this.jPanelList.get(14).add(this.jTextFieldList.get(4));
        this.jPanelList.get(16).add(this.jTextFieldList.get(5));
        this.jPanelList.get(18).add(this.jTextFieldList.get(6));
        this.jPanelList.get(20).add(this.jTextFieldList.get(7));
        this.jPanelList.get(22).add(this.jTextFieldList.get(8));
    }
   
    
}
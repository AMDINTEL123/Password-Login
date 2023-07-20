/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author khens
 */
public class GreetingsGUI extends JFrame {
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfields
    
    private JTextField nameTxtFld;
    private JTextField surnnameTxtFld;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    //textArea
    private JTextArea greetingsMess;
    
    //Panels
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAnsSurPnl;
    private JPanel greetPnl;
    private JPanel mainPnl;
    private JPanel buttonPnl;
    
    
    public GreetingsGUI(){
    setTitle("Geetings GUI");
    setLayout(new BorderLayout());
    setSize(500,600);
    setBackground(Color.PINK);
    //create labels
    headingLbl=new JLabel("Greetings");
    nameLbl=new JLabel("name");
    surnameLbl=new JLabel("surname");
    
    //create buttons
    greetBtn= new JButton("Greet");
    clearBtn= new JButton("Clear");
    exitBtn= new JButton("Exit");
    
    //create TextFileds
    nameTxtFld= new JTextField(20);
    surnnameTxtFld = new JTextField(20);
    
    //create textArea
    greetingsMess = new JTextArea(10,30);
    greetingsMess.setEditable(false);
    greetingsMess.setText("Greetings [name] [surname]");
    
    //create panel
    
     namePnl=new JPanel(new FlowLayout());
     surnamePnl=new JPanel(new FlowLayout());
     nameAnsSurPnl = new JPanel(new GridLayout(2,1));
     greetPnl= new JPanel(new FlowLayout());
     greetPnl.setBorder(new TitledBorder(new LineBorder(Color.yellow,1),"Greetings"));
     buttonPnl = new JPanel(new FlowLayout());
     mainPnl= new JPanel(new BorderLayout());
     headingPnl= new JPanel(new FlowLayout(FlowLayout.CENTER));
     headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
     
     //add componemts to their respective panels
     
     namePnl.add( nameLbl);
      namePnl.add(nameTxtFld); 
      
      surnamePnl.add( surnameLbl);
      surnamePnl.add(surnnameTxtFld);
      
      nameAnsSurPnl.add(namePnl);
      nameAnsSurPnl.add(surnamePnl);
      
      greetPnl.add(greetingsMess);
      
       buttonPnl.add(greetBtn);
       buttonPnl.add(clearBtn);
       buttonPnl.add(exitBtn);
       
       headingPnl.add(headingLbl);
       
       //add to the main panel
       mainPnl.add(nameAnsSurPnl,BorderLayout.NORTH);
       mainPnl.add(greetPnl,BorderLayout.CENTER);
       mainPnl.add( buttonPnl,BorderLayout.SOUTH);
       
       //add panels to the frame
       add(mainPnl,BorderLayout.CENTER);
       add( headingPnl,BorderLayout.NORTH); 
       
       //visibility
       setVisible(true);
                       
       
     
     
     
     
     
     
          
    
    
    
    
    }
}

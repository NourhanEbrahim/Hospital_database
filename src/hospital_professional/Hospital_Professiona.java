
package hospital_professional;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

//import hospital_professional.NewJApplet;

public class Hospital_Professiona extends JApplet implements ActionListener   {

	DBConnection connect = new DBConnection();
	static  private Button  btn1 ,btn2 , btn3 , btn4 ;   
javax.swing.JComboBox I = new javax.swing.JComboBox();
javax.swing.JComboBox I2 = new javax.swing.JComboBox();
javax.swing.JComboBox I3 = new javax.swing.JComboBox();
javax.swing.JComboBox I4 = new javax.swing.JComboBox();
javax.swing.JLabel   T1 = new javax.swing.JLabel();
javax.swing.JLabel   T2 = new javax.swing.JLabel();
javax.swing.JLabel   T3 = new javax.swing.JLabel();
javax.swing.JLabel   T4 = new javax.swing.JLabel();
javax.swing.JPanel  jPanel4  = new javax.swing.JPanel();
//javax.swing.JTextField Cycle_MPBox = new javax.swing.JTextField();

    public Hospital_Professiona(){
    	  getContentPane().setLayout(null);  
  //setLayout(new FlowLayout());               
//I.setBorder(new javax.swing.border.EtchedBorder());
     // I.paintImmediately(100, 10, 3, 290);
      //I.repaint(100, 100, 310, 290);
     // I.setSize(300, 100);
     // I.setSize(WIDTH, HEIGHT);
     // I.validate();
                           
  //getSelectedIndex
  /*.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                instBox6ItemStateChanged(evt);
            }
        });*/
    	  jPanel4. setVisible(true);
    	  jPanel4.setSize(500, 500);
    	  jPanel4. setLayout(null);
      //setTitle("HOSPITAL_DATA");
    	  jPanel4.setBounds(0, 0, 1500, 1000);
          jPanel4.setBackground(new java.awt.Color(255, 128, 64));
          jPanel4.setBorder(new javax.swing.border.EtchedBorder());
      jPanel4.setPreferredSize(new java.awt.Dimension(2542, 38));
      T1.setText("Insert");//26
      jPanel4.add(T1); 
      T1.setBounds(10, 0, 70, 30);
      T1.setFont(new java.awt.Font("Microsoft Sans Serif", 5, 13));
      T1.setForeground(new java.awt.Color(0, 0, 204));
 
      I.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analysis", "clinic", "doctors", "drugs", "follower_history", "out_patient","patients", "patient_history", "radiation","resident_patient","rooms","surgeries","visits","visit_analysis","visit_drugs","visit_radiation","visit_surgery"}));
      I.setSelectedIndex(-1);
  //setTitle("HOSPITAL_DATA");
      I.setBackground(new java.awt.Color(255, 128, 64));
      I.setBorder(new javax.swing.border.EtchedBorder());
      //I.setPreferredSize(new java.awt.Dimension(180, 30));
      I.setBackground(Color.pink);
      jPanel4.add(I);
      I.setBounds(65, 5, 150, 25);
  
      
      T2.setText("Select");//26
      jPanel4.add(T2); 
      T2.setBounds(10, 35, 70, 30);
      T2.setFont(new java.awt.Font("Microsoft Sans Serif", 5, 13));
      T2.setForeground(new java.awt.Color(0, 0, 204));
      
      I2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analysis", "clinic", "doctors", "drugs", "follower_history", "out_patient","patients", "patient_history", "radiation","resident_patient","rooms","surgeries","visits","visit_analysis","visit_drugs","visit_radiation","visit_surgery"}));
      I2.setSelectedIndex(-1);
      I2.setBackground(Color.pink);
      I2.setBorder(new javax.swing.border.EtchedBorder());
      jPanel4.add(I2);
      I2.setBounds(65, 40, 150, 25);
      
      T3.setText("Update");//26
      jPanel4.add(T3); 
      T3.setBounds(10, 70, 70, 30);
      T3.setFont(new java.awt.Font("Microsoft Sans Serif", 5, 13));
      T3.setForeground(new java.awt.Color(0, 0, 204));
      
      I3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analysis", "clinic", "doctors", "drugs", "follower_history", "out_patient","patients", "patient_history", "radiation","resident_patient","rooms","surgeries","visits","visit_analysis","visit_drugs","visit_radiation","visit_surgery"}));
      I3.setSelectedIndex(-1);
      I3.setBackground(Color.pink);
      I3.setBorder(new javax.swing.border.EtchedBorder());
      jPanel4.add(I3);
      I3.setBounds(65, 75, 150, 25);
      
      
      T4.setText("Delete");//26
      jPanel4.add(T4); 
      T4.setBounds(10, 105, 70, 30);
      T4.setFont(new java.awt.Font("Microsoft Sans Serif", 5, 13));
      T4.setForeground(new java.awt.Color(0, 0, 204));
      
      I4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analysis", "clinic", "doctors", "drugs", "follower_history", "out_patient","patients", "patient_history", "radiation","resident_patient","rooms","surgeries","visits","visit_analysis","visit_drugs","visit_radiation","visit_surgery"}));
      I4.setSelectedIndex(-1);
      I4.setBackground(Color.pink);
      I4.setBorder(new javax.swing.border.EtchedBorder());
      jPanel4.add(I4);
      I4.setBounds(65, 110, 150, 25);
      
      getContentPane().add(jPanel4);
      /*
      btn1 = new Button("Insert"); 
          add(btn1);
            btn1.setBackground(Color.pink);
     
       btn2 = new Button("Select");
               add(btn2); 
          btn2.setBackground(Color.pink);
               
       btn3 = new Button("Update");
               add(btn3); 
        btn3.setBackground(Color.pink);
        
        
       btn4 = new Button("Delet");
       add(btn4);
        btn4.setBackground(Color.pink);
    */
      
      
      I.addItemListener(new java.awt.event.ItemListener() {
          public void itemStateChanged(java.awt.event.ItemEvent evt){
          Insert(evt);
      }
  });
      
     /* I.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              Insert(evt);
          }
      });*/
    I2.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              Select(evt);
          }
      });
    I3.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              Update(evt);
          }
      });
    I4.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              Delete(evt);
          }
      });
     
    }
    
    void Select (java.awt.event.ActionEvent evt){
        int selection = I2.getSelectedIndex();
        if(selection==0){connect.getDatafromanalysis();}
        if(selection==1){connect.getDatafromclinic();}
        if(selection==2){connect.getDatafromdoctors() ;}
        if(selection==3){connect.getDatafromdrugs();}
        if(selection==4){connect.getDatafromfollower_history();}
        if(selection==5){connect.getDatafromout_patient();}
        if(selection==6){connect.getDatafromPatients();}
        if(selection==7){connect.getDatafrompatient_history();}
        if(selection==8){connect.getDatafromradiation();}
        if(selection==9){connect.getDatafromresident_patient();}
        if(selection==10){connect.getDatafromrooms();}
        if(selection==11){connect.getDatafromsurgeries();}
        if(selection==12){connect.getDatafromvisits();}
        if(selection==13){connect.getDatafromvisit_analysis();}
        if(selection==14){connect.getDatafromvisit_drugs();}
        if(selection==15){connect.getDatafromvisit_radiation();}
        if(selection==16){connect.getDatafromvisit_surgery();}
        
        
    
}
void Update (java.awt.event.ActionEvent evt){
        int selection = I3.getSelectedIndex();
        if(selection==0){connect.getDatafromanalysis();}
        if(selection==1){connect.getDatafromclinic();}
        if(selection==2){connect.getDatafromdoctors() ;}
        if(selection==3){connect.getDatafromdrugs();}
        if(selection==4){connect.getDatafromfollower_history();}
        if(selection==5){connect.getDatafromout_patient();}
        if(selection==6){connect.getDatafromPatients();}
        if(selection==7){connect.getDatafrompatient_history();}
        if(selection==8){connect.getDatafromradiation();}
        if(selection==9){connect.getDatafromresident_patient();}
        if(selection==10){connect.getDatafromrooms();}
        if(selection==11){connect.getDatafromsurgeries();}
        if(selection==12){connect.getDatafromvisits();}
        if(selection==13){connect.getDatafromvisit_analysis();}
        if(selection==14){connect.getDatafromvisit_drugs();}
        if(selection==15){connect.getDatafromvisit_radiation();}
        if(selection==16){connect.getDatafromvisit_surgery();}
        
        
    
}
void Delete (java.awt.event.ActionEvent evt){
        int selection = I4.getSelectedIndex();
        if(selection==0){connect.getDatafromanalysis();}
        if(selection==1){connect.getDatafromclinic();}
        if(selection==2){connect.getDatafromdoctors() ;}
        if(selection==3){connect.getDatafromdrugs();}
        if(selection==4){connect.getDatafromfollower_history();}
        if(selection==5){connect.getDatafromout_patient();}
        if(selection==6){connect.getDatafromPatients();}
        if(selection==7){connect.getDatafrompatient_history();}
        if(selection==8){connect.getDatafromradiation();}
        if(selection==9){connect.getDatafromresident_patient();}
        if(selection==10){connect.getDatafromrooms();}
        if(selection==11){connect.getDatafromsurgeries();}
        if(selection==12){connect.getDatafromvisits();}
        if(selection==13){connect.getDatafromvisit_analysis();}
        if(selection==14){connect.getDatafromvisit_drugs();}
        if(selection==15){connect.getDatafromvisit_radiation();}
        if(selection==16){connect.getDatafromvisit_surgery();}
}
    
    void Insert (java.awt.event.ItemEvent evt){
        int selection = I.getSelectedIndex();
        if(selection==0){connect.getDatafromanalysis();}
        if(selection==1){connect.getDatafromclinic();}
        if(selection==2){connect.getDatafromdoctors() ;}
        if(selection==3){connect.getDatafromdrugs();}
        if(selection==4){connect.getDatafromfollower_history();}
        if(selection==5){connect.getDatafromout_patient();}
        if(selection==6){connect.getDatafromPatients();}
        if(selection==7){connect.getDatafrompatient_history();}
        if(selection==8){connect.getDatafromradiation();}
        if(selection==9){connect.getDatafromresident_patient();}
        if(selection==10){connect.getDatafromrooms();}
        if(selection==11){connect.getDatafromsurgeries();}
        if(selection==12){connect.getDatafromvisits();}
        if(selection==13){connect.getDatafromvisit_analysis();}
        if(selection==14){connect.getDatafromvisit_drugs();}
        if(selection==15){connect.getDatafromvisit_radiation();}
        if(selection==16){connect.getDatafromvisit_surgery();}
        
        
    
}
    
    public static void main(String[] args) {                 

            Hospital_Professiona app = new Hospital_Professiona();
            System.out.println("gh");
           // NewJApplet frame = new NewJApplet();
       	 //JFrame frame = new JFrame();
   	app.setVisible(true);
   	app.setSize(10000, 1500);
   	app.setLayout(new FlowLayout());
   	app.repaint();
            
            DBConnection connect = new DBConnection();
       int r = 1;
       // while(r==1){
         btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           connect.getDatafromPatients();
            }
        });
      btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           connect.getDatafromdoctors();
            }
        });
       btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           connect.DataName();
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           connect.insertData();
            }
        });
        
        
         
        //}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

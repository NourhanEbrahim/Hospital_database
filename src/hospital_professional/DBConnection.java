
package hospital_professional;                /* 
                                                        */


import java.sql.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class DBConnection extends Frame implements ActionListener {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private ResultSet ss;
    
    
    Scanner n = new Scanner(System.in);

    public DBConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/ho","root","");
            st = con.createStatement();
            
    
                 }
            
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }                                                            
        public void getDatafromPatients(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Name");
               boolean x1 =  s.contains("Patient_Type");
               boolean x2 =  s.contains("Address");
               boolean x3 =  s.contains("Phone");
               boolean x4 =  s.contains("Birthday");
               x=x1=x2=x3=x4=s.contains('*');
               String pantient_name="", Patient_Type = "",Address="" , Birthday = "";
               int Phone;
             if(x) {pantient_name = rs.getString("Name"); message1.add("Patient name: "+pantient_name+"\n" );}
               if(x1)  {Patient_Type = rs.getString("Patient_Type");message1.add("Patient_Type: "+Patient_Type +"\n");}
               if(x2)  {Address = rs.getString("Address");message1.add("Address: "+Address+"\n" );}
                if(x3) {Phone = rs.getInt("Phone");message1.add("Phone: "+Phone+"\n" );}
                if(x4) {Birthday = rs.getString("Birthday");message1.add("Birthday: "+Birthday+"\n" );}
               // String disease = rs.getString("Disease");
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
    
        
        
        
        
        
        public void getDatafromanalysis(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("analysis_Type");
               boolean x1 =  s.contains("Price");
               String analysis_Type="";
               double Price;
             if(x) {analysis_Type = rs.getString("analysis_Type"); message1.add("analysis_Type: "+analysis_Type+"\n" );}
               if(x1)  {Price = rs.getDouble("Price");message1.add("Price: "+Price +"\n");}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
        
        
        
        public void getDatafromclinic(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Clinic_Type");
               boolean x1 =  s.contains("From_Time");
               boolean x2 =  s.contains("To_Time");
               boolean x3 =  s.contains("Price");
               String Clinic_Type="", From_Time = "",To_Time="" ;
               double Price;
             if(x) {Clinic_Type = rs.getString("Clinic_Type"); message1.add("Clinic_Type: "+Clinic_Type+"\n" );}
               if(x1)  {From_Time = rs.getString("From_Time");message1.add("From_Time: "+From_Time +"\n");}
               if(x2)  {To_Time = rs.getString("To_Time");message1.add("To_Time: "+To_Time+"\n" );}
                if(x3) {Price = rs.getDouble("Price");message1.add("Price: "+Price+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
        
        
        
         public void getDatafromdoctors(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Name");
               boolean x1 =  s.contains("Clinic_ID");
               boolean x2 =  s.contains("Address");
               boolean x3 =  s.contains("Phone");
               boolean x5 =  s.contains("Salary");
               boolean x4 =  s.contains("Birthday");
               boolean x6 =  s.contains("Major");
               boolean x7 =  s.contains("Day");
               boolean x8 =  s.contains("From_Time");
               boolean x9 =  s.contains("To_Time");
               
               String Name="", Major = "",Address="" , Birthday = "",Day,From_Time,To_Time;
               int Phone,Clinic_ID,Salary;
             if(x) {Name = rs.getString("Name"); message1.add("Name: "+Name+"\n" );}
               if(x1)  {Clinic_ID = rs.getInt("Clinic_ID");message1.add("Clinic_ID: "+Clinic_ID +"\n");}
               if(x2)  {Address = rs.getString("Address");message1.add("Address: "+Address+"\n" );}
                if(x3) {Phone = rs.getInt("Phone");message1.add("Phone: "+Phone+"\n" );}
                if(x4) {Birthday = rs.getString("Birthday");message1.add("Birthday: "+Birthday+"\n" );}
               if(x5) {Salary = rs.getInt("Salary");message1.add("Salary: "+Salary+"\n" );}
               if(x6) {Major = rs.getString("Major");message1.add("Major: "+Major+"\n" );}
               if(x7) {Day = rs.getString("Day");message1.add("Day: "+Day+"\n" );}
               if(x8) {From_Time = rs.getString("From_Time");message1.add("From_Time: "+From_Time+"\n" );}
               if(x9) {To_Time = rs.getString("To_Time");message1.add("To_Time: "+To_Time+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
         
         
         
          public void getDatafromdrugs(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Drugs_Name");
               boolean x1 =  s.contains("Drugs_ID");
               boolean x2 =  s.contains("Quantity");
               boolean x3 =  s.contains("Price");
               String Drugs_Name="";
               int Drugs_ID,Quantity;
               double Price;
             if(x) {Drugs_Name = rs.getString("Drugs_Name"); message1.add("Drugs_Name: "+Drugs_Name+"\n" );}
               if(x2)  {Quantity = rs.getInt("Quantity");message1.add("Quantity: "+Quantity +"\n");}
               if(x3)  {Price = rs.getDouble("Price");message1.add("Price: "+Price+"\n" );}
                if(x1) {Drugs_ID = rs.getInt("Drugs_ID");message1.add("Drugs_ID: "+Drugs_ID+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
          
          
          
           public void getDatafromfollower_history(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("disease");
               boolean x1 = s.contains("relative_relation");
               boolean x2 = s.contains("Patient_ID");
               String disease="",relative_relation = "";
               int Patient_ID;
             if(x) {relative_relation = rs.getString("relative_relation"); message1.add("relative_relation: "+relative_relation+"\n" );}
             if(x1){disease = rs.getString("disease");message1.add("disease: "+disease +"\n");}
             if(x2){Patient_ID = rs.getInt("Patient_ID");message1.add("Patient_ID: "+Patient_ID +"\n");}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
           
           
           
            public void getDatafromout_patient(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Patient_ID");
               boolean x1 =  s.contains("Check back_Date");
               String Check_back_Date="";
               int Patient_ID;
             if(x) {Check_back_Date = rs.getString("Check back_Date"); message1.add("Check_back_Date: "+Check_back_Date+"\n" );}
               if(x1)  {Patient_ID = rs.getInt("Patient_ID");message1.add("Patient_ID: "+Patient_ID +"\n");}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
            
            
             public void getDatafrompatient_history(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Patient_ID");
               boolean x1 =  s.contains("Disease");
               String Disease="";
               int Patient_ID;
             if(x) {Patient_ID = rs.getInt("Patient_ID"); message1.add("Patient_ID: "+Patient_ID+"\n" );}
             if(x1)  {Disease = rs.getString("Disease");message1.add("Disease: "+Disease+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
             
             
              public void getDatafromradiation(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Radiation_ID");
               boolean x1 =  s.contains("Radiation_Type");
               boolean x2 =  s.contains("Price");
               String Radiation_Type="";
               int Radiation_ID,Price;
             if(x) {Radiation_Type = rs.getString("Radiation_Type"); message1.add("Radiation_Type: "+Radiation_Type+"\n" );}
               if(x1)  {Radiation_ID = rs.getInt("Radiation_ID");message1.add("Radiation_ID: "+Radiation_ID +"\n");}
               if(x2)  {Price = rs.getInt("Price");message1.add("Price: "+Price+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
              
              
               public void getDatafromresident_patient(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Room_Number");
               boolean x1 =  s.contains("Duration");
               boolean x2 =  s.contains("Patient_ID");
               int Room_Number , Duration , Patient_ID ;
             if(x) {Room_Number = rs.getInt("Room_Number"); message1.add("Room_Number: "+Room_Number+"\n" );}
               if(x1)  {Duration = rs.getInt("Duration");message1.add("Duration: "+Duration +"\n");}
               if(x2)  {Patient_ID = rs.getInt("Patient_ID");message1.add("Patient_ID: "+Patient_ID+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
               
               
                public void getDatafromrooms(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Room_Number");
               boolean x1 =  s.contains("Room_Type");
               boolean x2 =  s.contains("Price");
               String Room_Type="";
               double Price;
               int Room_Number;
             if(x) {Room_Number = rs.getInt("Room_Number"); message1.add("Room_Number: "+Room_Number+"\n" );}
             if(x1){Room_Type = rs.getString("Room_Type");message1.add("Room_Type: "+Room_Type +"\n");}
             if(x2){Price = rs.getDouble("Price");message1.add("Price: "+Price+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
                
                
                 public void getDatafromsurgeries(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Surgery_Name");
               boolean x1 =  s.contains("Surgery_ID");
               boolean x2 =  s.contains("Price");
               String Surgery_Name="";
               int Surgery_ID;
               double Price;
             if(x) {Surgery_Name = rs.getString("Surgery_Name"); message1.add("Surgery_Name: "+Surgery_Name+"\n" );}
             if(x1)  {Surgery_ID = rs.getInt("Surgery_ID");message1.add("Surgery_ID: "+Surgery_ID +"\n");}
             if(x2)  {Price = rs.getDouble("Price");message1.add("Price: "+Price+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
                 
                 
                  public void getDatafromvisits(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Date");
               boolean x1 =  s.contains("time");
               boolean x2 =  s.contains("Patient_ID");
               boolean x3 =  s.contains("Clinic_ID");
               boolean x4 =  s.contains("Visit_ID");
               String Date="", time = "";
               int Patient_ID , Clinic_ID , Visit_ID;
             if(x) {Date = rs.getString("Date"); message1.add("Date: "+Date+"\n" );}
             if(x1){time = rs.getString("time");message1.add("time: "+time +"\n");}
             if(x2){Patient_ID = rs.getInt("Patient_ID");message1.add("Patient_ID: "+Patient_ID+"\n" );}
             if(x3){Clinic_ID = rs.getInt("Clinic_ID");message1.add("Clinic_ID: "+Clinic_ID+"\n" );}
             if(x4){Visit_ID = rs.getInt("Visit_ID");message1.add("Visit_ID: "+Visit_ID+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
        
        
                  
                  public void getDatafromvisit_analysis(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Date");
               boolean x1 =  s.contains("time");
               boolean x2 =  s.contains("Result");
               boolean x3 =  s.contains("analysis_id");
               boolean x4 =  s.contains("Visit_ID");
               String Date="", time = "" , Result;
               int  analysis_id , Visit_ID;
             if(x) {Date = rs.getString("Date"); message1.add("Date: "+Date+"\n" );}
             if(x1){time = rs.getString("time");message1.add("time: "+time +"\n");}
             if(x2){Result = rs.getString("Result");message1.add("Result: "+Result+"\n" );}
             if(x3){analysis_id = rs.getInt("analysis_id");message1.add("analysis_id: "+analysis_id+"\n" );}
             if(x4){Visit_ID = rs.getInt("Visit_ID");message1.add("Visit_ID: "+Visit_ID+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
                  
                  
                  
                  
                  public void getDatafromvisit_drugs(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Drugs_ID");
               boolean x1 =  s.contains("Visit_ID");
               int  Drugs_ID , Visit_ID;
             if(x) {Drugs_ID = rs.getInt("Drugs_ID"); message1.add("Drugs_ID: "+Drugs_ID+"\n" );}
             if(x1){Visit_ID = rs.getInt("Visit_ID");message1.add("Visit_ID: "+Visit_ID+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
                  
                  
                  
                  public void getDatafromvisit_radiation(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Result");
               boolean x1 =  s.contains("Comment");
               boolean x2 =  s.contains("Radiation_ID");
               boolean x3 =  s.contains("Visit_ID");
               String Result , Comment;
               int  Radiation_ID , Visit_ID;
             if(x) {Result = rs.getString("Result"); message1.add("Result: "+Result+"\n" );}
             if(x1){Comment = rs.getString("Comment");message1.add("Comment: "+Comment+"\n" );}
             if(x2){Radiation_ID = rs.getInt("Radiation_ID");message1.add("Radiation_ID: "+Radiation_ID+"\n" );}
             if(x3){Visit_ID = rs.getInt("Visit_ID");message1.add("Visit_ID: "+Visit_ID+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
                  
                  
                  
                  public void getDatafromvisit_surgery(){
            String s;
             Scanner n = new Scanner (System .in) ;
             s = n.nextLine();
            
            try{
            rs = st.executeQuery(s);   //read from DB
             ArrayList<String> message1 = new ArrayList();
            while (rs.next()){
                //System.out.println("aa");
          
               boolean x =  s.contains("Surgery_ID");
               boolean x1 =  s.contains("Doctor_ID");
               boolean x2 =  s.contains("Room_Number");
               boolean x3 =  s.contains("Price");
               boolean x4 =  s.contains("Visit_ID");
               boolean x5 =  s.contains("Date");
               boolean x6 =  s.contains("Time");
               
               String Date , Time;
               int  Surgery_ID , Doctor_ID , Room_Number , Visit_ID;
               double Price;
             if(x) {Surgery_ID = rs.getInt("Surgery_ID"); message1.add("Surgery_ID: "+Surgery_ID+"\n" );}
             if(x1){Doctor_ID = rs.getInt("Doctor_ID");message1.add("Doctor_ID: "+Doctor_ID+"\n" );}
             if(x2){Room_Number = rs.getInt("Room_Number");message1.add("Room_Number: "+Room_Number+"\n" );}
             if(x3){Price = rs.getDouble("Price");message1.add("Price: "+Price+"\n" );}
             if(x4){Visit_ID = rs.getInt("Visit_ID");message1.add("Visit_ID: "+Visit_ID+"\n" );}
             if(x5){Date = rs.getString("Date");message1.add("Date: "+Date+"\n" );}
             if(x6){Time = rs.getString("Time");message1.add("Time: "+Time+"\n" );}
                //message1.add("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\n********************************************\n");
                
            }  
                        
       JTextArea textArea = new JTextArea(20,40);//H W
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea); 
JOptionPane.showMessageDialog(null, scrollPane); 

              
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            
        
        }
                  
        
        public void getRoom()
        {     try{ ArrayList message1 = new ArrayList();
            rs = st.executeQuery("select * from Room");

              message1.add("Empty Room \t Complete Room :"+"\n");
          while (rs.next()){
              String RoomE =rs.getString("Empty");
              String RoomC =rs.getString("Complete");

              message1.add(RoomE+"\t\t " +RoomC +"\n");
                 
          } JTextArea textArea = new JTextArea(20,40);
       textArea.setText(message1.toString());
JScrollPane scrollPane = new JScrollPane(textArea , ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); 
            JOptionPane.showMessageDialog(null, scrollPane); 

        }
         catch (Exception e) {
            System.out.println("Error: "+e);
        }
          
        }
        public void DataName(){    
                                    
           
           try{
               String message1 = "mm" ;
           String name;
               name = JOptionPane.showInputDialog("Enter the name of patient : ");
                       String pantient_name = null;              
            ss = st.executeQuery("SELECT * FROM `patients` WHERE `Patients name`= '"+name+"'");
            while (ss.next()){   
                 pantient_name = ss.getString("Patients name");
                String doctor_name = ss.getString("Doctors name");
                String Room_name = ss.getString("Room");
                int age = ss.getInt("Age");
                String pantient_ray = ss.getString("Patients ray");
                String disease = ss.getString("Disease");
                 String date = ss.getString("Date");
             message1= String.format ("Patient name: "+pantient_name + "\nDoctor name: "+doctor_name+"\nRoom: "+Room_name + "\nAge: "+age+"\nPantient ray: "+pantient_ray+"\nDisease: "+disease+"Date "+date);
            JOptionPane.showMessageDialog(null, message1);
                  

            }
             if (pantient_name == null) {String message3= String.format ("This name is not written");
              JOptionPane.showMessageDialog(null, message3);
             }
                 
           }
          catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        }
        public void insertData(){
         
            try{ArrayList message1 = new ArrayList(); 
           
            String patientName = JOptionPane.showInputDialog("Enter your name : ");
           
            String doctorName = JOptionPane.showInputDialog("Enter your doctor name : ");
           
            String roomNum = JOptionPane.showInputDialog("Enter your room : ");
           
            String patientray = JOptionPane.showInputDialog("Enter your ray : ");
           
            String patientdisease = JOptionPane.showInputDialog("Enter your disease : ");
           
            String date = JOptionPane.showInputDialog("Enter your Date : "); 
           
            int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age : "));
            
           st.executeUpdate("INSERT INTO patients"+" VALUE ('"+patientName+"','"+doctorName+"' ,'"+age +"','"+patientray+"' , '"+patientdisease+"' ,'"+ date +"','"+roomNum +"')");
                  
                  JOptionPane.showMessageDialog(null, "DONE");

        
        }
          catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}

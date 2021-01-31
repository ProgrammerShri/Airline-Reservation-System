/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static net.sf.dynamicreports.examples.Templates.boldCenteredStyle;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.exception.DRException;


/**
 *
 * @author manali
 */
public class Reservation extends javax.swing.JInternalFrame {
 String  flightno2,Origin2,Destination2, des2,Avt2,date2   ,pay2,flg2;
    /**
     * Creates new form RESERVATION
     */
     public Reservation() {
        initComponents();
        getMaxId();
         
 
     }
      public void show(String Flightno,String Origin,String Destination,String Date,String ds,String Avt, String pay,String flg){
        jTextField6.setText(Origin);
        jTextField7.setText(Destination);
        jTextField11.setText(Flightno);
        jTextField5.setText(Date);
           jTextField4.setText(ds);
              jTextField2.setText(Avt);
       jTextField13.setText(flg);
              jTextField8.setText(pay);
        Origin2 = Origin;
        Destination2 = Destination;
         flightno2= Flightno;
         date2=Date;
         des2=ds;
         Avt2=Avt;
         flg2=flg; 
         pay2=pay;
    }
         
         
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField13 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField14 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);

        jPanel1.setLayout(null);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setText("Name :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 220, 80, 30);

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField1);
        jTextField1.setBounds(170, 220, 170, 30);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setText("Contact No. :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 260, 140, 30);

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel10.setText("Departure Time :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(360, 220, 190, 30);

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel11.setText("Date :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 300, 70, 30);

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel12.setText("From :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(30, 340, 80, 29);

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel13.setText("To :");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(30, 380, 50, 30);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel5.setText("Payable Amount :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(360, 300, 200, 30);

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel14.setText("Transaction Code :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(360, 340, 210, 30);

        jButton1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton1.setText("Done");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(400, 430, 90, 30);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel6.setText("Arrival Time :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(360, 180, 160, 30);

        jTextField2.setText(" ");
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2);
        jTextField2.setBounds(570, 180, 160, 30);

        jTextField4.setText(" ");
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(570, 220, 160, 30);

        jTextField5.setText(" ");
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField5);
        jTextField5.setBounds(170, 300, 170, 30);

        jTextField6.setText(" ");
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField6);
        jTextField6.setBounds(170, 340, 170, 30);

        jTextField7.setText(" ");
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField7);
        jTextField7.setBounds(170, 380, 170, 30);

        jTextField8.setText(" ");
        jTextField8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField8);
        jTextField8.setBounds(570, 300, 160, 30);

        jTextField9.setText(" ");
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField9);
        jTextField9.setBounds(570, 340, 160, 30);

        jTextField10.setText(" ");
        jTextField10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });
        jPanel3.add(jTextField10);
        jTextField10.setBounds(170, 260, 170, 30);

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel7.setText("Flight No. :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 180, 120, 30);

        jTextField11.setText(" ");
        jTextField11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField11);
        jTextField11.setBounds(170, 180, 170, 30);

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel15.setText("Gender :");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(360, 140, 110, 30);

        jTextField12.setText(" ");
        jTextField12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField12);
        jTextField12.setBounds(570, 140, 160, 30);

        jRadioButton1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jRadioButton1.setText("International");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(210, 100, 180, 31);

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel8.setText("Flight :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(360, 260, 80, 30);

        jRadioButton2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jRadioButton2.setText("Domestic");
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(410, 100, 170, 30);

        jTextField13.setText(" ");
        jTextField13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField13);
        jTextField13.setBounds(570, 260, 160, 30);

        jButton2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton2.setText("Add");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(290, 430, 90, 30);

        jComboBox2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No. Of Tickets", "1", "2", "3" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setOpaque(false);
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(20, 140, 140, 30);

        jTextField14.setText(" ");
        jTextField14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField14);
        jTextField14.setBounds(170, 140, 170, 30);

        jButton3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton3.setText("Exit");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(510, 430, 90, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setText("RESERVATION");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(290, 30, 300, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Image.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 480);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 900, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
            
           
           {
              total()   ; 
                    
               
        }
      
         
      
        
           generateReport();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
          
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
        insert();
         reserve();
         clearData();
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
          Home   kent34 = new Home();
        this.dispose();
        kent34.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
   
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
 
    void getMaxId(){
        jTextField9 .setEditable(true);
        Connection con = null;
    PreparedStatement pr = null;
    String url = null;
    String qry= null;
    ResultSet rs = null;
    try{
         File path= new File(System.getProperty("user.dir"));
        url="jdbc:ucanaccess://"+path.getPath()+"/airlines.accdb";
        qry="select MAX(Transaction)+1   from reservationrecord";
        
        con=DriverManager.getConnection(url);
        pr= con.prepareStatement(qry);
        
        rs= pr.executeQuery();
       
        while(rs.next()){
         jTextField9.setText(rs.getString(1));
        }
 
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
    
    }
     
        void insert(){
          Connection con = null; 
          PreparedStatement pr=null;
          String qry;
          String url;
          
           
           
          try{
               
                
             File path= new File(System.getProperty("user.dir"));
        url="jdbc:ucanaccess://"+path.getPath()+"/airlines.accdb";
              qry = "insert into reservationrecord(flightno,Name,contact, Departuretime,Arrivaltime ,Departuredate,Origin,Destination,Payment,Transaction,Gender ,flight) values( ?,?,?,?,?,?,?,?,?,?,?,?)";
             
             con = DriverManager.getConnection(url);
             pr=con.prepareStatement(qry);
            
             
             pr.setString(1,jTextField11.getText());
            pr.setString(2,jTextField1.getText());
            pr.setString(3,jTextField10.getText());
           pr.setString(4,jTextField4.getText());
              pr.setString(5,jTextField2.getText());
              pr.setString(6,jTextField5.getText());
              pr.setString(7,jTextField6.getText());
              pr.setString(8,jTextField7.getText());
              pr.setInt(9,Integer.parseInt(jTextField8.getText()));
            pr.setInt(10,Integer.parseInt(jTextField9.getText()));
            pr.setString(11,jTextField12.getText());
            pr.setString(12,jTextField13.getText());
         
             
             
             int result=pr.executeUpdate();
            if(result>0)
              JOptionPane.showMessageDialog(rootPane, "Thank YOu FOr BooKinG");
             con.close();
             
             
              
          }catch(Exception e){
              JOptionPane.showMessageDialog(rootPane, e);
              
          }
          
          
          
      }
         void reserve()
         {
      Connection con = null;
    PreparedStatement pr = null;
    String url = null;
    String qry= null;
    
    try{
        
         File path= new File(System.getProperty("user.dir"));
        url="jdbc:ucanaccess://"+path.getPath()+"/airlines.accdb";
             if(jRadioButton2.isSelected())
                  
        {
          qry="update  Dflightrecords set seats = seats - 1 where flightno ='"+jTextField11.getText()+ "'";
        }
   if(jRadioButton1.isSelected())
           {    qry="update  Iflightrecords set seats = seats - 1 where flightno ='"+jTextField11.getText()+ "'";
         }
        con=DriverManager.getConnection(url);
        pr=con.prepareStatement(qry);
            
        
        
        int result= pr.executeUpdate();
         
        
                
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
     
        

         }
         void total()  {           
                String tickets;
                int total;
         
             switch(jComboBox2.getSelectedIndex()){
            case 0:
                jTextField14.setText("");
                break;
            case 1:
                tickets = "1";
                jTextField14.setText(tickets);
                total=Integer.parseInt( jTextField8.getText())*1;
                 JOptionPane.showMessageDialog(null, "total" +total);
                 jTextField8.setText(""+total);
                
                
                break;
            case 2: 
                tickets = "2";
                jTextField14.setText(tickets);
                total=Integer.parseInt( jTextField8.getText())*2;
                 JOptionPane.showMessageDialog(null, "total" +total);
                 jTextField8.setText(""+total);
                break;
            case 3:
                tickets = "3";
                jTextField2.setText(tickets);
               total=Integer.parseInt( jTextField8.getText())*3;
                 JOptionPane.showMessageDialog(null, "total" +total);
                  jTextField8.setText(""+total);
                   case 4:
                     JOptionPane.showMessageDialog(null, "only three tickets can be booked "  );   
             }
         }
         void clearData()
      {
           
          jTextField1.setText("");
          jTextField12.setText("");
                     
      }
       
      
          private void generateReport() {   
        Connection con = null;
    PreparedStatement pr = null;
    String url = null;
    String qry= null;
    ResultSet rs = null;
        
        
       
        try {

        File path= new File(System.getProperty("user.dir"));
        url="jdbc:ucanaccess://"+path.getPath()+"/airlines.accdb";


// SELECT QUERY 

        qry="SELECT  flightno,Name,contact, Departuretime,Arrivaltime ,Departuredate,Origin,Destination,Transaction,Gender ,flight FROM reservationrecord where Transaction= '"+jTextField9.getText()+ "' ";
        con=DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        
       

                StyleBuilder columnTitleStyle  = stl.style(boldCenteredStyle)

                                    .setBorder(stl.pen1Point())
                                    .setBackgroundColor(Color.BLUE);

        
       JasperReportBuilder report = DynamicReports.report();//a new report
       report
                .setColumnTitleStyle(columnTitleStyle)
               // .setColumnStyle(boldStyle)
                .columns(
                        Columns.column("FLIGHTNO", "flightno", DataTypes.stringType()),
                        Columns.column("NAME", "Name", DataTypes.stringType()),
                        Columns.column("CONTACT", "Contact", DataTypes.stringType()),
                        Columns.column("TRANSACTION", "Transaction", DataTypes.stringType()),
    
                        Columns.column("GENDER", "Gender", DataTypes.stringType()),
                         Columns.column("ORIGIN", "Origin", DataTypes.stringType()),
                          Columns.column("DESTINATION", "Destination", DataTypes.stringType()),
                             Columns.column("DEPARTURETIME", "Departuretime", DataTypes.stringType()),
              Columns.column("ARRIVALTIME", "Arrivaltime", DataTypes.stringType()),
               Columns.column("DEPARTUREDATE", "Departuredate", DataTypes.stringType()),
               Columns.column("FLIGHT", "flight", DataTypes.stringType()) 
                             )
               
                  .title(//title of the report
	      Components.text(" CUSTOMER LIST ")
                      .setStyle(boldCenteredStyle)
                  .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)
		  )
                .setColumnTitleStyle(columnTitleStyle) 
                
		  .pageFooter(Components.pageXofY())//show page number on the page footer

                .pageFooter(Components.pageXofY())//show page number on the page footer

// SET DATA SOURCE
                .setDataSource(qry, con);
       try {
//show the report
            report.show(false);
//export the report to a pdf file
//report.toPdf(new FileOutputStream("c:/report.pdf"));
        } catch (DRException e) {
            e.printStackTrace();
        }
          
          }
 
    
     
    

         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
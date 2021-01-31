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
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class SearchFlight extends javax.swing.JInternalFrame {


    private final DefaultTableModel model;

    
  String Flight,Origin,Destination, Flightno,Date;
 
  
    /**
     * Creates new form SELECT
     */
    public SearchFlight() {
           model = new DefaultTableModel();
              
                      
           
    
        initComponents();
      
    
        
        
        
           
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        dates = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(null);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel5.setText("Form");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 50, 70, 29);

        jTextField3.setText(" ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField3);
        jTextField3.setBounds(90, 50, 140, 30);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel6.setText("To");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(240, 50, 50, 30);

        jTextField4.setText(" ");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel4.add(jTextField4);
        jTextField4.setBounds(280, 50, 140, 30);

        jComboBox3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "DUBAI", "THAILAND", "MALAYSAI", "SINGAPUR", "LONDON" }));
        jComboBox3.setToolTipText("");
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox3);
        jComboBox3.setBounds(90, 90, 140, 30);

        jComboBox4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "DUBAI", "THAILAND", "MALAYSAI", "SINGAPUR", "LONDON" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox4);
        jComboBox4.setBounds(280, 90, 140, 30);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setText("From");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(430, 50, 70, 30);

        jTextField1.setText(" ");
        jPanel4.add(jTextField1);
        jTextField1.setBounds(510, 50, 140, 30);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setText("To");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(670, 50, 40, 30);

        jTextField2.setText(" ");
        jPanel4.add(jTextField2);
        jTextField2.setBounds(720, 50, 140, 30);

        jComboBox1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mumbai", "Delhi", "Bhopal", "Lucknow", "Jaipur" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(510, 90, 140, 30);

        jComboBox2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mumbai", "Delhi", "Bhopal", "Lucknow", "Jaipur" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox2);
        jComboBox2.setBounds(720, 90, 140, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jRadioButton1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jRadioButton1.setText("International");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(100, 0, 230, 30);

        jRadioButton2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jRadioButton2.setText("Domestic");
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(390, 0, 240, 30);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(60, 10, 710, 30);

        dates.setFieldFont(new java.awt.Font("Garamond", java.awt.Font.BOLD, 13));
        dates.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                datesOnSelectionChange(evt);
            }
        });
        jPanel4.add(dates);
        dates.setBounds(90, 140, 140, 30);

        jButton1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(290, 140, 260, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Date");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 140, 60, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 80, 870, 180);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jButton2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton2.setText("Proceed");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(720, 50, 140, 40);

        jTable1.setModel(model);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 680, 160);

        jTextField5.setText(" ");
        jPanel5.add(jTextField5);
        jTextField5.setBounds(530, 10, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Flight No. :");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(420, 10, 110, 30);

        jButton3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton3.setText("Report");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(720, 100, 140, 40);

        jButton4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton4.setText("Back");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(720, 150, 140, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 250, 870, 220);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel9.setText("SEARCH FLIGHT");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(280, 20, 330, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if((  jComboBox1.getSelectedIndex())==( jComboBox2.getSelectedIndex()) && (jComboBox3.getSelectedIndex())==(jComboBox4.getSelectedIndex())){
            JOptionPane.showMessageDialog(null,"Your Origin and Destination are the same !! ");
        }
        else{
       Flightno=jTextField5.getText(); 
       Date= dates.getText(); 
        if( jRadioButton1.isSelected()){
            Origin=jTextField3.getText();
            Destination=jTextField4.getText();
        }
         if( jRadioButton2.isSelected()){
          
         Origin=jTextField1.getText();
            Destination=jTextField2.getText();
         }
       
        FlightBook  y=new  FlightBook();
        JDesktopPane  desktopPane = getDesktopPane();
         desktopPane.add( y );
        y.FlightDetails(Flightno,Origin,Destination,Date);
         y.setVisible(true);
          this.dispose();
         
                
        }
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
       
          switch(jComboBox4 .getSelectedIndex()){
            case 0:
               jTextField4.setText("");
                break;
            case 1:
                Origin = "Dubai";
                jTextField4.setText(Origin);
                break;
            case 2:
                Origin = "thailand";
                jTextField4.setText(Origin);
                break;
            case 3:
                Origin = "malaysia";
                jTextField4.setText(Origin);
                break;
            case 4:
                Origin = "singapur";
                jTextField4.setText(Origin);
                break;
             case 5:
                Origin = "london";
                jTextField4.setText(Origin);
                break;
             
                
        }
                
 
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
           Flight ="INTERNATIONAL";
       jRadioButton2.setSelected(false);
           jComboBox3.setSelectedIndex(0);
         jComboBox4.setSelectedIndex(0);
  jComboBox1.setEnabled(false);
           jComboBox2.setEnabled(false);
          jComboBox3.setEnabled(true);
       jComboBox4.setEnabled(true);
      
     
       }
       else{
           jComboBox1.setSelectedIndex(0);
          jComboBox2.setSelectedIndex(0);
          jComboBox3.setEnabled(false);
           jComboBox4.setEnabled(false);
            
       }
      
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        switch(jComboBox3 .getSelectedIndex()){
            case 0:
                jTextField3.setText("");
                break;
                
            case 1:
                Destination = "dubai";
                jTextField3.setText(Destination);
                break;
            case 2:
                Destination = "thailand";
                jTextField3.setText(Destination);
                break;
            case 3:
                Destination = " malaysia";
                jTextField3.setText(Destination);
                break;
            case 4:
                Destination = "singapur";
                jTextField3.setText(Destination);
                break;
            case 5:
                Destination = " london";
                jTextField3.setText(Destination);
                break;
            
        }
      
          
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                jTextField1.setText("");
                break;
            case 1:
                Destination = "mumbai";
                  jTextField1.setText(Destination);
                break;
            case 2:
                Destination = "delhi";
                 jTextField1.setText(Destination);
                break;
            case 3:
                Destination = "bhopal";
                 jTextField1.setText(Destination);
                break;
            case 4:
                Destination = "lucknow";
                 jTextField1.setText(Destination);
                break;
             case 5:
                Destination = "jaipur";
                 jTextField1.setText(Destination);
                break;   
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
   switch(jComboBox2.getSelectedIndex()){
            case 0:
                jTextField2.setText("");
                break;
            case 1:
                Destination = "mumbai";
                jTextField2.setText(Destination);
                break;
            case 2:
                Destination = "delhi";
                jTextField2.setText(Destination);
                break;
            case 3:
                Destination = "bhopal";
                jTextField2.setText(Destination);
                break;
            case 4:
                Destination = "lucknow";
                jTextField2.setText(Destination);
                break;
             case 5:
                Destination = "jaipur";
                jTextField2.setText(Destination);
                break;   
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          loadData();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
              generateReport();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        
         
        
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTable1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
        showData1();
         
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datesOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_datesOnSelectionChange
        // TODO add your handling code here:
         
             
    }//GEN-LAST:event_datesOnSelectionChange

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Home h = new Home();
        this.dispose();
        h.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if( jRadioButton2.isSelected()){
            Flight ="DOMESTIC";
            jRadioButton1.setSelected(false);
            jComboBox3.setSelectedIndex(0);
            jComboBox4.setSelectedIndex(0);
            jComboBox3.setEnabled(false);
            jComboBox4.setEnabled(false);
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);

        }
        else{
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jComboBox1.setEnabled(false);
            jComboBox2.setEnabled(false);

        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

       
    
    
    
    
    
    
     void showData1(){
        int row_count = model.getRowCount();
        if(row_count>0)
            for( int i = row_count-1;i>=0;i--)
                model.removeRow(i);
        
        model.setColumnCount(0);
        Connection con = null;
        
    PreparedStatement pr = null;
    String url = null;
    String qry= null;
        ResultSet rs = null;
    try{
         File path= new File(System.getProperty("user.dir"));
        url="jdbc:ucanaccess://"+path.getPath()+"/airlines.accdb";
         if(jRadioButton1.isSelected())
         {
        qry="SELECT Iflightrecords.* FROM Iflightrecords  where Destination ='"+jTextField3.getText()+"' and Origin='"+jTextField4.getText()+"' ";
   
         }
            if(jRadioButton2.isSelected())  {
             
              qry="SELECT Dflightrecords.* FROM Dflightrecords where Destination='"+jTextField1.getText()+"' and Origin='"+jTextField2.getText()+"'  ";

           }
        con=DriverManager.getConnection(url);
         
      
        pr= con.prepareStatement(qry);
        
        rs= pr.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int col_count= rsmd.getColumnCount();
        
        for( int i = 0;i< col_count;i++){
            String col_name= rsmd.getColumnName(i+1);
            model.addColumn(col_name);
        }
        while(rs.next()){
            Vector v= new Vector();
            for (int i=0;i<col_count;i++)
                v.add(rs.getString(i+1));
            model.addRow(v);
        }
        
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
    }
      void loadData(){
          String qry= null;
        DefaultTableModel m1 = (DefaultTableModel) jTable1.getModel();
        
        int rowindex = jTable1.getSelectedRow();
        if(jRadioButton1.isSelected())
         {
        qry="select  * from  Iflightrecords"  ; 
         jTextField5.setText(m1.getValueAt(rowindex, 6).toString());
         }
          if(jRadioButton2.isSelected()){
             
              qry="select    * from Dfightrecords";
        
        
            jTextField5.setText(m1.getValueAt(rowindex, 0).toString());
           
        }
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


// SearchFlight QUERY 
 if(jRadioButton1.isSelected())
         {
        qry="select  * from  Iflightrecords"  ; 
         }
          if(jRadioButton2.isSelected()){
             
              qry="select    * from Dflightrecords";
         }
        con=DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        
       

                net.sf.dynamicreports.report.builder.style.StyleBuilder columnTitleStyle  = stl.style(boldCenteredStyle)

                                    .setBorder(stl.pen1Point())
                                    .setBackgroundColor(Color.RED);

        
       net.sf.dynamicreports.jasper.builder.JasperReportBuilder report = DynamicReports.report();//a new report
         report
                .setColumnTitleStyle(columnTitleStyle)
               // .setColumnStyle(boldStyle)
                .columns(
                  Columns.column("FLIGHTNO", "flightno",   DataTypes.stringType()),
                        Columns.column("Airliner", "Airliner", DataTypes.stringType()),
                        Columns.column("Destination", "Destination", DataTypes.stringType()),
                        Columns.column("Origin", "Origin", DataTypes.stringType()),
                        Columns.column("Arrivaltime", "Arrivaltime", DataTypes.stringType()),
                       Columns.column("Departuretime", "Departuretime", DataTypes.stringType())       ,
                       Columns.column(" Eprice", "Eprice", DataTypes.stringType()), 
                         Columns.column(" days", "days", DataTypes.stringType()),
                          Columns.column(" seats", "seats", DataTypes.stringType()),
                           Columns.column(" date", "date", DataTypes.stringType()) 
                  
                          
                 )
                 .title(//title of the report
	      Components.text(" FLIGHT DETAILS LIST ")
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
    private datechooser.beans.DateChooserCombo dates;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

   
    
    }

   
    
    
    

  
    
     

   
    

    
    
    
    
        
 

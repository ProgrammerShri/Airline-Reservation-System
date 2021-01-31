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
 * @author 
 *
 */
public class FlightInfo extends javax.swing.JInternalFrame {
      
   
    

    private final DefaultTableModel model;

    /**
     * Creates new form fLIGHTINFO
     */
    public FlightInfo() {
        
model = new DefaultTableModel();
         
        
     
        initComponents();
        showData();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        my = new javax.swing.JRadioButton();
        my2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        date = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel1.setLayout(null);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jTable1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 10, 830, 180);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 190, 880, 190);

        jButton2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton2.setText("Report");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(470, 390, 160, 40);

        jButton1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton1.setText("Back To Menu");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 390, 200, 40);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setText("RESERVATION RECORDS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 30, 510, 50);

        my.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        my.setText("By Date");
        my.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        my.setOpaque(false);
        jPanel1.add(my);
        my.setBounds(130, 150, 120, 29);

        my2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        my2.setText("By Contact");
        my2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        my2.setOpaque(false);
        jPanel1.add(my2);
        my2.setBounds(400, 150, 140, 29);

        jTextField1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(550, 150, 160, 30);

        date.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
        jPanel1.add(date);
        date.setBounds(250, 150, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       
        Home h = new Home();
        this.dispose();
        h.setVisible(true);
           
           
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            generateReport();
    }//GEN-LAST:event_jButton2ActionPerformed
 
    void showData(){
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
        qry="select  flightno,Name,Contact,  Departuretime, Arrivaltime,Departuredate,Origin,Destination,Payment,Transaction,Gender  from  reservationrecord";
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
 if(my.isSelected())
 {
        qry="select * from reservationrecord where date='"+date.getText()+"' ";
 }
  if(my2.isSelected())
  {
       qry="select * from reservationrecord where Contact='"+jTextField1.getText()+"' ";
  }
        con=DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        
       

                net.sf.dynamicreports.report.builder.style.StyleBuilder columnTitleStyle  = stl.style(boldCenteredStyle)

                                    .setBorder(stl.pen1Point())
                                    .setBackgroundColor(Color.BLUE);

        
       net.sf.dynamicreports.jasper.builder.JasperReportBuilder report = DynamicReports.report();//a new report
         report
                .setColumnTitleStyle(columnTitleStyle)
               // .setColumnStyle(boldStyle)
                .columns(
                  Columns.column("FLIGHTNO", "flightno",   DataTypes.stringType()),
                        Columns.column("NAME", "Name", DataTypes.stringType()),
                        Columns.column("CONTACT", "Contact", DataTypes.stringType()),
                         
                        Columns.column("DEPARTURETIME", "Departuretime", DataTypes.stringType()),
                       Columns.column("ARRIVALTIME", "Arrivaltime", DataTypes.stringType())       ,
                       Columns.column(" DEPARTUREDATE", "Departuredate", DataTypes.stringType()), 
                         Columns.column(" ORIGIN", "Origin", DataTypes.stringType()),
                                    Columns.column(" DESTINATION", "Destination", DataTypes.stringType()),
                                  Columns.column(" PAYMENT", "Payment", DataTypes.stringType()),
                                   Columns.column(" TRANSACTION  ","Transaction", DataTypes.stringType()),
                                    Columns.column(" GENDER", "Gender", DataTypes.stringType()) 
                          
                 )
                 .title(//title of the report
	      Components.text(" RESERVATION LIST ")
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
    private datechooser.beans.DateChooserCombo date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton my;
    private javax.swing.JRadioButton my2;
    // End of variables declaration//GEN-END:variables
}

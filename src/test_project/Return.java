/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class Return extends javax.swing.JFrame {

    /**
     * Creates new form Return
     */
    public Return() {
        initComponents();
        DisplayRents();
        DisplayReturn();
        CustNameTbl.setEditable(false);
        RegNumTbl.setEditable(false);
        FineTb.setEditable(false);
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    private void DisplayRents()
    {
        try
            {
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root",""); 
              St = Con.createStatement();
              Rs = St.executeQuery("select * from renttbl ");
              RentTable.setModel(DbUtils.resultSetToTableModel(Rs));
            }catch(SQLException e)  
            {
                    e.printStackTrace();
            } 
    }
    
    private void DisplayReturn()
    {
        try
            {
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root",""); 
              St = Con.createStatement();
              Rs = St.executeQuery("select * from returntbl ");
              ReturnTable.setModel(DbUtils.resultSetToTableModel(Rs));
            }catch(SQLException e)  
            {
                    e.printStackTrace();
            } 
    }
    
    private void UpdateCar(){
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
                String Reg = RegNumTbl.getText();
                String CarStatus = "Available";
                String Query = "Update cartbl set Status='"+CarStatus+"'where CarReg='"+Reg+"'"; 
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Car Updated Successfully");
                
        }catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    private void RemoveFromRent(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
            String Query = "Delete from renttbl where RentId="+RId; 
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Car Remove from Rented Cars");
            DisplayRents();
                
        }catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    private void Generate(){
        
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CarsTbl = new javax.swing.JLabel();
        RentCarsTbl = new javax.swing.JLabel();
        CustomerTbl = new javax.swing.JLabel();
        tblLogout = new javax.swing.JLabel();
        HomeTbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ReturnId = new javax.swing.JTextField();
        RegNumTbl = new javax.swing.JTextField();
        DelayTb = new javax.swing.JTextField();
        FineTb = new javax.swing.JTextField();
        ReturnBtn = new javax.swing.JButton();
        PrintTbl = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RentTable = new javax.swing.JTable();
        ReturnDate = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ReturnTable = new javax.swing.JTable();
        GenerateTbl = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CustNameTbl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        CarsTbl.setBackground(new java.awt.Color(255, 255, 255));
        CarsTbl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        CarsTbl.setForeground(new java.awt.Color(255, 255, 255));
        CarsTbl.setText("Cars");
        CarsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsTblMouseClicked(evt);
            }
        });

        RentCarsTbl.setBackground(new java.awt.Color(255, 255, 255));
        RentCarsTbl.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        RentCarsTbl.setForeground(new java.awt.Color(255, 255, 255));
        RentCarsTbl.setText("Rent Cars");
        RentCarsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentCarsTblMouseClicked(evt);
            }
        });

        CustomerTbl.setBackground(new java.awt.Color(255, 255, 255));
        CustomerTbl.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        CustomerTbl.setForeground(new java.awt.Color(255, 255, 255));
        CustomerTbl.setText("Customer");
        CustomerTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTblMouseClicked(evt);
            }
        });

        tblLogout.setBackground(new java.awt.Color(255, 255, 255));
        tblLogout.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        tblLogout.setForeground(new java.awt.Color(255, 255, 255));
        tblLogout.setText("Logout");
        tblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLogoutMouseClicked(evt);
            }
        });

        HomeTbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\IdeaProjects\\Test_project\\src\\test_project\\img\\Car-Front-Red-icon.png")); // NOI18N
        HomeTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeTblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CarsTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerTbl)
                            .addComponent(RentCarsTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(HomeTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(HomeTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(CustomerTbl)
                .addGap(41, 41, 41)
                .addComponent(CarsTbl)
                .addGap(40, 40, 40)
                .addComponent(RentCarsTbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tblLogout))
        );

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Return Cars");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Return Id");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Return Date");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Delay");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("Fine");

        ReturnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnIdActionPerformed(evt);
            }
        });

        RegNumTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNumTblActionPerformed(evt);
            }
        });

        DelayTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelayTbActionPerformed(evt);
            }
        });

        FineTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FineTbActionPerformed(evt);
            }
        });

        ReturnBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ReturnBtn.setForeground(new java.awt.Color(255, 0, 0));
        ReturnBtn.setText("Return");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });

        PrintTbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PrintTbl.setForeground(new java.awt.Color(255, 0, 0));
        PrintTbl.setText("Print");
        PrintTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintTblMouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("Registration ");

        RentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "RentId", "Registration", "Customer", "RentDate", "ReturnDate", "Fees"
            }
        ));
        RentTable.setRowHeight(25);
        RentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(RentTable);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("Cars On Rent");

        ReturnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "RetId", "Registration", "Customer", "Return Date", "Delay", "Fine"
            }
        ));
        ReturnTable.setRowHeight(25);
        ReturnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ReturnTable);

        GenerateTbl.setBackground(new java.awt.Color(255, 255, 255));
        GenerateTbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        GenerateTbl.setForeground(new java.awt.Color(255, 0, 51));
        GenerateTbl.setText("Generate");
        GenerateTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerateTblMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("Customer Name");

        CustNameTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustNameTblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(862, Short.MAX_VALUE)
                .addComponent(PrintTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DelayTb, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FineTb, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(ReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ReturnId)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenerateTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addComponent(RegNumTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustNameTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(ReturnBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReturnId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegNumTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustNameTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DelayTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FineTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenerateTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(ReturnBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintTbl)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnIdActionPerformed

    private void RegNumTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNumTblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNumTblActionPerformed

    private void DelayTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelayTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelayTbActionPerformed

    private void FineTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FineTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FineTbActionPerformed
    int RId;
    private void RentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentTableMouseClicked
        try {
            DefaultTableModel model =(DefaultTableModel)RentTable.getModel();
            int MyIndex = RentTable.getSelectedRow();
            RegNumTbl.setText(model.getValueAt(MyIndex, 1).toString());
            CustNameTbl.setText(model.getValueAt(MyIndex, 2).toString());
            RId = Integer.valueOf((model.getValueAt(MyIndex, 0).toString()));
            Cost = Integer.valueOf(model.getValueAt(MyIndex, 5).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_RentTableMouseClicked

    private void ReturnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnTableMouseClicked
    
    int Cost = 0;
    int Fine;
    private void GenerateTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerateTblMouseClicked
        // TODO add your handling code here:
        if(Cost==0){
             JOptionPane.showMessageDialog(this, "Select the car to return");
        }else{
            Fine = Cost * Integer.valueOf(DelayTb.getText());
            FineTb.setText("Rs" + Fine);
        }
        
    }//GEN-LAST:event_GenerateTblMouseClicked

    java.util.Date ReturnDat;
    java.sql.Date MyReturnDat;
    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed
        // TODO add your handling code here:
        if(RegNumTbl.getText().isEmpty() || DelayTb.getText().isEmpty() || FineTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
            try{   
                ReturnDat = ReturnDate.getDate();
                MyReturnDat = new java.sql.Date(ReturnDat.getTime());
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
                PreparedStatement add = Con.prepareCall("insert into returntbl values(?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(ReturnId.getText()));
                add.setString(2, RegNumTbl.getText());
                add.setString(3, CustNameTbl.getText());
                add.setDate(4, MyReturnDat);
                add.setInt(5, Integer.valueOf(DelayTb.getText()));
                add.setInt(6, Fine);
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cars Returned  Successfully");
                DisplayReturn();
                UpdateCar();
                RemoveFromRent();
                //DisplayRents();
            }catch (Exception e) {
                e.printStackTrace();
            }}
    }//GEN-LAST:event_ReturnBtnActionPerformed

    private void CustNameTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustNameTblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustNameTblActionPerformed

    private void PrintTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintTblMouseClicked
        // TODO add your handling code here:
        try {
            ReturnTable.print(); 
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PrintTblMouseClicked

    private void CustomerTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTblMouseClicked
        // TODO add your handling code here:
        dispose();
        Customer customer = new Customer();
        customer.setLocationRelativeTo(null);
        customer.setVisible(true);
        customer.show();
    }//GEN-LAST:event_CustomerTblMouseClicked

    private void CarsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsTblMouseClicked
        // TODO add your handling code here:
        dispose();
        Cars cars = new Cars();
        cars.setLocationRelativeTo(null);
        cars.setVisible(true);
        cars.show();
    }//GEN-LAST:event_CarsTblMouseClicked

    private void RentCarsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentCarsTblMouseClicked
        // TODO add your handling code here:
        dispose();
        Rents rents = new Rents();
        rents.setLocationRelativeTo(null);
        rents.setVisible(true);
        rents.show();
    }//GEN-LAST:event_RentCarsTblMouseClicked

    private void tblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLogoutMouseClicked
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.show();
    }//GEN-LAST:event_tblLogoutMouseClicked

    private void HomeTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeTblMouseClicked
        // TODO add your handling code here:
        dispose();
        Home home= new Home();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        home.show();
    }//GEN-LAST:event_HomeTblMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Return rt = new Return();
                rt.setLocationRelativeTo(null);
                rt.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarsTbl;
    private javax.swing.JTextField CustNameTbl;
    private javax.swing.JLabel CustomerTbl;
    private javax.swing.JTextField DelayTb;
    private javax.swing.JTextField FineTb;
    private javax.swing.JLabel GenerateTbl;
    private javax.swing.JLabel HomeTbl;
    private javax.swing.JButton PrintTbl;
    private javax.swing.JTextField RegNumTbl;
    private javax.swing.JLabel RentCarsTbl;
    private javax.swing.JTable RentTable;
    private javax.swing.JButton ReturnBtn;
    private com.toedter.calendar.JDateChooser ReturnDate;
    private javax.swing.JTextField ReturnId;
    private javax.swing.JTable ReturnTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel tblLogout;
    // End of variables declaration//GEN-END:variables
}

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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class Cars extends javax.swing.JFrame {

    /**
     * Creates new form Cars
     */
    public Cars() {
        initComponents();
        DisplayCars();
    }
    private void showCars(){
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
        JBRentCars = new javax.swing.JLabel();
        JBReturnCars = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tblLogout = new javax.swing.JLabel();
        HomeTbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BrandTb = new javax.swing.JTextField();
        RegNumTb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarsTable = new javax.swing.JTable();
        ModelTb = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        StatusCb = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        JBRentCars.setBackground(new java.awt.Color(255, 255, 255));
        JBRentCars.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        JBRentCars.setForeground(new java.awt.Color(255, 255, 255));
        JBRentCars.setText("Rent Car");
        JBRentCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBRentCarsMouseClicked(evt);
            }
        });

        JBReturnCars.setBackground(new java.awt.Color(255, 255, 255));
        JBReturnCars.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        JBReturnCars.setForeground(new java.awt.Color(255, 255, 255));
        JBReturnCars.setText("Return Car");
        JBReturnCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBReturnCarsMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Customer");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
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
        HomeTbl.setMaximumSize(new java.awt.Dimension(500, 600));
        HomeTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeTblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBRentCars, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(JBReturnCars, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(HomeTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel9)
                .addGap(46, 46, 46)
                .addComponent(JBRentCars)
                .addGap(46, 46, 46)
                .addComponent(JBReturnCars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tblLogout))
        );

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Registration Num");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Cars List");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));

        BrandTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandTbActionPerformed(evt);
            }
        });

        RegNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNumTbActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Model");

        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("Status");

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 0, 51));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 0, 51));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 0, 51));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 0, 51));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("Manage Cars");

        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Registration", "Brand", "Model", "Status", "Price"
            }
        ));
        CarsTable.setRowHeight(25);
        CarsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CarsTable);

        ModelTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelTbActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("Brand");

        StatusCb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StatusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Available" }));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel12)
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BrandTb, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ModelTb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BrandTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ModelTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ResetBtn)
                                    .addComponent(DeleteBtn)
                                    .addComponent(EditBtn)
                                    .addComponent(SaveBtn))))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrandTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandTbActionPerformed

    private void RegNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNumTbActionPerformed

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    private void DisplayCars()
    {
            try
            {
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root",""); 
              St = Con.createStatement();
              Rs = St.executeQuery("select * from cartbl");
              CarsTable.setModel(DbUtils.resultSetToTableModel(Rs));
            }catch(SQLException e)  
            {
                    e.printStackTrace();
            } 
    }
    
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(RegNumTb.getText().isEmpty() || PriceTb.getText().isEmpty() || BrandTb.getText().isEmpty() || PriceTb.getText().isEmpty() || StatusCb.getSelectedIndex() == -1)
        {
                JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
                PreparedStatement add = Con.prepareCall("insert into cartbl values(?,?,?,?,?)");
                add.setString(1, RegNumTb.getText());
                add.setString(2, BrandTb.getText());
                add.setString(3, ModelTb.getText());
                add.setString(4, StatusCb.getSelectedItem().toString());
                add.setInt(5, Integer.valueOf(PriceTb.getText()));
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Car Added Successfully");
                DisplayCars();
        }catch (Exception e) {
                e.printStackTrace();
        }}
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if(RegNumTb.getText().isEmpty() || ModelTb.getText().isEmpty() || BrandTb.getText().isEmpty() || PriceTb.getText().isEmpty() || StatusCb.getSelectedIndex() == -1)
        {
                JOptionPane.showMessageDialog(this, "Select The Car To Be Updated");
        }else{
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
                String Reg = RegNumTb.getText();
                String Query = "Update cartbl set Brand='"+BrandTb.getText()+"',Model='"+ModelTb.getText()+"',Status='"+StatusCb.getSelectedItem().toString()+"',Price='"+PriceTb.getText()+"' where CarReg='"+Reg+"'"; 
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Car Updated Successfully");
                DisplayCars();
                Reset();
        }catch (Exception e) {
                e.printStackTrace();
        }}
    }//GEN-LAST:event_EditBtnActionPerformed
    
    private void Reset()
    {
            RegNumTb.setText("");
            BrandTb.setText("");
            ModelTb.setText("");
            StatusCb.setSelectedIndex(0);
            PriceTb.setText("");
    }
    
    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
       Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(RegNumTb.getText().isEmpty())
        {
                JOptionPane.showMessageDialog(this, "Select The Car To Be Deleted");
        }else{
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
                String Reg = RegNumTb.getText();
                String Query = "Delete from cartbl where CarReg='"+Reg+"'"; 
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Car Deleted Successfully");
                DisplayCars();
                Reset();
        }catch (Exception e) {
                e.printStackTrace();
        }}
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void CarsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)CarsTable.getModel();
        int MyIndex = CarsTable.getSelectedRow();
        RegNumTb.setText(model.getValueAt(MyIndex, 0).toString());
        BrandTb.setText(model.getValueAt(MyIndex, 1).toString());
        ModelTb.setText(model.getValueAt(MyIndex, 2).toString());
        StatusCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 4).toString());
        
    }//GEN-LAST:event_CarsTableMouseClicked

        private void ModelTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelTbActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_ModelTbActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        dispose();
        Customer customer = new Customer();
        customer.setLocationRelativeTo(null);
        customer.setVisible(true);
        customer.show();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void JBRentCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBRentCarsMouseClicked
        // TODO add your handling code here:
        dispose();
        Rents rent = new Rents();
        rent.setLocationRelativeTo(null);
        rent.setVisible(true);
        rent.show();
    }//GEN-LAST:event_JBRentCarsMouseClicked

    private void JBReturnCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBReturnCarsMouseClicked
        // TODO add your handling code here:
        dispose();
        Return rtn = new Return();
        rtn.setLocationRelativeTo(null);
        rtn.setVisible(true);
        rtn.show();
    }//GEN-LAST:event_JBReturnCarsMouseClicked

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
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cars cars = new Cars();
                cars.setLocationRelativeTo(null);
                cars.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BrandTb;
    private javax.swing.JTable CarsTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel HomeTbl;
    private javax.swing.JLabel JBRentCars;
    private javax.swing.JLabel JBReturnCars;
    private javax.swing.JTextField ModelTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField RegNumTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> StatusCb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tblLogout;
    // End of variables declaration//GEN-END:variables
}

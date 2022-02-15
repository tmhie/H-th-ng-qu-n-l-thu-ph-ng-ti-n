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
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        DisplayCars();
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
        JBRentCar = new javax.swing.JLabel();
        JBReturnCar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tblLogout = new javax.swing.JLabel();
        HomeTbl = new javax.swing.JLabel();
        CustIdTb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        CustNameTb = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CustPhoneTb = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        CustAddTb = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        JBRentCar.setBackground(new java.awt.Color(255, 255, 255));
        JBRentCar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        JBRentCar.setForeground(new java.awt.Color(255, 255, 255));
        JBRentCar.setText("Rent Car");
        JBRentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBRentCarMouseClicked(evt);
            }
        });

        JBReturnCar.setBackground(new java.awt.Color(255, 255, 255));
        JBReturnCar.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        JBReturnCar.setForeground(new java.awt.Color(255, 255, 255));
        JBReturnCar.setText("Return Car");
        JBReturnCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBReturnCarMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cars");
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
                        .addContainerGap()
                        .addComponent(tblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(JBReturnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(HomeTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(HomeTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel9)
                .addGap(45, 45, 45)
                .addComponent(JBRentCar)
                .addGap(42, 42, 42)
                .addComponent(JBReturnCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tblLogout))
        );

        CustIdTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustIdTbActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("Manage Customer ");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Address");

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Name", "Address", "Phone Number"
            }
        ));
        CustomerTable.setRowHeight(25);
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        CustNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustNameTbActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("Phone Number");

        CustPhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustPhoneTbActionPerformed(evt);
            }
        });

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

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Customer Name");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Customer List");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Customer ID");

        ResetBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 0, 51));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        CustAddTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustAddTbActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(372, 372, 372))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(337, 337, 337))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(132, 132, 132)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CustNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(CustAddTb, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustPhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustAddTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustPhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ResetBtn))
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustIdTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustIdTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustIdTbActionPerformed

    private void CustNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustNameTbActionPerformed

    private void CustPhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustPhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustPhoneTbActionPerformed
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    private void DisplayCars()
    {
            try
            {
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root",""); 
              St = Con.createStatement();
              Rs = St.executeQuery("select * from customertbl");
              CustomerTable.setModel(DbUtils.resultSetToTableModel(Rs));
            }catch(SQLException e)  
            {
                    e.printStackTrace();
            } 
    }
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
            if(CustIdTb.getText().isEmpty() || CustNameTb.getText().isEmpty() || CustAddTb.getText().isEmpty() || CustPhoneTb.getText().isEmpty())
        {
                JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
                PreparedStatement add = Con.prepareCall("insert into customertbl values(?,?,?,?)");
                add.setString(1, CustIdTb.getText());
                add.setString(2, CustNameTb.getText());
                add.setString(3, CustAddTb.getText());
                add.setString(4, CustPhoneTb.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Added Successfully");
                DisplayCars();
        }catch (Exception e) {
                e.printStackTrace();
        }}
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void CustAddTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustAddTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustAddTbActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(CustIdTb.getText().isEmpty())
        {
                JOptionPane.showMessageDialog(this, "Select The Customer To Be Deleted");
        }else{
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
                String Query = "Delete from customertbl where CustId="+CustIdTb.getText(); 
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Customer Deleted Successfully");
                DisplayCars();
                Reset();
        }catch (Exception e) {
                e.printStackTrace();
        }}
    }//GEN-LAST:event_DeleteBtnActionPerformed
        private void Reset()
        {
                CustIdTb.setText("");
                CustNameTb.setText("");
                CustAddTb.setText("");
                CustPhoneTb.setText("");
        }
        private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
                Reset();
        }//GEN-LAST:event_ResetBtnActionPerformed

        private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
                DefaultTableModel model =(DefaultTableModel)CustomerTable.getModel();
                int MyIndex = CustomerTable.getSelectedRow();
                CustIdTb.setText(model.getValueAt(MyIndex, 0).toString());
                CustNameTb.setText(model.getValueAt(MyIndex, 1).toString());
                CustAddTb.setText(model.getValueAt(MyIndex, 2).toString());
                CustPhoneTb.setText(model.getValueAt(MyIndex, 3).toString());
        }//GEN-LAST:event_CustomerTableMouseClicked

        private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
                if(CustIdTb.getText().isEmpty() || CustNameTb.getText().isEmpty() || CustAddTb.getText().isEmpty() || CustPhoneTb.getText().isEmpty())
        {
                JOptionPane.showMessageDialog(this, "Select The Customer To Be Updated");
        }else{
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
                String CustId = CustIdTb.getText();
                String Query = "Update customertbl set CustName='"+CustNameTb.getText()+"',CustAdd='"+CustAddTb.getText()+"',CustPhone='"+CustPhoneTb.getText()+"'where CustId="+CustId; 
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Customer Updated Successfully");
                DisplayCars();
                Reset();
        }catch (Exception e) {
                e.printStackTrace();
        }}
        }//GEN-LAST:event_EditBtnActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        dispose();
        Cars cars = new Cars();
        cars.setLocationRelativeTo(null);
        cars.setVisible(true);
        cars.show();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void JBRentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBRentCarMouseClicked
        // TODO add your handling code here:
        dispose();
        Rents rent = new Rents();
        rent.setLocationRelativeTo(null);
        rent.setVisible(true);
        rent.show();
    }//GEN-LAST:event_JBRentCarMouseClicked

    private void JBReturnCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBReturnCarMouseClicked
        // TODO add your handling code here:
        dispose();
        Return rt = new Return();
        rt.setLocationRelativeTo(null);
        rt.setVisible(true);
        rt.show();
    }//GEN-LAST:event_JBReturnCarMouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Customer customer = new Customer();
                customer.setLocationRelativeTo(null);
                customer.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustAddTb;
    private javax.swing.JTextField CustIdTb;
    private javax.swing.JTextField CustNameTb;
    private javax.swing.JTextField CustPhoneTb;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel HomeTbl;
    private javax.swing.JLabel JBRentCar;
    private javax.swing.JLabel JBReturnCar;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tblLogout;
    // End of variables declaration//GEN-END:variables
}
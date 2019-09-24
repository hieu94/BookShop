/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshop;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hieu
 */
public class Authors extends javax.swing.JFrame {

    /**
     * Creates new form Authors
     */
    public Authors() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    boolean action;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblAuthors = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAuthorAge = new javax.swing.JLabel();
        lblAuthorSex = new javax.swing.JLabel();
        lblAuthorNationality = new javax.swing.JLabel();
        lblAuthorAddress = new javax.swing.JLabel();
        lblAuthorPhoneNumber = new javax.swing.JLabel();
        lblAuthorEmail = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        txtAuthorAge = new javax.swing.JTextField();
        txtAuthorSex = new javax.swing.JTextField();
        txtAuthorNationality = new javax.swing.JTextField();
        txtAuthorAddress = new javax.swing.JTextField();
        txtAuthorPhoneNumber = new javax.swing.JTextField();
        txtAuthorEmail = new javax.swing.JTextField();
        btnAddNewAuthor = new javax.swing.JButton();
        btnUpdateAuthor = new javax.swing.JButton();
        btnDeleteAuthor = new javax.swing.JButton();
        btnSaveAuthor = new javax.swing.JButton();
        txtFindAuthor = new javax.swing.JTextField();
        btnFindAuthor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAuthors = new javax.swing.JTable();
        btnShowAllAuthors = new javax.swing.JButton();
        btnExitProgram = new javax.swing.JButton();
        lblFindAuthor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Authors");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblAuthors.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        lblAuthors.setForeground(java.awt.Color.darkGray);
        lblAuthors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthors.setText("AUTHORS");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblName.setForeground(java.awt.Color.darkGray);
        lblName.setText("Author name:");

        lblAuthorAge.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAuthorAge.setForeground(java.awt.Color.darkGray);
        lblAuthorAge.setText("Age:");

        lblAuthorSex.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAuthorSex.setForeground(java.awt.Color.darkGray);
        lblAuthorSex.setText("Sex:");

        lblAuthorNationality.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAuthorNationality.setForeground(java.awt.Color.darkGray);
        lblAuthorNationality.setText("Nationality:");

        lblAuthorAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAuthorAddress.setForeground(java.awt.Color.darkGray);
        lblAuthorAddress.setText("Address:");

        lblAuthorPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAuthorPhoneNumber.setForeground(java.awt.Color.darkGray);
        lblAuthorPhoneNumber.setText("Phone Number:");

        lblAuthorEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAuthorEmail.setForeground(java.awt.Color.darkGray);
        lblAuthorEmail.setText("Email:");

        txtAuthorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAuthorAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAuthorSex.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAuthorNationality.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAuthorAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAuthorPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAuthorEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAddNewAuthor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAddNewAuthor.setForeground(java.awt.Color.darkGray);
        btnAddNewAuthor.setText("Add New Author");
        btnAddNewAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewAuthorActionPerformed(evt);
            }
        });

        btnUpdateAuthor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUpdateAuthor.setForeground(java.awt.Color.darkGray);
        btnUpdateAuthor.setText("Update Author");
        btnUpdateAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAuthorActionPerformed(evt);
            }
        });

        btnDeleteAuthor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDeleteAuthor.setForeground(java.awt.Color.darkGray);
        btnDeleteAuthor.setText("Delete Author");
        btnDeleteAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAuthorActionPerformed(evt);
            }
        });

        btnSaveAuthor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSaveAuthor.setForeground(java.awt.Color.darkGray);
        btnSaveAuthor.setText("Save Author");
        btnSaveAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAuthorActionPerformed(evt);
            }
        });

        txtFindAuthor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnFindAuthor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFindAuthor.setForeground(java.awt.Color.orange);
        btnFindAuthor.setText("Find Author!");
        btnFindAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAuthorActionPerformed(evt);
            }
        });

        tableAuthors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Author Name", "Age", "Sex", "Nationality", "Address", "Phone Number", "Email"
            }
        ));
        tableAuthors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAuthorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAuthors);

        btnShowAllAuthors.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnShowAllAuthors.setForeground(java.awt.Color.darkGray);
        btnShowAllAuthors.setText("Show All Authors");
        btnShowAllAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllAuthorsActionPerformed(evt);
            }
        });

        btnExitProgram.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExitProgram.setForeground(java.awt.Color.blue);
        btnExitProgram.setText("CLOSE WINDOW");
        btnExitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitProgramActionPerformed(evt);
            }
        });

        lblFindAuthor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFindAuthor.setForeground(java.awt.Color.darkGray);
        lblFindAuthor.setText("Enter author name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAuthors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAuthorAddress)
                            .addComponent(lblAuthorEmail)
                            .addComponent(lblName)
                            .addComponent(lblAuthorNationality)
                            .addComponent(lblAuthorSex)
                            .addComponent(lblAuthorAge)
                            .addComponent(lblAuthorPhoneNumber))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFindAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAuthorAge)
                            .addComponent(txtAuthorName)
                            .addComponent(txtAuthorSex)
                            .addComponent(txtAuthorNationality)
                            .addComponent(txtAuthorAddress)
                            .addComponent(txtAuthorPhoneNumber)
                            .addComponent(txtAuthorEmail)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblFindAuthor)
                                .addGap(18, 18, 18)
                                .addComponent(txtFindAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddNewAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdateAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSaveAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnShowAllAuthors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExitProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAuthors)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAuthorName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAuthorAge)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtAuthorAge, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAuthorSex, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAuthorNationality))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAuthorSex)
                                .addGap(18, 18, 18)
                                .addComponent(lblAuthorNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddNewAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaveAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnShowAllAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExitProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAuthorAddress)
                    .addComponent(txtAuthorAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAuthorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAuthorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAuthorPhoneNumber)
                        .addGap(18, 18, 18)
                        .addComponent(lblAuthorEmail)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFindAuthor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindAuthor)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void RetrieveData(String sql) {
        String header[] = {"Author name", "Age", "Sex", "Nationality", "Address", "Phone Number", "Email"};
        DefaultTableModel tblModel = new DefaultTableModel(header, 0);
        try {
            Vector data = null;
            tblModel.setRowCount(0);
            ConnectionToDatabase ketNoi = new ConnectionToDatabase();
            ResultSet resultSet = ketNoi.Query(sql);
            while (resultSet.next()) {
                data = new Vector();
                data.add(resultSet.getString("Author name"));
                data.add(resultSet.getInt("Age"));
                data.add(resultSet.getString("Sex"));
                data.add(resultSet.getString("Nationality"));
                data.add(resultSet.getString("Address"));
                data.add(resultSet.getString("Phone Number"));
                data.add(resultSet.getString("Email"));
                
                tblModel.addRow(data);
            }
        tableAuthors.setModel(tblModel);
        } catch (Exception ex) {
            System.out.println("Error!" + ex);
        }
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String sql = "SELECT * FROM Author";
        RetrieveData(sql);
    }//GEN-LAST:event_formWindowOpened

    private void tableAuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAuthorsMouseClicked
        String authorName;
        int age;
        String sex;
        String nationality;
        String address;
        String phoneNumber;
        String email;
        
        authorName = tableAuthors.getValueAt(tableAuthors.getSelectedRow(), 0).toString();
        txtAuthorName.setText(authorName);
        age = Integer.parseInt(tableAuthors.getValueAt(tableAuthors.getSelectedRow(), 1).toString());
        txtAuthorAge.setText(String.valueOf(age));
        sex = tableAuthors.getValueAt(tableAuthors.getSelectedRow(), 2).toString();
        txtAuthorSex.setText(sex);
        nationality = tableAuthors.getValueAt(tableAuthors.getSelectedRow(), 3).toString();
        txtAuthorNationality.setText(nationality);
        address = tableAuthors.getValueAt(tableAuthors.getSelectedRow(), 4).toString();
        txtAuthorAddress.setText(address);
        phoneNumber = tableAuthors.getValueAt(tableAuthors.getSelectedRow(), 5).toString();
        txtAuthorPhoneNumber.setText(phoneNumber);
        email = tableAuthors.getValueAt(tableAuthors.getSelectedRow(), 6).toString();
        txtAuthorEmail.setText(email);
    }//GEN-LAST:event_tableAuthorsMouseClicked

    private void btnExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitProgramActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnExitProgramActionPerformed

    private void btnSaveAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAuthorActionPerformed
        String sql;
        String authorName;
        int age;
        String sex;
        String nationality;
        String address;
        String phoneNumber;
        String email;
        
        authorName = txtAuthorName.getText();
        age = Integer.parseInt(txtAuthorAge.getText());
        sex = txtAuthorSex.getText();
        nationality = txtAuthorNationality.getText();
        address = txtAuthorAddress.getText();
        phoneNumber = txtAuthorPhoneNumber.getText();
        email = txtAuthorEmail.getText();
        
        if (action == true) {
            sql = "INSERT INTO Author VALUES(N'" + authorName + "', " + age + ", N'" + sex + "', N'" + nationality + "', N'" + address + "', N'" + phoneNumber + "', N'" + email + "'" + ")";
        } else {
            sql = "UPDATE Author SET Age = " + age + ", Sex = N'" + sex + "', Nationality = N'" + nationality + "', Address = N'" + address + "', [Phone number] = N'" + phoneNumber + "', Email = N'" + email + "' WHERE [Author name] = N'" + authorName + "'";
        }
        ConnectionToDatabase ketNoi = new ConnectionToDatabase();
        ketNoi.Update(sql);
        sql = "SELECT * FROM Author";
        RetrieveData(sql);
        btnAddNewAuthor.setEnabled(true);
        btnUpdateAuthor.setEnabled(true);
        btnDeleteAuthor.setEnabled(true);
        btnSaveAuthor.setEnabled(false);
    }//GEN-LAST:event_btnSaveAuthorActionPerformed

    private void btnUpdateAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAuthorActionPerformed
        action = false;
        txtAuthorName.setEnabled(false);
        btnAddNewAuthor.setEnabled(false);
        btnUpdateAuthor.setEnabled(false);
        btnSaveAuthor.setEnabled(true);
    }//GEN-LAST:event_btnUpdateAuthorActionPerformed

    private void btnAddNewAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewAuthorActionPerformed
        txtAuthorName.setEnabled(true);
        txtAuthorName.setText("");
        txtAuthorAge.setText("");
        txtAuthorSex.setText("");
        txtAuthorNationality.setText("");
        txtAuthorAddress.setText("");
        txtAuthorPhoneNumber.setText("");
        txtAuthorEmail.setText("");
        btnAddNewAuthor.setEnabled(false);
        btnUpdateAuthor.setEnabled(false);
        action = true;
        btnSaveAuthor.setEnabled(true);
    }//GEN-LAST:event_btnAddNewAuthorActionPerformed

    private void btnDeleteAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAuthorActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Confirm to delete author?", "Delete Author", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            String authorName;
            authorName = tableAuthors.getValueAt(tableAuthors.getSelectedRow(), 0).toString();
            String sql = "DELETE FROM Author WHERE [Author name] = N'" + authorName + "'";
            ConnectionToDatabase ketNoi = new ConnectionToDatabase();
            ketNoi.Update(sql);
            sql = "SELECT * FROM [Author]";
            RetrieveData(sql);
        }
    }//GEN-LAST:event_btnDeleteAuthorActionPerformed

    private void btnShowAllAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllAuthorsActionPerformed
        String sql = "SELECT * FROM [Author]";
        RetrieveData(sql);
    }//GEN-LAST:event_btnShowAllAuthorsActionPerformed

    private void btnFindAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAuthorActionPerformed
        String sql = "";
        String keyWord = "";
        keyWord = txtFindAuthor.getText();
        sql = "SELECT * FROM [Author] WHERE [Author name] LIKE '%" + keyWord + "%'";
        RetrieveData(sql);
    }//GEN-LAST:event_btnFindAuthorActionPerformed

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
            java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewAuthor;
    private javax.swing.JButton btnDeleteAuthor;
    private javax.swing.JButton btnExitProgram;
    private javax.swing.JButton btnFindAuthor;
    private javax.swing.JButton btnSaveAuthor;
    private javax.swing.JButton btnShowAllAuthors;
    private javax.swing.JButton btnUpdateAuthor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAuthorAddress;
    private javax.swing.JLabel lblAuthorAge;
    private javax.swing.JLabel lblAuthorEmail;
    private javax.swing.JLabel lblAuthorNationality;
    private javax.swing.JLabel lblAuthorPhoneNumber;
    private javax.swing.JLabel lblAuthorSex;
    private javax.swing.JLabel lblAuthors;
    private javax.swing.JLabel lblFindAuthor;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tableAuthors;
    private javax.swing.JTextField txtAuthorAddress;
    private javax.swing.JTextField txtAuthorAge;
    private javax.swing.JTextField txtAuthorEmail;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtAuthorNationality;
    private javax.swing.JTextField txtAuthorPhoneNumber;
    private javax.swing.JTextField txtAuthorSex;
    private javax.swing.JTextField txtFindAuthor;
    // End of variables declaration//GEN-END:variables
}

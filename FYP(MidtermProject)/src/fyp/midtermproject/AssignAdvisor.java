/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp.midtermproject;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Altaf Hussain
 */
public class AssignAdvisor extends javax.swing.JFrame {
    FilehandlingFYP f = new FilehandlingFYP();
        DefaultTableModel model;


    /**
     * Creates new form AssignAdvisor
     */
    public AssignAdvisor() {
        initComponents();
        this.model = new DefaultTableModel();
        model.addColumn("ID of 1st Student");
        model.addColumn("ID of 2nd Student");
        model.addColumn("Project Name");
        model.addColumn("Advisor name");
        jTable1.setModel(model);
    }
    
    public ArrayList ListAssignAdvisor(String STD_ID1,String STD_ID2, String ProjName,String AdvisorName)
    {
        ArrayList<AssignAdvData> list = new ArrayList<>() ;
        AssignAdvData AAd = new AssignAdvData( STD_ID1, STD_ID2, ProjName, AdvisorName);
        list.add(AAd);
       
        return list;
      }
  
     public void addRow(String STD_ID1,String STD_ID2, String ProjName,String AdvisorName)
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         ArrayList<AssignAdvData> list = ListAssignAdvisor( STD_ID1, STD_ID2, ProjName, AdvisorName);
         Object rowData[] = new Object[4];
         for (int i =0 ;i < list.size(); i++)
         {
             rowData[0] = list.get(i).STD_ID1;
             rowData[1] = list.get(i).STD_ID2;
             rowData[2] = list.get(i).ProjName;
             rowData[3] = list.get(i).AdvisorName;
             model.addRow(rowData);
         }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ID_s1 = new javax.swing.JTextField();
        Project = new javax.swing.JTextField();
        ExportBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddBTN = new javax.swing.JButton();
        UpdBTN = new javax.swing.JButton();
        DeleteBtN = new javax.swing.JButton();
        ID_s2 = new javax.swing.JTextField();
        Adv_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        CancelBTN1 = new javax.swing.JButton();
        CancelBTN2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Assign Advisor");

        jLabel2.setText("1st std ID");

        jLabel3.setText("2nd std ID");

        jLabel4.setText("Project tilte");

        Project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectActionPerformed(evt);
            }
        });

        ExportBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ExportBTN.setText("SaveData");
        ExportBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportBTNActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        AddBTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddBTN.setText("Add");
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });

        UpdBTN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UpdBTN.setText("Update");
        UpdBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdBTNActionPerformed(evt);
            }
        });

        DeleteBtN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeleteBtN.setText("Delete");
        DeleteBtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtNActionPerformed(evt);
            }
        });

        ID_s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_s2ActionPerformed(evt);
            }
        });

        Adv_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adv_nameActionPerformed(evt);
            }
        });

        jLabel5.setText("Advisor Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Search");

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchFieldKeyReleased(evt);
            }
        });

        CancelBTN1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CancelBTN1.setText("Export");
        CancelBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTN1ActionPerformed(evt);
            }
        });

        CancelBTN2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CancelBTN2.setText("Exit");
        CancelBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTN2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Project)
                            .addComponent(ID_s2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Adv_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ID_s1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddBTN)
                                .addGap(46, 46, 46)
                                .addComponent(UpdBTN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ExportBTN)
                                .addGap(29, 29, 29)
                                .addComponent(CancelBTN1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(DeleteBtN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(CancelBTN2)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(ID_s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ID_s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Project, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Adv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExportBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBTN)
                            .addComponent(UpdBTN)
                            .addComponent(DeleteBtN))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProjectActionPerformed

    private void ExportBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportBTNActionPerformed
        // TODO add your handling code here:
       JFileChooser  chooser = new JFileChooser(); 
   
    chooser.setDialogTitle("Choose a destination to save exported file");
    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    //
    // disable the "All files" option.
    //
    //chooser.setAcceptAllFileFilterUsed(false);
    
    if(chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) { 
     f.saveAssignAdvisorData(chooser.getSelectedFile()+".csv");
      
      }
    else {
      System.out.println("No Selection ");
      }
    }//GEN-LAST:event_ExportBTNActionPerformed

    private void ID_s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_s2ActionPerformed

    private void Adv_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adv_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Adv_nameActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void CancelBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTN1ActionPerformed
        // TODO add your handling code here:
        f.saveAssignAdvisorData("AssignAdvisors.csv");
        this.dispose();
    }//GEN-LAST:event_CancelBTN1ActionPerformed

    private void SearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyReleased
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String search = SearchField.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_SearchFieldKeyReleased

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed
        // TODO add your handling code here:
        
            String STD_ID1 = ID_s1.getText();
            String STD_ID2 = ID_s2.getText();
            String ProjName = Project.getText();
            String AdvisorName = Adv_name.getText();
            
            addRow( STD_ID1, STD_ID2, ProjName, AdvisorName);
             ID_s1.setText("");
             ID_s2.setText("");
             Project.setText("");
             Adv_name.setText("");
    }//GEN-LAST:event_AddBTNActionPerformed

    private void UpdBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdBTNActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount()==1){
            String STD_ID1 = ID_s1.getText();
            String STD_ID2 = ID_s2.getText();
            String ProjName = Project.getText();
            String AdvisorName = Adv_name.getText();
        jTable1.setValueAt(STD_ID1 , jTable1.getSelectedRow(), 0);
        jTable1.setValueAt(STD_ID2, jTable1.getSelectedRow(), 1);
        jTable1.setValueAt(ProjName, jTable1.getSelectedRow(), 2);
        jTable1.setValueAt(AdvisorName, jTable1.getSelectedRow(), 3);
        
        JOptionPane.showMessageDialog(null," Updated Successfully!");
        }
        else{
        if(jTable1.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"Table is empty");
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select any row!");
        }
        }
    }//GEN-LAST:event_UpdBTNActionPerformed

    private void DeleteBtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtNActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount()==1)
        {
            model.removeRow(jTable1.getSelectedRow());
        }
        else
        {
            if(jTable1.getRowCount()==0)
            {
            JOptionPane.showMessageDialog(null,"Table is empty");
        }
        else{
           JOptionPane.showMessageDialog(null,"Please select any row!");
        }
        }
    }//GEN-LAST:event_DeleteBtNActionPerformed

    private void CancelBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTN2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelBTN2ActionPerformed

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
            java.util.logging.Logger.getLogger(AssignAdvisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignAdvisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignAdvisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignAdvisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignAdvisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JTextField Adv_name;
    private javax.swing.JButton CancelBTN1;
    private javax.swing.JButton CancelBTN2;
    private javax.swing.JButton DeleteBtN;
    private javax.swing.JButton ExportBTN;
    private javax.swing.JTextField ID_s1;
    private javax.swing.JTextField ID_s2;
    private javax.swing.JTextField Project;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton UpdBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

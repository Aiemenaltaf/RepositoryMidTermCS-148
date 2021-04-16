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
public class Projects extends javax.swing.JFrame {

    /**
     * Creates new form Projects
     */
    FilehandlingFYP f = new FilehandlingFYP();
    
      
    DefaultTableModel model;
    
    public Projects() {
        initComponents();
         this.model = new DefaultTableModel();
        model.addColumn("Project Title");
        model.addColumn("Project Type");
        model.addColumn("Project Description");
        ProjectTable.setModel(model);
    }

    
      public ArrayList ListProjects(String ProjectTitle, String ProjectType, String ProjectDescpt )
    {
        ArrayList<ProjectsData> list = new ArrayList<>() ;
        ProjectsData Pd;
        Pd = new ProjectsData(ProjectTitle,ProjectType,ProjectDescpt );
        list.add(Pd);
       
        return list;
      }
      
      public void addRow(String ProjectTitle, String ProjectType, String ProjectDescpt)
    {
        DefaultTableModel model = (DefaultTableModel) ProjectTable.getModel();
         ArrayList<ProjectsData> list = ListProjects(ProjectTitle, ProjectType, ProjectDescpt);
         Object rowData[] = new Object[4];
         for (int i =0 ;i < list.size(); i++)
         {
             rowData[0] = list.get(i).ProjectTitle;
             rowData[1] = list.get(i).ProjectType;
             rowData[2] = list.get(i). ProjectDescpt;
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
        P_Title = new javax.swing.JTextField();
        P_Type = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        P_Descrpt = new javax.swing.JTextArea();
        CanceBtN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProjectTable = new javax.swing.JTable();
        AddBTN = new javax.swing.JButton();
        UpdateBTN = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        ExpField = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Projects Details");

        jLabel2.setText("Title");

        jLabel3.setText("Type");

        jLabel4.setText("Description");

        P_Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_TitleActionPerformed(evt);
            }
        });

        P_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_TypeActionPerformed(evt);
            }
        });

        P_Descrpt.setColumns(20);
        P_Descrpt.setRows(5);
        jScrollPane1.setViewportView(P_Descrpt);

        CanceBtN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CanceBtN.setText("Cancel");
        CanceBtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceBtNActionPerformed(evt);
            }
        });

        ProjectTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ProjectTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(ProjectTable);

        AddBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddBTN.setText("Add");
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });

        UpdateBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateBTN.setText("Update");
        UpdateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBTNActionPerformed(evt);
            }
        });

        DeleteBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Search");

        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        ExpField.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ExpField.setText("Export Data");
        ExpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P_Title)
                            .addComponent(P_Type)
                            .addComponent(jScrollPane1))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(AddBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(UpdateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(ExpField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DeleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(CanceBtN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2))
                            .addComponent(P_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addComponent(P_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CanceBtN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExpField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_TypeActionPerformed

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed
        // TODO add your handling code here:
        String ProjectTitle = P_Title.getText();
        String ProjectType =  P_Type.getText();
        String ProjectDescpt = P_Descrpt.getText();
        
        addRow(ProjectTitle,ProjectType, ProjectDescpt);
        P_Title.setText("");
        P_Type.setText("");
        P_Descrpt.setText("");
        
    }//GEN-LAST:event_AddBTNActionPerformed

    private void P_TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_TitleActionPerformed

    private void CanceBtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceBtNActionPerformed
        // TODO add your handling code here:
         f.saveProjectData("ProjectList.csv");
           this.dispose();
    }//GEN-LAST:event_CanceBtNActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model= (DefaultTableModel) ProjectTable.getModel();
        if(ProjectTable.getSelectedRowCount()==1)
        {
            model.removeRow(ProjectTable.getSelectedRow());
        }
        else
        {
            if(ProjectTable.getRowCount()==0)
            {
            JOptionPane.showMessageDialog(null,"Table is empty");
        }
        else{
           JOptionPane.showMessageDialog(null,"Please select any row!");
        }
        }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void UpdateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBTNActionPerformed
        // TODO add your handling code here:
           DefaultTableModel model= (DefaultTableModel) ProjectTable.getModel();
        if(ProjectTable.getSelectedRowCount()==1){
        String ProjectTitle = P_Title.getText();
        String ProjectType =  P_Type.getText();
        String ProjectDescpt = P_Descrpt.getText();
        
        ProjectTable.setValueAt(ProjectTitle, ProjectTable.getSelectedRow(), 0);
        ProjectTable.setValueAt(ProjectType, ProjectTable.getSelectedRow(), 1);
        ProjectTable.setValueAt(ProjectDescpt, ProjectTable.getSelectedRow(), 2);
        
        JOptionPane.showMessageDialog(null,"Project List Updated Successfully");
        }
        else{
        if(ProjectTable.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"Table is empty");
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select any row!");
        }
        }
    }//GEN-LAST:event_UpdateBTNActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) ProjectTable.getModel();
        String search = searchField.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        ProjectTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void ExpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpFieldActionPerformed
        // TODO add your handling code here:
        
              JFileChooser  chooser = new JFileChooser(); 
   
    chooser.setDialogTitle("Choose a destination to save exported file");
    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    //
    // disable the "All files" option.
    //
    //chooser.setAcceptAllFileFilterUsed(false);
    
    if(chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) { 
     f.saveProjectData(chooser.getSelectedFile()+".csv");
      
      }
    else {
      System.out.println("No Selection ");
      }
    }//GEN-LAST:event_ExpFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Projects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Projects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Projects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Projects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Projects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JButton CanceBtN;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton ExpField;
    private javax.swing.JTextArea P_Descrpt;
    private javax.swing.JTextField P_Title;
    private javax.swing.JTextField P_Type;
    private javax.swing.JTable ProjectTable;
    private javax.swing.JButton UpdateBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}

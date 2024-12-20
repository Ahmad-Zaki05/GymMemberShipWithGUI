/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.TrainerRole;

import javax.swing.JOptionPane;

/**
 *
 * @author Zaki
 */
public class AddClassPage extends javax.swing.JFrame {

    TrainerRole trainer; TrainerOptions trainerOptions;
    /**
     * Creates new form AddClassPage
     */
    public AddClassPage(TrainerRole trainer, TrainerOptions trainerOptions) {
        initComponents();
        this.trainer = trainer;
        this.trainerOptions = trainerOptions;
        this.setVisible(true);
        this.setTitle("Add Class");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classIDLabel = new javax.swing.JLabel();
        classIDField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        trainerIDLabel = new javax.swing.JLabel();
        trainerIDField = new javax.swing.JTextField();
        durationLabel = new javax.swing.JLabel();
        durationField = new javax.swing.JTextField();
        maxParticipantsLabel = new javax.swing.JLabel();
        maxParticipantsField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        classIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        classIDLabel.setText("Class ID: ");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setText("Name: ");

        trainerIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        trainerIDLabel.setText("Trainer ID: ");

        durationLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        durationLabel.setText("Duration: ");

        maxParticipantsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        maxParticipantsLabel.setText("Max Participants: ");

        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(durationLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(durationField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(classIDLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(classIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(trainerIDLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(trainerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maxParticipantsLabel)
                                .addGap(18, 18, 18)
                                .addComponent(maxParticipantsField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitButton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(addButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classIDLabel)
                    .addComponent(classIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainerIDLabel)
                    .addComponent(trainerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationLabel)
                    .addComponent(durationField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxParticipantsLabel)
                    .addComponent(maxParticipantsField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(quitButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        trainerOptions.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(1);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        if (classIDField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Class ID can't be empty!!", "Error: Data Missing", JOptionPane.ERROR_MESSAGE);
        }
        else if (nameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Class name can't be empty!!", "Error: Data Missing", JOptionPane.ERROR_MESSAGE);
        }
        else if (trainerIDField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Trainer ID can't be empty!!", "Error: Data Missing", JOptionPane.ERROR_MESSAGE);
        }
        else if (durationField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Duration can't be empty!!", "Error: Data Missing", JOptionPane.ERROR_MESSAGE);
        }
        else if (maxParticipantsField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Max participants can't be empty!!", "Error: Data Missing", JOptionPane.ERROR_MESSAGE);
        }
        else if (trainer.getListOfClasses().stream().anyMatch(record -> record.getSearchKey().equals(classIDField.getText()))) {
          JOptionPane.showMessageDialog(null, "Class with ID: " + classIDField.getText() + " already exists", "Error: Duplicated Data", JOptionPane.ERROR_MESSAGE);
        }
        else {
            trainer.addClass(classIDField.getText(), nameField.getText(), trainerIDField.getText(), Integer.parseInt(durationField.getText()), Integer.parseInt(maxParticipantsField.getText()));
            JOptionPane.showMessageDialog(null, "Class with ID: " + classIDField.getText() + " has been added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            trainerOptions.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_addButtonMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddClassPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField classIDField;
    private javax.swing.JLabel classIDLabel;
    private javax.swing.JTextField durationField;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField maxParticipantsField;
    private javax.swing.JLabel maxParticipantsLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton quitButton;
    private javax.swing.JTextField trainerIDField;
    private javax.swing.JLabel trainerIDLabel;
    // End of variables declaration//GEN-END:variables
}

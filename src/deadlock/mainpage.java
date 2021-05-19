package deadlock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class mainpage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     */
    public mainpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BankersAlgorithm = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Semaphore = new javax.swing.JButton();
        ProdCons = new javax.swing.JButton();
        PetersonSol = new javax.swing.JButton();
        Dekker = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BankersAlgorithm.setText("Bankers Algorithm");
        BankersAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankersAlgorithmActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("Concurrency and Deadlock");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Semaphore.setText("Semaphore");
        Semaphore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemaphoreActionPerformed(evt);
            }
        });

        ProdCons.setText("Producer Consumer");
        ProdCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdConsActionPerformed(evt);
            }
        });

        PetersonSol.setText("Peterson Solution");
        PetersonSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetersonSolActionPerformed(evt);
            }
        });

        Dekker.setText("Dekkers Algorithm");
        Dekker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DekkerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(BankersAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(Semaphore, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dekker, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ProdCons, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addComponent(PetersonSol, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(BankersAlgorithm))
                    .addComponent(Semaphore))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ProdCons))
                    .addComponent(PetersonSol))
                .addGap(66, 66, 66)
                .addComponent(Dekker)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BankersAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankersAlgorithmActionPerformed
  BankersAlgo jfrm2= new BankersAlgo();
        jfrm2.setTitle("Bankers Algorithm");
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(mainpage.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_BankersAlgorithmActionPerformed

    private void SemaphoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemaphoreActionPerformed
    Semaph jfrm2 = new Semaph();
        //jfrm2.setTitle("Semaphore");
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(mainpage.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SemaphoreActionPerformed

    private void ProdConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdConsActionPerformed
        ProdCons jfrm2= new ProdCons();
        //jfrm2.setTitle("Producer Consumer");
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(mainpage.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ProdConsActionPerformed

    private void DekkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DekkerActionPerformed
        Dekker jfrm2= new Dekker();
       // jfrm2.setTitle("Deckers Algorithm");
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(mainpage.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_DekkerActionPerformed

    private void PetersonSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetersonSolActionPerformed
        Peterson jfrm2= new Peterson();
       // jfrm2.setTitle("Peterson Solution");
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(mainpage.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_PetersonSolActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mainpage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BankersAlgorithm;
    private javax.swing.JButton Dekker;
    private javax.swing.JButton PetersonSol;
    private javax.swing.JButton ProdCons;
    private javax.swing.JButton Semaphore;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private static class LockVariable {

        public LockVariable() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Semaphore {

        public Semaphore() {
        }

        private void setTitle(String semaphore) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class DeckersAlgorithm {

        public DeckersAlgorithm() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class PetersonSol {

        public PetersonSol() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}

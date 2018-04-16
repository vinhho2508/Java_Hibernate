
import java.awt.GridBagLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import giaovu.form.pnThemMonHoc;
import giaovu.form.pnThemSinhVien;
import giaovu.form.pnXemDiemDanh;
import java.awt.GridBagConstraints;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class giaovu extends javax.swing.JFrame {

    GridBagLayout layout=new GridBagLayout();
    pnThemMonHoc p1;
    pnThemSinhVien p2;
    pnXemDiemDanh p3;
    login l;
    public giaovu(login login)
    {
        l=login;
        initComponents();
        p1=new pnThemMonHoc();
        p2=new pnThemSinhVien();
        p3=new pnXemDiemDanh();
        dynamicPanel.setLayout(layout);
        GridBagConstraints c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p1,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p2,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p3,c);
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }
    public giaovu() {
    
        initComponents();
        p1=new pnThemMonHoc();
        p2=new pnThemSinhVien();
        p3=new pnXemDiemDanh();
        dynamicPanel.setLayout(layout);
        GridBagConstraints c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p1,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p2,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p3,c);
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dynamicPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ChucNang = new javax.swing.JMenu();
        ThemMonHoc = new javax.swing.JMenuItem();
        ThemSinhVien = new javax.swing.JMenuItem();
        XemDiemDanh = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        ChucNang.setText("Chức năng");

        ThemMonHoc.setText("Thêm môn học");
        ThemMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemMonHocActionPerformed(evt);
            }
        });
        ChucNang.add(ThemMonHoc);

        ThemSinhVien.setText("Thêm sinh viên ");
        ThemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemSinhVienActionPerformed(evt);
            }
        });
        ChucNang.add(ThemSinhVien);

        XemDiemDanh.setText("Xem điểm danh");
        XemDiemDanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XemDiemDanhActionPerformed(evt);
            }
        });
        ChucNang.add(XemDiemDanh);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        ChucNang.add(Exit);

        jMenuBar1.add(ChucNang);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThemMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemMonHocActionPerformed
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_ThemMonHocActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ThemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemSinhVienActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
    }//GEN-LAST:event_ThemSinhVienActionPerformed

    private void XemDiemDanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemDiemDanhActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
    }//GEN-LAST:event_XemDiemDanhActionPerformed

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
            java.util.logging.Logger.getLogger(giaovu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giaovu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giaovu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giaovu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giaovu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ChucNang;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem ThemMonHoc;
    private javax.swing.JMenuItem ThemSinhVien;
    private javax.swing.JMenuItem XemDiemDanh;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
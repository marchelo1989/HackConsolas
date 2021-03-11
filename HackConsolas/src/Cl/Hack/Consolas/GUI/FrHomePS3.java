/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Hack.Consolas.GUI;

import Cl.Hack.Consolas.Conf.Confi;
import Cl.Hack.Consolas.FUN.Directorio;
import java.io.File;
import javax.swing.JComboBox;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author march
 */
public class FrHomePS3 extends javax.swing.JFrame {

    Directorio d = new Directorio();
    static String urlUSB;
    /**
     * Creates new form FrHomePS3
     */
    public FrHomePS3() {
        initComponents();
        setLocationRelativeTo(null);
        
        USB();
        txtUSB.setText("");
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jtaMensaje.setEditable(false);
    }

    public void USB(){
        File unidades[] = File.listRoots();
        jcbUSB.removeAllItems();
        for(int i=0;i<unidades.length;i++){
//            System.out.println(unidades[i]);
//            System.out.println(FileSystemView.getFileSystemView().getSystemDisplayName (unidades[i]));
            String unidad=FileSystemView.getFileSystemView().getSystemDisplayName (unidades[i]);
            if(unidad.length()!=0){
                jcbUSB.addItem(FileSystemView.getFileSystemView().getSystemDisplayName (unidades[i]));
            }
        }
    }
    public String crearArchivosPS3(){
        String mensaje ="";
        mensaje="Carpetas Creadas:";
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Update);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Backup);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3PartidasPS3);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Temas);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Musica);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Imagene);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Video);
        
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Exdata);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Games);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3Packages);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3PS2ISO);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3PS3ISO);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3PSPSavedata);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3PSPISO);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3PSXISO);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3ROMS);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3USERLIST);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3PS2SD);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS3PSV);
        mensaje=mensaje+"\n"+crearRetroArch("");
        
        d.CopiarArchivos(Confi.InfoImgPs3, urlUSB+"USB de PS3.jpg");
        mensaje=mensaje+"\n"+urlUSB+"\\USB de PS3.jpg";
        return mensaje;
    }
    public String crearArchivosPS4(){
        String mensaje ="";
        mensaje="Carpetas Creadas:";
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS4Imagene);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS4Backup);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS4PartidasPS4);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS4SCREENSHOTS);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS4VideoClips);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,Confi.PS4Update);
        
        mensaje=mensaje+"\n"+crearRetroArch("retroarchps4/");
        d.CopiarArchivos(Confi.InfoImgPs4, urlUSB+"USB de PS4.jpg");
        mensaje=mensaje+"\n"+urlUSB+"\\USB de PS4.jpg";
        return mensaje;
    }
    public String crearRetroArch(String url2){
        String mensaje ="";
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroATARI2600);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroATARI7800);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroATARILynx);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroBandaiWonderSwan);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroBandaiWonderSwanColor);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroFBAlphaArcadeGames);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroGCEVectrex);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroHandheldElectronicGame);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroMAME2003);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNECPCEngine);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNECPCEngineCD);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNECPCEngineSuperGrafx);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNECTurboGrafx16);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNECTurboGrafxCD);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoFamicom);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoFamilyComputerDiskSystem);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoGameBoy);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoGameBoyAdvance);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoGameBoyColor);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoNintendoEntertainmentSystem);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoSufamiTurbo);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoSuperFamicom);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoSuperNintendoEntertainmentSystem);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroNintendoVirtualBoy);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroSegaGameGear);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroSegaMasterSystemMarkIII);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroSegaMegaDriveGenesis);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroSegaMegaCDSegaCD);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroSegaSG1000);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroSNKNeoGeoPocket);
        mensaje=mensaje+"\n"+d.crearDirec(urlUSB,url2+Confi.RetroSNKNeoGeoPocketColor);
        return mensaje;
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMensaje = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        txtUSB = new javax.swing.JLabel();
        jcbUSB = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Crear Carpetas en USB:");

        jButton1.setText("Carpetas Para PS3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtaMensaje.setColumns(20);
        jtaMensaje.setRows(5);
        jScrollPane1.setViewportView(jtaMensaje);

        jButton2.setText("Carpetas Para PS4");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        txtUSB.setText("jLabel2");

        jcbUSB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setText("Seleccionar USB");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbUSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addComponent(txtUSB))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbUSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(txtUSB)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jtaMensaje.setText(crearArchivosPS3());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String usbselect=(String) jcbUSB.getSelectedItem();
        String usbselect2=usbselect.substring(usbselect.length() - 4);
        urlUSB=usbselect2.replaceAll("[()]","");
//        txtUSB.setText("Unidad USB Seleccionada "+usbselect);
        txtUSB.setText(usbselect);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jtaMensaje.setText(crearArchivosPS4());
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrHomePS3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrHomePS3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrHomePS3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrHomePS3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrHomePS3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbUSB;
    private javax.swing.JTextArea jtaMensaje;
    private javax.swing.JLabel txtUSB;
    // End of variables declaration//GEN-END:variables
}

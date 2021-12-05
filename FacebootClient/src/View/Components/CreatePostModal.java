/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Components;

import Faceboot.App;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author orlandocamacho
 */
public class CreatePostModal extends javax.swing.JDialog {

    private static String pickedImageFilename;
    private static byte[] pickedImage;
    /**
     * Creates new form CreatePostModal
     */
    public CreatePostModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        this.setUndecorated(true);
        super.setUndecorated(true);

        setShape(new RoundRectangle2D.Double(0, 0, 500, 400, 22, 22));

        initComponents();

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new View.Components.RoundedPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cancelContainer = new View.Components.RoundPanelText();
        cancel = new javax.swing.JButton();
        containerUser2 = new View.Components.RoundPanelText();
        user2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        roundedPanel2 = new View.Components.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        scrollText = new javax.swing.JScrollPane();
        postContents = new javax.swing.JTextArea();
        containerBtn = new View.Components.RoundedPanel();
        CreateAccountBt = new javax.swing.JButton();
        roundedPanel5 = new View.Components.RoundedPanel();
        roundedPanel4 = new View.Components.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        addPhotoContainer = new View.Components.RoundPanelText();
        addPhoto = new javax.swing.JButton();
        tagUserContainer = new View.Components.RoundPanelText();
        tagUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        roundedPanel1.setBackground(new java.awt.Color(35, 36, 37));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundedPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 500, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear publicación");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 180, 40));

        cancelContainer.setBackground(new java.awt.Color(58, 59, 60));
        cancelContainer.setLayout(new java.awt.BorderLayout());

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/x.png"))); // NOI18N
        cancel.setContentAreaFilled(false);
        cancel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cancelMouseMoved(evt);
            }
        });
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelMousePressed(evt);
            }
        });
        cancelContainer.add(cancel, java.awt.BorderLayout.CENTER);

        roundedPanel1.add(cancelContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 12, 36, 36));

        containerUser2.setBackground(new java.awt.Color(58, 59, 60));
        containerUser2.setLayout(new java.awt.BorderLayout());

        user2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/user.png"))); // NOI18N
        user2.setContentAreaFilled(false);
        user2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        containerUser2.add(user2, java.awt.BorderLayout.CENTER);

        roundedPanel1.add(containerUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario #1");
        roundedPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 20));

        roundedPanel2.setBackground(new java.awt.Color(58, 59, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/world.png"))); // NOI18N
        jLabel3.setText("Público");
        jLabel3.setIconTextGap(5);

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        roundedPanel1.add(roundedPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 20));

        scrollText.setBackground(new java.awt.Color(23, 24, 26));
        scrollText.setBorder(null);

        postContents.setBackground(new java.awt.Color(35, 36, 37));
        postContents.setColumns(20);
        postContents.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        postContents.setForeground(new java.awt.Color(204, 204, 204));
        postContents.setRows(5);
        postContents.setText("¿Qué estás pensando?");
        scrollText.setViewportView(postContents);

        roundedPanel1.add(scrollText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 460, 100));

        containerBtn.setBackground(new java.awt.Color(65, 183, 41));
        containerBtn.setLayout(new java.awt.BorderLayout());

        CreateAccountBt.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CreateAccountBt.setForeground(new java.awt.Color(255, 255, 255));
        CreateAccountBt.setText("Publicar");
        CreateAccountBt.setContentAreaFilled(false);
        CreateAccountBt.setFocusPainted(false);
        CreateAccountBt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CreateAccountBtMouseMoved(evt);
            }
        });
        CreateAccountBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateAccountBtMouseExited(evt);
            }
        });
        CreateAccountBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBtActionPerformed(evt);
            }
        });
        containerBtn.add(CreateAccountBt, java.awt.BorderLayout.CENTER);

        roundedPanel1.add(containerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 460, 40));

        roundedPanel5.setBackground(new java.awt.Color(60, 61, 63));

        roundedPanel4.setBackground(new java.awt.Color(35, 36, 37));
        roundedPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Agregar a tu publicación");
        roundedPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        addPhotoContainer.setBackground(new java.awt.Color(35, 36, 37));
        addPhotoContainer.setLayout(new java.awt.BorderLayout());

        addPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/insertPhoto.png"))); // NOI18N
        addPhoto.setContentAreaFilled(false);
        addPhoto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addPhotoMouseMoved(evt);
            }
        });
        addPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPhotoMouseExited(evt);
            }
        });
        addPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoActionPerformed(evt);
            }
        });
        addPhotoContainer.add(addPhoto, java.awt.BorderLayout.CENTER);

        roundedPanel4.add(addPhotoContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 40, 40));

        tagUserContainer.setBackground(new java.awt.Color(35, 36, 37));
        tagUserContainer.setLayout(new java.awt.BorderLayout());

        tagUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/tag.png"))); // NOI18N
        tagUser.setContentAreaFilled(false);
        tagUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tagUserMouseMoved(evt);
            }
        });
        tagUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tagUserMouseExited(evt);
            }
        });
        tagUserContainer.add(tagUser, java.awt.BorderLayout.CENTER);

        roundedPanel4.add(tagUserContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 40, 40));

        javax.swing.GroupLayout roundedPanel5Layout = new javax.swing.GroupLayout(roundedPanel5);
        roundedPanel5.setLayout(roundedPanel5Layout);
        roundedPanel5Layout.setHorizontalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
            .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundedPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        roundedPanel5Layout.setVerticalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundedPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        roundedPanel1.add(roundedPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 462, 62));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccountBtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountBtMouseMoved
        containerBtn.setBackground(new Color(53, 163, 31));
    }//GEN-LAST:event_CreateAccountBtMouseMoved

    private void CreateAccountBtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountBtMouseExited
        containerBtn.setBackground(new Color(65, 183, 41));
    }//GEN-LAST:event_CreateAccountBtMouseExited

    private void cancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMousePressed
        if (evt.getClickCount() >= 0) {
            this.dispose();
        }
    }//GEN-LAST:event_cancelMousePressed

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancelContainer.setBackground(new Color(58, 59, 60));
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseMoved
        cancelContainer.setBackground(new Color(84, 86, 86));
    }//GEN-LAST:event_cancelMouseMoved

    private void addPhotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPhotoMouseExited
        addPhotoContainer.setBackground(new Color(35, 36, 37));
    }//GEN-LAST:event_addPhotoMouseExited

    private void addPhotoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPhotoMouseMoved
        addPhotoContainer.setBackground(new Color(58, 59, 60));
    }//GEN-LAST:event_addPhotoMouseMoved

    private void tagUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagUserMouseExited
        tagUserContainer.setBackground(new Color(35, 36, 37));
    }//GEN-LAST:event_tagUserMouseExited

    private void tagUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagUserMouseMoved
        tagUserContainer.setBackground(new Color(58, 59, 60));
    }//GEN-LAST:event_tagUserMouseMoved

    private void CreateAccountBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBtActionPerformed
        // TODO add your handling code here:
        App.GetSingleton().PostsController.AttemptPost(postContents.getText(), CreatePostModal.pickedImageFilename, CreatePostModal.pickedImage);
    }//GEN-LAST:event_CreateAccountBtActionPerformed

    private void addPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser c = new JFileChooser();
        
        //Setting Up The Filter
        FileFilter imageFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());

        //Attaching Filter to JFileChooser object
        c.setFileFilter(imageFilter);

        //Displaying Filechooser
        this.setVisible(false);
        int rVal = c.showOpenDialog(new JPanel());
        if (rVal == JFileChooser.APPROVE_OPTION) {
            try {
                CreatePostModal.pickedImage = Files.readAllBytes(c.getSelectedFile().toPath());
                if (CreatePostModal.pickedImage == null)
                    throw new Exception("Invalid image.");
                CreatePostModal.pickedImageFilename = c.getSelectedFile().getName();
            } catch (Exception ex) {
                App.GetSingleton().DisplayErrorMessage("Error", "IO error");
            }
        } else {
            CreatePostModal.pickedImage = null;
            CreatePostModal.pickedImageFilename = null;
        }
        this.setVisible(true);
    }//GEN-LAST:event_addPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccountBt;
    private javax.swing.JButton addPhoto;
    private View.Components.RoundPanelText addPhotoContainer;
    private javax.swing.JButton cancel;
    private View.Components.RoundPanelText cancelContainer;
    private View.Components.RoundedPanel containerBtn;
    private View.Components.RoundPanelText containerUser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea postContents;
    private View.Components.RoundedPanel roundedPanel1;
    private View.Components.RoundedPanel roundedPanel2;
    private View.Components.RoundedPanel roundedPanel4;
    private View.Components.RoundedPanel roundedPanel5;
    private javax.swing.JScrollPane scrollText;
    private javax.swing.JButton tagUser;
    private View.Components.RoundPanelText tagUserContainer;
    private javax.swing.JButton user2;
    // End of variables declaration//GEN-END:variables
}

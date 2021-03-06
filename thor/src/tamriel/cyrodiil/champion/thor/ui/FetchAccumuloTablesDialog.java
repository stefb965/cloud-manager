/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamriel.cyrodiil.champion.thor.ui;

import java.awt.TrayIcon;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.net.URL;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.SwingWorker;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.openide.windows.WindowManager;
import tamriel.cyrodiil.champion.thor.MainTopComponent;
import tamriel.cyrodiil.champion.thor.bo.AccumuloServerNode;
import tamriel.cyrodiil.champion.thor.jaxb.accumulo.Stats;
import tamriel.cyrodiil.champion.thor.jaxb.accumulo.Table;
import tamriel.cyrodiil.champion.thor.service.accumulo.UCDDataTool;

/**
 *
 * @author Ottch
 */
public class FetchAccumuloTablesDialog extends javax.swing.JDialog {

    private static AccumuloServerNode associatedNode;
    private JAXBContext jaxbContext;
    private Unmarshaller jaxbUnmarshaller;
    private Marshaller jaxbMarshaller;
    private final MainTopComponent tc = (MainTopComponent) WindowManager.getDefault().findTopComponent("MainTopComponent");

    /**
     * Creates new form NewAccumuloDialog
     */
    public FetchAccumuloTablesDialog(java.awt.Frame parent, boolean modal, AccumuloServerNode associatedNode) {
        super(parent, modal);
        initComponents();
        this.associatedNode = associatedNode;

        loadTables();
    }

    private void loadTables() {

        try {
            jaxbContext = JAXBContext.newInstance(Stats.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            jaxbMarshaller = jaxbContext.createMarshaller();

            Stats stats = (Stats) jaxbUnmarshaller.unmarshal(
                    new URL("http://"
                            + associatedNode.getHostname()
                            + ":"
                            + associatedNode.getUi_port()
                            + "/xml"));
            String results = new String();
            for (Table t : stats.getTables().getTable()) {
                results = results.concat(t.getTablename() + "\r\n");
            }
            jTextArea1.setText(results);
        } catch (Exception err) {
            err.printStackTrace();
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

        jButton2 = new javax.swing.JButton();
        instanceNameTextField = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(FetchAccumuloTablesDialog.class, "FetchAccumuloTablesDialog.title")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(FetchAccumuloTablesDialog.class, "FetchAccumuloTablesDialog.jButton2.text")); // NOI18N
        jButton2.setToolTipText(org.openide.util.NbBundle.getMessage(FetchAccumuloTablesDialog.class, "FetchAccumuloTablesDialog.jButton2.toolTipText")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        instanceNameTextField.setText(org.openide.util.NbBundle.getMessage(FetchAccumuloTablesDialog.class, "FetchAccumuloTablesDialog.instanceNameTextField.text")); // NOI18N

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jSplitPane1.setTopComponent(jScrollPane2);

        jScrollPane1.setViewportView(jList1);

        jSplitPane1.setRightComponent(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(instanceNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(instanceNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (instanceNameTextField.getText().equals("Instance Name")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid instance name.", "Invalid Instance Name", JOptionPane.ERROR_MESSAGE);
        } else {
            final JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (tc.getClientProperty("lastFolder") != null) {
                fc.setCurrentDirectory(new File(tc.getClientProperty("lastFolder").toString()));
            }
            int returnVal = fc.showOpenDialog(FetchAccumuloTablesDialog.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                setEnablement(false);
                tc.putClientProperty("lastFolder", fc.getCurrentDirectory().toString());
                String destFolder = fc.getSelectedFile().getAbsolutePath();
                String tablesDelimited = "";
                for (String table : jTextArea1.getText().split("\r\n")) {
                    tablesDelimited += table + ",";
                }
                try {
                    UCDDataTool tool = new UCDDataTool(associatedNode, instanceNameTextField.getText(), tablesDelimited, destFolder);

                    tool.addPropertyChangeListener(new PropertyChangeListener() {

                        String state;

                        @Override
                        public void propertyChange(PropertyChangeEvent evt) {

                            if (evt.getPropertyName().equals("status")) {
                                addListItem(evt.getNewValue().toString());
                            }

                            if (evt.getPropertyName().equals("state")) {
                                state = evt.getNewValue().toString();
                                if (state.equals(SwingWorker.StateValue.STARTED)) {
                                    addListItem("Started.");
                                }
                                if (state.equals(SwingWorker.StateValue.DONE)) {
                                    addListItem("Done.");
                                    setEnablement(true);
                                }
                            }
                        }
                    });

                    tool.setOperation("extract");
                    tool.execute();
                    //tool.extract();
                } catch (Exception err) {
                    err.printStackTrace();
                }
            } else {
                //do nothing.

            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void addListItem(String text) {
        DefaultListModel lm = new DefaultListModel();
        for (int i = 0; i < jList1.getModel().getSize(); i++) {
            lm.addElement(jList1.getModel().getElementAt(i));
        }
        lm.addElement(text);
        jList1.setModel(lm);
    }

    private void setEnablement(boolean status) {
        instanceNameTextField.setEnabled(status);
        jButton2.setEnabled(status);
        jTextArea1.setEnabled(status);
    }

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
            java.util.logging.Logger.getLogger(FetchAccumuloTablesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FetchAccumuloTablesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FetchAccumuloTablesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FetchAccumuloTablesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FetchAccumuloTablesDialog dialog = new FetchAccumuloTablesDialog(new javax.swing.JFrame(), true, associatedNode);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField instanceNameTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

package com.poo2.prJ_pethop.forms;

/**
 *
 * @author Pablo
 */
public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniCadClientes = new javax.swing.JMenuItem();
        mniCadPets = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniRelatClientes = new javax.swing.JMenuItem();
        mniRelatPets = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMULÁRIO PRINCIPAL");

        jMenu1.setText("Cadastros");

        mniCadClientes.setText("Cadastros de Clientes");
        mniCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadClientesActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadClientes);

        mniCadPets.setText("Cadastros de Pets");
        mniCadPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadPetsActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadPets);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        mniRelatClientes.setText("Relatório de Clientes");
        mniRelatClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatClientesActionPerformed(evt);
            }
        });
        jMenu2.add(mniRelatClientes);

        mniRelatPets.setText("Relatório de Pets");
        mniRelatPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatPetsActionPerformed(evt);
            }
        });
        jMenu2.add(mniRelatPets);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opções");

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        jMenu3.add(mniSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadClientesActionPerformed
        new FormPessoa().setVisible(true);
    }//GEN-LAST:event_mniCadClientesActionPerformed

    private void mniCadPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadPetsActionPerformed
        new FormPet().setVisible(true);
    }//GEN-LAST:event_mniCadPetsActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSairActionPerformed

    private void mniRelatClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatClientesActionPerformed
        new FormRelatPessoa().setVisible(true);
    }//GEN-LAST:event_mniRelatClientesActionPerformed

    private void mniRelatPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatPetsActionPerformed
        new FormRelatPet().setVisible(true);
    }//GEN-LAST:event_mniRelatPetsActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mniCadClientes;
    private javax.swing.JMenuItem mniCadPets;
    private javax.swing.JMenuItem mniRelatClientes;
    private javax.swing.JMenuItem mniRelatPets;
    private javax.swing.JMenuItem mniSair;
    // End of variables declaration//GEN-END:variables
}

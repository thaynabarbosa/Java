/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.ListaPacientes;
import modelos.Pacientes;

/**
 *
 * @author thayn
 */
public class TelaInicial extends javax.swing.JFrame {

    private final String[] tableColumns = {"Paciente", "CPF", "Telefone", "Data", "Já era Paciente?", "Consulta Realizada"};

    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);

    private List<Pacientes> pacienteList = ListaPacientes.Listar();

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        pnlTelaInicial = new javax.swing.JPanel();
        lblBoaVindas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        btnNovaConsulta = new javax.swing.JButton();
        btnExcluirConsulta = new javax.swing.JButton();
        btnFinalizarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");

        lblBoaVindas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBoaVindas.setText("Boas vindas ao sistema de agendamento");

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Já era Paciente?", "Consulta Realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        btnNovaConsulta.setText("Nova Consulta");
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });

        btnExcluirConsulta.setText("Excluir Consulta");
        btnExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConsultaActionPerformed(evt);
            }
        });

        btnFinalizarConsulta.setText("Finalizar Consulta");
        btnFinalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTelaInicialLayout = new javax.swing.GroupLayout(pnlTelaInicial);
        pnlTelaInicial.setLayout(pnlTelaInicialLayout);
        pnlTelaInicialLayout.setHorizontalGroup(
            pnlTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaInicialLayout.createSequentialGroup()
                .addGroup(pnlTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaInicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTelaInicialLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblBoaVindas)))
                    .addGroup(pnlTelaInicialLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnNovaConsulta)
                        .addGap(123, 123, 123)
                        .addComponent(btnExcluirConsulta)
                        .addGap(135, 135, 135)
                        .addComponent(btnFinalizarConsulta)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlTelaInicialLayout.setVerticalGroup(
            pnlTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBoaVindas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaConsulta)
                    .addComponent(btnExcluirConsulta)
                    .addComponent(btnFinalizarConsulta))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        Cadastro TelaCadastro = new Cadastro();
        TelaCadastro.MostrarTela(this);
    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void btnExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConsultaActionPerformed
        excluirPaciente(getPosicaoPaciente());
    }//GEN-LAST:event_btnExcluirConsultaActionPerformed

    private void btnFinalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarConsultaActionPerformed
        finalizarConsulta(getPosicaoPaciente());
    }//GEN-LAST:event_btnFinalizarConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirConsulta;
    private javax.swing.JButton btnFinalizarConsulta;
    private javax.swing.JButton btnNovaConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBoaVindas;
    private javax.swing.JPanel pnlTelaInicial;
    private javax.swing.JTable tblPacientes;
    // End of variables declaration//GEN-END:variables

    public void atualizarTabela() {

        if (!pacienteList.isEmpty()) {

            Pacientes paciente;

            tableModel = new DefaultTableModel(tableColumns, 0);

            for (int i = 0; i < pacienteList.size(); i++) {

                paciente = pacienteList.get(i);

                String[] rowData = {paciente.getNome(), paciente.getCpf(), paciente.getTelefone(), paciente.getData(), paciente.getJaPaciente(), paciente.getConsultaRealizada()};

                tableModel.addRow(rowData);
            }

            tblPacientes.setModel(tableModel);
        } else {

            tableModel = new DefaultTableModel(tableColumns, 0);
            tblPacientes.setModel(tableModel);
        }
    }

    private int getPosicaoPaciente() {

        int posPaciente = tblPacientes.getSelectedRow();

        if (posPaciente == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um paciente");
        }

        return posPaciente;
    }


  private void excluirPaciente(int posPaciente){
     

     if(posPaciente >= 0){
        

         String[] options = { "Sim", "Não" };
         
         int deletar = JOptionPane.showOptionDialog(
                 rootPane,
                 "Tem certeza que deseja excluir?", 
                 "Exclusão de paciente", 
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 options, 
                 options[0]
         );
         

         if(deletar == 0){

                 pacienteList.remove(posPaciente);

                 atualizarTabela();
         }else{

            tblPacientes.clearSelection();             
         }
     }  
  } 
    
private void finalizarConsulta(int posPaciente){
    if(posPaciente>=0){
        Consulta telaConsulta = new Consulta();
        telaConsulta.MostrarTela(this, posPaciente);
    }
}
    
}
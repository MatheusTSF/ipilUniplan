/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.uniplan.UI;


import br.uniplan.DAL.ClienteDAL;
import br.uniplan.DTO.ClienteDTO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author profe
 */
public class frmClientes1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmClientes1
     */
    public frmClientes1() {
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

        jLabel10 = new javax.swing.JLabel();
        txtUFCli = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvClientes = new javax.swing.JTable();
        txtNomeCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ftfDtInclusaoCli = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEnderecoCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBairroCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmailCli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnIncluirCli = new javax.swing.JButton();
        ftfTelefoneCli = new javax.swing.JFormattedTextField();
        btnAlterarCli = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnExcluirCli = new javax.swing.JButton();
        txtCidadeCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnMostrarTodosCli = new javax.swing.JButton();
        txtCodigoIDCli = new javax.swing.JTextField();
        btnLimparCli = new javax.swing.JButton();
        btnPesquisarCliID = new javax.swing.JButton();
        btnSairCli = new javax.swing.JButton();

        setMaximizable(true);
        setTitle("Dados de Clientes");

        jLabel10.setText("UF");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel3.setText("Nome do Cliente");

        dgvClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código (ID)", "Nome", "Data Inclusão", "Endereço", "Bairro", "E-mail", "Telefone", "Cidade", "UF"
            }
        ));
        jScrollPane1.setViewportView(dgvClientes);

        jLabel4.setText("Data de Inclusão");

        try {
            ftfDtInclusaoCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDtInclusaoCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftfDtInclusaoCliFocusLost(evt);
            }
        });

        jLabel5.setText("Endereço");

        jLabel6.setText("Bairro");

        jLabel7.setText("E-mail");

        jLabel8.setText("Telefone");

        btnIncluirCli.setMnemonic('I');
        btnIncluirCli.setText("Incluir");
        btnIncluirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirCliActionPerformed(evt);
            }
        });

        try {
            ftfTelefoneCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAlterarCli.setMnemonic('A');
        btnAlterarCli.setText("Alterar");

        jLabel9.setText("Cidade");

        btnExcluirCli.setMnemonic('E');
        btnExcluirCli.setText("Excluir");

        jLabel2.setText("Código(ID)");

        btnMostrarTodosCli.setMnemonic('M');
        btnMostrarTodosCli.setText("Mostrar Todos");

        btnLimparCli.setMnemonic('L');
        btnLimparCli.setText("Limpar");

        btnPesquisarCliID.setMnemonic('P');
        btnPesquisarCliID.setText("Pesquisar");

        btnSairCli.setMnemonic('S');
        btnSairCli.setText("Sair");
        btnSairCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCli)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ftfDtInclusaoCli, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtEnderecoCli)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(txtBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmailCli))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodigoIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisarCliID))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(180, 180, 180)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ftfTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUFCli, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnIncluirCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarTodosCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimparCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSairCli)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCliID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfDtInclusaoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUFCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirCli)
                    .addComponent(btnAlterarCli)
                    .addComponent(btnExcluirCli)
                    .addComponent(btnMostrarTodosCli)
                    .addComponent(btnLimparCli)
                    .addComponent(btnSairCli))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1175, 704);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirCliActionPerformed
        //Abrindo a conexão com o Banco de Dados
        //Connection con = ConexaoMySQL.abrirBD();
        ClienteDAL dal = new ClienteDAL();
        try
        {
            dal.abrirBD();
        }
        catch (Exception ex)
        {
            Logger.getLogger(frmClientes1.class.getName()).log(Level.SEVERE, null, ex);
        }
        // instanciando a classe ClienteDTO do pacote DTO e criando seu objeto cliente
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCliNome(txtNomeCli.getText());
        //cliente.setCliDtInclusao(new SimpleDateFormat("dd/MM/yyyy").format(ftfDtInclusaoCli.getText()));
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        //SimpleDateFormat dti = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        LocalDate dataFormatada = LocalDate.parse(ftfDtInclusaoCli.getText(), dtf); 
        //try
        //{
            //Date data = sdf.parse(ftfDtInclusaoCli.getText());
            //cliente.setCliDtInclusao(dti.parse(ftfDtInclusaoCli.getText()));
            cliente.setCliDtInclusao(dataFormatada);
        //}
        //catch (ParseException ex)
       // {
        //    Logger.getLogger(frmClientes1.class.getName()).log(Level.SEVERE, null, ex);
       // }
        cliente.setCliEndereco(txtEnderecoCli.getText());
        cliente.setCliBairro(txtBairroCli.getText());
        cliente.setCliEmail(txtEmailCli.getText());
        cliente.setCliTel(ftfTelefoneCli.getText());
        cliente.setCliCidade(txtCidadeCli.getText());
        cliente.setCliUF(txtUFCli.getText());
        // fazendo a validação dos dados
        if ((txtNomeCli.getText().isEmpty()) || (ftfDtInclusaoCli.getText().isEmpty()) || (txtEnderecoCli.getText().isEmpty()) || (txtBairroCli.getText().isEmpty()) || (ftfTelefoneCli.getText().isEmpty())|| (txtCidadeCli.getText().isEmpty())|| (txtUFCli.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios !!!!");
            txtNomeCli.requestFocus();
        }
        else
        {
            try {
                // Instancia a classe ClienteDAL e chama o método incluirCliente
                //ClienteDAL dal = new ClienteDAL();
                dal.incluirCliente(cliente);
                JOptionPane.showMessageDialog(null, "Usuário " + txtNomeCli.getText() + " incluído com sucesso! ");
                dal.fecharBD();
                txtNomeCli.requestFocus();
                btnMostrarTodosCli.setEnabled(true);
            } catch (Exception ex)
            {
                Logger.getLogger(frmClientes1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // apaga os dados preenchidos nos campos de texto
        txtBairroCli.setText("");
        txtCidadeCli.setText("");
        txtCodigoIDCli.setText("");
        txtEmailCli.setText("");
        txtEnderecoCli.setText("");
        txtNomeCli.setText("");
        txtUFCli.setText("");
        ftfDtInclusaoCli.setText(null);
        ftfTelefoneCli.setText(null);
    }//GEN-LAST:event_btnIncluirCliActionPerformed

    private void btnSairCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCliActionPerformed
        // Fecha o formulário de clientes e volta para o formulário principal
        dispose();
    }//GEN-LAST:event_btnSairCliActionPerformed

    private void ftfDtInclusaoCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftfDtInclusaoCliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfDtInclusaoCliFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCli;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JButton btnIncluirCli;
    private javax.swing.JButton btnLimparCli;
    private javax.swing.JButton btnMostrarTodosCli;
    private javax.swing.JButton btnPesquisarCliID;
    private javax.swing.JButton btnSairCli;
    private javax.swing.JTable dgvClientes;
    private javax.swing.JFormattedTextField ftfDtInclusaoCli;
    private javax.swing.JFormattedTextField ftfTelefoneCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBairroCli;
    private javax.swing.JTextField txtCidadeCli;
    private javax.swing.JTextField txtCodigoIDCli;
    private javax.swing.JTextField txtEmailCli;
    private javax.swing.JTextField txtEnderecoCli;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtUFCli;
    // End of variables declaration//GEN-END:variables
}
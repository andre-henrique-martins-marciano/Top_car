
package View;

import Model.ClsCarro;
import javax.swing.DefaultListModel;


public class FRM_Carro extends javax.swing.JFrame {
     //Atributos da classe
    ClsCarro[] vetorCarros = new ClsCarro[5];
    DefaultListModel model = new DefaultListModel();
    float valorTotal = 0;
    int ctCarros=0;
    //Método construtor
    public FRM_Carro() {
        initComponents();
        this.setTitle("Top Carros");
        this.setLocationRelativeTo(null);
        this.desabilitarCampos();
        this.limparCampos();
        this.lstCarros.setModel(model);
    }
    public void desabilitarCampos(){
        this.txtCodigo.setEnabled(false);
        this.cmbMarca.setEnabled(false);
        this.cmbModelo.setEnabled(false);
        this.cmbCor.setEnabled(false);
        this.txtPlaca.setEnabled(false);
        this.txtValor.setEnabled(false);
    }
        public void habilitarCampos(){
        this.txtCodigo.setEnabled(true);
        this.cmbMarca.setEnabled(true);
        this.cmbModelo.setEnabled(true);
        this.cmbCor.setEnabled(true);
        this.txtPlaca.setEnabled(true);
        this.txtValor.setEnabled(true);
    }
    public void limparCampos(){
        this.txtCodigo.setText("");
        this.cmbMarca.setSelectedIndex(-1);
        this.cmbModelo.setSelectedIndex(-1);
        this.cmbCor.setSelectedIndex(-1);
        this.txtPlaca.setText("");
        this.txtValor.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        cmbModelo = new javax.swing.JComboBox<>();
        cmbCor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblNumCarros = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCarros = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Top Carros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("cor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Placa");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Valor");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPlaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        cmbMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUDI", "FIAT", "FOD", "VW", " " }));

        cmbModelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A3", "A4", "Palio", "UNO", "KA", "ECOSPORT", "GOL", "UP" }));
        cmbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModeloActionPerformed(evt);
            }
        });

        cmbCor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prata", "Preto", "Vermelho ", "Vinho", "Branco" }));
        cmbCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlaca)
                    .addComponent(cmbModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValor)
                    .addComponent(cmbCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        btnIniciar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIncluir.setText("INCLUIR");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblNumCarros.setText("0");

        lblValorTotal.setText("0");

        jLabel8.setText("No.Carros");

        jLabel9.setText("Valor Total");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 19, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnIncluir, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(lblValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumCarros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(18, 18, 18)
                .addComponent(btnIncluir)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(lblNumCarros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        lstCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCarrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstCarros);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCorActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        this.habilitarCampos();
        this.limparCampos();
        for (int ct=0;ct<=4;ct++){
            ClsCarro Obj_Carro = new ClsCarro();
            vetorCarros[ct]= Obj_Carro;
        }
        model.removeAllElements();
        valorTotal = 0;
        ctCarros = 0;
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
  //Inicializar as variáveis com os valores da tela
        int codigo=Integer.valueOf(this.txtCodigo.getText());
        String marca=this.cmbMarca.getSelectedItem().toString();
        String modelo=this.cmbModelo.getSelectedItem().toString();
        String cor = this.cmbCor.getSelectedItem().toString();
        String placa = this.txtPlaca.getText();
        float valor=Float.valueOf(this.txtValor.getText());
        //Criar o Obj_Carro
        ClsCarro Obj_Carro = new ClsCarro();
        Obj_Carro.setCodigo(codigo);
        Obj_Carro.setMarca(marca);
        Obj_Carro.setModelo(modelo);
        Obj_Carro.setCor(cor);
        Obj_Carro.setPlaca(placa);
        Obj_Carro.setValor(valor);
        //Colocando o objeto no vetor
        vetorCarros[ctCarros]=Obj_Carro;
        //Criando uma string que será o item do vetor model
        //que está ligado na lista
        String itemLista = "";
        itemLista = String.valueOf(codigo);
        itemLista+=("-"+marca);
        itemLista+=("-"+modelo);
        itemLista+=("-"+cor);
        itemLista+=("-"+placa);
        itemLista+=("-"+String.valueOf(valor));
        model.addElement(itemLista);
        //Atualizo os dados
        this.valorTotal=valorTotal+valor;
        this.ctCarros++;
        if(ctCarros==3)
            this.btnIncluir.setEnabled(false);
        //Exibir os dados
        this.lblNumCarros.setText(String.valueOf(ctCarros));
        this.lblValorTotal.setText(String.valueOf(valorTotal));
        //Limpar os dados de entrada
        this.limparCampos();
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
                //Inicializar as variáveis
        String codigo=this.txtCodigo.getText(); //Codigo digitado pelo usuário
        String codigoVetor="";
        //Percorrer o vetor para encontrar o código que o usuário digitou
        for (int ct=0;ct<=4;ct++){
            codigoVetor = String.valueOf(vetorCarros[ct].getCodigo());
            if(codigo.equals(codigoVetor)){
                model.removeElementAt(ct);
                ClsCarro Obj_Carro = new ClsCarro();
                //Atualizar vetorCarros movimentando os elementos
                for (int i=0; i<vetorCarros.length; i++){
                    if(vetorCarros[i].getCodigo()==Integer.valueOf(codigo)){
                        for(int j = i; j<vetorCarros.length-1; j++){
                            vetorCarros[j] = vetorCarros[j+i];
                        }
                        break;
                    }
                }
                //Atualizando os dados
                ctCarros--;
                if(ctCarros<3)
                    this.btnIncluir.setEnabled(true);
                valorTotal= valorTotal-vetorCarros[ct].getValor();
                //Exibir os dados
                this.lblNumCarros.setText(String.valueOf(ctCarros));
                this.lblValorTotal.setText(String.valueOf(valorTotal));
                //Limpar os dados de entrada
                this.limparCampos();
                break;
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cmbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbModeloActionPerformed

    private void lstCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCarrosMouseClicked
        //Capturando o índice do objeto selecionado na lista
        int indiceModel=lstCarros.getSelectedIndex();
        //Inicializando as variáveis
        int codigo=vetorCarros[indiceModel].getCodigo();
        String marca=vetorCarros[indiceModel].getMarca();
        String modelo=vetorCarros[indiceModel].getModelo();
        String cor = vetorCarros[indiceModel].getCor();
        String placa = vetorCarros[indiceModel].getPlaca();
        Float valor = vetorCarros[indiceModel].getValor();
        //Exibir o dados na entrada
        this.txtCodigo.setText(String.valueOf(codigo));
        this.txtPlaca.setText(placa);
        this.txtValor.setText(String.valueOf(valor));
    }//GEN-LAST:event_lstCarrosMouseClicked

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
            java.util.logging.Logger.getLogger(FRM_Carro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Carro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Carro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Carro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Carro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cmbCor;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumCarros;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JList<String> lstCarros;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoControle;
import Model.Entidade.Produto;
import Model.Persistencia.ProdutoDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hillison
 */
public class CadastroProduto extends javax.swing.JInternalFrame {
    
    ProdutoControle pc = new ProdutoControle();
    private ArrayList <Produto> ListaProdutos = new ArrayList<>();
    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        tfdescricao = new javax.swing.JTextField();
        tfcategoria = new javax.swing.JTextField();
        tftipo = new javax.swing.JTextField();
        tfqtd = new javax.swing.JSpinner();
        btSalvaProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tfpreco = new javax.swing.JFormattedTextField();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setText("Código");

        jLabel2.setText("Descrição");

        jLabel3.setText("Categoria");

        jLabel4.setText("Tipo");

        jLabel5.setText("Quantidade");

        tfqtd.setModel(new javax.swing.SpinnerNumberModel(0, 0, 250, 1));
        tfqtd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btSalvaProduto.setText("Salvar");
        btSalvaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvaProdutoActionPerformed(evt);
            }
        });

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Categoria", "Tipo", "Preço", "Qtd."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProdutos);

        jLabel6.setText("Preço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdescricao)
                            .addComponent(tfcategoria)
                            .addComponent(tftipo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(tfpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvaProduto)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tftipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvaProdutoActionPerformed
        String codigo = tfid.getText();
        String pr= tfpreco.getText();
        Double preco = Double.parseDouble(pr);
        String descricao = tfdescricao.getText();
        String categoria = tfcategoria.getText();
        String tipo = tftipo.getText();
        int qtd = Integer.parseInt(tfqtd.getValue().toString());
        
        Produto p = new Produto(null, null, 0, null, null, null);

        p = pc.insere(codigo,descricao, qtd, preco, categoria, tipo);
        
        System.out.println(p.getId()+": "+p.getDescricao()+" = R$"+p.getPreco());
        DefaultTableModel dtmProdutos = (DefaultTableModel) tbProdutos.getModel();
        
        dtmProdutos.setNumRows(0);
        //dtmProdutos.addRow(new Object[]{p.getId(),p.getDescricao(),p.getCategoria(),p.getTipo(),p.getPreco(), p.getQtd()});
        ProdutoDAO pdao = new ProdutoDAO();
        ListaProdutos = pdao.ListarTodos();
        for (Produto p1 : ListaProdutos) {
            dtmProdutos.addRow(new Object[]{p1.getId(),p1.getDescricao(),p1.getCategoria(),p1.getTipo(),p1.getPreco(), p1.getQtd()});
            
        }
        tbProdutos.setModel(dtmProdutos);
        
        dtmProdutos.setNumRows(0);
    }//GEN-LAST:event_btSalvaProdutoActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvaProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfcategoria;
    private javax.swing.JTextField tfdescricao;
    private javax.swing.JTextField tfid;
    private javax.swing.JFormattedTextField tfpreco;
    private javax.swing.JSpinner tfqtd;
    private javax.swing.JTextField tftipo;
    // End of variables declaration//GEN-END:variables
}
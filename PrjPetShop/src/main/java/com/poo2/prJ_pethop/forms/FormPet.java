package com.poo2.prJ_pethop.forms;

import com.poo2.prj_petshop.classesbo.PessoaBO;
import com.poo2.prj_petshop.classesbo.PetBO;
import com.poo2.prj_petshop.objetos.Pessoa;
import com.poo2.prj_petshop.objetos.Pet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Lucas
 */
public class FormPet extends javax.swing.JFrame {

    private final PetBO petBO;
    private final PessoaBO pessoaBO;
    private List<Pet> lstPet;
    private List<Pessoa> lstPessoas;
    private MaskFormatter FormatoDataNasc;
    
    public FormPet() {
        initComponents();
        petBO = new PetBO();
        pessoaBO = new PessoaBO();
        CarregarTutores();
    }
    
     public FormPet(int idpet) {
        initComponents();
        petBO = new PetBO();
        pessoaBO = new PessoaBO();
        CarregarTutores();
        preencherCombo(idpet);
    }
    
    public void CarregarTutores(){
        
        ArrayList<Pessoa> pessoa = new ArrayList();
      
        pessoa = pessoaBO.buscarPessoa();
        
        cmbDonoPet.removeAllItems();
        
        cmbDonoPet.addItem("Selecione");
        for (Pessoa p : pessoa) {
            cmbDonoPet.addItem(p.getNome() + " | " + p.getId());
        }
        cmbDonoPet.setSelectedIndex(0);
             
        /*cmbDonoPet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = (String) cmbDonoPet.getSelectedItem();

                if (!nome.equals("Selecione") || cmbDonoPet.getSelectedItem()!=null) {
                    txtDonoPet.setText(nome);
                } else {
                    txtDonoPet.setText("");
                }
            }
        });*/
        
        String nome = (String) cmbDonoPet.getSelectedItem();
        
        if (!nome.equals("Selecione") && cmbDonoPet.getSelectedItem()!= null) {
            txtDonoPet.setText(nome);
        } else {
            txtDonoPet.setText("");
        }
        
    }
    
    private void preencherCombo(int idpet){
    
        Pet pet = petBO.getPetId(idpet);
        cmbPet.addItem(pet.getNome() + " | " + pet.getId_pet());
        preencherCampos(pet);
    
    }
    
    private void preencherCombo(){
    
        String nome = txtNomePet.getText();
        if(!nome.isEmpty()){
        
            lstPet = petBO.getPet(nome);
            cmbPet.removeAllItems();
            lstPet.forEach(itemPet ->{
               cmbPet.addItem(itemPet.getNome() + " | " + itemPet.getId_pet());
            });
            
        }else{
        
            cmbPet.removeAllItems();
             
        }
    
    }
    
    private void preencherCampos(Pet pet){
    
        txtIdPet.setText(String.valueOf(pet.getId_pet()));
        txtNome.setText(pet.getNome());
        txtRaca.setText(pet.getRaca());
        txtPorte.setText(pet.getPorte());
        txtEspecie.setText(pet.getEspecie());
        txtCor.setText(pet.getCor());
        txtDataNasc.setText(pet.getData_nasc());
        cmbDonoPet.removeAllItems();
        lstPessoas = new ArrayList();
        lstPessoas.add(pet.getP());
        cmbDonoPet.addItem(pet.getP().getNome() + " | " + pet.getP().getId());
        btnSalvarPet.setEnabled(false);
        
    }
    
    private void preencherCampos(){
    
        if(!lstPet.isEmpty()){
        
            int index = cmbPet.getSelectedIndex();
            Pet pet = lstPet.get(index);
            preencherCampos(pet);
            
        }
        
    }
    
    private void novo(){
    
        txtNomePet.setText("");
        lstPet = new ArrayList<>();
        txtIdPet.setText("");
        txtNome.setText("");
        txtPorte.setText("");
        txtRaca.setText("");
        txtEspecie.setText("");
        txtDataNasc.setText("");
        txtCor.setText("");
        CarregarTutores();
        btnSalvarPet.setEnabled(true);
        
    }
    
    private void excluir(){
    
        Pet pet = new Pet();
        pet.setId_pet(Integer.parseInt(txtIdPet.getText()));
        
        petBO.exc(pet);
        
        JOptionPane.showMessageDialog(null,"Dados do pet excluidos com sucesso!!!");
        
        novo();
    
    }
    
    private void editar(){
    
        Pessoa p = new Pessoa();
        Pessoa pe = new Pessoa();
        
        String selecionado = (String) cmbDonoPet.getSelectedItem();
        int idPessoa = -1;

        if (selecionado != null && selecionado.contains("|")) {
            String idStr = selecionado.split(" \\| ")[1].trim();
            idPessoa = Integer.parseInt(idStr);  // agora você tem o ID real do dono
        }

        p.setNome(selecionado);
            
        pe = pessoaBO.buscarDono(idPessoa);
        
        Pet pet = new Pet();
        pet.setId_pet(Integer.parseInt(txtIdPet.getText()));
        pet.setNome(txtNome.getText());
        pet.setRaca(txtRaca.getText());
        pet.setEspecie(txtEspecie.getText());
        pet.setCor(txtCor.getText());
        pet.setPorte(txtPorte.getText());
        pet.setData_nasc(txtDataNasc.getText());
        pet.setP(pe);
        
        petBO.edit(pet);
        
        JOptionPane.showMessageDialog(null,"Dados do pet editado com sucesso!!!");
        
        novo();
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPet = new javax.swing.JComboBox<>();
        txtNomePet = new javax.swing.JTextField();
        btnConsultarPet = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        try{

            FormatoDataNasc = new MaskFormatter ("##/##/####");

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,"Nao foi possivel fazer a datra de nascimento");

        }
        txtDataNasc = new JFormattedTextField(FormatoDataNasc);
        txtRaca = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtPorte = new javax.swing.JTextField();
        cmbDonoPet = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtDonoPet = new javax.swing.JTextField();
        txtIdPet = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSalvarPet = new javax.swing.JButton();
        btnEditarPet = new javax.swing.JButton();
        btnExcluirPet = new javax.swing.JButton();
        btnSairPet = new javax.swing.JButton();
        btnSairPet1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE PET");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome do Pet:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Pets:");

        cmbPet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        txtNomePet.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomePetCaretUpdate(evt);
            }
        });
        txtNomePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePetActionPerformed(evt);
            }
        });

        btnConsultarPet.setBackground(new java.awt.Color(0, 0, 102));
        btnConsultarPet.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarPet.setText("CONSULTAR");
        btnConsultarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbPet, 0, 461, Short.MAX_VALUE)
                    .addComponent(txtNomePet))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultarPet)
                .addGap(321, 321, 321))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnConsultarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nome do Pet:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Raça:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Espécie:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Porte:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cor:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Data Nascimento:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Dono do Pet:");

        txtPorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorteActionPerformed(evt);
            }
        });

        cmbDonoPet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cmbDonoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDonoPetActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Dono:");

        txtDonoPet.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDonoPetCaretUpdate(evt);
            }
        });
        txtDonoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonoPetActionPerformed(evt);
            }
        });

        txtIdPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPetActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPorte, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtRaca)
                            .addComponent(txtNome))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCor, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txtEspecie)
                            .addComponent(txtDataNasc)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonoPet)
                            .addComponent(cmbDonoPet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(92, 92, 92))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdPet, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDonoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        btnSalvarPet.setBackground(new java.awt.Color(51, 204, 0));
        btnSalvarPet.setText("SALVAR");
        btnSalvarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPetActionPerformed(evt);
            }
        });

        btnEditarPet.setBackground(new java.awt.Color(0, 0, 255));
        btnEditarPet.setText("EDITAR");
        btnEditarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPetActionPerformed(evt);
            }
        });

        btnExcluirPet.setBackground(new java.awt.Color(0, 0, 0));
        btnExcluirPet.setText("EXCLUIR");
        btnExcluirPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPetActionPerformed(evt);
            }
        });

        btnSairPet.setBackground(new java.awt.Color(255, 0, 0));
        btnSairPet.setText("SAIR");
        btnSairPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairPetActionPerformed(evt);
            }
        });

        btnSairPet1.setBackground(new java.awt.Color(255, 255, 255));
        btnSairPet1.setForeground(new java.awt.Color(0, 0, 0));
        btnSairPet1.setText("NOVO");
        btnSairPet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairPet1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnSalvarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirPet, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnSairPet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSairPet1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirPet, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSairPet, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSairPet1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorteActionPerformed

    private void txtNomePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePetActionPerformed

    private void btnSalvarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPetActionPerformed
        
        Pet pet = new Pet();
        
        Pessoa p = new Pessoa();
        Pessoa pe = new Pessoa();
        
        String selecionado = (String) cmbDonoPet.getSelectedItem();
        int idPessoa = -1;

        if (selecionado != null && selecionado.contains("|")) {
            String idStr = selecionado.split(" \\| ")[1].trim();
            idPessoa = Integer.parseInt(idStr);  // agora você tem o ID real do dono
        }

        if (!selecionado.equals("Selecione") && selecionado!=null) {
            p.setNome(selecionado);
            pe = pessoaBO.buscarDono(idPessoa);
            if(pe != null){
                pet.setNome(txtNome.getText());
                pet.setEspecie(txtEspecie.getText());
                pet.setData_nasc(txtDataNasc.getText());
                pet.setRaca(txtRaca.getText());
                pet.setCor(txtCor.getText());
                pet.setPorte(txtPorte.getText());
                pet.setP(pe);
                Pet codigo = petBO.salvar(pet);
                txtIdPet.setText(String.valueOf(pet.getId_pet()));
                JOptionPane.showMessageDialog(null,"Dados do pet salvos com sucesso!!!");
        
            }else{
                JOptionPane.showMessageDialog(null,"Dono não encontrado!!!");
            }
        } else {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar os dados do pet!!!");
            
        }
        
    }//GEN-LAST:event_btnSalvarPetActionPerformed

    private void txtDonoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonoPetActionPerformed
        
    }//GEN-LAST:event_txtDonoPetActionPerformed

    private void cmbDonoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDonoPetActionPerformed
       
    }//GEN-LAST:event_cmbDonoPetActionPerformed

    private void txtDonoPetCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDonoPetCaretUpdate
        
        ArrayList<Pessoa> pessoa = new ArrayList();
        Pessoa p = new Pessoa();
        
        p.setNome(txtDonoPet.getText());
        
        pessoa = pessoaBO.carregarNome(p);
        
        cmbDonoPet.removeAllItems();
        
        for (Pessoa pe : pessoa) {
            cmbDonoPet.addItem(pe.getNome() + " | " + pe.getId());
        }
        
    }//GEN-LAST:event_txtDonoPetCaretUpdate

    private void txtNomePetCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomePetCaretUpdate
        preencherCombo();
    }//GEN-LAST:event_txtNomePetCaretUpdate

    private void btnConsultarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPetActionPerformed
        preencherCampos();
    }//GEN-LAST:event_btnConsultarPetActionPerformed

    private void btnSairPet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPet1ActionPerformed
        novo();
    }//GEN-LAST:event_btnSairPet1ActionPerformed

    private void btnExcluirPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPetActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirPetActionPerformed

    private void txtIdPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPetActionPerformed

    private void btnEditarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPetActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarPetActionPerformed

    private void btnSairPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPetActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairPetActionPerformed

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
            java.util.logging.Logger.getLogger(FormPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarPet;
    private javax.swing.JButton btnEditarPet;
    private javax.swing.JButton btnExcluirPet;
    private javax.swing.JButton btnSairPet;
    private javax.swing.JButton btnSairPet1;
    private javax.swing.JButton btnSalvarPet;
    private javax.swing.JComboBox<String> cmbDonoPet;
    private javax.swing.JComboBox<String> cmbPet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtDonoPet;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtIdPet;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomePet;
    private javax.swing.JTextField txtPorte;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}

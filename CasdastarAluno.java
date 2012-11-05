import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CasdastarAluno extends JFrame {

    private JLabel lblTituloTela;
    private JLabel lblNome;
    private JLabel lblEndereco;
    private JLabel lblNaturalidade;
    private JLabel lblTelefone;
    private JLabel lblCpf;
    private JLabel lblIdentidade;
    private JLabel lblMensalidade;
    private JLabel lblTipoBolsa;
    private JLabel lblPerBolsa;
    private JLabel lblVlBolsa;
    private JLabel lblVlPagar;
    private JTextField txtNome;
    private JTextField txtEndereco;
    private JTextField txtTelefone;
    private JTextField txtCpf;
    private JTextField txtIdentidade;
    private JTextField txtMensalidade;
    private JTextField txtPerBolsa;
    private JTextField txtVlBolsa;
    private JTextField txtVlPagar;
    private JRadioButton rbtParcial;
    private JRadioButton rbtIntegral;
    private JButton btnGravar;
    private JButton btnSair;
    private JComboBox cmbNaturalidade;
    private ButtonGroup grupo;

    public CasdastarAluno() {
        super("Cadastrar Aluno");
        setVisible(true);
        setSize(600, 700);
        setLocationRelativeTo(null); // centraliza a janela na tela
    }

    public void init() {
        Container tela = getContentPane();
        tela.setLayout(null);
        getContentPane().setBackground(Color.green);
        lblTituloTela = new JLabel("Cadastramento de Aluno");
        lblNome = new JLabel("Nome: ");
        lblEndereco = new JLabel("Endereço: ");
        lblNaturalidade = new JLabel("Naturalidade:");
        lblTelefone = new JLabel("Telefone:  ");
        lblCpf = new JLabel("Cpf:  ");
        lblIdentidade = new JLabel("Identidade:  ");
        lblMensalidade = new JLabel("Mensalidade:  R$");
        lblPerBolsa = new JLabel("Perc Bolsa:   %");
        lblTipoBolsa = new JLabel("Tipo de Bolsa: ");
        lblVlBolsa = new JLabel("Valor da Bolsa: R$");
        lblVlPagar = new JLabel("Valor a Pagar: R$");
        txtNome = new JTextField();
        txtEndereco = new JTextField();
        txtTelefone = new JTextField();
        txtCpf = new JTextField();
        txtIdentidade = new JTextField();
        txtMensalidade = new JTextField(null);
        txtPerBolsa = new JTextField(null);
        txtVlBolsa = new JTextField();
        txtVlPagar = new JTextField();
        rbtParcial = new JRadioButton("Parcial");
        rbtIntegral = new JRadioButton("Integral");
        rbtParcial.setBackground(Color.green);
        rbtIntegral.setBackground(Color.green);
        //Vetor de String para alimentar o campo ComboBox
        String[] opcoes = new String[]{"RJ",
            "MG",
            "SP",
            "AL",
            "RS"};
        cmbNaturalidade = new JComboBox(opcoes);

        btnGravar = new JButton("Gravar");
        btnSair = new JButton("Sair");
        lblTituloTela.setBounds(200, 10, 200, 20);//coluna, linha, largura, altura
        lblNome.setBounds(40, 40, 100, 20);//coluna, linha, largura, altura
        lblEndereco.setBounds(40, 70, 100, 20);//coluna, linha, largura, altura
        lblNaturalidade.setBounds(40, 100, 100, 20);
        lblTelefone.setBounds(40, 130, 100, 20);
        lblCpf.setBounds(40, 160, 100, 20);
        lblIdentidade.setBounds(40, 190, 100, 20);//coluna, linha, largura, altura
        lblMensalidade.setBounds(40, 220, 100, 20);
        lblTipoBolsa.setBounds(40, 250, 100, 20);
        lblPerBolsa.setBounds(40, 280, 100, 20);
        lblVlBolsa.setBounds(40, 310, 110, 20);
        lblVlPagar.setBounds(40, 340, 100, 20);
        txtNome.setBounds(150, 40, 350, 25);//coluna, linha, largura, altura
        txtEndereco.setBounds(150, 70, 350, 25);//coluna, linha, largura, altura
        cmbNaturalidade.setBounds(150, 100, 85, 25);
        txtTelefone.setBounds(150, 130, 190, 25);
        txtCpf.setBounds(150, 160, 200, 25);
        txtIdentidade.setBounds(150, 190, 200, 25);//coluna, linha, largura, altura
        txtMensalidade.setBounds(150, 220, 150, 25);
        rbtParcial.setBounds(150, 250, 120, 25);
        rbtIntegral.setBounds(280, 250, 120, 25);
        txtPerBolsa.setBounds(150, 280, 80, 25);
        txtVlBolsa.setBounds(150, 310, 150, 25);
        txtVlPagar.setBounds(150, 340, 150, 25);
        btnGravar.setBounds(140, 390, 150, 30);//coluna, linha, largura, altura
        btnSair.setBounds(380, 390, 150, 30);//coluna, linha, largura, altura
        txtPerBolsa.setEditable(false);
        grupo = new ButtonGroup();
        grupo.add(rbtParcial);
        grupo.add(rbtIntegral);
        //rbtParcial.setActionCommand("Parcial");
        //rbtIntegral.setActionCommand("Integral");
        tela.add(lblTituloTela);
        tela.add(lblNome);
        tela.add(lblEndereco);
        tela.add(lblTelefone);
        tela.add(lblCpf);
        tela.add(lblIdentidade);
        tela.add(lblMensalidade);
        tela.add(lblPerBolsa);
        tela.add(lblTipoBolsa);
        tela.add(lblNaturalidade);
        tela.add(lblVlBolsa);
        tela.add(lblVlPagar);
        tela.add(txtNome);
        tela.add(txtEndereco);
        tela.add(txtTelefone);
        tela.add(txtCpf);
        tela.add(txtIdentidade);
        tela.add(txtMensalidade);
        tela.add(txtPerBolsa);
        tela.add(txtVlBolsa);
        tela.add(txtVlPagar);
        tela.add(rbtParcial);
        tela.add(rbtIntegral);
        tela.add(btnGravar);
        tela.add(btnSair);
        tela.add(cmbNaturalidade);
        btnGravar.addActionListener(new CasdastarAluno.Gravar());
        btnSair.addActionListener(new Sair());
        rbtParcial.addActionListener(new Habilitajanela());
        rbtIntegral.addActionListener(new Habilitajanela());
      //  grupo.addActionListener(new Habilitajanela());
        txtPerBolsa.addKeyListener(new Evento());
    }

    private class Evento implements KeyListener {

        @Override
        public void keyTyped(KeyEvent evento) {
// Chamado após o usuário digitar um caractere Unicode em um componente
// que detém o foco.
        }

        @Override
        public void keyPressed(KeyEvent evento) {
// Chamado após o usuário pressionar uma tecla no componente
// que detém o foco.
            float Mensal, Percent, bolsa, vlpagar;
            String Pervazio = txtPerBolsa.getText();
            String Menvazio = txtMensalidade.getText();
            if (evento.getKeyCode() == KeyEvent.VK_ENTER) {
                if ((Menvazio.isEmpty()) || (Pervazio.isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Campo Mensalidade e/ou Percentual vazio");
                    return;
                }
                Mensal = Float.parseFloat(Menvazio);
                Percent = Float.parseFloat(Pervazio);
                bolsa = (Percent / 100) * Mensal;
                vlpagar = Mensal - bolsa;
                txtVlBolsa.setText("" + bolsa);
                txtVlPagar.setText("" + vlpagar);
            }
        }

        @Override
        public void keyReleased(KeyEvent evento) { // Chamado após o usuário liberar uma tecla no componente
// que detém o foco. }
        }
    }

    private class Habilitajanela implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            float Mensal, Percent, bolsa, vlpagar;
            String Menvazio = txtMensalidade.getText();
            if (rbtParcial.isSelected() == true) {
                txtPerBolsa.setEditable(true);
                txtPerBolsa.setText("");
            }
            if (rbtIntegral.isSelected() == true) {
                txtPerBolsa.setEditable(false);
                txtPerBolsa.setText("100");
                if (Menvazio.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Mensalidade vazio");
                    return;
                    
                }
                Mensal = Float.parseFloat(txtMensalidade.getText());
                Percent = Float.parseFloat(txtPerBolsa.getText());
                bolsa = (Percent / 100) * Mensal;
                vlpagar = Mensal - bolsa;
                txtVlBolsa.setText("" + bolsa);
                txtVlPagar.setText("" + vlpagar);
            }
        }
    }

    private class Gravar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String tipodeBolsa = null;
            if (rbtParcial.isSelected()) {
                tipodeBolsa = rbtParcial.getText();
            } else if (rbtIntegral.isSelected()) {
                tipodeBolsa = rbtIntegral.getText();
            }
            JOptionPane.showMessageDialog(null,
                    "Dados informados:\n"
                    + "\nNome: " + txtNome.getText()
                    + "\nEndereço: " + txtEndereco.getText()
                    + "\nNaturalidade: " + cmbNaturalidade.getSelectedItem()
                    + "\nTelefone: " + txtTelefone.getText()
                    + "\nCpf: " + txtCpf.getText()
                    + "\nIdentidade: " + txtIdentidade.getText()
                    + "\nMensalidade: " + txtMensalidade.getText()
                    + "\nPercent da bolsa: " + txtPerBolsa.getText()
                    + "\nTipo de Bolsa: " + tipodeBolsa
                    + "\nValor da Bolsa: " + txtVlBolsa.getText()
                    + "\nValor a pagar: " + txtVlPagar.getText());

        }
    }

    private class Sair implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}

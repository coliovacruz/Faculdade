import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class IncluiFuncionario extends JFrame {

    private JLabel lblTituloTela;
    private JLabel lblNome;
    private JLabel lblEndereco;
    private JLabel lblEstado;
    private JTextField txtNome;
    private JTextField txtEndereco;
    private JTextField txtEstado;
    private JButton btnGravar;
    private JButton btnSair;
    private JButton btnRetornar;

    public IncluiFuncionario() {
        super("Cadastramento de Funcionário");
        setVisible(true);
        setSize(500, 300);
        setLocationRelativeTo(null); // centraliza a janela na tela
    }

    public void init() {
        Container tela = getContentPane();
        getContentPane().setBackground(Color.blue);
        tela.setLayout(null);
        lblTituloTela = new JLabel("Inclusão de Dados de Funcionário");
        lblNome = new JLabel("Nome: ");
        lblEndereco = new JLabel("Endereço: ");
        lblEstado = new JLabel("Estado: ");
        txtNome = new JTextField();
        txtEndereco = new JTextField();
        txtEstado = new JTextField();
        btnRetornar = new JButton("Retornar");
        btnGravar = new JButton("Gravar");
        btnSair = new JButton("Sair");
        lblTituloTela.setBounds(200, 10, 200, 20);//coluna, linha, largura, altura
        lblNome.setBounds(50, 40, 60, 20);//coluna, linha, largura, altura
        lblEndereco.setBounds(50, 70, 60, 20);//coluna, linha, largura, altura
        lblEstado.setBounds(50, 100, 60, 20);//coluna, linha, largura, altura
        txtNome.setBounds(120, 40, 350, 25);//coluna, linha, largura, altura
        txtEndereco.setBounds(120, 70, 350, 25);//coluna, linha, largura, altura
        txtEstado.setBounds(120, 100, 200, 25);//coluna, linha, largura, altura
        btnRetornar.setBounds(80, 200, 100, 30);//coluna, linha, largura, altura
        btnGravar.setBounds(200, 200, 100, 30);//coluna, linha, largura, altura
        btnSair.setBounds(320, 200, 100, 30);//coluna, linha, largura, altura
        tela.add(lblTituloTela);
        tela.add(lblNome);
        tela.add(lblEndereco);
        tela.add(lblEstado);
        tela.add(txtNome);
        tela.add(txtEndereco);
        tela.add(txtEstado);
        tela.add(btnGravar);
        tela.add(btnSair);
        tela.add(btnRetornar);
        btnRetornar.addActionListener(new Retornar());
        btnGravar.addActionListener(new Gravar());
        btnSair.addActionListener(new Sair());
    }

    private class Gravar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "Dados Gravados:\n"
                    + "\nNome: " + txtNome.getText()
                    + "\nEndereço: " + txtEndereco.getText()
                    + "\nEstado: " + txtEstado.getText());
        }
    }

    private class Sair implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class Retornar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class CadastrarDisciplina extends JFrame {

    private JLabel lblTituloTela;
    private JLabel lblCodigo;
    private JLabel lblNome;
    private JTextField txtCodigo;
    private JTextField txtNome;
    private JButton btnGravar;
    private JButton btnSair;
 
    public CadastrarDisciplina () {
        super("Cadastramento de Disciplina");
        setVisible(true);
        setSize(500, 300);
        setLocationRelativeTo(null); // centraliza a janela na tela
    }

    public void init() {
        Container tela = getContentPane();
        tela.setLayout(null);
        getContentPane().setBackground(Color.yellow);
        lblTituloTela = new JLabel("Inclusão de Disciplina");
        lblCodigo = new JLabel("Codigo: ");
        lblNome = new JLabel("Nome: ");
        txtCodigo = new JTextField();
        txtNome = new JTextField();
        btnGravar = new JButton("Gravar");
        btnSair = new JButton("Sair");
        lblTituloTela.setBounds(200, 10, 200, 20);//coluna, linha, largura, altura
        lblCodigo.setBounds(50, 40, 60, 20);//coluna, linha, largura, altura
        lblNome.setBounds(50, 70, 60, 20);//coluna, linha, largura, altura
        txtCodigo.setBounds(120, 40, 120, 25);//coluna, linha, largura, altura
        txtNome.setBounds(120, 70, 300, 25);//coluna, linha, largura, altura
        btnGravar.setBounds(120, 200, 100, 30);//coluna, linha, largura, altura
        btnSair.setBounds(300, 200, 100, 30);//coluna, linha, largura, altura
        tela.add(lblTituloTela);
        tela.add(lblCodigo);
        tela.add(lblNome);
        tela.add(txtCodigo);
        tela.add(txtNome);
        tela.add(btnGravar);
        tela.add(btnSair);
        btnGravar.addActionListener(new CadastrarDisciplina.Gravar());
        btnSair.addActionListener(new CadastrarDisciplina.Sair());
    }

    private class Gravar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "Dados Gravados:\n"
                    + "\nCodigo: " + txtCodigo.getText()
                    + "\nNome: " + txtNome.getText());
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
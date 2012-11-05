import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class IncluiCargo extends JFrame {

    private JLabel lblTituloTela;
    private JLabel lblNome;
    private JLabel lblCargo;
    private JLabel lblSetor;
    private JTextField txtNome;
    private JTextField txtCargo;
    private JTextField txtSetor;
    private JButton btnGravar;
    private JButton btnSair;
    private JButton btnRetornar;

    public IncluiCargo () {
        super("Cadastramento de Cargo");
        setVisible(true);
        setSize(500, 300);
        setLocationRelativeTo(null); // centraliza a janela na tela
    }

    public void init() {
        Container tela = getContentPane();
        tela.setLayout(null);
        getContentPane().setBackground(Color.green);
        lblTituloTela = new JLabel("Inclusão de Cargo");
        lblNome = new JLabel("Nome: ");
        lblCargo = new JLabel("Cargo: ");
        lblSetor = new JLabel("Setor: ");
        txtNome = new JTextField();
        txtCargo = new JTextField();
        txtSetor = new JTextField();
        btnRetornar = new JButton("Retornar");
        btnGravar = new JButton("Gravar");
        btnSair = new JButton("Sair");
        lblTituloTela.setBounds(200, 10, 200, 20);//coluna, linha, largura, altura
        lblNome.setBounds(50, 40, 60, 20);//coluna, linha, largura, altura
        lblCargo.setBounds(50, 70, 60, 20);//coluna, linha, largura, altura
        lblSetor.setBounds(50, 100, 60, 20);//coluna, linha, largura, altura
        txtNome.setBounds(120, 40, 350, 25);//coluna, linha, largura, altura
        txtCargo.setBounds(120, 70, 200, 25);//coluna, linha, largura, altura
        txtSetor.setBounds(120, 100, 200, 25);//coluna, linha, largura, altura
        btnRetornar.setBounds(80, 200, 100, 30);//coluna, linha, largura, altura
        btnGravar.setBounds(200, 200, 100, 30);//coluna, linha, largura, altura
        btnSair.setBounds(320, 200, 100, 30);//coluna, linha, largura, altura
        tela.add(lblTituloTela);
        tela.add(lblNome);
        tela.add(lblCargo);
        tela.add(lblSetor);
        tela.add(txtNome);
        tela.add(txtCargo);
        tela.add(txtSetor);
        tela.add(btnGravar);
        tela.add(btnSair);
        tela.add(btnRetornar);
        btnRetornar.addActionListener(new IncluiCargo.Retornar());
        btnGravar.addActionListener(new IncluiCargo.Gravar());
        btnSair.addActionListener(new IncluiCargo.Sair());
    }

    private class Gravar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "Dados Gravados:\n"
                    + "\nNome: " + txtNome.getText()
                    + "\nCargo: " + txtCargo.getText()
                    + "\nSetor: " + txtSetor.getText());
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
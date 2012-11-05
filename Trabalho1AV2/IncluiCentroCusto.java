import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class IncluiCentroCusto extends JFrame {

    private JLabel lblTituloTela;
    private JLabel lblNome;
    private JLabel lblPrecCust;
    private JLabel lblOrigem;
    private JTextField txtNome;
    private JTextField txtPrecCust;
    private JTextField txtOrigem;
    private JButton btnGravar;
    private JButton btnSair;
    private JButton btnRetornar;

    public IncluiCentroCusto () {
        super("Centro de Custo");
        setVisible(true);
        setSize(500, 300);
        setLocationRelativeTo(null); // centraliza a janela na tela
    }

    public void init() {
        Container tela = getContentPane();
        getContentPane().setBackground(Color.red);
        tela.setLayout(null);
        lblTituloTela = new JLabel("Centro de Custo");
        lblNome = new JLabel("Nome: ");
        lblPrecCust = new JLabel("Custo: ");
        lblOrigem = new JLabel("Origem: ");
        txtNome = new JTextField();
        txtPrecCust = new JTextField();
        txtOrigem = new JTextField();
        btnRetornar = new JButton("Retornar");
        btnGravar = new JButton("Gravar");
        btnSair = new JButton("Sair");
        lblTituloTela.setBounds(200, 10, 200, 20);//coluna, linha, largura, altura
        lblNome.setBounds(50, 40, 60, 20);//coluna, linha, largura, altura
        lblPrecCust.setBounds(50, 70, 60, 20);//coluna, linha, largura, altura
        lblOrigem.setBounds(50, 100, 60, 20);//coluna, linha, largura, altura
        txtNome.setBounds(120, 40, 200, 25);//coluna, linha, largura, altura
        txtPrecCust.setBounds(120, 70, 200, 25);//coluna, linha, largura, altura
        txtOrigem.setBounds(120, 100, 200, 25);//coluna, linha, largura, altura
        btnRetornar.setBounds(80, 200, 100, 30);//coluna, linha, largura, altura
        btnGravar.setBounds(200, 200, 100, 30);//coluna, linha, largura, altura
        btnSair.setBounds(320, 200, 100, 30);//coluna, linha, largura, altura
        tela.add(lblTituloTela);
        tela.add(lblNome);
        tela.add(lblPrecCust);
        tela.add(lblOrigem);
        tela.add(txtNome);
        tela.add(txtPrecCust);
        tela.add(txtOrigem);
        tela.add(btnGravar);
        tela.add(btnSair);
        tela.add(btnRetornar);
        btnRetornar.addActionListener(new IncluiCentroCusto.Retornar());
        btnGravar.addActionListener(new IncluiCentroCusto.Gravar());
        btnSair.addActionListener(new IncluiCentroCusto.Sair());
    }

    private class Gravar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "Dados Gravados:\n"
                    + "\nNome: " + txtNome.getText()
                    + "\nPreço de Custo: " + txtPrecCust.getText()
                    + "\nOrigem: " + txtOrigem.getText());
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
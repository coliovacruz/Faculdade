import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class IncluiProduto extends JFrame {

    private JLabel lblTituloTela;
    private JLabel lblNomeProduto;
    private JLabel lblOrigemProduto;
    private JLabel lblNumeroInterno;
    private JLabel lblPrecProduto;
    private JTextField txtNomeProduto;
    private JTextField txtOrigemProduto;
    private JTextField txtNumeroInterno;
    private JTextField txtPrecProduto;
    private JButton btnGravar;
    private JButton btnSair;
    private JButton btnRetornar;

    public IncluiProduto () {
        super("Cadastramento de produto");
        setVisible(true);
        setSize(500, 300);
        setLocationRelativeTo(null); // centraliza a janela na tela
    }

    public void init() {
        Container tela = getContentPane();
        getContentPane().setBackground(Color.yellow);
        tela.setLayout(null);
        lblTituloTela = new JLabel("Inclusão de Produto");
        lblNomeProduto = new JLabel("Nome do Produto: ");
        lblOrigemProduto = new JLabel("Origem do Produto: ");
        lblNumeroInterno = new JLabel("Numero interno: ");
        lblPrecProduto = new JLabel("Preço do Produto : ");
        txtNomeProduto = new JTextField();
        txtOrigemProduto = new JTextField();
        txtNumeroInterno = new JTextField();
        txtPrecProduto = new JTextField();
        btnRetornar = new JButton("Retornar");
        btnGravar = new JButton("Gravar");
        btnSair = new JButton("Sair");
        lblTituloTela.setBounds(200, 10, 200, 20);//coluna, linha, largura, altura
        lblNomeProduto.setBounds(50, 40, 200, 20);//coluna, linha, largura, altura
        lblOrigemProduto.setBounds(50, 70, 200, 20);//coluna, linha, largura, altura
        lblNumeroInterno.setBounds(50, 100, 200, 20);//coluna, linha, largura, altura
        lblPrecProduto.setBounds(50, 130, 200, 20);//coluna, linha, largura, altura
        txtNomeProduto.setBounds(180, 40, 300, 25);//coluna, linha, largura, altura
        txtOrigemProduto.setBounds(180, 70, 200, 25);//coluna, linha, largura, altura
        txtNumeroInterno.setBounds(180, 100, 200, 25);//coluna, linha, largura, altura
        txtPrecProduto.setBounds(180, 130, 200, 25);//coluna, linha, largura, altura
        btnRetornar.setBounds(80, 200, 100, 30);//coluna, linha, largura, altura
        btnGravar.setBounds(200, 200, 100, 30);//coluna, linha, largura, altura
        btnSair.setBounds(320, 200, 100, 30);//coluna, linha, largura, altura
        
        lblTituloTela.setFont(new Font("Comic Sans MS", Font.ITALIC, 14));
        lblNomeProduto.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblOrigemProduto.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNumeroInterno.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblPrecProduto.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        
        tela.add(lblTituloTela);
        tela.add(lblNomeProduto);
        tela.add(lblOrigemProduto);
        tela.add(lblNumeroInterno);
        tela.add(lblPrecProduto);
        tela.add(txtNomeProduto);
        tela.add(txtOrigemProduto);
        tela.add(txtNumeroInterno);
        tela.add(txtPrecProduto);
        tela.add(btnGravar);
        tela.add(btnSair);
        tela.add(btnRetornar);
        btnRetornar.addActionListener(new IncluiProduto.Retornar());
        btnGravar.addActionListener(new IncluiProduto.Gravar());
        btnSair.addActionListener(new IncluiProduto.Sair());
    }

    private class Gravar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "Dados Gravados:\n"
                    + "\nNome do Produto: " + txtNomeProduto.getText()
                    + "\nOrigem do Produto: " + txtOrigemProduto.getText()
                    + "\nNumero Interno: " + txtNumeroInterno.getText()
                     + "\nPreço do Produto: " + txtPrecProduto.getText());
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

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

public class CodigodeBarra extends JFrame {

    private JPanel pnlpanel;
    private JLabel lblcodigo, lblresposta;
    private JTextField txtcodigo;
    private JButton bntverificar, bntsair, bntGerar;
    private Barcode barcode;

    public CodigodeBarra() {
        super("codigo de barras");

    }

    public void inity() {
        pnlpanel = new JPanel();
        pnlpanel.setLayout(null);
        lblcodigo = new JLabel("codigo");
        lblresposta = new JLabel();
        txtcodigo = new JTextField();
        bntverificar = new JButton("Verificar");
        bntsair = new JButton("Sair");
        bntGerar = new JButton("Gerar Codigo");
        super.add(pnlpanel);
        lblcodigo.setBounds(40, 10, 200, 20);//coluna, linha, largura, altura
        txtcodigo.setBounds(150, 10, 200, 20);//coluna, linha, largura, altura
        bntverificar.setBounds(40, 100, 100, 20);//coluna, linha, largura, altura
        bntGerar.setBounds(150, 100, 150, 20);//coluna, linha, largura, altura
        bntsair.setBounds(310, 100, 100, 20);//coluna, linha, largura, altura

        pnlpanel.add(lblcodigo);
        pnlpanel.add(txtcodigo);
        pnlpanel.add(bntverificar);
        pnlpanel.add(bntGerar);
        pnlpanel.add(bntsair);
        bntGerar.addActionListener(new Gerar());
        bntsair.addActionListener(new Sair());
        bntverificar.addActionListener(new Verificar());

    }

    private class Sair implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class Gerar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String Menvazio = txtcodigo.getText();
            String str = txtcodigo.getText();
            /**
             * Verifica em uma String esta vazia ou diferente de 12 digitos*
             */
            if ((Menvazio.isEmpty()) || (Menvazio.length() != 12)) {
                JOptionPane.showMessageDialog(null, "FAVOR PREENCHA O CAMPO CODIGO CORRETAMENTE");
                return;
            }

            /**
             * Verifica se contem somente numeros em uma String*
             */
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    JOptionPane.showMessageDialog(null, "DIGITE APENAS NUMEROS");
                    return;
                }
            }
            GerarCodBarEAN(Menvazio);

        }
    }

    private class Verificar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String Menvazio = txtcodigo.getText();
            String str = txtcodigo.getText();
            /**
             * Verifica em uma String esta vazia ou diferente de 12 digitos*
             */
            if ((Menvazio.isEmpty()) || (Menvazio.length() != 13)) {
                JOptionPane.showMessageDialog(null, "FAVOR PREENCHA O CAMPO CODIGO CORRETAMENTE");
                return;
            }

            /**
             * Verifica se contem somente numeros em uma String*
             */
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    JOptionPane.showMessageDialog(null, "DIGITE APENAS NUMEROS");
                    return;
                }
            }
            ValidCodBarEAN(Menvazio);

        }
    }

    public void ValidCodBarEAN(String codeBar) {
        int digit = 0;
        int calculated = 0;
        String ean;
        String checkSum = "131313131313";
        int sum = 0;
        if (codeBar.length() == 8 || codeBar.length() == 13) {
            digit = Integer.parseInt("" + codeBar.charAt(codeBar.length() - 1));
            ean = codeBar.substring(0, codeBar.length() - 1);
            for (int i = 0; i <= ean.length() - 1; i++) {
                sum += (Integer.parseInt("" + ean.charAt(i))) * (Integer.parseInt("" + checkSum.charAt(i)));
            }
            calculated = 10 - (sum % 10);
            if (digit == calculated) {
                JOptionPane.showMessageDialog(null, "CODIGO VALIDO");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INVALIDO");
                return;
            }
        }
    }

    public void GerarCodBarEAN(String codeBar) {
        int calculated = 0;
        String ean = null;
        String checkSum = "131313131313";
        int sum = 0;
        if (codeBar.length() == 8 || codeBar.length() == 12) {
            //digit = Integer.parseInt("" + codeBar.charAt(codeBar.length() - 1));
            ean = codeBar.substring(0, codeBar.length());
            for (int i = 0; i <= ean.length() - 1; i++) {
                sum += (Integer.parseInt("" + ean.charAt(i))) * (Integer.parseInt("" + checkSum.charAt(i)));
            }
            calculated = 10 - (sum % 10);
            JOptionPane.showMessageDialog(null, "Codigo verificador:   " + calculated);
            GeraCodigoBarras(ean + calculated);
            //return;
        }
    }

    public void GeraCodigoBarras(String value) {
        try {
            barcode = BarcodeFactory.createCode128(value);
            barcode.setDrawingText(true);
            BufferedImage image = new BufferedImage(300, 150, BufferedImage.TYPE_BYTE_GRAY);
            Graphics2D g = (Graphics2D) image.getGraphics();
            g.setBackground(Color.BLUE);
            barcode.draw(g, 0, 56);
            File f = new File("D:/barras.jpg");
            File f1 = new File("D:/barras.png");
            ImageIcon imagem = new ImageIcon(image);
            JLabel lblcodbar = new JLabel();
            //CodigodeBarra exe = new CodigodeBarra();
            lblresposta.setIcon(imagem);
            lblresposta.setBounds(100, 200, 1300, 80);
            pnlpanel.add(lblresposta);
            this.getContentPane().validate();
            this.getContentPane().repaint();

//Com o objeto Image em mãos podemos converte-lo em um ImageIcon e apresenta-lo em um JLabel
            BarcodeImageHandler.saveJPEG(barcode, f);
            BarcodeImageHandler.savePNG(barcode, f1);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public static void main(String[] args) {
        CodigodeBarra exe = new CodigodeBarra();
        exe.inity();
        exe.setVisible(true);
        exe.show();
        exe.setSize(500, 400);
        //exe.setExtendedState(JFrame.MAXIMIZED_BOTH); // Executa maximizado
        exe.validate();
        // exe.pack();
        exe.setLocationRelativeTo(null); // centraliza a janela na tela
        exe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

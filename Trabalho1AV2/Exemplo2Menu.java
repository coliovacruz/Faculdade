import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exemplo2Menu extends JFrame {
// Declaração dos objetos do menu principal (barra de menus)

    private JMenuBar JmMenuBar;
    private JMenu menuFuncionario;
    private JMenu menuCargo;
    private JMenu menuCentroCusto;
    private JMenu menuProduto;
//Itens do menu Fucionario
    private JMenuItem jmiFuncInclui;
    private JMenuItem jmiFuncAltera;
    private JMenuItem jmiFuncExclui;
    private JMenuItem jmiFuncConsulta;
    private JMenuItem jmiFuncSair;
//Itens do menu Cargo
    private JMenuItem jmiCargoInclui;
    private JMenuItem jmiCargoAltera;
    private JMenuItem jmiCargoExclui;
    private JMenuItem jmiCargoConsulta;
    private JMenuItem jmiCargoSair;
    //Itens do menu Centro de Custo
    private JMenuItem jmiCcustoInclui;
    private JMenuItem jmiCcustoAltera;
    private JMenuItem jmiCcustoExclui;
    private JMenuItem jmiCcustoConsulta;
    private JMenuItem jmiCcustoSair;
    //Itens do menu Produto
    private JMenuItem jmiProdutoInclui;
    private JMenuItem jmiProdutoAltera;
    private JMenuItem jmiProdutoExclui;
    private JMenuItem jmiProdutoConsulta;
    private JMenuItem jmiProdutoSair;

    public Exemplo2Menu() {
        super("Manutenção de Cadastro");
    }

    public void inicializaFrame() {
        setVisible(true);
       // setExtendedState(JFrame.MAXIMIZED_BOTH); // Executa maximizado
        setSize (600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void montaTela() {
//Inicializa menu principal
        JmMenuBar = new JMenuBar();
        menuFuncionario = new JMenu("Funcionario");
        menuCargo = new JMenu("Cargo");
        menuCentroCusto = new JMenu("Centro de Custo");
        menuProduto = new JMenu("Produto");
//Adiciona menu principal (menu bar)
        JmMenuBar.add(menuFuncionario);
        JmMenuBar.add(menuCargo);
        JmMenuBar.add(menuCentroCusto);
        JmMenuBar.add(menuProduto);
        trataFuncionario();
        trataCargo();
        trataCentroDeCusto();
        trataProduto();
//Adicionar a barra de ferramentas no JFrame, posicionando-a na parte superior
        super.add(JmMenuBar, BorderLayout.NORTH);
    }

    public void trataFuncionario() {
//Inicializa itens de menu Funcionario
        jmiFuncInclui = new JMenuItem("Incluir");
        jmiFuncAltera = new JMenuItem("Alterar");
        jmiFuncExclui = new JMenuItem("Excluir");
        jmiFuncConsulta = new JMenuItem("Consultar");
        jmiFuncSair = new JMenuItem("Sair");
//Adiciona itens de menu Funcionario
        menuFuncionario.add(jmiFuncInclui);
        menuFuncionario.add(jmiFuncAltera);
        menuFuncionario.add(jmiFuncExclui);
        menuFuncionario.add(jmiFuncConsulta);
        menuFuncionario.addSeparator();

        menuFuncionario.add(jmiFuncSair);
        ProcessaFuncionario procFunc = new ProcessaFuncionario();
        jmiFuncInclui.addActionListener(procFunc);
        jmiFuncAltera.addActionListener(procFunc);
        jmiFuncExclui.addActionListener(procFunc);
        jmiFuncConsulta.addActionListener(procFunc);
        jmiFuncSair.addActionListener(procFunc);
    }

    public void trataCargo() {
//Inicializa itens de menu Cargo
        jmiCargoInclui = new JMenuItem("Incluir");
        jmiCargoAltera = new JMenuItem("Alterar");
        jmiCargoExclui = new JMenuItem("Excluir");
        jmiCargoConsulta = new JMenuItem("Consultar");
        jmiCargoSair = new JMenuItem("Sair");
//Adiciona itens de menu Cargo
        menuCargo.add(jmiCargoInclui);
        menuCargo.add(jmiCargoAltera);
        menuCargo.add(jmiCargoExclui);
        menuCargo.add(jmiCargoConsulta);
        menuCargo.addSeparator();
        menuCargo.add(jmiCargoSair);
        ProcessaCargo procCargo = new ProcessaCargo();
        jmiCargoInclui.addActionListener(procCargo);
        jmiCargoAltera.addActionListener(procCargo);
        jmiCargoExclui.addActionListener(procCargo);
        jmiCargoConsulta.addActionListener(procCargo);
        jmiCargoSair.addActionListener(procCargo);
    }

    public void trataCentroDeCusto() {
//Inicializa itens de menu Centro de Custo
        jmiCcustoInclui = new JMenuItem("Incluir");
        jmiCcustoAltera = new JMenuItem("Alterar");
        jmiCcustoExclui = new JMenuItem("Excluir");
        jmiCcustoConsulta = new JMenuItem("Consultar");
        jmiCcustoSair = new JMenuItem("Sair");
//Adiciona itens de menu Cargo
        menuCentroCusto.add(jmiCcustoInclui);
        menuCentroCusto.add(jmiCcustoAltera);
        menuCentroCusto.add(jmiCcustoExclui);
        menuCentroCusto.add(jmiCcustoConsulta);
        menuCentroCusto.addSeparator();
        menuCentroCusto.add(jmiCcustoSair);
        ProcessaCentroCusto procCentroCusto = new ProcessaCentroCusto();
        jmiCcustoInclui.addActionListener(procCentroCusto);
        jmiCcustoAltera.addActionListener(procCentroCusto);
        jmiCcustoExclui.addActionListener(procCentroCusto);
        jmiCcustoConsulta.addActionListener(procCentroCusto);
        jmiCcustoSair.addActionListener(procCentroCusto);
    }

    public void trataProduto() {
        //Inicializa itens de menu Centro de Custo
        jmiProdutoInclui = new JMenuItem("Incluir");
        jmiProdutoAltera = new JMenuItem("Alterar");
        jmiProdutoExclui = new JMenuItem("Excluir");
        jmiProdutoConsulta = new JMenuItem("Consultar");
        jmiProdutoSair = new JMenuItem("Sair");
        //Adiciona itens de menu Produto
        menuProduto.add(jmiProdutoInclui);
        menuProduto.add(jmiProdutoAltera);
        menuProduto.add(jmiProdutoExclui);
        menuProduto.add(jmiProdutoConsulta);
        menuProduto.addSeparator();
        menuProduto.add(jmiProdutoSair);
        ProcessaProduto procProduto = new ProcessaProduto();
        jmiProdutoInclui.addActionListener(procProduto);
        jmiProdutoAltera.addActionListener(procProduto);
        jmiProdutoExclui.addActionListener(procProduto);
        jmiProdutoConsulta.addActionListener(procProduto);
        jmiProdutoSair.addActionListener(procProduto);
    }

    private class ProcessaFuncionario implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jmiFuncInclui) {
                IncluiFuncionario incluiFunc = new IncluiFuncionario();
                incluiFunc.init();
            } else if (e.getSource() == jmiFuncAltera) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Alteração de Funcionario");
            } else if (e.getSource() == jmiFuncExclui) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Exclusão de Funcionario");
            } else if (e.getSource() == jmiFuncConsulta) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Consulta Funcionario");
            } else if (e.getSource() == jmiFuncSair) {
                System.exit(EXIT_ON_CLOSE);

            }
        }
    }

    private class ProcessaCargo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jmiCargoInclui) {
                IncluiCargo incluiCarg = new IncluiCargo();
                incluiCarg.init();
            } else if (e.getSource() == jmiCargoAltera) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Alteração de Cargo");
            } else if (e.getSource() == jmiCargoExclui) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Exclusão de Cargo");
            } else if (e.getSource() == jmiCargoConsulta) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Consulta Cargo");
            } else if (e.getSource() == jmiCargoSair) {
                System.exit(EXIT_ON_CLOSE);
            }
        }
    }

    private class ProcessaCentroCusto implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jmiCcustoInclui) {
                 IncluiCentroCusto incluiCentroCust = new IncluiCentroCusto();
                incluiCentroCust.init();
            } else if (e.getSource() == jmiCcustoAltera) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Alteração de Centro de Custo");
            } else if (e.getSource() == jmiCcustoExclui) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Exclusão de Centro de Custo");
            } else if (e.getSource() == jmiCcustoConsulta) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Consulta Centro de Custo");
            } else if (e.getSource() == jmiCcustoSair) {
                System.exit(EXIT_ON_CLOSE);
            }
        }
    }

    private class ProcessaProduto implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jmiProdutoInclui) {
                IncluiProduto incluiProdut = new IncluiProduto();
                incluiProdut.init();
            } else if (e.getSource() == jmiProdutoAltera) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Alteração de Produto");
            } else if (e.getSource() == jmiProdutoExclui) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Exclusão de Produto");
            } else if (e.getSource() == jmiProdutoConsulta) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Consulta Produto");
            } else if (e.getSource() == jmiProdutoSair) {
                System.exit(EXIT_ON_CLOSE);
            }
        }
    }

    public static void main(String[] args) {
        Exemplo2Menu exe = new Exemplo2Menu();
        exe.inicializaFrame();
        exe.montaTela();
    }
}
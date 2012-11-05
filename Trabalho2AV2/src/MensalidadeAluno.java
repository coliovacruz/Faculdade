import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MensalidadeAluno extends JFrame {
// Declaração dos objetos do menu principal (barra de menus)

    private JMenuBar JmMenuBar;
    private JMenu menuArquivo;
    private JMenu menuAluno;
    private JMenu menuDisciplina;
//Itens do menu Arquivo
    private JMenuItem jmiAbrir;
    private JMenuItem jmiLocalizar;
    private JMenuItem jmiArqConsulta;
    private JMenuItem jmiArqSair;
//Itens do menu Aluno
    private JMenuItem jmiAlunoInclui;
    private JMenuItem jmiAlunoAltera;
    private JMenuItem jmiAlunoConsulta;
    private JMenuItem jmiAlunoExclui;
    private JMenuItem jmiAlunoSair; 
//Itens do menu Centro de Disciplina
    private JMenuItem jmiDiscInclui;
    private JMenuItem jmiDiscAltera;
    private JMenuItem jmiDiscConsulta;
    private JMenuItem jmiDiscExclui;
    private JMenuItem jmiDiscSair;
    
    public MensalidadeAluno() {
        super("Cadastramentos");
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
        menuArquivo = new JMenu("Arquivo");
        menuAluno = new JMenu("Aluno");
        menuDisciplina = new JMenu("Disciplina");
//Adiciona menu principal (menu bar)
        JmMenuBar.add(menuArquivo);
        JmMenuBar.add(menuAluno);
        JmMenuBar.add(menuDisciplina);
        trataArquivo();
        trataAluno();
        trataDisciplina();   
//Adicionar a barra de ferramentas no JFrame, posicionando-a na parte superior
        super.add(JmMenuBar, BorderLayout.NORTH);
    }

    public void trataArquivo() {
//Inicializa itens de menu Arquivo
        jmiAbrir = new JMenuItem("Abrir");
        jmiLocalizar = new JMenuItem("Localizar");
        jmiArqConsulta = new JMenuItem("Consulta");
        jmiArqSair = new JMenuItem("Sair");
//Adiciona itens de menu Funcionario
        menuArquivo.add(jmiAbrir);
         menuArquivo.add(jmiLocalizar);
         menuArquivo.add(jmiArqConsulta);
         menuArquivo.addSeparator();
         menuArquivo.add(jmiArqSair);

        MensalidadeAluno.ProcessaArquivo procArq = new MensalidadeAluno.ProcessaArquivo();
        jmiAbrir.addActionListener(procArq);
        jmiLocalizar.addActionListener(procArq);
        jmiArqConsulta.addActionListener(procArq);
        jmiArqSair.addActionListener(procArq);
        }

    public void trataAluno() {
//Inicializa itens de menu Cargo
        jmiAlunoInclui = new JMenuItem("Inclusao");
        jmiAlunoAltera = new JMenuItem("Alterar");
        jmiAlunoConsulta = new JMenuItem("Consultar");
        jmiAlunoExclui = new JMenuItem("Excluir");
        jmiAlunoSair = new JMenuItem("Sair");
//Adiciona itens de menu Cargo
        menuAluno.add(jmiAlunoInclui);
        menuAluno.add(jmiAlunoAltera);
        menuAluno.add(jmiAlunoConsulta);
        menuAluno.add(jmiAlunoExclui);
        menuAluno.addSeparator();
        menuAluno.add(jmiAlunoSair);
        MensalidadeAluno.ProcessaAluno procAluno = new MensalidadeAluno.ProcessaAluno();
        jmiAlunoInclui.addActionListener(procAluno);
        jmiAlunoAltera.addActionListener(procAluno);
        jmiAlunoExclui.addActionListener(procAluno);
        jmiAlunoConsulta.addActionListener(procAluno);
        jmiAlunoSair.addActionListener(procAluno);
    }

    public void trataDisciplina() {
//Inicializa itens de menu Disciplina
        jmiDiscInclui = new JMenuItem("Inclusao");
        jmiDiscAltera = new JMenuItem("Alterar");
        jmiDiscExclui = new JMenuItem("Excluir");
        jmiDiscConsulta = new JMenuItem("Consultar");
        jmiDiscSair = new JMenuItem("Sair");
//Adiciona itens de menu Disciplina
        menuDisciplina.add(jmiDiscInclui);
        menuDisciplina.add(jmiDiscAltera);
        menuDisciplina.add(jmiDiscConsulta);
        menuDisciplina.add(jmiDiscExclui);
        menuDisciplina.addSeparator();
        menuDisciplina.add(jmiDiscSair);
        MensalidadeAluno.ProcessaDisciplina procDisciplina = new MensalidadeAluno.ProcessaDisciplina();
        jmiDiscInclui.addActionListener(procDisciplina);
        jmiDiscAltera.addActionListener(procDisciplina);
        jmiDiscExclui.addActionListener(procDisciplina);
        jmiDiscConsulta.addActionListener(procDisciplina);
        jmiDiscSair.addActionListener(procDisciplina);
    }   
    private class ProcessaArquivo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jmiAbrir) {
                 JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Abrir de Arquivo");
            } else if (e.getSource() == jmiLocalizar) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Alteração de Arquivo");
            } else if (e.getSource() == jmiArqConsulta) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Consulta Arquivo");
            } else if (e.getSource() == jmiArqSair) {
                System.exit(EXIT_ON_CLOSE);
            }
        }
    }
    private class ProcessaAluno implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jmiAlunoInclui) {
                CasdastarAluno x = new CasdastarAluno();
                    x.init();
            } else if (e.getSource() == jmiAlunoAltera) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Alteração de Aluno");
            } else if (e.getSource() == jmiAlunoExclui) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Exclusão de Aluno");
            } else if (e.getSource() == jmiAlunoConsulta) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Consulta Aluno");
            } else if (e.getSource() == jmiAlunoSair) {
                System.exit(EXIT_ON_CLOSE);
            }
        }
    }
    private class ProcessaDisciplina implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jmiDiscInclui) {
                 CadastrarDisciplina incluiCarg = new CadastrarDisciplina();
                incluiCarg.init();
            } else if (e.getSource() == jmiDiscAltera) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Alteração de Disciplina");
            } else if (e.getSource() == jmiDiscExclui) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Exclusão de Disciplina");
            } else if (e.getSource() == jmiDiscConsulta) {
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: Consulta Disciplina");
            } else if (e.getSource() == jmiDiscSair) {
                System.exit(EXIT_ON_CLOSE);
            }
        }
    }   
    public static void main(String[] args) {
        MensalidadeAluno exe = new MensalidadeAluno();
        exe.inicializaFrame();
        exe.montaTela();
    }
}
package Ex7;

import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
public class FGestaoAluno {
    private JPanel PanelAlunos;
    private JTabbedPane tabbedPaneNovo;
    private JTextField textFieldNome;
    private JTextField textFieldMedia;
    private JTextField textFieldNNegativas;
    private JButton gerarDisciplinasButton;
    private JButton guardarButton;
    private JTextArea textAreaNotas;
    private JTextField textFieldNota;
    private JButton buttonAdicionarNota;
    private JButton novoAlunoButton;
    private JTextField textFieldPesquisar;
    private JTextField textFieldANome;
    private JTextField textFieldAMedia;
    private JButton alterarButton;
    private JTextField textFieldANNegativas;
    private JButton pesquisarButton;
    private JTextArea textAreaANotas;
    private JTextArea textAreaCAlunos;
    private JTextField textFieldNomeApagar;
    private JTextArea textAreaResultApagar;
    private JButton encontrarAlunoButton;
    private JTextField textFieldApgNome;
    private JTextField textFieldApgMedia;
    private JTextField textFieldApgNNegativas;
    private JButton turmaApósApagarButton;
    private JButton eliminarAlunoButton;
    public static Aluno alu,al;
    int nDscp = 10;
    int[] notas = new int[nDscp];
    short ap=0;
    public static ArrayList<Aluno> turma=new ArrayList<Aluno>();
    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Gestão de Alunos");
        frame.setContentPane(new Ex7.FGestaoAluno().PanelAlunos);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 420);
        frame.setLocationRelativeTo(null);
//frame.pack();
        frame.setVisible(true);
    }
    public FGestaoAluno() {
        gerarDisciplinasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();
                int total = 0;
                short nNeg = 0;
                textAreaNotas.setText("");
                for (int i = 0; i < nDscp; i++) {
                    notas[i] = rnd.nextInt(20);
                    textAreaNotas.append(notas[i] + "\n");
                }
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((textFieldNome.getText()!="") && (textAreaNotas.getText()!=""))
                {
                    alu = new Aluno();
                    alu.Nome = textFieldNome.getText();
// System.arraycopy(a, 0, b, 0, a.length);
                    alu.Notas = new int[notas.length];
                    System.arraycopy(notas,0,alu.Notas,0,notas.length);
                    turma.add(alu);
                    textFieldMedia.setText(String.valueOf(alu.Media()));
                    textFieldNNegativas.setText(String.valueOf(alu.NNegativas()));
                    JOptionPane.showMessageDialog(null,
                            "aluno guardado com sucesso: " + alu.Nome);
                }
                else
                    JOptionPane.showMessageDialog(null,
                            "Dados incompletos! Introduza o nome e as " +
                                    "notas por favor!");
            }
        });
        buttonAdicionarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldNota.getText() != "") {
                    textAreaNotas.append(textFieldNota.getText() + "\n");
                    notas[ap] = Integer.parseInt(textFieldNota.getText());
                    ap++;
                }
            }
        });
        novoAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldNota.setText("");
                textFieldNome.setText("");
                textAreaNotas.setText("");
                textFieldNNegativas.setText("");
                textFieldMedia.setText("");
            }
        });
        pesquisarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome=textFieldPesquisar.getText();
                for(Aluno a: turma)
                    if(a.Nome.equals(nome)) //<=> a.Nome==nome
                    {
                        textFieldANome.setText(a.Nome);
                        int i=0;
                        textAreaANotas.setText("");
                        for (int nota: a.getNotas()) {
                            textAreaANotas.append(nota + "\n");
                        }
                        textFieldAMedia.setText(String.valueOf(a.Media()));
                        textFieldANNegativas.setText(String.valueOf(a.NNegativas()));
                        al = a;
                    }
            }
        });
        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                al.setNome(textFieldANome.getText());
                JOptionPane.showMessageDialog(null,
                        "aluno guardado com sucesso: " + al.Nome);
                String[] newStr = textAreaANotas.getText().split("\n");
                int[] arNotas = new int[newStr.length];
                try {
                    for (int i = 0; i < newStr.length; i++)
                        arNotas[i] = Integer.parseInt(newStr[i]);
                    al.Notas = arNotas.clone();
                    textFieldAMedia.setText(String.valueOf(al.Media()));
                    textFieldANNegativas.setText(String.valueOf(al.NNegativas()));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " +
                            ex.getMessage());
                }
            } });

        tabbedPaneNovo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                textAreaANotas.setText("");
                textAreaCAlunos.setText("");
                textFieldANome.setText("");
                textFieldAMedia.setText("");
                textFieldANNegativas.setText("");
                textAreaCAlunos.setText("");
                for(Aluno a: turma )
                    textAreaCAlunos.append(a.toString()+"\n");
            }
        });
        encontrarAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome=textFieldNomeApagar.getText();
                for(Aluno a: turma)
                    if(a.Nome.equals(nome)) //<=> a.Nome==nome
                    {
                        textFieldApgNome.setText(a.getNome());

                        textFieldApgMedia.setText(String.valueOf(a.Media()));

                        textFieldApgNNegativas.setText(String.valueOf(a.NNegativas()));
                        int res=JOptionPane.showConfirmDialog(null,
                                "Tem a certeza que quer apagar?");
                        if(res==0) {
                            turma.remove(a);

                            JOptionPane.showMessageDialog(null, "Aluno " +
                                    a.getNome()+ "removido com sucesso");
                        }
                    }
            }
        });
        turmaApósApagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(Aluno a: turma )
                    textAreaResultApagar.append(a.toString()+"\n");
                textFieldApgNome.setText("");
                textFieldApgMedia.setText("");
                textFieldApgNNegativas.setText("");
            }
        });
    }
}

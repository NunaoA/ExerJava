package Ex7;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FGestaoTurmas {
    private JPanel PanelTurmas;
    private JButton guardarTurmaButton;
    private JTextField textFieldDesigTurma;
    private JTextArea textAreaAlunosTurma;
    private JButton atribuirAlunosButton;
    private JTextField textFieldMediaTurma;
    private JTextField textFieldNAlunos3Neg;
    private JTextField textFieldNotaMaisAlta;
    private JTextField textFieldNAlunos;
    public FGestaoTurmas() {
        guardarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldDesigTurma.getText()!="" && textAreaAlunosTurma.getText()!="")
                {
                    Turma t = new Turma();
                    t.setDesignacao(textFieldDesigTurma.getText());

                    t.setAlunos(FGestaoAluno.turma);
                    textFieldNAlunos.setText(String.valueOf(FGestaoAluno.turma.size()));
                    textFieldMediaTurma.setText(String.valueOf(t.Media()));
                    textFieldNAlunos3Neg.setText(String.valueOf(t.NAlunos3MaisNeg()));
                    textFieldNotaMaisAlta.setText(String.valueOf(t.NotaMaisAlta()));
                }
                else
                    JOptionPane.showMessageDialog(null,
                            "Dados incompletos! Introduza a designação e atribua os alunos," +
                            " por favor!");
            }
        });
        atribuirAlunosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(Aluno a: FGestaoAluno.turma )
                    textAreaAlunosTurma.append(a.toString()+"\n");
            }
        });
    }
    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Gestão de Turmas");
        frame.setContentPane(new FGestaoTurmas().PanelTurmas);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
//frame.pack();
        frame.setVisible(true);
    }
}

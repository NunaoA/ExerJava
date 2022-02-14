package Ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FPrincipal {
    private JButton buttonAlunos;
    private JButton buttonTurmas;
    private JPanel PanelPrincipal;
    public FPrincipal() {
        buttonAlunos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FGestaoAluno().setVisible(true);
            }
        });
        buttonTurmas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FGestaoTurmas().setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestão de Alunos e Turmas");
        frame.setContentPane(new FPrincipal().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
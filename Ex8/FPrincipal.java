package Ex8;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FPrincipal {
    private JButton buttonGestaoDeJogadores;
    private JButton buttonGestaoDeClubes;
    private JPanel PanelPrincipal;

    public FPrincipal() {
        buttonGestaoDeJogadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FGestaoJogadores();
            }
        });
        buttonGestaoDeClubes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FGestaoJogadores();
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestão de Jogadores e Clubes");
        frame.setContentPane(new FPrincipal().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}

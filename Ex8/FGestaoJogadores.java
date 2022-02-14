package Ex8;

import Ex7.Aluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.Random;

public class FGestaoJogadores {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField textNome;
    private JTextField textIdade;
    private JTextField textMorada;
    private JTextField textPeso;
    private JTextField textAltura;
    private JTextField textRenumeracao;
    private JTextField textPosicao;
    private JButton buttonCriar;
    private JButton buttonAlterar;
    private JButton buttonProcurar;
    public static Jogador jog;
    public static ArrayList<Jogador> jogadors=new ArrayList<Jogador>();
    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Gestão de Jogadores");
        frame.setContentPane(new Ex8.FGestaoJogadores().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 420);
        frame.setLocationRelativeTo(null);
//frame.pack();
        frame.setVisible(true);
    }
}


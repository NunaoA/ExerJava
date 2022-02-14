package Ex7;

import java.util.ArrayList;

public class Turma {
    public String Designacao;
    public ArrayList<Aluno> Alunos;
    public static int nA = 0;
    public Turma() {
    }
    public Turma(String design, ArrayList<Aluno> alunos) {
        this.Designacao = design;
        this.Alunos= (ArrayList<Aluno>) alunos.clone();
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.Alunos= (ArrayList<Aluno>) alunos.clone();
    }
    public void setDesignacao(String designacao) {
        this.Designacao = designacao;
    }
    public String getDesignacao() {
        return this.Designacao;
    }
    public ArrayList<Aluno> getAlunos() {
        return (ArrayList<Aluno>)this.Alunos;
    }
    public double Media() {
        double total = 0;
        for (Aluno a: this.Alunos)
            total += a.Media();
        return (total / this.Alunos.size());
    }
    public int NAlunos3MaisNeg() {
        int nAlunos = 0;
        for (Aluno a: this.Alunos)
            if (a.NNegativas() >= 3)
                nAlunos++;
        return nAlunos;
    }
    public double NotaMaisAlta() {
        double NotaMAlta = 0;
        for (Aluno a: this.Alunos)
            if (a.Media() > NotaMAlta)
                NotaMAlta = a.Media();
        return NotaMAlta;
    }
}
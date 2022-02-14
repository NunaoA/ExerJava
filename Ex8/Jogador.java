package Ex8;

public class Jogador {
    public String Nome;
    public int Idade;
    public String Morada;
    public double Peso;
    public double Altura;
    public String Posicao;
    public double Renumeracao;

    public Jogador() {}
    public Jogador (String nome, int idade, double peso, double altura,String posicao,  double renumeracao){
        this.Nome = nome;
        this.Idade = idade;
        this.Peso = peso;
        this.Altura = altura;
        this.Posicao = posicao;
        this.Renumeracao = renumeracao;
    }

    public String getNome() {
        return (this.Nome);
    }

    public double getIdade() {
        return (this.Idade);
    }

    public String getMorada() {
        return (this.Morada);
    }

    public double getPeso() {
        return (this.Peso);
    }

    public double getAltura() {
        return (this.Altura);
    }

    public String getPosicao() {
        return (this.Posicao);
    }

    public double getRenumeracao() {
        return (this.Renumeracao);
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public void setMorada(String morada) {
        this.Morada = morada;
    }

    public void setPeso(double peso) {
        this.Peso = peso;
    }

    public void setAltura(double altura) {
        this.Peso = altura;
    }

    public void setPosicao(String posicao) {
        this.Posicao = posicao;
    }

    public void setRenumeracao(double renumeracao) {
        this.Renumeracao = renumeracao;
    }

    public double SalarioAnual() {
        double s;
        s = Renumeracao *14;
        return s;
    }

    public double IndiceMassa() {
        double imc = 0;
        imc = Peso/(Altura * Altura);
        return imc;
    }
}

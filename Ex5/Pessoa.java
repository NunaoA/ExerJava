package Ex5;

public class Pessoa {

    public String Nome;
    public double Altura;
    public double Peso;

    public Pessoa(){}
    public Pessoa(String nome, double altura, double peso)
    {
        this.Nome= nome;
        this.Altura = altura;
        this.Peso = peso;
    }

    public String getNome() {
        return (this.Nome);
    }

    public double getAltura() { return (this.Altura);
    }
    public double getPeso() {
        return (this.Peso);
    }

    public void setNome(String nome)
    {
        this.Nome= nome;
    }

    public void setAltura(double altura)
    {
        this.Altura = altura;
    }

    public void setPeso(double peso)
    {
        this.Peso = peso;
    }
}

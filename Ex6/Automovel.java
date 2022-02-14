package Ex6;

public class Automovel {
    public String MarcaA;
    public String ModeloA;
    public double CustoA;

    public Automovel(){}
    public Automovel(String marcaA, String modeloA, double custoA)
    {
        this.MarcaA= marcaA;
        this.ModeloA = modeloA;
        this.CustoA = custoA;
    }

    public String getMarcaA() {
        return (this.MarcaA);
    }

    public String getModeloA() { return (this.ModeloA);
    }
    public double getCustoA() {
        return (this.CustoA);
    }

    public void setMarcaA(String marcaA)
    {
        this.MarcaA = marcaA;
    }

    public void setModeloA(String modeloA) { this.ModeloA = modeloA; }

    public void setCustoA(double custoA)
    {
        this.CustoA = custoA;
    }
}

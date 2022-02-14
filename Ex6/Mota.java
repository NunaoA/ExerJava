package Ex6;

public class Mota {
    public String MarcaM;
    public String ModeloM;
    public double CustoM;

    public Mota(){}
    public Mota(String marcaM, String modeloM, double custoM)
    {
        this.MarcaM= marcaM;
        this.ModeloM = modeloM;
        this.CustoM = custoM;
    }

    public String getMarcaM() {
        return (this.MarcaM);
    }

    public String getModeloM() { return (this.ModeloM);
    }
    public double getCustoM() {
        return (this.CustoM);
    }

    public void setMarcaM(String marcaM)
    {
        this.MarcaM = marcaM;
    }

    public void setModeloM(String modeloM) { this.ModeloM = modeloM; }

    public void setCustoM(double custoM)
    {
        this.CustoM = custoM;
    }
}

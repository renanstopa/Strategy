public class Disciplina {

    private ICalcMedia calcular;
    private String Nome;
    private double P1;
    private double P2;
    private double Media;
    private String Situacao;

    Disciplina(ICalcMedia calc){
        this.calcular = calc;
    }

    void calcularMedia(){
        Media = calcular.calculaMedia(P1, P2);
        Situacao = calcular.situacao(Media);
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public void setP1(double P1){
        this.P1 = P1;
    }

    public void setP2(double P2){
        this.P2 = P2;
    }

    public String getNome(){
        return Nome;
    }

    public double getP1(){
        return P1;
    }

    public double getP2(){
        return P2;
    }

    public double getMedia(){
        return Media;
    }

    public String getSituacao(){
        return Situacao;
    }

}

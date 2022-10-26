public class Main {
    public static void main(String[] args) {

        ICalcMedia calculo = new Aritmetica();
        Disciplina d = new Disciplina(calculo);

        d.setNome("Engenharia de Software III");
        d.setP1(5);
        d.setP2(7);
        d.calcularMedia();

        System.out.println(String.format("Disciplina: %s \nP1: %.2f P2: %.2f \nMédia: %.2f \nSituação: %s",
                d.getNome(), d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}
package polimorphus;

public class Soma extends OperacaoMatematica {
    @Override
    public double calcular(double x, double y) {
        return x + y;
    }
}

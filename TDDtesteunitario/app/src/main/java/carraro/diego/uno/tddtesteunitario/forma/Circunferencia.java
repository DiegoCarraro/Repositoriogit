package carraro.diego.uno.tddtesteunitario.forma;

public class Circunferencia extends Forma {
    public static final int TAMANHO_ARRAY_INFO_CALCULO_AREA = 1;
    private static final int EXPOENTE_2 = 2;
    private static final int POSICAO_ZERO = 0;


    public Circunferencia() {
        super(TAMANHO_ARRAY_INFO_CALCULO_AREA);
    }

    public int getTamanhoArrayInfoCalculoArea() {
        return TAMANHO_ARRAY_INFO_CALCULO_AREA;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getMedida(POSICAO_ZERO), EXPOENTE_2);
    }

    @Override
    public double area(double pi) {
        return 0;
    }
}

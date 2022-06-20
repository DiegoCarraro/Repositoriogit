package carraro.diego.uno.conceitosclassesabstrataseinterfaces.formas;

import static java.lang.Math.PI;

public class Circunferencia extends Forma {
    public Circunferencia(double raio) {
        super(1); // uso obrigatorio do construtor da superclasse
        setRaio(raio); // ajuste da medida do raio
    }

    // implementação do metodo abstrato area()
    @Override
    public double area() {
        return PI * Math.pow(getMedida(0), 2);
    }

    // novo metodo para ajuste do raio
    public void setRaio(double raio) {
        setMedida(0, raio);
    }

    // Adicaoo para exemplo 3.68
    // comparador estático
    public static int comparador(Circunferencia a, Circunferencia b) {
        return (int) (a.area() - b.area());
    }

    // comparador não-estático
    public int comparador2(Circunferencia b) {
        return (int) (this.area() - b.area());
    }
}
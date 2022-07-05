package carraro.diego.uno.tddtesteunitario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import carraro.diego.uno.tddtesteunitario.forma.Triangulo;


public class TrianguloTest {
    public static final double LADO_1 = 1;
    public static final double LADO_2 = 2;
    public static final double LADO_3 = 3;
    double DIFERENCA_ACEITAVEL        = 0.0001;
    private static Triangulo triangulo = new Triangulo(1);

    public TrianguloTest() {}

    @Before
    public void objeto(){
        triangulo = new Triangulo(3);
    }

    @Test
    public void deveriaCalcularUmTriangulo(){
        double areaPapel           = 1.732;
        double DIFERENCA_ACEITAVEL = 0.0001;

        //lados do triangulo
        triangulo.setMedidas(0, 2);
        triangulo.setMedidas(1, 2);
        triangulo.setMedidas(2, 2);

        double perimetro = triangulo.getMedida(0) + triangulo.getMedida(1) + triangulo.getMedida(2);

        double semiPerimetro = perimetro / 2;

        double area1 = semiPerimetro * (semiPerimetro - triangulo.getMedida(0)) * (semiPerimetro - triangulo.getMedida(1))
                * (semiPerimetro - triangulo.getMedida(2));

        double areaFinal = Math.sqrt(area1);

        assertEquals("A área do triângulo é: ", areaPapel, areaFinal, DIFERENCA_ACEITAVEL);
    }

}





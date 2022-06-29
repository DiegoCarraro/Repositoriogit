package carraro.diego.uno.tddtesteunitario;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import carraro.diego.uno.tddtesteunitario.forma.Circunferencia;


public class CircunferenciaTest {
    private static final Circunferencia circunferencia = new Circunferencia();
    public static final int POSICAO_ZERO = 0;
    public static final int EXPOENTE_2 = 2;
    private static final int PRECISAO_4_CASAS_DECIMAIS = 4;




    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidas() {

        circunferencia.setMedidas(0, 3);

        //Posição ZERO por se tratar de uma circunferência que precisa de apenas uma informação p/ calcular a área
        double raio = circunferencia.getMedida(0);

        boolean x = raio > 0;

        assertTrue(x);
        //assertEquals(true, raio > 0);
    }

    @Test
    public void deveriaTerUmLimiteDeTamanhoOVetorDeInformacoesDoCalculoDaArea() {
        // boolean tamanhoValido = circunferencia.setMedidas(0, 3) > circunferencia;
        circunferencia.getTamanhoArrayInfoCalculoArea();


    }

    @Test
    public void deveriaCalcularAreaDaCircunferencia() {
        /*O calculo da área de uma circunferencia é dad pela fórmula; A= PI * Raio ao quadrado*/
        int PRECISAO_4_CASAS_DECIMAIS = 4;
        double area_raio3 = 28.2743;
        double area_raio4 = 50.2655;
        double area_raio5 = 78.5398;

        //Raio armazenado na estrutura de dados da classe Pai ( Forma ).
        circunferencia.setMedidas(POSICAO_ZERO,5);

    double area = Math.PI * Math.pow(circunferencia.getMedida(POSICAO_ZERO), EXPOENTE_2);

     //assertEquals("A área de uma circunferência de raio3 é 28,2743", area_raio3,area,PRECISAO_4_CASAS_DECIMAIS");
     //assertEquals("A área de uma circunferência de raio3 é 50,2655, area_raio4,area,PRECISAO_4_CASAS_DECIMAIS");
     assertEquals("A área de uma circunferência de raio 5 é 78,5398", area_raio5,area,PRECISAO_4_CASAS_DECIMAIS);
    }


}

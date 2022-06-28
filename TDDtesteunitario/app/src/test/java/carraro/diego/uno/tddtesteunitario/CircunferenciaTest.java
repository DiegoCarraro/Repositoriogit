package carraro.diego.uno.tddtesteunitario;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import carraro.diego.uno.tddtesteunitario.forma.Circunferencia;


public class CircunferenciaTest {
    private static  Circunferencia circunferencia = new Circunferencia(1);;


    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidas(){

        circunferencia.setMedidas(0, 3);

        //Posição ZERO por se tratar de uma circunferência que precisa de apenas uma informação p/ calcular a área
        double raio = circunferencia.getMedida(0);

        boolean x =  raio > 0;

        assertTrue(x);
        //assertEquals(true, raio > 0);
    }

    @Test
    public void deveriaTerUmLimiteDeTamanhoOVetorDeInformacoesDoCalculoDaArea(){
        //boolean tamanhoValido = circunferencia.setMedidas(0, 3) > circunferencia.;
        circunferencia.getTamanhoArrayInfoCalculoArea();
    }


}

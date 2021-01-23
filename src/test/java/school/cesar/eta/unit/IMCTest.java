package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMCTest {
    private IMC imc = new IMC();

    @Test
    public void calculateIMC_IMC30_obeso(){
        int imc = 30;

        String actual = IMC.calculateIMC(30);
        Assertions.assertEquals("Obeso", actual);
    }

//    @Test
//    public void calculateIMC_IMC25_acimaPeso(){
//        int imc = 25;
//
//        String actual = IMC.calculateIMC(25);
//        Assertions.assertEquals("Acima do Peso", actual);
//    }
}

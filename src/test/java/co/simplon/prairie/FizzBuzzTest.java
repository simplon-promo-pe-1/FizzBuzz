package co.simplon.prairie;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Classe de tests de la classe FizzBuzz
 */
public class FizzBuzzTest {

    @Test
    public void la_correspondance_de_0_est_0() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 0 doit etre 0.",
                "0",
                fizzBuzz.determinerCorrespondance(0)
        );
    }
    
    @Test
    public void la_correspondance_de_15_est_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 15 doit etre FizzBuzz.",
                "FizzBuzz",
                fizzBuzz.determinerCorrespondance(15)
        );
    }

    @Test
    public void la_correspondance_de_3_est_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 3 doit etre Fizz.",
                "Fizz",
                fizzBuzz.determinerCorrespondance(3)
        );
    }

    @Test
    public void la_correspondance_de_5_est_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 5 doit etre Buzz.",
                "Buzz",
                fizzBuzz.determinerCorrespondance(5)
        );
    }
    
    @Test
    public void la_correspondance_de_12_est_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 12 doit etre Fizz.",
                "Fizz",
                fizzBuzz.determinerCorrespondance(12)
        );
    }
    
    @Test
    public void la_correspondance_de_10_est_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 10 doit etre Buzz.",
                "Buzz",
                fizzBuzz.determinerCorrespondance(10)
        );
    }
    
    @Test
    public void la_correspondance_de_9_est_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 9 doit etre Fizz.",
                "Fizz",
                fizzBuzz.determinerCorrespondance(9)
        );
    }
    
    @Test
    public void la_correspondance_de_7_est_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 7 doit etre 7.",
                "7",
                fizzBuzz.determinerCorrespondance(7)
        );
    }
}

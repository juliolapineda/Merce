import static org.junit.Assert.*;

import org.junit.Test;


public class SumaTest {

	//primer cambio del código
	//modificación del código
	
	@Test
	   public void sumaPositivos() {
	      System.out.println("Sumando dos números positivos ...");
	       Suma S = new Suma(2, 3);
	       assertTrue(S.sumar() == 5);
	   }

	   @Test
	   public void sumaNegativos() {
	       System.out.println("Sumando dos números negativos ...");
	       Suma S = new Suma(-2, -3);
	       assertTrue(S.sumar() == -5);
	   }

	   @Test
	   public void sumaPositivoNegativo() {
	       System.out.println("Sumando un número + y un número - ...");
	       Suma S = new Suma(2, -3);
	       assertTrue(S.sumar() == -1);
	   }

}

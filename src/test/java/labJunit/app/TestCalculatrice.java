package labJunit.app;

import static org.junit.Assert.assertEquals;

public class TestCalculatrice {
    
        @Test
        public void testSomme() {
            Calculatrice c = new Calculatrice();
            Calculatrice s;
            assertEquals(5.0, s.somme(2, 3));
        }
    
        @Test
        public void testProduit() {
            Calculatrice c = new Calculatrice();
            Calculatrice p;
            assertEquals(5.0, p.produit(2, 3));
        }
    
}

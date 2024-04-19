package labJunit.app;

public class Main {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();

		double s = c.somme(2, 3);
		System.out.println("La somme de 2 et 3 est : " + s); // doit afficher "La somme de 2 et 3 est : 5.0"

		double p = c.produit(2, 3);
		System.out.println("Le produit de 2 et 3 est : " + p); // doit afficher "Le produit de 2 et 3 est : 6.0"

	}

}

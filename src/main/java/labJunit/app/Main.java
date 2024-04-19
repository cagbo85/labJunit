package labJunit.app;

public class Main {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();

		double s = c.somme(2, 3);
		System.out.println("La somme de 2 et 3 est : " + s);

		double p = c.produit(2, 3);
		System.out.println("Le produit de 2 et 3 est : " + p);

		CompteBancaire cb = new CompteBancaire();
		System.out.println("Le solde est : " + cb.getSolde());
		double z = cb.crediterSolde(10, 5);
		System.out.println("Le solde après crédit de 5 est : " + z);
		double q = cb.debiterSolde(5, 5);
		System.out.println("Le solde après débit de 5 et crédit de 5 est : " + q);
	}

}

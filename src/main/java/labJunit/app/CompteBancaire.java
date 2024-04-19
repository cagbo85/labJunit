package labJunit.app;

public class CompteBancaire {
	
	public CompteBancaire() {
		System.out.println("Bienvenue");
	}

	private double solde;

	public double debiterSolde(double solde, double montant) {
		return solde + montant;
	}

	public double crediterSolde(double solde, double montant) {
		return solde - montant;
	}

	public double getSolde() {
		return this.solde;
	}
}

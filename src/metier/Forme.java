package metier;

public abstract class Forme {

	/**
	 * Calcul le perimetre
	 * @return perimetre
	 */
	public abstract float perimetre();
	
	/**
	 * Calcul l'aire
	 * @return surface
	 */
	public abstract float surface();
	
	/**
	 * Methode qui calcul le coefficient d'etalement
	 * @return coefficient d'etalement
	 */
	public double coefficientEtalement() {
		double lePerimetre = perimetre();
		return 16 * surface() /	(lePerimetre * lePerimetre);
	}
	
}

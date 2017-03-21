package metier;

public class Ellipse extends Forme {
	private int petitAxe;
	private int grandAxe;
	
	
	/**
	 * Constructeur de Ellipse
	 * @param petitAxe petit axe de l'ellipse
	 * @param grandAxe grand axe de l'ellipse
	 */
	public Ellipse(int petitAxe, int grandAxe) {
		super();
		this.petitAxe = petitAxe;
		this.grandAxe = grandAxe;
	}

	@Override
	public float perimetre() {
		/* wikipedia
		La difficulté de ces calculs a conduit à développer des approximations.
		La deuxième proposée, plus précise, est l'œuvre de Ramanujan13 :
		π * [3(a+b) - sqrt((3a + b)(a + 3b))]
		 */
		float a = grandAxe;
		float b = petitAxe;
		double resultat = Math.PI * (3*(a+b) - Math.sqrt((double)((3*a+b)*(a+3*b))));
		return (float)resultat;
	}

	@Override
	public float surface() {
		// wikipedia A = π × demi-grand axe × demi-petit axe
		return (float) (Math.PI * petitAxe * grandAxe);
	}

	@Override
	public String toString() {
		return "Ellipse [petitAxe=" + petitAxe + ", grandAxe=" + grandAxe + "]";
	}

	public int getPetitAxe() {
		return petitAxe;
	}

	public void setPetitAxe(int petitAxe) {
		this.petitAxe = petitAxe;
	}

	public int getGrandAxe() {
		return grandAxe;
	}

	public void setGrandAxe(int grandAxe) {
		this.grandAxe = grandAxe;
	}
	

}

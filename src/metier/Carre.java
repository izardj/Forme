package metier;

public class Carre extends Forme {

	private int cote;
	
	/**
	 * Constructeur de Carre
	 * @param cote	longueur du cote
	 */
	public Carre(int cote) {
		super();
		this.cote = cote;
	}

	@Override
	public float perimetre() {
		return 4 * cote;
	}

	@Override
	public float surface() {
		return cote * cote;
	}

	@Override
	public String toString() {
		return "Carre [cote=" + cote + "]";
	}

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}
}

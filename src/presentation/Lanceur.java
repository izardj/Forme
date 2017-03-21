package presentation;

import metier.Carre;
import metier.Ellipse;
import metier.Rectangle;

public class Lanceur {

	public Lanceur() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carre c = new Carre(8);
		System.out.println(c);
		System.out.println("Le perimetre du carre est: " + c.perimetre());
		System.out.println("La surface du carre est: " + c.surface());
		System.out.println("Le coef. d'etalement du carre est: " + c.coefficientEtalement());
		
		System.out.println("----------------------------------------------");
		Rectangle r = new Rectangle(25, 7);
		System.out.println(r);
		System.out.println("Le perimetre du rectangle est: " + r.perimetre());
		System.out.println("La surface du rectangle est: " + r.surface());
		System.out.println("Le coef. d'etalement du rectangle est: " + r.coefficientEtalement());
		
		System.out.println("----------------------------------------------");
		Ellipse e = new Ellipse(10, 5);
		System.out.println(e);
		System.out.println("Le perimetre de l'ellipse est: " + e.perimetre());
		System.out.println("La surface de l'ellipse est: " + e.surface());
		System.out.println("Le coef. d'etalement de l'ellipse est: " + e.coefficientEtalement());
	}

}

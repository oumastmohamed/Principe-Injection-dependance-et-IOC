package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Statique {
	public static void main(String[] args){
		/*
		 * Injection de dépendance par instanciation statique
		 */
		//Partie 1 : (Instanciation Statique)
		DaoImpl dao = new DaoImpl();
		MetierImpl metier = new MetierImpl();
		
		//Partie 2 :
		metier.setDao(dao);
		System.out.println(metier.calcul());
	}
}

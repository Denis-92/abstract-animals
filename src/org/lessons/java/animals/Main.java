package org.lessons.java.animals;

public class Main {

	public static void main(String[] args) {
		
		// ESERCIZIO 1
		
		Cane testCane = new Cane ();
		
		System.out.println("Oggetto: Cane");
		testCane.dormi();
		testCane.verso();
		testCane.mangia();
		
		System.out.println();
		
		Passerotto testPasserotto = new Passerotto ();
		
		System.out.println("Oggetto: Passerotto");
		testPasserotto.dormi();
		testPasserotto.verso();
		testPasserotto.mangia();
		
		System.out.println();
		
		Aquila testAquila = new Aquila ();
		
		System.out.println("Oggetto: Aquila");
		testAquila.dormi();
		testAquila.verso();
		testAquila.mangia();
		
		System.out.println();
		
		Delfino testDelfino = new Delfino ();
		
		System.out.println("Oggetto: Delfino");
		testDelfino.dormi();
		testDelfino.verso();
		testDelfino.mangia();
		
		// ------
		// ESERCIZIO 2
		
		System.out.println("-----ESERCIZIO 2");
		
		Azione azione = new Azione();
		
		System.out.print("Test faiVolare con aquila: ");
		azione.faiVolare(testAquila);
		System.out.print("Test faiNuotare con delfino: ");
		azione.faiNuotare(testDelfino);
		
		
		
//		if (arrayAnimali instanceof Inuotante)
//			azione.faiNuotare(arrayAnimali);
//		else
//			azione.faiVolare(arrayAnimali);
		

	}

}

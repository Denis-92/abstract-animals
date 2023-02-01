package org.lessons.java.animals;

public class Passerotto extends Animale implements Ivolante {
	
	public void verso() {
		System.out.println("Cip cip");
	}
	
	public void mangia()  {
		System.out.println("Mangio semi o cereali");
	}
	
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}

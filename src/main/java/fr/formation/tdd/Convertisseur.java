package fr.formation.tdd;

public class Convertisseur {

	static int[] NOMBRES_ARABES = {1000, 900, 500, 400,  100, 90, 50, 40, 10, 9, 5, 4, 1};
	static String[] NOMBRES_ROMAINS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
	public static String convert(int nombre) {
		String chaine = "";

		for(int i = 0 ; i < NOMBRES_ARABES.length ; i++) {
			while(nombre >= NOMBRES_ARABES[i]) {
				chaine += NOMBRES_ROMAINS[i];
				nombre -= NOMBRES_ARABES[i];
			}
		}
		return chaine;
	}

}

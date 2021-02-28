package fr.formation.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConvertisseurTest {


	
	@Test
	public void testConvertir1() {
		
		assertEquals("I", Convertisseur.convert(1));
	}
	/*
	  Creation de la classe
	 
		package fr.formation.tdd;
		
		public class Convertisseur {
		
			public static String convert(int i) {
				return null;
			}
		
		}
	
	
		fail
		
	public static String convert(int i) {
		return "I";
	}
	
	 
	 */
	
	
	@Test
	public void testConvertir2() {
		
		assertEquals("II", Convertisseur.convert(2));
	}
	
/*
	public static String convert(int i) {
		if (i == 1)
			return "I";
		return "II";
	}

*/	
	
	
	@Test
	public void testConvertir3() {
		
		assertEquals("III", Convertisseur.convert(3));
	}
	
/*
	public static String convert(int i) {
		if (i == 1)
			return "I";
		else if (i == 2)
			return "II";
		else
			return "III";
	}


	Refactoring  : 
	************
	
	public static String convert(int nombre) {
		String chaine = "";
		
		while(nombre-- > 0) {
			chaine += "I";
		}
		return chaine;
	}

*/
	
	@Test
	public void testConvertir10() {
		
		assertEquals("X", Convertisseur.convert(10));
	}
	
/*	
	public static String convert(int nombre) {
		
		if (nombre == 10)
			return "X";
		
		String chaine = "";
		
		while(nombre-- > 0) {
			chaine += "I";
		}
		return chaine;
	}
*/	
	
	
	@Test
	public void testConvertir20() {
		
		assertEquals("XX", Convertisseur.convert(20));
	}
	
/*	
	public static String convert(int nombre) {
		String chaine = "";

		while(nombre >= 10) {
			chaine += "X";
			nombre -= 10;
		}

		while(nombre-- > 0) {
			chaine += "I";
		}
		return chaine;
	}

	Refactoring  1 : 
	************

	public static String convert(int nombre) {
		String chaine = "";

		while(nombre >= 10) {
			chaine += "X";
			nombre -= 10;
		}

		while(nombre >= 1) {
			chaine += "I";
			nombre -= 1;
		}
		return chaine;
	}
	
	
	
	Refactoring  2 : 
	************
	

	static int[] NOMBRES_ARABES = {10, 1};
	static String[] NOMBRES_ROMAINS = {"X", "I"};
	
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
	
*/	
	
	
	
	@Test
	public void testConvertir11() {
		
		assertEquals("XI", Convertisseur.convert(11));
	}
/*
 	OK
*/	
	
	
	@Test
	public void testConvertir23() {
		
		assertEquals("XXIII", Convertisseur.convert(23));
	}
/*
 	OK
*/	
	
	
	@Test
	public void testConvertir5() {
		
		assertEquals("V", Convertisseur.convert(5));
	}
/*
 		static int[] NOMBRES_ARABES = {10, 5, 1};
	static String[] NOMBRES_ROMAINS = {"X", "V", "I"};

*/	
	
	
	
	
	@Test
	public void testConvertir8() {
		
		assertEquals("VIII", Convertisseur.convert(8));
	}
/*
 		OK

*/	
	
	
	
	@Test
	public void testConvertir36() {
		
		assertEquals("XXXVI", Convertisseur.convert(36));
	}
/*
 		OK

*/	
	
	@Test
	public void testConvertir1505() {
		
		assertEquals("MDV", Convertisseur.convert(1505));
	}
/*
 	
	static int[] NOMBRES_ARABES = {1000, 500, 10, 5, 1};
	static String[] NOMBRES_ROMAINS = {"M", "D", "X", "V", "I"};

*/	
	
	@Test
	public void testConvertir255() {
		
		assertEquals("CCLV", Convertisseur.convert(255));
	}
/*
 	
	static int[] NOMBRES_ARABES = {1000, 500, 100, 50, 10, 5, 1};
	static String[] NOMBRES_ROMAINS = {"M", "D", "C", "L", "X", "V", "I"};

*/	
	
	
	@Test
	public void testConvertir4() {
		
		assertEquals("IV", Convertisseur.convert(4));
	}
/*
 	
	static int[] NOMBRES_ARABES = {1000, 500, 100, 50, 10, 5, 4, 1};
	static String[] NOMBRES_ROMAINS = {"M", "D", "C", "L", "X", "V", "IV", "I"};

*/	
	
	
	@Test
	public void testConvertir9() {
		
		assertEquals("IX", Convertisseur.convert(9));
	}
/*
 	
	static int[] NOMBRES_ARABES = {1000, 500, 100, 50, 10, 5, 4, 1};
	static String[] NOMBRES_ROMAINS = {"M", "D", "C", "L", "X", "V", "IV", "I"};

*/	
	
	
	@Test
	public void testConvertir1954() {
		
		assertEquals("MCMLIV", Convertisseur.convert(1954));
	}
	
	@Test
	public void testConvertir2499() {
		
		assertEquals("MMCDXCIX", Convertisseur.convert(2499));
	}
	
	
	@Test
	public void testConvertir3944() {
		
		assertEquals("MMMCMXLIV", Convertisseur.convert(3944));
	}
	
	
	@Test
	public void testConvertir2001() {
		
		assertEquals("MMI", Convertisseur.convert(2001));
	}
	
	
}

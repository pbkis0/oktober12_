package oktober12_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class elsoFeladat {
	static Scanner beolvas = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj programot, amely egész számokat kér be a képernyorol egészen addig,
míg a felhasználó 11-et nem ad meg! Ezután írd ki, hányadik számként
kaptuk a 11-est! */
		int szam = 0;
		int szamlalo = 0;
		
		try {
			while (szam != 11) { //feltétel
				System.out.println("Adj meg egy számot: ");
				szam = beolvas.nextInt();
				szamlalo++;
			}
			System.out.println("A 11-es a(z) "  + szamlalo + ". volt!");
		} catch  (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Hiba történt a programban.");
		}
	}
		
	}



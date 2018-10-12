package oktober12_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class masodikFeladat {
	static Scanner beolvas = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj programot, amely beolvas egy egész számot, és eldönti róla, hogy
osztható-e 2-vel vagy 3-mal!*/
		try {
			System.out.println("Adj meg egy számot: ");
			int szam = beolvas.nextInt();
			boolean paros = (szam % 2 == 0);
			if (szam % 3 == 0) {
				if (paros) {
					System.out.println("A szám osztható 2-vel és 3-mal!");
				} else {
					System.out.println("A szám osztható 3-mal, de 2-vel nem!");
				}
			} else {
				if (paros) {
					System.out.println("A szám osztható 2-vel de 3-mal nem!");
				} else {
					System.out.println("A szám nem osztható 2-vel se 3-al!");
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.out.println("Hiba történt a programban.");;
		}
	}

}

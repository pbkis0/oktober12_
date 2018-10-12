package oktober12_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class harmadikFeladat {
	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Írj programot, amely bekér 3 egész számot, és eldönti, hogy melyik a
legnagyobb! Majd írja ki azt is, hogy igaz-e, hogy mindhárom szám
osztható hárommal!*/
		try {
			System.out.print("1) szám: ");
			int szam1 = beolvas.nextInt();
			System.out.print("2) szám: ");
			int szam2 = beolvas.nextInt();
			System.out.print("3) szám: ");
			int szam3 = beolvas.nextInt();
			
			int max = szam1;
			if(szam2 > max) {
				max = szam2;
			}
			if(szam3 > max) {
				max = szam3;
			}
			System.out.println("A legnagyobb szám " + max);
			if(szam1 % 3 == 0 && szam2 % 3 == 0 && szam3 % 3 == 0) {
				System.out.println("Mind a három szám osztható 3-al!");
			} else {
				System.out.println("Nem osztatható mind 3-mal!");
			}
			
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Hiba történt a programban.");
		}
	}

}

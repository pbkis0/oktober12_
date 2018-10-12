package oktober12_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class otodikFeladat {
	static Scanner beolvas = new Scanner(System.in);
	public static void main(String[] args) {
	/*Írj programot, amely bekér 5 egész számot, és eldönti róluk, hogy mértani
sorozatot alkotnak-e!
Segítség: mértani sorozatnak nevezzük azt a sorozatot, melyben (a
második tagtól) bármely tag és az azt megelozo tag hányadosa állandó; pl.:
1 2 4 8 16 32. . . ; 3 9 27 81 243. . . ;7 70 700 7000 70 000. . . */
		// TODO Auto-generated method stub
		try {
			System.out.print("1) szám: ");
			int szam1 = beolvas.nextInt();
			System.out.print("2) szám: ");
			int szam2 = beolvas.nextInt();
			System.out.print("3) szám: ");
			int szam3 = beolvas.nextInt();
			System.out.print("4) szám: ");
			int szam4 = beolvas.nextInt();
			System.out.print("5) szám: ");
			int szam5 = beolvas.nextInt();
			
			double hanyados = (double) szam2 / szam1;
			
			if(szam3 / szam2 == hanyados && szam4 / szam3 == hanyados && szam5 / szam4== hanyados) {
				System.out.println("Mértani sorozat!");
			}else {
				System.out.println("Nem mértani sorozat!");
			}
			
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
	
		}
			
	}

}

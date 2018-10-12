package oktober12_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class negyedikFeladat {
	static Scanner beolvas = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Írj programot, amely bekér 5 egész számot és eldönti róluk, hogy
Fibonacci-sorozatot alkotnak-e!
Segítség: a Fibonacci-sorozat minden eleme az elozo két elem összege, pl.:
5 6 11 17 28 45. . . ) */
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
			
			if(szam3 == szam1 + szam2 && szam4 == szam2 + szam3 && szam5 == szam3 + szam4) {
				System.out.println("Fibonacci sorozat!");
			}else {
				System.out.println("Nem Fibonacci sorozat");
			}
			
			
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Hiba történt a programban.");
		}
				
			
			
				
		
		

	}

}

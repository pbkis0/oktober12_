package oktober12_;

import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner beolvas = new Scanner(System.in);
		System.out.print("Kérek egy szót: ");
		String beolvasottadat = beolvas.nextLine(); // <- több; next() -egy
		System.out.println(beolvasottadat);
		beolvas.close(); */
		/*
		try {
			System.out.print("Kérek egy számot: ");
			int szam = beolvas.nextInt();
			double eredmeny = (double) 1 / szam;
			System.out.println("A szám recipróka: ");
			System.out.println(eredmeny);
		} catch (InputMismatchException e) {
			System.out.println("Hibás szám formátum! \n Számot kérek!");
		}
		beolvas.close(); */
		
		
		/*1, feladat Írj programot, amely egész számokat kér be a képernyorol egészen addig,
míg a felhasználó 11-et nem ad meg! Ezután írd ki, hányadik számként
kaptuk a 11-est! */
		
		
		
			int szam = 0;
			int szamlalo = 0;
			
			try {
				while (feltetel) { //feltétel
					System.out.println("Adj meg egy számot: ");
				}
				System.out.println("A 11-es a(z) "); + szamlalo + ". volt!";
			} catch  (InputMismatchException e) {
				System.err.println("Nem számot adtál meg!");
			} catch (Exception e) {
				System.err.println("Hiba történt a programban.");
			}
		}
		
		
		}
		
	}



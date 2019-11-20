package Test;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		/*Ukoliko kupac kupi robu u iznosu vecem od 1500 dinara, dobija 10% popusta,
		 *  a ukoliko kupi robu u iznosu vecem od 7000 dinara dobija 20% popusta.
		 *   Napisati program koji ce za uneti iznos odabrane robe ispisati koliko 
		 *   zapravo treba platiti.
		 */
Scanner sk=new Scanner(System.in);
double racun;
System.out.println("Unesite vrednost racuna: ");
racun=sk.nextDouble();

 if(racun>0) {
	if(racun>1500 && racun<=7000) 
		racun=racun*0.9;
	if(racun>7000)
		racun=racun*0.8;
	System.out.println("Vas iznos racuna je:" + racun + " din.");
 }else if(racun <= 0) {
	 System.out.println("Uneli ste neodgovarajuci broj!");
 }
	sk.close();



	}

}

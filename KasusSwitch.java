//7. Kode Program  

import java.util.Scanner; 
 
public class KasusSwitch { 
 
	/** 
	* @param args 
	*/ 
 
	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	/* Kamus */  
	char cc; 
	Scanner masukan=new Scanner(System.in); 
  
	/* Program */ 
	System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n");  
	cc=masukan.next().charAt(0); 
  
		switch (cc) { 
			case 'a': { System.out.print (" Yang anda ketik adalah a \n"); 
				break;} 
			case 'u': { System.out.print (" Yang anda ketik adalah u \n"); 
				break;} 
			case 'e': { System.out.print (" Yang anda ketik adalah e \n"); 
				break;} 
			case 'i': { System.out.print (" Yang anda ketik adalah i \n"); 
				break;} 
			case 'o': { System.out.print (" Yang anda ketik adalah o \n"); 
				break;} 
		default: 
			System.out.print (" Yang anda ketik adalah huruf mati \n"); 
		} 
	} 
}

/*
outpur: (dgn pakai return)
Ketikkan sebuah huruf, akhiri dengan RETURN
a return
 Yang anda ketik adalah a 
 
output: tanpa return)
Ketikkan sebuah huruf, akhiri dengan RETURN
q
Yang anda ketik adalah huruf mati

penjelasan:
pada percabangan di atas mengambil kondisi dengan huruf inputan yang mana huruf itu akan dibandingan dengan variabel pembanding
dari case 'a' 'i' 'u' 'e' 'o'. jika inputan sama dengan variabel pembanding maka output yang tampil berupa "Yang diketik adalah 
(huruf yang di inputkan)" dan break atau memberhentikan program itu, bila perbandingannya salah maka akan menjalankan perintah yang ada pada default.
*/
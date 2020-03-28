//8. Kode Program 

import java.util.Scanner; 
 
/* Membaca jari-jari, menghitung luas lingkaran */  
/* latihan pemakaian konstanta */ 

public class Konstant { 
 
	/** 
	* @param args 
	*/ 
 
	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	/* Kamus */ 
	final float PHI = 3.1415f;  
	float r; 
	Scanner masukan=new Scanner(System.in); 
 
	/* program */ /* baca data */ 
 
	System.out.print ("Jari-jari lingkaran =");  
	r = masukan.nextFloat(); 
	
	/* Hitung dan tulis hasil */  
	System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");  
	System.out.print ("Akhir program \n");  
	} 
} 

/*
output:
Jari-jari lingkaran =13
Luas lingkaran = 530.9135
Akhir program

penjelasan:
konstanta yang dipakai disini adalah PHI. menggunakan keyword final karena berarti bahwa nilai sebuah konstanta tidak dapat berubah.
memberikan inputan untuk variabel r atau jari-jari. kemudian melakukan proses perhitungan yang mana jika mencari luas lingkaran dengan
PHI * r * r. dan hasil dari perhitangan itu akan muncul pada output
*/
//4. Kode Program 

import java.util.Scanner; 
 
/* contoh pemakaian IF dua kasus komplementer */  
/* Membaca sebuah nilai, */ 
/* menuliskan 'Nilai a positif , nilai a', jika a >=0 */ 
/* 'Nilai a negatif , nilai a', jika a <0 */ 
 
public class If2 { 
 
 
	/** 
	* @param args 
	*/ 
 
	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	/* Kamus */ 
	int a; 
	Scanner masukan=new Scanner(System.in); 
  
	/* Program */ 
	System.out.print ("Contoh IF dua kasus \n"); 
	System.out.print ("Ketikkan suatu nilai integer :");  
	a=masukan.nextInt(); 
 
		if (a >= 0){ 
			System.out.println ("Nilai a positif "+ a); 
		}else /* a< 0 */ { 
			System.out.println ("Nilai a negatif "+ a); 
		} 
	} 
}

/*
output:
Contoh IF dua kasus
Ketikkan suatu nilai integer :1
Nilai a positif 1

penjelasan:
pada kondisi if-else di atas untuk menentukan angka yang dimasukkan itu merupakan bilangan positif atau negatif dengan memberikan kondisi (a >= 0).
jika kondisi itu benar maka output yang tampil adalah nilai a positif bila kondisinya salah maka output yang tampil 
adalah nilai a negatif.
*/
//5. Kode Program        

import java.util.Scanner; 
 
/* contoh pemakaian IF tiga kasus */ 
/* Membaca sebuah nilai, */ 
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */ 
/* 'Nilai Nol , nilai a', jika a = 0 */ 
/* 'Nilai a negatif , nilai a', jika a <0 */ 
 
public class If3 { 
 
	/**   
	* @param args   
	*/ 

	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	/* Kamus */   
	int a;   
	Scanner masukan=new Scanner(System.in);   
	
	/* Program */   
	System.out.print ("Contoh IF tiga kasus \n");    
	System.out.print ("Ketikkan suatu nilai integer :");    
	a=masukan.nextInt();   
	
		if (a > 0){    
			System.out.println ("Nilai a positif "+ a);   
		}else if (a == 0){    
			System.out.println ("Nilai Nol "+ a);  
		}else /* a > 0 */ {    
			System.out.println ("Nilai a negatif "+ a);  
		} 
	} 
} 

/*
output:
Contoh IF tiga kasus
Ketikkan suatu nilai integer :9
Nilai a positif 9

penjelasan:
pada kondisi if-else if di atas untuk menentukan angka yang dimasukkan itu merupakan bilangan positif, nol atau negatif dengan memberikan kondisi if pertama(a > 0).
jika kondisi itu benar maka output yang tampil adalah nilai a positif bila kondisinya salah maka lanjut ke else if dengan kondisi (a==0) jika kondisi itu benar maka 
output yang tampil adalah nilai a nol bila kondisinya salah maka yang tampil adalah nilai a negatif.
*/
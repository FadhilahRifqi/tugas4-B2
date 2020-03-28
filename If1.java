//3. Kode Program 
/* contoh pemakaian IF satu kasus */ 
/* membaca nilai integer, menuliskan nilainya jika positif */  
 
import java.util.Scanner; 
 
public class If1 { 
 
	/** 
	* @param args 
	*/ 

	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	/* Kamus */  
  
	Scanner masukan=new Scanner(System.in); 
	int a; 
	
	/* Program */ 
	System.out.print ("Contoh IF satu kasus \n");  
	System.out.print ("Ketikkan suatu nilai integer : ");  
	a = masukan.nextInt(); 
		if (a >= 0)  
		System.out.print  ("\nNilai a positif "+ a);  
	} 
} 

/*
output:
Contoh IF satu kasus
Ketikkan suatu nilai integer : 3

Nilai a positif 3

penjelasan:
pada kondisi if di atas untuk menentukan angka yang dimasukkan itu merupakan bilangan positif atau negatif dengan memberikan kondisi (a >= 0).
jika kondisi itu benar maka output yang tampil adalah nilai a positif bila kondisinya salah maka output tdk keluar apa-apa
karena tidak ada elsenya atau pengecualiannya.

*/
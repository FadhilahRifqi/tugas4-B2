//17. KOde Program  

import java.util.Scanner; 
 
/* contoh baca nilai x, */ 
/* Jumlahkan nilai yang dibaca dengan WHILE */  

public class PrintXWhile { 
 
	/**   
	* @param args   
	*/ 

	public static void main(String[] args) {  
	// TODO Auto-generated method stub   
	/* Kamus : */    
	int Sum;   
	int x;   
	Scanner masukan=new Scanner(System.in);  

	/* Program */   
	Sum = 0; 
	
	/* Inisialisasi */ 
	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");    
	x = masukan.nextInt();/* First Elmt*/   
	
	while (x != 999) /* Kondisi berhenti */ {    
		Sum = Sum + x; /* Proses */    
		System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");     
		x = masukan.nextInt();/* First Elmt*/   }   
		System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */   
	} 
} 

/*
output:
Masukkan nilai x (int), akhiri dg 999 : 90
Masukkan nilai x (int), akhiri dg 999 : 1
Masukkan nilai x (int), akhiri dg 999 : 34
Masukkan nilai x (int), akhiri dg 999 : 999
Hasil penjumlahan = 125

penjelasan:
pada program printXWhile ini melakukan proses penjumlahan dari nilai-nilia yang di inputkan menggunakan perulangan whila. awalnya sum diberikan nilai 0.
inputkan nilai x masuk pada pengecekkan kondisi perulangan while apakah x tidak sama dengan 999 makan selama kondisi itu benar maka program akan mengeksekusi 
statement yang ada di dalamnya yaitu proses penjumlahan dari nilai x dan nilai x sebelumnya. kemudian inputkan lagi nilai x sampai kondisi itu 
memenuhi dan program akan berhenti dan memunculkan hasil dari penjumlahan-penjumlahan tersebut.
*/
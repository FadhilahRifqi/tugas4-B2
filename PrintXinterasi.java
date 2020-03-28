//15. Kode Program 

import java.util.Scanner; 
 
/* contoh baca nilai x, */ 
/* Jumlahkan nilai yang dibaca dengan ITERATE */  

public class PrintXinterasi { 
 
	/**   
	* @param args   
	*/  
	
	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	/* Kamus : */    
	int Sum=0;   
	int x;   
	Scanner masukan=new Scanner(System.in);   
	
	/* Program */
	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");   
	x = masukan.nextInt(); 
	/* First Elmt */   
	
		if (x == 999){      
			System.out.print ("Kasus kosong \n"); 
		}else{ /* MInimal ada satu data yang dijumlahkan */    
			Sum = x; /* Inisialisasi; invariant !! */    
			for (;;){     
				System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");     
				x = masukan.nextInt(); /* Next Elmt */     
				if(x==999)       
					break;     
				else{      
					Sum = Sum + x; /* Proses */     
				}    
			}      
		}     
	System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */  
	}   
} 

/*
output:
Masukkan nilai x (int), akhiri dg 999 : 89
Masukkan nilai x (int), akhiri dg 999 : 23
Masukkan nilai x (int), akhiri dg 999 : 41
Masukkan nilai x (int), akhiri dg 999 : 11
Masukkan nilai x (int), akhiri dg 999 : 999
Hasil penjumlahan = 164

penjelasan:
pada program printXinterasi ini terdapat percabangan didalam perulangan for dan perulangan itu didalamnya lagi pecabangan. awalnya menginputkan nilai x.
kemudian masuk ke percabangan apakah nilai x bertipe data int yang di masukkan tadi = 999 jika iya maka proses itu akan berhenti dan mengeluarkan output kosong,
jika x tidak sama dengan 999 maka masuk ke perulangan yang mana di mintai lagi untuk memasukkan nilai x dan masuk kek percabangan jika x==999 maka perulangan
itu berhenti. jika kondisinya tidak memenuhi maka melakukan statmen yang ada di dalamnya yaitu  proses perhitungan dimana terdapat variabel sum untuk menampung 
hasil dari proses penjumlahan itu. akan terus melakukan penjumlahan dari nilai-nilai x yang dimasukkan bila kondisi yang diberikan tidak memenuhi. 
perulangan dan penjumlahan x akan berhenti bila x==999. dan hasil yang akan minta untuk tampil adalah hasil penjumlahan dari nilai x yang telah di masukkan tadi.
*/
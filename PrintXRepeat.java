//16. Kode Program 

import java.util.Scanner; 
 
/* contoh baca nilai x, */ 
/* Jumlahkan nilai yang dibaca dengan ITERATE */ 
 
public class PrintXRepeat { 
 
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
	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : "); 
	x = masukan.nextInt(); /* First Elmt */ 
 
		if (x == 999){    
			System.out.print("Kasus kosong \n");   
		}else { /* MInimal ada satu data yang dijumlahkan */ 
			Sum = 0; /* Inisialisasi; invariant !! */   
			do{    
				Sum = Sum + x; /* Proses */   
				System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");    
				x = masukan.nextInt(); /* Next Elmt */   
			} while (x != 999); /* Kondisi pengulangan */ 
		System.out.println  ("Hasil penjumlahan = "+Sum); /* Terminasi */ 
		} 
	} 
}

/*
output:
Masukkan nilai x (int), akhiri dg 999 : 12
Masukkan nilai x (int), akhiri dg 999 : 78
Masukkan nilai x (int), akhiri dg 999 : 56
Masukkan nilai x (int), akhiri dg 999 : 999
Hasil penjumlahan = 146

penjelasan:
pada program printXrepeat ini terdapat perulangan do-while di dalam pecabangan. awalnya menginputkan nilai x. kamudian masuk pada percabangan dengan kondisi
apakah x==999 jika iya maka print kasus kosong dan kemudian program berhenti. jika tidak maka statement yang d dalam else yang dieksekusi 
dimana  variabel sum diberikan nilai awal 0 di dalamnya terdapat perulangan do-while. program mengeksekusi perintah sum+x terlebih dahulu dan menampikannya kemudian setelah
itu mengecek kondisi yang diberikan. dengan kondisi dimana jika x bukan sama dengan 999 maka perulangan itu akan terus berlanjut dan setiap x baru yang diinputkan
akan ditambahkan dengan nilai x yang telah di inputkan sebelumnya. jika kondisi telah memenuhi maka perulangan akan berhenti dan hasil dari proses sum atau proses penjumlahan
tadi akan di tmpilkan.
*/
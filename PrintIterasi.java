//11. Kode Program 

import java.util.Scanner; 
 
/* Baca N, */ 
/* Print i = 1 s/d N dengan ITERATE */  

public class PrintIterasi { 
 
	/**   
	* @param args   
	*/ 

	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	/* Kamus : */    
	int N;   
	int i;   
	Scanner masukan=new Scanner(System.in);   
	
	/* Program */   
	System.out.print ("Nilai N >0 = "); 
	
	/* Inisialisasi*/    
	N = masukan.nextInt(); 
	i = 1; /* First Elmt */   
	
	System.out.print ("Print i dengan ITERATE : \n");    
	
		for (;;){    
			System.out.println(i); 
			/* Proses */     
			if (i == N)      
			/* Kondisi Berhenti */ 
				break;    
			else {      
				i++; /* Next Elmt */     
			}    
		} /* (i == N) */ 
	} 
}

/*
output:
Nilai N >0 = 3
Print i dengan ITERATE :
1
2
3

penjelasan:
pada perulangan di atas terdapat percabangan didalam perulangan itu.
awalnya batas N nya ditentukan oleh penginput dan sudah diberi nilai i terlebih dahulu yaitu dengan nilai 1.
kemudian masuk ke perulangan for di mana perintah pertama untuk dieksekusi adalah menampilkan output i setela itu baru di berikan kondisi pada percabangan yang
ada di dalamnya jika i==N maka perulangan berhenti, jika i tidak sama dengan N maka i tadi terus bertambah 1 atau i++ sampai i==N akan berhenti program tersebut.
*/
//12. Kode Program  

import java.util.Scanner; 
 
public class PrintRepeat { 
 
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
	System.out.print  ("Nilai N >0 = ");    
	
	/* Inisialisasi */    
	N = masukan.nextInt(); 
	i = 1;    /* First Elmt */   
	System.out.print ("Print i dengan REPEAT: \n");   
	
		do{    
			System.out.print (i+"\n"); 
			/* Proses */     
			i++;  /* Next Elmt */   
		} while (i <= N); /* Kondisi pengulangan */   
	} 
} 

/*
output:
Nilai N >0 = 5
Print i dengan REPEAT:
1
2
3
4
5

penjelasan:
perulanga di atas menggunakan do-while di mana statement nya dieksekusi terlebih dahulu baru mengecek kondisinya. 
awalnya batas N nya ditentukan oleh penginput dan sudah diberi nilai i terlebih dahulu yaitu dengan nilai 1.
masuk ke perulangan do-while dimana perintah pertama untuk dieksekusi adalah menampilkan output i setelah itu 
i bertambah 1 atau i++. kemudian mengecek kondisi yang diberikan yaitu apakah (i <= N) jika kondisi itu terpenuhi maka perulangan akan berlanjut
jika tidak terpenuhi sampai i>N maka akan berhenti program tersebut.
*/
//14. Kode Program 

import java.util.Scanner; 
 
/* Baca N, */ 
/* Print i = 1 s/d N dengan while (ringkas) */  

public class PrintWhile1 { 
 
	/**   
	* @param args   
	*/  
	
	public static void main(String[] args) {   
	// TODO Auto-generated method stub  

	/* Kamus : */    
	int N;   
	int i = 1;   
	Scanner masukan=new Scanner(System.in);   
	
	/* Program */ 
	System.out.print ("Nilai N >0 = ");    
	N = masukan.nextInt();   
	System.out.print ("Print i dengan WHILE (ringkas): \n");    
	
		while (i <= N){    
			System.out.println (i++);    
		} /* (i > N)*/ 
	} 
} 

/*
output:
Nilai N >0 = 9
Print i dengan WHILE (ringkas):
1
2
3
4
5
6
7
8
9

penjelasan:
perulangan ini sama dengan perulangan pada program sebelumnya printWhile tapi sintax yang di berikan pada perulangan ini lebih singkat.
yaitu dengan dan langsung memberikan i++ pada perintah tampil output. jadi jika telah di eksekusi untuk menmpilkan output maka dengan 
otomatis akan bertambah 1 lagi output tersebut. jika kondisi masih terpenuhi maka perulangan akan 
berlanjut sampai kondisi yang diberikan sudah tidak terpenuhi lagi yang mana i > N.
*/
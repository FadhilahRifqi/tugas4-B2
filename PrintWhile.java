//13. KOde Program 
 
import java.util.Scanner; 
 
/* Baca N, Print i = 1 s/d N dengan WHILE */  

public class PrintWhile { 
 
	/**   
	* 
	@param args   
	*/  
	
	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	/* Kamus : */    
	int N;   
	int i;   
	Scanner masukan=new Scanner(System.in);   
	
	/* Program */ 
	System.out.print ("Nilai N >0 = ");
	
	/* Inisialisasi */    
	N = masukan.nextInt();    
	i = 1; /* First Elmt */ 
	System.out.print ("Print i dengan WHILE: \n");    
	
		while (i <= N) /* Kondisi pengulangan */   { 
			System.out.println (i); /* Proses */ 
			i++; /* Next Elmt */ 
		}; /* (i > N) */ 
	} 
}

/*
output:
Nilai N >0 = 7
Print i dengan WHILE:
1
2
3
4
5
6
7

penjelasan:
perulanga di atas menggunakan perulangan while dimana melakukan pengecekan kondisi terlebih dahulu baru mengeksekusi statment yang ada di dalamnya.
jika memenuhi kondisi maka mengeluarkan output dan kemudian output itu bertambah satu atau i++. jika kondisi masih terpenuhi maka perulangan akan 
berlanjut sampai kondisi yang dierikan sudah tidak terpenuhi lagi yang mana i > N.
*/
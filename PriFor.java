//10. Kode Program 
 
import java.util.Scanner; 
 
/* Baca N, Print 1 s/d N dengan FOR */  

public class PriFor { 
 
	/**   
	* @param args 
	*/  
	
	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	/* Kamus */    
	int i,N;    
	Scanner masukan=new Scanner(System.in);   
	
	/* Program */   /* program */ 
 
	System.out.print ("Baca N, print 1 s/d N ");   
	System.out.print ("N = "); 
	N=masukan.nextInt(); 
 
	for (i = 1; i <= N; i++){   
		System.out.println (i);
	};   
	System.out.println ("Akhir program \n");  
	}
} 

/*
output:
Baca N, print 1 s/d N N = 5
1
2
3
4
5
Akhir program

penjelasan:
pada perulangan ini, batas ditentukan oleh penginput. jadi perulangan akan berhenti jika telah samapi batas yang diinputkan tadi.
misal batas yang di masukan ke variabel N adalah 5 maka proses akan terus melakukan perulangan penambahan i++ dari nilai sebelumn 
yang dimulai dengan nilai awal 1 dan diterus ditambah 1 sampai batas angka 5 tercapai.
*/
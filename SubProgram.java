//18. Kode Program 

import java.util.Scanner; 
 
/* Contoh program yang mengandung prosedur dan fungsi */ 
/* prosedur/fungsi */ 
 
	public class SubProgram { 
	/**   
	* @param args   
	*/  
	
	public static int maxab (int a, int b){    
	/* mencari maksimum dua bilangan bulat */   
		return ((a >= b) ? a : b); 
	}      
	
	public static void tukar (int a, int b)  { 
	/* menukar dua bilangan bulat */   
		int temp;   
		temp = a;   
		a = b;   
		b = temp;   
		System.out.println ("Ke dua bilangan setelah tukar: a = "+ a +" b = "+ b);  
	}    
	
	/*** Program Utama ***/   
	public static void main(String[] args) {   
	// TODO Auto-generated method stub    
	/* Membaca dua bilangan integer */
	/* Menuliskan maksimum dua bilangan yang dibaca dg memanggil fungsi */    
	/* Menukar kedua bilangan dengan 'prosedur' */     
	int a, b;      
	Scanner masukan=new Scanner(System.in);     
	System.out.print ("Maksimum dua bilangan \n");     
	System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");     
	a = masukan.nextInt();     
	b = masukan.nextInt(); 
    
	System.out.println ("Ke dua bilangan : a = "+ a +" b = "+ b);     
	System.out.println ("Maksimum = " + (maxab (a, b)));     
	System.out.print("Tukar kedua bilangan... \n");          
	tukar (a, b);       
	} 
} 
/*
output:
Maksimum dua bilangan
Ketikkan dua bilangan, pisahkan dg RETURN :
4 0
Ke dua bilangan : a = 4 b = 0
Maksimum = 4
Tukar kedua bilangan...
Ke dua bilangan setelah tukar: a = 0 b = 4

penjelasan:
pada program subprogram ini terdapat fungsi dan juga prosedur. dimana fungsi itu memiliki nilai kembalian sementara prosedur tidak memiliki nilai kembalian.
pada fungsi maxab berparameter a dan b untuk mencari atau membandingkan nilai maksimum antara nilai a dan b. Apakah (a>=b) jika iya maka cetak nilai a dan jika salah maka cetak nilai b
pada prosedur tukar berparameter a dan b untuk menukar nilai yang ada di variabel a dan b. di prosedur ini disiapkan variabel penampung yaitu variabel temp untu menampung nilai. 
ketika fungsi main atau fungsi utama di jalankan maka awalnya yang di minta adalah inputkan nilai a dan nilai b. kemudian cetak nilai a dan b itu.
setelah itu panggil fungsi maxab yang mana fungsi itu tadi untuk membandingan nilai antara a dan b nilai mana yang besar atau maksimum itu yang akan di cetak.
yang terakhir untuk menukar 2 nilai yang ada di variabel a mau pun variabel b panggil prosedur tukar unutk menukarnya nilai a masuk ke variabel tampung atau 
variabel temp kemudian nilai b masuk ke variabel a dan nilai yg ada di variabel temp tadi masuk ke variabel b. dan terakhir cetak perubahan nilai itu.

*/
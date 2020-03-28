//9. Kode Program 
 
import java.util.Scanner; 
 
/* Maksimum dua bilangan yang dibaca */  

public class Max2 { 
 
	/** 
	* @param args 
	*/ 
	
	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	/* Kamus */  
	int a, b; 
	Scanner masukan=new Scanner(System.in); 
	
	/* Program */ 
	System.out.print ("Maksimum dua bilangan : \n"); 
	System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n"); 
	a=masukan.nextInt(); 
	b=masukan.nextInt(); 
	System.out.println ("Ke dua bilangan :  a = "+ a+" b = "+b);  
		if (a >= b){ 
			System.out.println ("Nilai a yang maksimum  "+ a); 
		}else /* a > b */{ 
			System.out.println ("Nilai b yang maksimum: "+ b); 
		} 
	} 
} 

/*
output:
Maksimum dua bilangan :
Ketikkan dua bilangan, pisahkan dg RETURN :
4 6
Ke dua bilangan :  a = 4 b = 6
Nilai b yang maksimum: 6

penjelasan:
untuk mencari nilai inputan yang maksimum maka menggunakan percabangan if-else.
disini dengan memberikan inputan 2 nilai. inputan a dan b yang terserah dari penginput maka percabangan mengecek pada kondisi di if-else nya
apakah (a >= b) jika benar maka statment yang dijalankan adalah nilai a yang maksimum
jika salah maka statment yang dijalankan adalah nilai b yang maksimum
*/
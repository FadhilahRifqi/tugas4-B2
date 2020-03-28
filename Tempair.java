//19. KOde Program 

import java.util.Scanner; 
 
/* contoh pemakaian IF tiga kasus : wujud air */  

public class Tempair { 
 
	/**   
	* @param args   
	*/  
	
	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	/* Kamus : */    
	int T;   
	Scanner masukan=new Scanner(System.in);   
	
	/* Program */ 
	System.out.print  ("Contoh IF tiga kasus \n");    
	System.out.print  ("Temperatur (der. C) = ");    
	T=masukan.nextInt();   
	
		if (T < 0) {    
			System.out.print ("Wujud air beku \n"+ T);   
		}else if ((0 <= T) && (T <= 100)){    
			System.out.print ("Wujud air cair \n"+ T);   
		}else if (T > 100){    
			System.out.print ("Wujud air uap/gas \n"+ T);    
		}; 
 
	} 
}

/*
output:
Contoh IF tiga kasus
Temperatur (der. C) = 900
Wujud air uap/gas
900
penjelasan:
pada program tempair ini untuk menentukan wujud air dari suhu air yang di inputkan.
menggunakan percabangan if yang mana kondisi pertama jika suhu lebih kecil dari 0 maka outputnya itu wujud air beku. jika tidak memenuhi maka memeriksa kondisi kedua.
kondisi kedua jika suhu lebih besar atau sama dengan 0 dan suhu lebih kecil atau sama dengan 100 (suhu berada di antara 0 dan 100) maka outputnya itu wujud air cair.
jika tidak memenuhi maka memeriksa kondisi ketiga. kondisi ketiga jika suhu lebih besar dari 100 maka outputnya itu wujud air gas
*/
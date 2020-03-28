//1. Kode Program 

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
import javax.swing.*; 
public class BacaString { 
 
	/**   
	* @param args   
	* @throws IOException    
	*/  
	
	public static void main(String[] args) throws IOException {   
	// TODO Auto-generated method stub   
	/* Kamus */    
	String str;          
	
	BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));   
	
		/* Program */ 
		System.out.print ("\nBaca string dan Integer: \n");       
		System.out.print("masukkan sebuah string: ");       
		str= datAIn.readLine();     
		System.out.print ("String yang dibaca : "+ str);       
	} 
} 

/*
output:
Baca string dan Integer:
masukkan sebuah string: Belajar Java
String yang dibaca : Belajar Java

penjelasan:
untuk membuat inputan string pada java maka pada program ini membuat terlebih dahulu 
object buffer yang mana di dalamnya telah di inputkan langsung object InputStream.
kemudian mengisi variabel str dengan BufferedReader (salah input class). 
dimana kalimat yang kita ketikan pada layar cmd nanti masuk ke variabel str.
Dan ketika dipanggil dengan nama varabel str maka kata yang tadi kita ketikan 
di cmd akan tampil lagi.

*/
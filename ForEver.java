//2. Kode Program     

public class ForEver { 
 
	/**   
	* @param args   
	*/  
	
	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	
		/* Program */   
		System.out.println("Program akan looping, akhiri dengan ^c");   
		while (true){ 
			System.out.print ("Print satu baris ....\n"); 
		} 
	}
} 

/*
output:
Print satu baris ....
Print satu baris ....
Print satu baris ....
Print satu baris ....
Print satu baris ....
Print satu baris ....
Print satu baris ....
Print satu baris ....
Print satu baris ....
Print satu baris ....
...

penjelasan:
pada perulangan while di atas dia tidak memberikan suatu kondisi sampai mana "print satu baris..." 
itu akan berhenti. oleh sabab itu saat di jalankan akan muncul terus sampai di berhentikan.
*/
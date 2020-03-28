//6. Kode Program  

/* Eksrpesi kondisional dengan boolean */  

public class KasusBoolean { 
 
 
	/** 
	* @param args 
	*/ 
 
	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	/* Kamus */  
	boolean bool; 
  
	/* Algoritma */  
	bool= true; 
		if(bool) {  
			System.out.print("true\n");
		} else  
			System.out.print("false\n"); 
		
		if(!bool) {  
			System.out.print("salah\n"); 
		} else  
			System.out.print("benar\n"); 
		} 
}

/*
output:
true
benar

penjelasan:
pada kasus boolean di atas menggunakan percabangan if-else dimana nilai boolean sudah diberiakan nilai pada variabel bool yaitu nilai true.
jika dieksekusi pada percabangan pertama yang kondisinya if(bool) atau jika kondisi bernilai true maka yang tampil adalah true. 
jika dieksekusi pada percabangan kedua yang kondisinya if(!bool) atau jika kondisi bernilai false maka yang tampil adalah statment
yang ada didalam perintah elsenya karena kondisinya mengatakan tidak benar.
*/
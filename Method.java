import java.util.Scanner;

public class Method{
   
   public static void main(String[] args) {
	   
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("nilai a = ");
      int a = input.nextInt();
	  System.out.print("nilai b = ");
      int b = input.nextInt();
      int c = max(a, b);
      System.out.println("nilai terbesar = " + c);
   }

   /** mengembalikan nilai terkecil antara dua nomor*/
   public static int max(int n1, int n2) {
      int max;
      if (n1 > n2)
         max = n1;
      else
         max = n2;

      return max; 
   }
}

/*
output:
nilai a = 6
nilai b = 3
nilai terbesar = 6

penjelasan:
pada program di atas menggunakan method max dengan menggunakan 2 parameter yaitu n1 dan n2 dan bertipe data integer.
di dalam method terdapar percabangan if-else. dengan kondisi jika n1 lebih besar dari n2 maka nilai n1 masuk ke variabel
penampung yaitu variabel max dan jikan kondisi terpenuhi maka nilai n2 yang akan di simpan pada variabel max.
setelah itu masuk pada menu utama yang mana harus menginputkan 2 nilai yaitu nilai a dan nilai b.
setelah itu kemudian memanggil methid max untuk meneksekusi proses yang ada di dalamnya yang menentukan antara
nilai a dan b yang dimasukkan tadi mana nilai yang besar. kemudian nilai yang besar tersebut akan ditampilkan.
*/
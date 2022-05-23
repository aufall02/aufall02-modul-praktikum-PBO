package Materi;
public class Contoh3 {
   static int penjumalahan(int bil1, int bil2){
       return bil1+bil2;
   }
   static int perkalian(int bil1, int bil2){
       return bil1*bil2;
   }
   public static void main(String[] args) {
       int x=4,y=6;
       System.out.println(x+" + "+y+" = "+penjumalahan(x, y));
       System.out.println(x+" * "+y+" = "+perkalian(x, y));
   }
}

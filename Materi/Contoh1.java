package Materi;
public class Contoh1 {
    // method tanpa mengmbalikan nilai
   static void cetak(){
       System.out.println("hallo saya");
   }
   static void tampil(int a){
       System.out.println("nilai : "+a);
   }
   public static void main(String[] args) {
    cetak();
    System.out.println("aufal");   
    int a;
    for (a=0; a<4; a++){
        tampil(a);
    }
    System.out.println("nilaai terakhir : "+a);
   }
}

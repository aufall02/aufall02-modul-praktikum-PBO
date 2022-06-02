package Materi;
public class MainArray {
   public static void main(String[] args) {
      Array ob = new Array();
      String [] mahasiswa = { "dona", "doni","donu","dono","dana"};
      int [] deret = {2,5,6,9,7,9,7,4,1};
      ob.tampil("daftar mahasiswa : ");
      ob.setMhs(mahasiswa);
      ob.tampil(ob.getmhs());
      ob.tampil("============================");
      ob.tampil("deret : ");
      ob.setderet(deret);
      ob.tampil(ob.getDeret());
      ob.tampil("hasil penjumlahan deret : ");
      ob.setPenjumlahan(deret);
      ob.tampil(ob.getpenjumlahan());




      //megnhapus variable dari mempori

      ob.hapus();
      mahasiswa = null;
      deret = null;
      ob = null;
   } 
   // public static void main(String[] args) {

   //  String [] BilanganBulat = {"aku","saya","dia","anu","hhh","klklk"};
   //     Array ob = new Array();
   //     ob.setBilanganBulat(BilanganBulat);
   //     System.out.println("nama "+ob.getBilanganBulat()[0]);
   // } 
}

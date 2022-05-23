package LATIHAN1;

public class AlatTulis {
   int Stok,HargaSatuan,Harga;
   String Nama;
   public void setNama(String nama){
    Nama = nama; 
   }
   public String getNama(){
       return Nama;
   } 
   public void setStok(int stok){
       Stok = stok;
   }
   public int getStok(){
       return Stok;
   }
   public void setHargaSatuan(int hs){
        HargaSatuan = hs;
   }
   public int getHargaSatuan(){
     return HargaSatuan;
   }
  
   public void setHarga(int Stok, int HargaSatuan){
    Harga = Stok*HargaSatuan;
   }
   public int getHarga(){
       return Harga;
   }
//    public void setTotalHarga(int harga1, int harga2, int harga3){
//     TotalHarga = harga1+harga2+harga3;
//    }
//    public int getTotalHarga(){
//        return TotalHarga;
//    }

   
}

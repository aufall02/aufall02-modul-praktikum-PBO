package LATIHAN1;

public class Toko {
    public static void main(String[] args) {
        AlatTulis Pensil = new AlatTulis();
        AlatTulis bulpoint = new AlatTulis();
        AlatTulis penghapus = new AlatTulis();
        int Totalharga = 0;
        Pensil.setNama("pensil");    
        Pensil.setStok(10);
        Pensil.setHargaSatuan(2000);
        Pensil.setHarga(Pensil.getStok(), Pensil.getHargaSatuan());
        System.out.println("Nama Alat Tulis : "+Pensil.getNama());
        System.out.println("stok : "+Pensil.getStok());
        System.out.println("Harga satuan : "+Pensil.getHargaSatuan());
        System.out.println("Total "+Pensil.getNama()+" : "+Pensil.getHarga());
        
        bulpoint.setNama("bulpoin");    
        bulpoint.setStok(10);
        bulpoint.setHargaSatuan(1000);
        bulpoint.setHarga(bulpoint.getStok(), bulpoint.getHargaSatuan());
        System.out.println("Nama Alat Tulis : "+bulpoint.getNama());
        System.out.println("stok : "+bulpoint.getStok());
        System.out.println("Harga satuan : "+bulpoint.getHargaSatuan());
        System.out.println("Total "+bulpoint.getNama()+" : "+bulpoint.getHarga());
        

        penghapus.setNama("penghapus");    
        penghapus.setStok(7);
        penghapus.setHargaSatuan(500);
        penghapus.setHarga(penghapus.getStok(), penghapus.getHargaSatuan());
        System.out.println("Nama Alat Tulis : "+penghapus.getNama());
        System.out.println("stok : "+penghapus.getStok());
        System.out.println("Harga satuan : "+penghapus.getHargaSatuan());
        System.out.println("Total "+penghapus.getNama()+" : "+penghapus.getHarga());
        
        // Atk.setTotalHarga(Atk.getHarga(), Atk.getHarga(), Atk.getHarga());
        // System.out.println("Total Harga : "+Atk.getTotalHarga());
        AlatTulis[] TotalHarga = {Pensil,bulpoint,penghapus};

        for (AlatTulis a:TotalHarga){
            Totalharga+=a.getHarga();
        }
        System.out.println("Total Harga = "+Totalharga);


       
    }
}
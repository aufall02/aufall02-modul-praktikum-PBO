package Materi;

public class MainArray2 {
    public static void main(String[] args) {
        Array2 Ob = new Array2();
        String [][] mhs = {
                        //{kolom 0, kolom 1}
                        {"Nim","Nama"}, //baris 0
                        {"000001","pikri"}, // baris 1
                        {"000002","basofi"},// baris 2
                        {"000003","rejal"},// baris 3
                        {"000004","ajis"},// baris 4
                        {"000005","niko"}//baris 5
        };
        Ob.tampil("data mahasiswa");
        Ob.setMahasiswa(mhs);
        Ob.tampil(Ob.getMahasiswa());
        Ob.tampil("=========================");
        int [][] data ={
            // {kolom 0, kolom 1}
            {1,2},
            {3,4},
            {5,6}
        };
        int pengali = 2;
        Ob.tampil("Data matrik : ");
        Ob.setData(data);
        Ob.tampil(Ob.getData());
        Ob.tampil("Data Matrix " +pengali+" : ");
        Ob.setPerkalianSaklar(data, pengali);
        Ob.tampil(Ob.getPerkalianSaklar());

        //menghapus semua variable dalam memory
        Ob.hapus();
        mhs = null;
        data = null;
        Ob = null;
    }
}

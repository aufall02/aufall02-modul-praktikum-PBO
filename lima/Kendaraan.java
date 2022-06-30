package lima;

public class Kendaraan {
    private String merk,warna;
    protected String namaClass = "Kendaraan";

    protected void setMerk(String merk) {
        this.merk = merk;
        merk = null;//menghapus variable paramater dari memory
    }

    protected String getMerk() {
        return merk;
    }

    protected void setWarna(String warna) {
        this.warna = warna;
    }

    protected String getWarna() {
        return warna;
    }

    protected void tampil(String a){
        System.out.println(a);
        a = null;
    }
    protected String keterangan(){
        return ("ini adlaah Class "+namaClass);
    }
    protected  void hapus(){
        warna = null;
        merk = null;
        namaClass = null;
    }
}

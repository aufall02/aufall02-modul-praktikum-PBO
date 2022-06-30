package lima;
import  java.io.*;
import javax.swing.*;

class InputBufferReader{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama,kota;
        System.out.print("masukkan nama : ");
        nama = br.readLine();
        System.out.print("masukkan nama kota: ");
        kota = br.readLine();
        System.out.println("name : "+nama);
        System.out.println("kota : "+kota);

    }

}
class InputJavaSwing{
    public static void main(String[] args) {
        String nama,kota;
        nama = JOptionPane.showInputDialog("masukkan nama : ");
        kota = JOptionPane.showInputDialog("masukkan kota anda : ");
        System.out.println("selamat datang " + nama +" dari kota "+kota);
        System.exit(0);

    }
}



public class Apps extends Mobil {
    public static void main(String[] args) {
        Apps Ob = new Apps();
        String merk,warna,harga;
        merk = JOptionPane.showInputDialog("merk mobil :");
        Ob.setMerk(merk);
        Ob.tampil("merk mobil : "+Ob.getMerk());
        warna = JOptionPane.showInputDialog("warna mobil :");
        Ob.setWarna(warna);
        Ob.tampil("warna mobil : "+Ob.getWarna());
        harga = JOptionPane.showInputDialog("harga mobil :");
        Ob.setHarga(harga);
        Ob.tampil("harga mobil : "+Ob.getHarga());
        Ob.hapus();
        merk = null;
        warna = null;
        harga   = null;

        System.exit(0);

    }
}

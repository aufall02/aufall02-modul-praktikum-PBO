package LATIHAN3;

public class MainArray {
    public static void main(String[] args) {
        int [] list  = {2,5,3,5,9,5};
        Array2 Ob = new Array2();
        System.out.println("ini listnya : ");
        Ob.tampil(list);
        Ob.setList(list);
        System.out.println("ini hasilnya : ");
        Ob.tampil(list);
        System.out.println("setelah di kali : ");
        Ob.setKali(list);
        Ob.tampil(Ob.arrayhasil);

    }
}

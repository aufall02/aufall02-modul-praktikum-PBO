package LATIHAN4;

public class App {
    public static void main(String[] args) {
        Array Ob =new Array();
        int [][] a = {
                    {1,2},
                    {3,5},
                    {6,7}
        };
        int [][] b = {
                    {8,9},
                    {10,11},
                    {12,13},

        };
        System.out.println("array A : ");
        Ob.tampil(a);
        System.out.println("array B : ");
        Ob.tampil(b);
        System.out.println("ini hasil kali");
        Ob.setSum(a,b);
        Ob.tampil(Ob.getHasil());
        int [][] hasil = Ob.getHasil();
        Ob.setHasilkali(hasil,0.5);
        System.out.println("ini hasi kali : ");
        Ob.tampil(Ob.getHasilkali());
    }
}

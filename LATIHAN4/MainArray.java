package LATIHAN4;

public class MainArray {
    
    public static void main(String[] args) {
        Array Ob =new Array();
        int [][] a = {
                    {1,2},
                    {3,4},
                    {5,6},
                    {7,8},
        };
        int [][] b = {
                    {2,1},
                    {4,3},
                    {7,9},
                    {1,6},
        };

        System.out.println("array A : ");
        Ob.tampil(a);
        System.out.println("array B : ");
        Ob.tampil(b);
        System.out.println("ini hasil kali");
        Ob.setSum(a,b);
        Ob.tampil(Ob.getHasil());
        Ob.setPerkalianSaklar(hasil, 0.5);
        System.out.println(Ob.getPerkalianSaklar());


    }
}

package LATIHAN4;

public class Array {
    private int [][] A,B,hasil ;
    private double[][] hasilkali ;

    public void setA(int[][] a) {
        A = a;
    }
    public int[][] getA() {
        return A;
    }
    public void setB(int[][] b) {
        B = b;
    }
    public int[][] getB() {
        return B;
    }
    public void setSum(int [][] matrikA, int [][] matrikB){
        hasil = new int [matrikA.length][matrikA[0].length];
        int i,j;
        for (i=0 ; i<matrikA.length; i++){
            for (j=0; j<matrikA[0].length; j++){
                hasil[i][j] = matrikA[i][j] + matrikB[i][j];
                // this.hasil = hasil;
            }
        }

    }

    public int[][] getHasil() {
        return hasil;
    }
    public  void setHasilkali(int [][] hasil,double a){
        hasilkali = new double[hasil.length][hasil[0].length];

        int i,j;
        for (i = 0; i< hasil.length; i++){
            for (j=0 ; j< hasil[i].length; j++){
                this.hasilkali[i][j] = a*(double)hasil[i][j];
            }
        }
    }

    public double[][] getHasilkali() {
        return hasilkali;
    }

    public void tampil(int data[][]){
        // mendeklarasikan baris dan kolom
        int i,j; //baris dan kolom

        for (i=0 ; i<data.length; i++){
            for (j=0;j<data[i].length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        data = null;
    }
    public void tampil(double data[][]){
        // mendeklarasikan baris dan kolom
        int i,j; //baris dan kolom

        for (i=0 ; i<data.length; i++){
            for (j=0;j<data[i].length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        data = null;
    }
    // public void hapus(){
    //     mahasiswa = null;
    //     data = null;
    //     hasil = null;
    // }
}

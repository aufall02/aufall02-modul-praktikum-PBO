package Materi;

public class Array2 {
    private String [] [] mahasiswa;
    private int [] [] data,hasil;

    public void setMahasiswa(String[][] mahasiswa) {
        this.mahasiswa = mahasiswa;
        mahasiswa = null;
    }
    public String[][] getMahasiswa() {
        return mahasiswa;
    }
    public void setData(int[][] data) {
        this.data = data;
        data = null;
    }
    public int[][] getData() {
        return data;
    }
    public void setPerkalianSaklar(int [][] data, int a ){
        hasil = data;
        int i,j;
        for (i=0 ; i<data.length; i++){
            for (j=0;j<data[i].length;j++){
                hasil[i][j] = a*data[i][j];
            }
        }
        data = null;
    }
    public int [][] getPerkalianSaklar(){
        return hasil;
    }
    // menampilkan hasil
    
    public void tampil(String a){
        System.out.println(a);
    }
    public void tampil(String data[][]){
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
    public void hapus(){
        mahasiswa = null;
        data = null;
        hasil = null;
    }
}

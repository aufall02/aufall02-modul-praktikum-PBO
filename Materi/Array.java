package Materi;
public class Array {
    private String []mhs;
    private int [] deret;
    private int Hasilpenjumlahan;
    private double ratarata;
    
    public void setMhs(String [] mhs){
        this.mhs = mhs;
        mhs = null;

    }

    public String [] getmhs(){
        return mhs;

    }

    public void setderet(int []deret){
        this.deret = deret;
        deret=null;
    }

    public int [] getDeret(){
        return deret;
    }
    public void setPenjumlahan(int [] setPenjumlahan){
        Hasilpenjumlahan = 0;
        //int det;
        
        for (int i=0; i<deret.length; i++){
            Hasilpenjumlahan += deret[i];
        }
        //det = deret.length;
        //ratarata = (Hasilpenjumlahan/det);
        deret=null;
    }
    public int getpenjumlahan(){
        return Hasilpenjumlahan;
    }
    public double getRataRata(){
        return ratarata;
    }
    public void tampil(String a){
        System.out.println(a);
        a = null; //menghapus variable dari memori 
    }

    public void tampil(String [] a){
        String data = "";
        for (int i=0; i<a.length; i++){
            if (i==0){
                data += a[i];
            } else {
                data += " , "+a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;

    }

    public void tampil(int a){
        System.out.println(a);
    }
     public void tampil(Double a){
        System.out.println(a);
    }

    public void tampil(int [] a){
        String data = "";
        for (int i=0; i<a.length; i++){
            if (i==0){
                data += a[i];
            } else {
                data += " , "+a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;

    }

    public void hapus(){
        mhs = null;
        deret= null;
        Hasilpenjumlahan = 0;
    }



//    String Bil anganBulat[]; 
//    int [] BilanganBulat1;
   
//    public void setBilanganBulat(String Bilanganbulat[]){
//        this.BilanganBulat=Bilanganbulat;
//     //    BilanganBulat=null;
//    }
//    public String [] getBilanganBulat(){
//        return BilanganBulat;
//    }
}

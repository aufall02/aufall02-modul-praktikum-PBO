package LATIHAN3;

public class Array2 {
    // int list;
   double  arrayhasil [] ;
    public void setList(int [] list){
        for (int i=0 ; i<list.length;i++)
        if (list[i] == 5){
            list[i] = 1;
        }
        
    
    }
    public void setKali(int [] list){
        
        arrayhasil = new double [list.length];
        for (int i=0; i<list.length;i++){
            arrayhasil [i] =  list[i]*0.5;

           
        }
    }
    


    public double[] getArrayhasil() {
        return arrayhasil;
    }

    public void tampil(double[] list){
        String data = " " ;
        for (int i=0; i<list.length; i++){
            if (i==0){
                data += list[i];
            } else {
                data += " , "+list[i];
            }
        }
        System.out.println(data);

    }

    public void tampil(int[] a){
        String data = "";
        for (int i=0; i<a.length; i++){
            if (i==0){
                data += a[i];
            } else {
                data +=  " , "+a[i];
            }
        }
        System.out.println(data);

    }
}

package LATIHAN2;

public class TestArray {
    public double average;
    public int min,max;
    public  int find;
    public int [] list;

    public void setlist(int [] list){
        this.list = list;
    }

    public void setAverage(int [] list){
        double sum = 0.0;
        int length = list.length;
        // for (int i=0; i<equal.length; i++){
        // sum += equal[i];
        for (double num : list){
            sum += num;
            // System.out.println(sum);
        }
      average = sum / length;
    }
    
    public double getAverage(){
    return average;
    }

    // public void setshort(int [] list){
    //     Arrays.sort(list);
    //     max = list[list.length-1];
    //     min = list[0];
    //     list = null;
    // }
    public void setMax(int [] list){
        int max = list[0];
        for (int i=0 ; i<list.length; i++)
            if (list[i]>max)
                max= list[i];
            this.max = max; // return max;
        
    }
    public void setMin(int [] list){
        for (int i=0 ; i<list.length; i++){
            for (int j=i+1; j<list.length;j++){
            if (list[i] < list[j]) {
                min = list[i];
                list[i] = list[j];
                list[j] = min;
            } 
        }
    }
        
    }

    private int extracted() {
        return min;
    }
    public int getmax(){
        return max;
    }
    public int getmin(){
        return extracted();
    }
    public   void setFindIndex(int [] list){
        for (int i=0; i<list.length;i++){
            if (list[i] == -3){
                find = i;
            }
        }
        }
    

    public int getFindIndex(){
        return find;
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
        average = 0;
        min= 0;
        max = 0;
    }





}

  
// double r;  
// int max,min,cari;

// public int setCarinomer(int []data){

//     for (int i=0; i<data.length; i++ ){
//         if (data[i]== -6){
//             // System.out.println(data[i]);
//           return i;
//         }
//     }
//    return -1; 
// }

//   public void setRataRata(int []rata){
//         double jml = 0;
//       for (int  i=0; i<rata.length;i++){
//         jml  +=  rata[i];
//         // System.out.println(jml);
//       }
//       r=jml / rata.length;
//       rata = null;
//   }
//   public double getRataRata(){
//       return r;
//   }
//   public void setMaxmin(int []rata){
//     //   int ;
//       int nilai = 0;

//       for (int i=0; i<rata.length;i++){
//           for (int j=1;j<(rata.length - i);j++){
//             if (rata[j-1] > rata[j]){
//                 nilai = rata[j-1];
//                 rata[j-1]=rata[j];
//                 rata[j]=nilai;
//             }
//           }
//           // rata = null;
//         }
//         //   for (int i=0; i<rata.length; i++){
//           //       max = rata[i];
//           //       min = rata[i-1];
//           //     //   System.out.println(rata[i]);
//           //     //   max = rata[i-1];
//           //   }
//           max= rata[rata.length-1];
//           min= rata[0];
//           rata = null;
     


//     //   max = nilai;
//   }
//   public int getMax(){
//       return max;
//   }
//   public int getmin(){
//       return min;
// //   }
// //   public int setCarinomer(int []data){
// //       for (int i=0; i<data.length; i++ ){
// //           if (data[i]== -4){
// //             //   System.out.println(data[i]);
// //             return i;
// //             //   break;
// //             //   cari = data[i];
// //           }
// //       }
// //      return -1; 
// //   }
// //   public int getCariNomer(){
// //       return ;
// //   }

// }
// }

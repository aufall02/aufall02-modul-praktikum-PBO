package LATIHAN2;

public class Mainlatihan2 {

public static void main(String[] args) {

    int [] list = {-5,-3,-6,-3,-4};
    // int [] list = {23,10,6,10,9};
    TestArray Ob = new TestArray();
    Ob.tampil("ini listnya : ");
    Ob.tampil(list);
    Ob.tampil("");
    Ob.setAverage(list);
    Ob.tampil("average  : "+Ob.getAverage());
    Ob.setMax(list);
    Ob.setMin(list);
    Ob.tampil("max      : "+Ob.getmax());
    Ob.tampil("min      : "+Ob.getmin());
    Ob.setFindIndex(list);
    Ob.tampil("nilai -3 ada di index : "+Ob.getFindIndex());
    Ob.hapus();

}

    
//    public static void main(String[] args) {
//        int angka[]={-5,-3,-6,-3,-4,-3};
//        TestArray test = new TestArray();
       
//        System.out.println("angka -6 berada di index = "+test.setCarinomer(angka));
       
//        test.setRataRata(angka);
//        test.setMaxmin(angka);
//        //    test.setCarinomer(angka);
//        System.out.println("rata-rata = "+test.getRataRata());
//        System.out.println("nilai maksimum = "+test.getMax());
//        System.out.println("nilai minimum = "+test.getmin());
//        //    test.setCarinomer(angka);
    
// }
}
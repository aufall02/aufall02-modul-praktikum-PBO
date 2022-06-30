package matematika;

public class Matematika {
    int c;

    public  void tambah(int a, int b){
        c = a + b;
        System.out.println("pertambahan : "+a+" + "+b+" = "+c);
    }

    public int getTambah(){
        return c;
    }
}

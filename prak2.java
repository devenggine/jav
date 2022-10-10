import java.util.Scanner;
class PersegiPanjang {
    private int panjang;
    private int lebar;
    private int luas;
    private int keliling;

    public int getpanjang() { // method brp Fungsi
        return panjang;
    }
    public void setpanjang() { // method brp procedure
        Scanner input = new Scanner(System.in);
        System.out.println(" Masukan panjang persegi :");
        this.panjang = input.nextInt();


    }
    public int getlebar() { // method brp Fungsi
        return lebar;
    }
    public void setlebar() { // method brp procedure
        Scanner input = new Scanner(System.in);
        System.out.println(" Masukan lebar persegi :");
        this.lebar = input.nextInt();
    }
    public int getluas() { // method brp Fungsi
        return luas;
    }
    public void setluas(){
        this.luas = getpanjang()*getlebar();

    }
    public int getkeliling() { // method brp Fungsi
        return keliling;
    }
    public void setkeliling(){
        this.keliling = (getpanjang()*2)+(2*getlebar());

    }
}
class benda{
    int panjang; //deklarasi variabel
    int lebar;
    int luas;
    int keliling;
    public benda(){} //default constructor
    public benda(int panjang, int lebar, int keliling , int luas){ //constructor perparameter
        this.panjang = panjang;
        this.lebar= lebar;
        this.luas=luas;
        this.keliling=keliling;
    }
}

public class prak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersegiPanjang PP= new PersegiPanjang();
        PP.setpanjang();
        PP.setlebar();
        System.out.println("Panjang :"+ PP.getpanjang());
        System.out.println("lebar :"+ PP.getlebar());
        PP.setkeliling();
        System.out.println("keliling persegi :"+ PP.getkeliling());
        PP.setluas();
        System.out.println("luas persegi :"+ PP.getluas());
    }
}

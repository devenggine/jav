import java.util.Scanner;

public class Ready   {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        karyawan k = new karyawan();
        k.setnik("2100018014");
        k.setNama("Duwi Anjar");
        k.setAlamat("Kulin Progo");
        k.setjabatan("Manager");
        System.out.print("Berapa bon "+k.getNama()+" bulan ini : " );
        k.setbon(input.nextInt());

        System.out.println("Nik :" + k.getnik());
        System.out.println("Nama :" + k.getNama());
        System.out.println("Alamat :" + k.getAlamat());
        System.out.println("Gaji :" + k.getgaji());
        System.out.println("Jabatan :" + k.getjabatan());
        System.out.println("Potong Bon :" + k.getbon());
        System.out.println("Gaji setelah potong bon :" + (k.getgaji()-k.getbon()));
        }
        }

package mahasiswa;

import mahasiswa.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("06018251");
        m.setNama("Tejo");
        m.setAlamat("Sleman");
        m.setkelas("A");
        System.out.println("Nim :" + m.getNim());
        System.out.println("Nama :" + m.getNama());
        System.out.println("Alamat :" + m.getAlamat());
        System.out.println("Kelas :" + m.getkelas());
        System.out.println("Semester :" + m.getsemester());
    }
}

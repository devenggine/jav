package mahasiswa;

public class Manusia {
    private String nama;
    private String alamat;

    public Manusia(){}
    public Manusia(String nama, String alamat, String kelas) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

}

public class Makhluk_hidup {
    private String nama;
    private String alamat;

    public Makhluk_hidup(){}
    public Makhluk_hidup(String nama, String alamat) {
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

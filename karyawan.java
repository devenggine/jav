public class karyawan extends Makhluk_hidup {
    private String nik;
    protected int gaji=20000000;
    private String jabatan;
    private int bon;

    public karyawan() {
    }
    public karyawan(String nik) {
        this.nik = nik;
    }
    public String getnik() {
        return nik;
    }
    public void setnik(String nik) {
        this.nik = nik;
    }
    public String getjabatan() {
        return jabatan;
    }
    public void setjabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public int getbon() {
        return bon;
    }
    public void setbon(int bon) {
        this.bon = bon;
    }
    public int getgaji() {
        return gaji;
    }

}


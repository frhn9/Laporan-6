package Bab6;

public class Employee {
    protected static String nama, id, jabatan, istri;
    protected int jumlahAnak, tahunkerja, lamakerja;
    protected final int tahun = 2016;
    protected double bonus, tunjangan, tunjanganJabatan, tunjanganAnak, tunjanganistri;
    protected double totalBonus, totalTunjangan;
    protected double gaji, totalgaji, totalfinalgaji;
    public Employee(String a, String b, String c, String d, int e, int f) {
        nama = a;
        id = b;
        jabatan = c;
        istri = d;
        jumlahAnak = e;
        tahunkerja = f;}
    public String getNama() {
        return nama;
    }
    public String getID() {
        return id;
    }
    public int getTahunkerja() {
        return tahunkerja;
    }
    public double getTotalgaji() {
        return totalgaji;
    }
}

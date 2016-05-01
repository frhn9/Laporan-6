package Bab6;

public class PegawaiTetap extends Employee {
public PegawaiTetap(String a, String b, String c, String d, int e,int f){
    super(a,b,c,d,e,f);
    gaji = 5000000;
}
public void getBonus() {
        lamakerja = super.tahun - super.getTahunkerja();
        if (lamakerja > 10) {
            bonus = 0.1 * lamakerja * gaji;
            tunjangan = 0.1 * lamakerja * gaji;
        } else if (lamakerja >= 5 || lamakerja <= 10) {
            bonus = 0.05 * lamakerja * gaji;
            tunjangan = 0;
        } else {
            bonus = 0;
            tunjangan = 0;
        }
        totalgaji = gaji + bonus + tunjangan;
    }
    public void getTunjanganIstri(String a) {
        if (istri.equalsIgnoreCase("Y")) {
            tunjanganistri = 0.1 * totalgaji;
        } else {
            tunjanganistri = 0;
        }
    }
    public void getTunjanganAnak(int a) {
        if (a > 3) {
            tunjanganAnak = 0.15 * totalgaji * 3;
        } else if (a >= 1 && a <= 3) {
            tunjanganAnak = 0.15 * totalgaji * a;
        } else {
            tunjanganAnak = 0;
        }
    }
    public double getTotalTunjangan() {
        totalTunjangan = tunjanganistri + tunjanganAnak;
        return totalTunjangan;
    }
    public double getTotalFinalGaji(){
        totalfinalgaji = totalgaji+totalTunjangan;
        return totalfinalgaji;
    }
}

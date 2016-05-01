package Bab6;

public class PegawaiNonTetap extends Employee {
    protected double lembur;
    public PegawaiNonTetap(String a, String b, String c, String d, int e, int f) {
        super(a, b, c, d, e, f);
        gaji = 2000000;
    }
    public double setLembur(int a) {
        if (a > 10) {
            lamakerja = a - 10;
            lembur = 10000 * lamakerja;
            return lembur;
        } else {
            return lembur = 0;
        }
    }
    public double getTotalFinalGaji() {
        totalfinalgaji = gaji + lembur;
        return totalfinalgaji;
    }
}

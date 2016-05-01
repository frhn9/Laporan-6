package Bab6;

import java.util.Scanner;
public class MainEmployee {
    static String list = "\nNama\t\tIDKerja\t\tJabatan\t\t\tGaji\t\t\n";
    public static void main(String[] args) {
        String pilihanss;
        int anaks, tahuns, jab = 0;
        String nama, id, jabatan;
        Scanner input = new Scanner(System.in);
        System.out.println("===EMPLOYEE'S DATABASE===");
        do {
            System.out.print("Masukkan Nama Pegawai : ");
            nama = input.next();
            System.out.print("Masukkan ID Anda : ");
            id = input.next();
            System.out.print("Masukkan Jabatan Anda : ");
            jabatan = input.next();
            System.out.println("Apakah Anda Mempunyai Istri ? (Y/N)");
            System.out.print("Pilihan anda : ");
            String pilihan = input.next();
            System.out.println("Apakah Anda Mempunyai Anak? (Y/N)");
            System.out.print("Pilihan anda : ");
            String pilihans = input.next();
            System.out.print("Jumlah anak : ");
            anaks = input.nextInt();
            System.out.print("Tahun masuk kerja : ");
            tahuns = input.nextInt();
            if (jabatan.equalsIgnoreCase("Manager")) 
                jab = 1;
             else if (jabatan.equalsIgnoreCase("PegawaiTetap")) 
                jab = 2;
             else if (jabatan.equalsIgnoreCase("PegawaiNonTetap")) 
                jab = 3;
            switch (jab) {
                case 1:{
                    Manager a = new Manager(nama, id, jabatan, pilihan, anaks, tahuns);
                    a.getBonus();
                    a.getTunjanganIstri(pilihan);
                    a.getTunjanganAnak(anaks);
                    a.getTotalTunjangan();
                    a.getTunjanganJabatan();
                    a.getTotalFinalGaji();
                    list += a.getNama() + "\t\t" + a.getID() + "\t\t" + jabatan + "\t\t\t" + a.getTotalFinalGaji()+"\t\n";
                }break;
                case 2:{
                    PegawaiTetap b = new PegawaiTetap(nama, id, jabatan, pilihan, anaks, tahuns);
                    b.getBonus();
                    b.getTunjanganIstri(pilihan);
                    b.getTunjanganAnak(anaks);
                    b.getTotalTunjangan();
                    b.getTotalFinalGaji();
                    list += b.getNama() + "\t\t" + b.getID() + "\t\t" + jabatan + "\t\t\t" + b.getTotalFinalGaji()+"\t\n";
                }break;
                case 3:{
                    PegawaiNonTetap c = new PegawaiNonTetap(nama, id, jabatan, pilihan, anaks, tahuns);
                    System.out.println("Masukkan Jam Kerja Anda : ");
                    int jam = input.nextInt();
                    c.setLembur(jam);
                    c.getTotalFinalGaji();
                    list += c.getNama() + "\t\t" + c.getID() + "\t\t" + jabatan + "\t\t\t" + c.getTotalFinalGaji()+"\t\n";
                }break;
            }
            System.out.println("Ingin Memasukkan lagi? (Y/N)");
            pilihanss = input.next();           System.out.println("=================================================");
        } while (pilihanss.equalsIgnoreCase("Y"));
        System.out.println("");
        System.out.println(list);
    }
}


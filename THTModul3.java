import java.util.Scanner;

public class THTModul3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Shift kerja (pagi/siang/malam): ");
        String shift = input.nextLine();
        System.out.print("Total jam kerja dalam seminggu: ");
        double jamKerja = input.nextDouble();
        System.out.print("Jumlah hari absen: ");
        int absen = input.nextInt();

        if (jamKerja < 0 || jamKerja > 168 || absen < 0) {
                System.out.println("Error: Input tidak valid");
                return;
        }

        double tarifPerJam;
        switch (shift) {
            case "pagi":
                tarifPerJam = 60000;
                break;
            case "siang":
                tarifPerJam = 65000;
                break;
            case "malam":
                tarifPerJam = 70000;
                break;
            default:
                System.out.println("Error: Shift kerja tidak valid");
                return;
        }

        double gaji = jamKerja * tarifPerJam;
        if (jamKerja > 40) {
            double jamLembur = jamKerja - 40;
            double tarifLembur = tarifPerJam * 1.5; 
            gaji += jamLembur * tarifLembur;
        } else if (jamKerja < 30) {
            gaji *= 0.9; 
        }

        double potonganAbsen = absen * 100000;
        gaji -= potonganAbsen;

        System.out.println("\n===== Laporan Gaji Karyawan =====");
        System.out.println("ID Karyawan       : " + id);
        System.out.println("Nama Karyawan     : " + nama);
        System.out.println("Shift Kerja       : " + shift);
        System.out.println("Total Jam Kerja   : " + jamKerja);
        System.out.println("Jumlah Hari Absen : " + absen);
        System.out.println("Total Gaji        : Rp" + gaji);

        input.close();
    }
}

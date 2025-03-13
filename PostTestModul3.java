import java.util.Scanner;

public class PostTestModul3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tipe member: ");
        String tipe = input.nextLine();
        System.out.print("Masukkan total belanja: ");
        double total = input.nextDouble();
        

        double diskonUtama;
        if (total > 500000) {
            diskonUtama = 0.20; 
        } else if (total >= 250000) {
            diskonUtama = 0.10; 
        } else {
            diskonUtama = 0.0; 
        }

        double diskonTambahan;
        switch (tipe) {
            case "platinum":
                diskonTambahan = 0.05; 
                break;
            case "gold":
                diskonTambahan = 0.03;
                break;
            case "silver":
                diskonTambahan = 0.02; 
                break;
            default:
                System.out.println("Error: Tipe member tidak valid");
        }

        String pesan = (diskonUtama > 0) ? "Anda mendapatkan diskon" : "Anda tidak mendapatkan diskon";
        System.out.println(pesan);

        double total1 = total - (total * diskonUtama);
        double total2 = total1 - (total1 * diskonTambahan);

        System.out.println("Total Bayar Setelah Diskon: Rp" + total2);

        input.close();
    }
}
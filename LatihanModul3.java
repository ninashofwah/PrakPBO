import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        int jumlahVokal = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
       
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                jumlahVokal++;
            } 
            
        }

        System.out.println("Jumlah huruf vokal dalam teks: " + jumlahVokal);


        switch(jumlahVokal % 2) {
            case 0:
                System.out.println("Jumlah vokal Genap");
                break;
            default:
                System.out.println("Jumlah vokal Ganjil");
        }

        char[] karakter = kalimat.toCharArray();
        char[] reversed = new char[karakter.length];

        int index = karakter.length - 1;
        for (char c : karakter) {
            reversed[index--] = c;
        }

        System.out.print("Kalimat Terbalik: ");
        for (char c : reversed) {
            System.out.print(c);
        }

        input.close();
    }
}

   

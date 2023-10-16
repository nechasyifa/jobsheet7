import java.util.Scanner;

public class ForKelipatan20 {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input20.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        
        double average = (double) jumlah / counter;
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.1f\n", kelipatan, average);

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }
}
    

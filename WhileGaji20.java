import java.util.Scanner;

public class WhileGaji20 {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input20.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = input20.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input20.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                i--;
                gajiLembur = 0;
                System.out.println("Jabatan invalid");
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total Gaji Lembur: " + totalGajiLembur);
    }
}
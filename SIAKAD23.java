import java.util.Scanner;
public interface SIAKAD23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //modifikasi mengakomodasi jumlah nsiswa dan jumlah mata kuliah yang dinamis
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;//modifikasi program

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];//modifikasi program
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        }
        //tambahan kode program
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul / 4);
        }
    }
}

import java.util.Scanner;
public class BioskopWithScanner23 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nama;
    String next;
    int kolom, baris;

    String[][] penonton = new String[4][2];

    while (true) {
        System.out.println("---Pilihan Menu Bioskop---");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih opsi (1/2/3): ");
        int pilihan = sc.nextInt();
        sc.nextLine(); 

        switch (pilihan) {
            case 1:

                System.out.println("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.println("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.println("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Input baris atau kolom tidak valid!");//baris/kolom tidak tersedia
                } else {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton sukses disimpan!");
                        break;
                    } else {
                        System.out.println("Tempat sudah terisi, silakan pilih tempat lain.");//Warning tempat duduk sudah terisi
                    }
                }
                break;

            case 2:
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");//Mengganti null dengan ***
                        }
                    }
                }
                break;

            case 3:
                System.out.println("Keluar dari menu bioskop.");
                sc.close();
                return;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
}




   
        //penonton[baris-1][kolom-1] = nama;

        //System.out.print("Input penonton lainnya? (y/n): ");
        //next = sc.nextLine();

        //if (next.equalsIgnoreCase("n")) {
            //break;
        //}
    }
  


import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        PriorityQueue<Tugas> tugas = new PriorityQueue<Tugas>(new TugasComparator());

        do {
            System.out.println("---------------------");
            System.out.println("1. Tambah Tugas Baru");
            System.out.println("2. Lihat Tugas yang harus diselesaikan");
            System.out.println("3. Selesei Tugas terbaru");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            choice = input.nextInt(); input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama tugas: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan prioritas tugas: ");
                    int prioritas = input.nextInt();
                    tugas.add(new Tugas(nama, prioritas));
                    break;

                case 2:
                    if (tugas.isEmpty()) {
                        System.out.println("Tidak ada tugas yang harus diselesaikan");
                        break;
                    }
                    System.out.printf("Task terdekat yang harus diselesaikan: %s\n", tugas.peek().getkegiatan());
                    break;
            
                case 3:
                    if (tugas.isEmpty()) {
                        System.out.println("Tidak ada tugas");
                        break;
                    }
                    System.out.printf("%s selesai dilaksanakan, ", tugas.poll().getkegiatan());
                    if (tugas.isEmpty()) {
                        System.out.printf("Tidak ada tugas lagi\n");
                        break;
                    } else {
                        System.out.printf("berikutnya %s\n", tugas.peek().getkegiatan());
                    }
                    break;
                
                case 4:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (choice!=4);
    }
}
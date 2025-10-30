import java.util.Scanner;

    public class Main {

        public static final int HARGASIMENTAL1 = 15500000;
        public static final int HARGASIMENTALJANTAN1 = HARGASIMENTAL1;
        public static final int HARGASIMENTAL2 = 23000000;
        public static final int HARGASIMENTALJANTAN2 = HARGASIMENTAL2;
        public static final int HARGASIMENTAL3 = 25000000;
        public static final int HARGASIMENTALJANTAN3 = HARGASIMENTAL3;
        public static final int HARGASIMENTALBETINA1 = 11000000;
        public static final int HARGASIMENTALBETINA2 = 16000000;
        public static final int HARGASIMENTALBETINA3 = 19000000;
        public static final int HARGALIMOUSINJANTAN1 = 17000000;
        public static final int HARGALIMOUSINJANTAN2 = 25000000;
        public static final int HARGALIMOUSINJANTAN3 = 27000000;
        public static final int HARGALIMOUSINBETINA1 = 12000000;
        public static final int HARGALIMOUSINBETINA2 = 18000000;
        public static final int HARGALIMOUSINBETINA3 = 21000000;
        public static final int HARGABRAHMANJANTAN1 = 14000000;
        public static final int HARGABRAHMANJANTAN2 = 20000000;
        public static final int HARGABRAHMANJANTAN3 = 23000000;
        public static final int HARGABRAHMANBETINA1 = 10000000;
        public static final int HARGABRAHMANBETINA2 = 16000000;
        public static final int HARGABRAHMANBETINA3 = 18000000;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            System.out.println("=== PEMBELIAN SAPI ===");
            System.out.println("Pilih jenis sapi:");
            System.out.println("1. Simental");
            System.out.println("2. Limousin");
            System.out.println("3. Brahman");
            System.out.print("Masukkan pilihan (1-3): ");

            //Refactoring Inline Variable untuk menyimpan pilihan jenis sapi
            switch (input.nextInt()) {
                case 1:
                    Sapi.setPilihanJenisSapi("Simental");
                    break;
                case 2:
                    Sapi.setPilihanJenisSapi("Limousin");
                    break;
                case 3:
                    Sapi.setPilihanJenisSapi("Brahman");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }
    
            System.out.println("\nPilih jenis kelamin:");
            System.out.println("1. Jantan");
            System.out.println("2. Betina");
            System.out.print("Masukkan pilihan (1-2): ");

            //Refactoring Inline Variable untuk menyimpan pilihan jenis kelamin
            switch (input.nextInt()) {
                case 1:
                    Sapi.setPilihanJenisKelamin("Jantan");
                    break;
                case 2:
                    Sapi.setPilihanJenisKelamin("Betina");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }
    
            System.out.println("\nPilih PilihanUmur sapi:");
            System.out.println("1. 1-12 bulan");
            System.out.println("2. 12-24 bulan");
            System.out.println("3. >24 bulan");
            System.out.print("Masukkan pilihan (1-3): ");

            //Refactoring Inline Variable untuk menyimpan pilihan umur
            switch (input.nextInt()) {
                case 1:
                    Sapi.setPilihanUmur("1-12 bulan");
                    break;
                case 2:
                    Sapi.setPilihanUmur("12-24 bulan");
                    break;
                case 3:
                    Sapi.setPilihanUmur(">24 bulan");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }
    
            System.out.print("\nMasukkan jumlah unit yang dibeli: ");
            Sapi.setJumlahBeli(input.nextInt());
    
            // Refactoring Extract Method untuk menghitung harga sapi Simental
            if (Sapi.hitungHargaSimental(Sapi.getPilihanJenisSapi())) {
                if (Sapi.getPilihanJenisKelamin().equals("Jantan")) {
                    if (Sapi.getPilihanUmur().equals("1-12 bulan")) Sapi.setHarga(HARGASIMENTALJANTAN1);
                    else if (Sapi.getPilihanUmur().equals("12-24 bulan")) Sapi.setHarga(HARGASIMENTALJANTAN2);
                    else if (Sapi.getPilihanUmur().equals(">24 bulan")) Sapi.setHarga(HARGASIMENTALJANTAN3);       //REFACTORING Replace Magic Number with Symbolic Constant
                } else {
                    if (Sapi.getPilihanUmur().equals("1-12 bulan")) Sapi.setHarga(HARGASIMENTALBETINA1);
                    else if (Sapi.getPilihanUmur().equals("12-24 bulan")) Sapi.setHarga(HARGASIMENTALBETINA2);
                    else if (Sapi.getPilihanUmur().equals(">24 bulan")) Sapi.setHarga(HARGASIMENTALBETINA3);
                }
            // Refactoring Extract Method untuk menghitung harga sapi Limousin
            } else if (Sapi.hitungHargaLimousin(Sapi.getPilihanJenisSapi())) {
                if (Sapi.getPilihanJenisKelamin().equals("Jantan")) {
                    if (Sapi.getPilihanUmur().equals("1-12 bulan")) Sapi.setHarga(HARGALIMOUSINJANTAN1);
                    else if (Sapi.getPilihanUmur().equals("12-24 bulan")) Sapi.setHarga(HARGALIMOUSINJANTAN2);
                    else if (Sapi.getPilihanUmur().equals(">24 bulan")) Sapi.setHarga(HARGALIMOUSINJANTAN3);       //REFACTORING Replace Magic Number with Symbolic Constant
                } else {
                    if (Sapi.getPilihanUmur().equals("1-12 bulan")) Sapi.setHarga(HARGALIMOUSINBETINA1);
                    else if (Sapi.getPilihanUmur().equals("12-24 bulan")) Sapi.setHarga(HARGALIMOUSINBETINA2);
                    else if (Sapi.getPilihanUmur().equals(">24 bulan")) Sapi.setHarga(HARGALIMOUSINBETINA3);
                }
            //Refactoring Extract Method untuk menghitung harga sapi Brahman
            } else if (Sapi.hitungHargaBrahman(Sapi.getPilihanJenisSapi())) {
                if (Sapi.getPilihanJenisKelamin().equals("Jantan")) {
                    if (Sapi.getPilihanUmur().equals("1-12 bulan")) Sapi.setHarga(HARGABRAHMANJANTAN1);
                    else if (Sapi.getPilihanUmur().equals("12-24 bulan")) Sapi.setHarga(HARGABRAHMANJANTAN2);      //REFACTORING Replace Magic Number with Symbolic Constant
                    else if (Sapi.getPilihanUmur().equals(">24 bulan")) Sapi.setHarga(HARGABRAHMANJANTAN3);
                } else {
                    if (Sapi.getPilihanUmur().equals("1-12 bulan")) Sapi.setHarga(HARGABRAHMANBETINA1);
                    else if (Sapi.getPilihanUmur().equals("12-24 bulan")) Sapi.setHarga(HARGABRAHMANBETINA2);
                    else if (Sapi.getPilihanUmur().equals(">24 bulan")) Sapi.setHarga(HARGABRAHMANBETINA3);
                }

            }
    
            if (Sapi.getHarga() == 0) {
                System.out.println("\nData harga tidak ditemukan. Pastikan input benar.");
            } else {
                System.out.println("\n=== RINCIAN PEMBELIAN ===");
                System.out.println("Jenis sapi    : " + Sapi.getPilihanJenisSapi());
                System.out.println("Jenis kelamin : " + Sapi.getPilihanJenisKelamin());
                System.out.println("Umur          : " + Sapi.getPilihanUmur());
                System.out.println("Jumlah beli   : " + Sapi.getJumlahBeli());
                System.out.println("Harga satuan  : Rp" + String.format("%,.0f", Sapi.getHarga()));
                System.out.println("Total harga   : Rp" + String.format("%,.0f", Sapi.getHarga() * Sapi.getJumlahBeli())); // Refactoring Inline Variable
            }
    
            input.close();
        }

    }

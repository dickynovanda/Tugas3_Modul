public class Sapi {
    //Refactoring Move Field Variable untuk menyimpan pilihan user
    private static String PilihanJenisSapi;
    private static String PilihanJenisKelamin; //Refactoring Rename Variable untuk memperjelas nama variabel
    private static String PilihanUmur;
    private static int jumlahBeli;
    private static double harga = 0;

    static boolean hitungHargaBrahman(String jenisSapi) {
        return jenisSapi.equals("Brahman");
    }

    static boolean hitungHargaLimousin(String jenisSapi) {
        return jenisSapi.equals("Limousin");
    }

    static boolean hitungHargaSimental(String jenisSapi) {
        return jenisSapi.equals("Simental");
    }

    //Refactoring Encapsulate Field untuk mengakses pilihan user
    public static String getPilihanJenisSapi() {
        return PilihanJenisSapi;
    }

    public static void setPilihanJenisSapi(String pilihanJenisSapi) {
        PilihanJenisSapi = pilihanJenisSapi;
    }

    public static String getPilihanJenisKelamin() {
        return PilihanJenisKelamin;
    }

    public static void setPilihanJenisKelamin(String pilihanJenisKelamin) {
        PilihanJenisKelamin = pilihanJenisKelamin;
    }

    public static String getPilihanUmur() {
        return PilihanUmur;
    }

    public static void setPilihanUmur(String pilihanUmur) {
        PilihanUmur = pilihanUmur;
    }

    public static int getJumlahBeli() {
        return jumlahBeli;
    }

    public static void setJumlahBeli(int jumlahBeli) {
        Sapi.jumlahBeli = jumlahBeli;
    }

    public static double getHarga() {
        return harga;
    }

    public static void setHarga(double harga) {
        Sapi.harga = harga;
    }
}

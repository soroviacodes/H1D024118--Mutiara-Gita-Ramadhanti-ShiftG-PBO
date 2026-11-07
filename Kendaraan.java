public abstract class Kendaraan {

    // Syarat 2: konstanta global (nilainya tidak bisa diubah)
    public static final int BATAS_BENSIN = 50;

    // Syarat 2: atribut final (diisi sekali di konstruktor, tidak boleh diubah lagi)
    private final String nomorKendaraan;

    // Syarat 1 dan 3: atribut biasa, semuanya private
    private String merek;
    private int bensin;        // dalam liter
    private int totalJarak;

    // Syarat 3: konstruktor 1 (bensin langsung penuh)
    public Kendaraan(String merek, String nomorKendaraan) {
        this.merek = merek;
        this.nomorKendaraan = nomorKendaraan;
        this.bensin = BATAS_BENSIN;
        this.totalJarak = 0;
    }

    // Syarat 3: konstruktor 2 (jumlah bensin awal kita tentukan sendiri)
    public Kendaraan(String merek, String nomorKendaraan, int bensin) {
        this.merek = merek;
        this.nomorKendaraan = nomorKendaraan;
        this.bensin = bensin;
        this.totalJarak = 0;
    }

    // Getter dan setter (nomorKendaraan hanya getter, karena final)
    public String getNomorKendaraan() { return nomorKendaraan; }

    public String getMerek() { return merek; }
    public void setMerek(String merek) { this.merek = merek; }

    public int getBensin() { return bensin; }
    public void setBensin(int bensin) { this.bensin = bensin; }

    public int getTotalJarak() { return totalJarak; }
    public void setTotalJarak(int totalJarak) { this.totalJarak = totalJarak; }

    // Syarat 1: method void (tidak mengembalikan apa-apa, hanya mengubah state)
    public void isiBensin(int liter) {
        bensin = bensin + liter;
        System.out.println(merek + " diisi " + liter + " liter. Bensin sekarang " + bensin + " liter");
    }

    // Syarat 1: method fungsi (mengembalikan nilai)
    public boolean cukupBensin(int butuh) {
        return bensin >= butuh;
    }

    // Method biasa, nanti di-override oleh subclass
    public void info() {
        System.out.println(merek + " | nomor " + nomorKendaraan + " | bensin " + bensin + " liter"
                + " | total jarak " + totalJarak + " km");
    }

    // Syarat 7: abstract method (tanpa isi, wajib diisi oleh subclass)
    public abstract void jalankan(int jarak);
}

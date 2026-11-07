// Syarat 10: Mobil meng-implement DUA interface sekaligus
public class Mobil extends Kendaraan implements BisaServis, BisaIsiBahanBakar {

    private int jumlahPenumpang;

    // Syarat 5: super(...) memanggil konstruktor 1 milik Kendaraan
    public Mobil(String merek, String nomorKendaraan, int jumlahPenumpang) {
        super(merek, nomorKendaraan);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    // Syarat 3: konstruktor overload, super(...) memanggil konstruktor 2 milik Kendaraan
    public Mobil(String merek, String nomorKendaraan, int jumlahPenumpang, int bensin) {
        super(merek, nomorKendaraan, bensin);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public int getJumlahPenumpang() { return jumlahPenumpang; }
    public void setJumlahPenumpang(int jumlahPenumpang) { this.jumlahPenumpang = jumlahPenumpang; }

    // Syarat 6 dan 8: isi abstract method, ada if/else yang membaca dan mengubah state
    @Override
    public void jalankan(int jarak) {
        int butuh = jarak / 10;   // mobil: 1 liter untuk 10 km
        if (cukupBensin(butuh)) {
            setBensin(getBensin() - butuh);
            setTotalJarak(getTotalJarak() + jarak);
            System.out.println(getMerek() + " melaju " + jarak + " km. Sisa bensin " + getBensin() + " liter");
        } else {
            System.out.println(getMerek() + " gagal melaju, bensin kurang (butuh " + butuh
                    + " liter, ada " + getBensin() + " liter)");
        }
    }

    // Syarat 5 dan 6: override info() dan memanggil super.info()
    @Override
    public void info() {
        super.info();
        System.out.println("   Penumpang: " + jumlahPenumpang);
    }

    // dari interface BisaServis
    @Override
    public void servis() {
        System.out.println(getMerek() + " selesai diservis.");
    }

    // dari interface BisaIsiBahanBakar
    @Override
    public void isiPenuh() {
        isiBensin(BATAS_BENSIN - getBensin());
    }
}

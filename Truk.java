// Truk meng-implement satu interface: BisaIsiBahanBakar
public class Truk extends Kendaraan implements BisaIsiBahanBakar {

    private int muatan;   // dalam kg

    public Truk(String merek, String nomorKendaraan, int muatan) {
        super(merek, nomorKendaraan);
        this.muatan = muatan;
    }

    public int getMuatan() { return muatan; }
    public void setMuatan(int muatan) { this.muatan = muatan; }

    @Override
    public void jalankan(int jarak) {
        int butuh = jarak / 5;   // truk: 1 liter untuk 5 km (paling boros)
        if (cukupBensin(butuh)) {
            setBensin(getBensin() - butuh);
            setTotalJarak(getTotalJarak() + jarak);
            System.out.println(getMerek() + " melaju " + jarak + " km. Sisa bensin " + getBensin() + " liter");
        } else {
            System.out.println(getMerek() + " gagal melaju, bensin kurang (butuh " + butuh
                    + " liter, ada " + getBensin() + " liter)");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("   Muatan: " + muatan + " kg");
    }

    @Override
    public void isiPenuh() {
        isiBensin(BATAS_BENSIN - getBensin());
    }
}

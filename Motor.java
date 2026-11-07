// Motor meng-implement satu interface: BisaServis
public class Motor extends Kendaraan implements BisaServis {

    private String tipe;   // contoh: "matic" atau "sport"

    public Motor(String merek, String nomorKendaraan, String tipe) {
        super(merek, nomorKendaraan);
        this.tipe = tipe;
    }

    public String getTipe() { return tipe; }
    public void setTipe(String tipe) { this.tipe = tipe; }

    @Override
    public void jalankan(int jarak) {
        int butuh = jarak / 40;   // motor: 1 liter untuk 40 km (lebih irit)
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
        System.out.println("   Tipe: " + tipe);
    }

    @Override
    public void servis() {
        System.out.println(getMerek() + " selesai diservis.");
    }
}

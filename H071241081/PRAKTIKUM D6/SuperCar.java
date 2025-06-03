public class SuperCar extends Kendaraan implements IBergerak{
    String jenisSuperCar ;
    double  kecepatan = 0.0;
    boolean sedangBerjalan = false ;

    public SuperCar(String id, String merek, String model, String warna, int tahunProduksi, String jenisSuperCar) {
        this.id = id;
        this.merek = merek;
        this.model = model;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.jenisSuperCar = jenisSuperCar;
        this.tipeKendaraan = "Mobil" ;
    }

    public String getJenisSuperCar () {
        return jenisSuperCar ;
    }

    public void setJenisSuperCar (String jenisSuperCar) {
        this.jenisSuperCar = jenisSuperCar ;
    }
    @Override
    public double hitungPajak() {
        return 0.0;
    }
    @Override
    public String getTipeKendaraan() {
        return tipeKendaraan;
    
    }
    @Override
    public boolean mulai() {
        if (!sedangBerjalan) {
            sedangBerjalan = true;
            kecepatan = 3.0; // Kecepatan awal kuda (misalnya 10 km/jam)
            System.out.println("Supercar mulai bergerak.");
            return true;
        }
        System.out.println("Supercar sudah mulai bergerak.");
        return false;    
}
    @Override
    public boolean berhenti() {
        if (sedangBerjalan) {
            sedangBerjalan = false;
            kecepatan = 0.0;
            System.out.println("Supercar berhenti.");
            return true;
        }
        System.out.println("Supercar sudah berhenti.");
        return false;

}
    @Override
    public double getKecepatan() {
        return this.kecepatan;
}
    @Override
    public void setKecepatan(double kecepatan) {
    if (sedangBerjalan) {
        this.kecepatan = kecepatan;
        System.out.println("Kecepatan Supercar diubah menjadi " + kecepatan + " km/jam");
    } else {
        System.out.println("Supercar belum mulai berjalan, tidak bisa ubah kecepatan.");
    }
}
}
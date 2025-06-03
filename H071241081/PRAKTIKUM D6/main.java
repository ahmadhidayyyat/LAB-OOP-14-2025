public class main {

    public static void main(String[] args) {
        SuperCar mobil1 = new SuperCar(
            "SC001",           // id
            "Ferrari",         // merek
            "F8 Tributo",      // model
            "Merah",           // warna
            2022,              // tahun produksi
            "Sport Coupe"      // jenis supercar
        );

        // Menampilkan jenis supercar
        System.out.println("Jenis Supercar: " + mobil1.getJenisSuperCar());
        System.out.println("Tipe Kendaraan: " + mobil1.getTipeKendaraan());

        // Mulai bergerak
        mobil1.mulai();

        // Ubah kecepatan
        mobil1.setKecepatan(180.0);

        // Tampilkan kecepatan sekarang
        System.out.println("Kecepatan saat ini: " + mobil1.getKecepatan() + " km/jam");

        // Berhenti
        mobil1.berhenti();
    }
}
public class MatakuliahMain {
    public static void main(String[] args) {

        Matakuliah10 matkul1 = new Matakuliah10();
        matkul1.kodemk = "ALSD_SI";
        matkul1.namamk = "Algoritma dan Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahjam = 4;

        System.out.println("========== INFO MATKUL ==========");
        matkul1.tampilinformasi();
        System.out.println("==============================");
        matkul1.ubahsks(2);
        matkul1.tambahjam(2);
        matkul1.kurangijam(0);
        System.out.println("==============================");
        System.out.println();

        System.out.println("========== UPDATE MATKUL ==========");
        matkul1.tampilinformasi();
        System.out.println();

        Matakuliah10 matkul2 = new Matakuliah10("PRAKALSD_SIB", "Praktikum Algoritma dan Struktur Data", 4, 6);
        System.out.println("========== INFO MATKUL (Konstruktor) ==========");
        matkul2.tampilinformasi();
        System.out.println("==============================");
        matkul2.tambahjam(2);
        System.out.println("==============================");

        System.out.println();
        System.out.println("========== UPDATE MATKUL (Konstruktor)==========");
        matkul2.tampilinformasi();

    }
}

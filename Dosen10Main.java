public class Dosen10Main {
    public static void main(String[] args) {
        Dosen10 dosen1 = new Dosen10();
        dosen1.iddosen = "MCI1";
        dosen1.nama = "Meylani Cahya Ilahi, S.T M.T";
        dosen1.statusaktif = true;
        dosen1.tahunbergabung = 2023;
        dosen1.bidangkeahlian = "Teknik Informatika";

        System.out.println("===== Data Dosen 1 =====");
        dosen1.tampilinformasi();

        dosen1.setstatusaktif(true);
        dosen1.hitungmasakerja(2024);
        dosen1.ubahkeahlian("Teknologi Informasi");
        System.out.println();
        System.out.println("===== Data Dosen 1 Setelah di Update =====");
        dosen1.tampilinformasi();

        System.out.println();
        System.out.println("===== Data Dosen 2 (Konstruktor) =====");
        Dosen10 dosen2 = new Dosen10("NJM", "NA JAEMIN, S.Kom M.kom", false, 1945, "Teknik Informatika");
        dosen2.tampilinformasi();
        System.out.println();
        System.out.println("===== Data Dosen 2 Setelah di Update ===== ");
        dosen2.ubahkeahlian("Sistem Informasi");
        dosen2.tampilinformasi();

    }
}

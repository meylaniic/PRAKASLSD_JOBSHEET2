public class Dosen10 {
    String iddosen;
    String nama;
    boolean statusaktif;
    int tahunbergabung, tahun;
    String bidangkeahlian;

    public Dosen10 () {

    }

    public Dosen10 (String idds, String nm, boolean stts, int thngbg, String bdg){
        iddosen = idds;
        nama = nm;
        statusaktif = stts;
        tahunbergabung = thngbg;
        bidangkeahlian = bdg;
    }

    void tampilinformasi() {
        System.out.println("Id Dosen : " + iddosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status Dosen : " + statusaktif );
        System.out.println("Tahun Bergabung Dosen : " +tahunbergabung);
        System.out.println("Bidang Keahlian dosen : " + bidangkeahlian);
        System.out.println("Masa kerja : " + tahun);
    }

    void setstatusaktif(boolean status) {
        statusaktif = status;

    }

    int hitungmasakerja(int thnskrg) {
        return tahun = thnskrg - tahunbergabung;
    }

    void ubahkeahlian(String bidang) {
        bidangkeahlian = bidang;
    }

}

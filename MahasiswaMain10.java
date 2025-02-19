public class MahasiswaMain10 {
    public static void main(String[] args) {
        Mahasiswa10 mhs1 = new Mahasiswa10();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;
        System.out.println();
        
        mhs1.tampilkaninformasi();
        System.out.println();
        mhs1.ubahkelas("S1 2K");
        mhs1.updateipk(3.60);
        mhs1.tampilkaninformasi();
        System.out.println();

        Mahasiswa10 mhs2 = new Mahasiswa10("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateipk(3.30);
        mhs2.tampilkaninformasi();
        System.out.println();

        Mahasiswa10 mahasiswameylani = new Mahasiswa10("Meylani Cahya Ilahi", "244107060082", 4.00, "SIB 1D");
        mahasiswameylani.tampilkaninformasi();
        System.out.println();
    }
}

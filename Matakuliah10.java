public class Matakuliah10 {
    String kodemk;
    String namamk;
    int sks, jumlahjam;

    public Matakuliah10 () {

    }

    public Matakuliah10 (String kdmk, String nmmk, int sks, int jumlahjam) {
        kodemk = kdmk;
        namamk = nmmk;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tampilinformasi() {
        System.out.println("Kode Matkul : " + kodemk);
        System.out.println("Nama Matkul : " + namamk);
        System.out.println("SKS : " + sks);
        System.out.println("Total jam pertemuan perminggu : " + jumlahjam);
    }

    void ubahsks(int sksbaru) {
        sks = sksbaru;
        System.out.println("SKS telah diubah menjadi " +sks);
    }

    void tambahjam (int jam) {
        jumlahjam += jam;
        System.out.println("Jam telah diubah menjadi " + jumlahjam);
    }

    void kurangijam (int krgjam) {
        if (krgjam > jumlahjam) {
            System.out.println("Pengurangan tidak dapat dilakukan karena jumlah jam yang tersisa tidak cukup untuk dikurangi");
        } else {
            jumlahjam -= krgjam;
            System.out.println("Jam telah dikurangi menjadi " +jumlahjam);
        }
    }
    
}

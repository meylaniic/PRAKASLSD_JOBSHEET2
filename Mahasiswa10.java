public class Mahasiswa10 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa10() {
    }

    public Mahasiswa10(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }


    void tampilkaninformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " +ipk);
        System.out.println("Kelas : " + kelas);
    }

    void ubahkelas(String kelasbaru) {
        kelas = kelasbaru;
    }

    void updateipk(double ipkbaru) {
        if (ipkbaru >= 0.0 && ipkbaru <= 4.00) {
            ipk = ipkbaru;

        } else {
            System.out.println("IPK tidak valid, harus antara rentang 0.0 dan 4.0");
            
        } 
    }

    String nilaikinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    
}



package service;

import model.Anggota;
import model.Buku;

public class PinnjamBukuService {

    public void pinjamBuku(Buku buku, Anggota anggota) {
        if (!buku.isDipinjam()) {
            buku.setDipinjam(true);
            System.out.println(anggota.getNama() + " meminjam buku: " + buku.getJudul());
        } else {
            System.out.println("Buku " + buku.getJudul() + " sedang dipinjam.");
        }
    }
    public void kembalikanBuku(Buku buku, Anggota anggota) {
        if (buku.isDipinjam()) {
            buku.setDipinjam(false);
            System.out.println(anggota.getNama() + " mengembalikan buku: " + buku.getJudul());
        } else {
            System.out.println("Buku " + buku.getJudul() + " tidak sedang dipinjam.");
        }
    }
}

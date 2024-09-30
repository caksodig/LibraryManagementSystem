package main;

import model.Buku;
import model.Anggota;
import service.PinnjamBukuService;

public class main {
    public static void main(String[] args) {
        // Membuat objek buku dan anggota
        Buku buku1 = new Buku("Sumala", "VitoNaryama", "123456789");
        Anggota anggota1 = new Anggota("Alice", "A001");

        // Membuat service peminjaman buku
        PinnjamBukuService service = new PinnjamBukuService();

        // Proses peminjaman dan pengembalian buku
        service.pinjamBuku(buku1, anggota1);
        service.kembalikanBuku(buku1, anggota1);
    }
}

package model;

public class Buku {
    private String judul;
    private String penulis;
    private String isbn;
    private boolean dipinjam;

    public Buku(String judul, String penulis, String isbn){
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
        this.dipinjam = false;
    }
    public String getJudul(){
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public String getIsbn(){
        return isbn;
    }
    public boolean isDipinjam(){
        return dipinjam;
    }
    public void setDipinjam (boolean dipinjam){
        this.dipinjam = dipinjam;
    }
}


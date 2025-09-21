package model;

public class Peminjaman {
    private String nama;
    private String nim;
    private String departemen;
    private String barang;
    private int jumlah;


    public Peminjaman(String nama, String nim, String departemen, String barang, int jumlah) {
        this.nama = nama;
        this.nim = nim;
        this.departemen = departemen;
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getDepartemen() {
        return departemen;
    }

    public String getBarang() {
        return barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    
    public void tampilkanInfo() {
        System.out.println("Nama        : " + getNama());
        System.out.println("NIM         : " + getNim());
        System.out.println("Departemen  : " + getDepartemen());
        System.out.println("Nama Barang : " + getBarang());
        System.out.println("Jumlah      : " + getJumlah());
    }
}

package model;

public class PeminjamanNonElektronik extends Peminjaman {
    private String kategoriBarang; 

    public PeminjamanNonElektronik(String nama, String nim, String departemen,
                                   String barang, int jumlah, String kategoriBarang) {
        super(nama, nim, departemen, barang, jumlah);
        this.kategoriBarang = kategoriBarang;
    }

    public String getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kategori Barang       : " + getKategoriBarang());
    }
}

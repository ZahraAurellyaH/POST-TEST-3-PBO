package model;

public class PeminjamanElektronik extends Peminjaman {
    private String kondisiBarang;

    public PeminjamanElektronik(String nama, String nim, String departemen,
                                String barang, int jumlah, String kondisiBarang) {
        super(nama, nim, departemen, barang, jumlah);
        this.kondisiBarang = kondisiBarang;
    }

    public String getKondisiBarang() {
        return kondisiBarang;
    }

    public void setKondisiBarang(String kondisiBarang) {
        this.kondisiBarang = kondisiBarang;
    }

    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kondisi Barang    : " + getKondisiBarang());
    }
}

# POST-TEST-3-PBO

## NAMA: ZAHRA AURELLYA HERDIANSYAH

## NIM: 2409116062

<img width="402" height="278" alt="image" src="https://github.com/user-attachments/assets/0d288ce9-b63e-42f0-8798-a948186e7e66" />

### Struktur Program Peminjaman Barang Sekre
1. Package main
- Berisi kelas `Main.java` yang menjadi titik masuk (entry point) program.
- Kelas ini menampilkan menu utama (tambah, lihat, ubah, hapus, keluar) dan memanggil fungsi dari PeminjamanService.

2. Package model

- Berisi kelas-kelas yang merepresentasikan data (entity) dalam sistem.
- `Peminjaman.java` → Superclass berisi atribut umum (nama, NIM, departemen, barang, jumlah) serta getter, setter, dan method tampilkanInfo().
- `PeminjamanElektronik.java` → Subclass dari Peminjaman, digunakan khusus untuk barang elektronik dengan tambahan atribut kondisi.
- `PeminjamanNonElektronik.java` → Subclass dari Peminjaman, digunakan untuk barang non-elektronik dengan tambahan atribut bahan.

`Konsep inheritance` (pewarisan) digunakan agar subclass dapat menambahkan atribut spesifik di atas atribut umum dari superclass.

3. Package service
- Berisi kelas PeminjamanService.java yang menangani logika bisnis aplikasi.
- Fungsi utama:

`tambah()` : menambahkan data peminjaman baru (memilih jenis elektronik atau non-elektronik).

`lihat()` : menampilkan daftar peminjaman, dipisahkan antara barang elektronik dan non-elektronik.

`ubah()` : mengubah data lama, termasuk mengganti jenis barang.

`hapus()` : menghapus data peminjaman berdasarkan pilihan pengguna.

### Main.Java

<img width="439" height="113" alt="image" src="https://github.com/user-attachments/assets/dc270845-33c3-4607-94fa-58b3d4e97c16" />

File ini berada pada package `main`.
- Mengimpor `PeminjamanService` dari package service untuk menjalankan fitur tambah, lihat, ubah, dan hapus data.
- Mengimpor `Scanner` dari Java untuk membaca input pengguna.
- Berfungsi sebagai entry point program dengan menampilkan menu utama dan memanggil metode dari `PeminjamanService`.

#
<img width="694" height="137" alt="image" src="https://github.com/user-attachments/assets/346d7986-9bd0-4f7a-b6bb-56e445f3b3da" />

Bagian kode ini adalah **awal dari class `Main`** dan **metode `main`**, fungsinya:

* Membuat objek `Scanner` (`sc`) untuk membaca input dari pengguna.
* Membuat objek `PeminjamanService` (`ps`) untuk mengelola operasi peminjaman (tambah, lihat, ubah, hapus).
* Mendeklarasikan variabel `pil` untuk menyimpan pilihan menu dari pengguna.

Ini menjadi **titik masuk (entry point) program** di mana menu interaktif akan dijalankan.

#
<img width="973" height="328" alt="image" src="https://github.com/user-attachments/assets/b36d0c10-06b0-420a-b525-37f8782474f3" />

Bagian kode ini adalah **loop menu utama** program, fungsinya:
* Menampilkan daftar pilihan menu untuk manajemen peminjaman: **Tambah, Lihat, Ubah, Hapus, Keluar**.
* Membaca input pengguna sebagai string, lalu mencoba **mengubahnya menjadi angka** (`Integer.parseInt`).
* Jika input bukan angka, akan ditangani exception dan variabel `pil` di-set `-1` agar dianggap pilihan tidak valid.
Ini memungkinkan program tetap aman dari input yang salah dan terus menampilkan menu sampai pengguna memilih keluar.

#
<img width="897" height="297" alt="image" src="https://github.com/user-attachments/assets/ba15f8e6-7b80-4ce1-8a9d-f102ebe142f1" />

Bagian kode ini adalah **struktur pengendalian menu** di `Main`:
* Menggunakan `switch` untuk mengeksekusi **aksi sesuai pilihan** (`pil`) dari pengguna:
  * `1` → memanggil `ps.tambah()` untuk menambah data peminjaman.
  * `2` → memanggil `ps.lihat()` untuk menampilkan daftar peminjaman.
  * `3` → memanggil `ps.ubah()` untuk mengubah data peminjaman.
  * `4` → memanggil `ps.hapus()` untuk menghapus data peminjaman.
  * `5` → menampilkan pesan “Terima kasih!” dan keluar dari program.
  * `default` → menampilkan pesan “Pilihan tidak valid!” jika input tidak sesuai.
* `do…while(pil != 5)` memastikan **menu terus muncul** sampai pengguna memilih opsi keluar (`5`).


### Peminjaman.Java

<img width="196" height="25" alt="image" src="https://github.com/user-attachments/assets/ff275713-b856-4cd8-a570-a40ca91fda3b" />

Package `model` berisi class yang merepresentasikan struktur data peminjaman. Di dalamnya terdapat properti, constructor, dan metode akses yang digunakan sebagai dasar pengolahan data pada sistem manajemen peminjaman barang.

#
<img width="382" height="181" alt="image" src="https://github.com/user-attachments/assets/5dda1412-d899-4219-b5e1-65bf2ebfcd5d" />

- Merupakan superclass yang menyimpan atribut umum peminjaman, yaitu:
  - nama : nama peminjam
  - nim : nomor induk mahasiswa
  - departemen : asal departemen
  - barang : nama barang yang dipinjam
  - jumlah : banyaknya barang yang dipinjam
- Atribut dibuat private untuk menerapkan enkapsulasi, dan diakses melalui getter & setter.
- Menyediakan metode tampilkanInfo() untuk menampilkan data peminjaman.

#
<img width="1096" height="196" alt="image" src="https://github.com/user-attachments/assets/1b51816e-71d4-4e71-ae49-ab091d2a6b8c" />

`Constructor Peminjaman` berfungsi untuk membuat objek baru dan langsung mengisi semua atribut (nama, nim, departemen, barang, jumlah) dengan data yang diberikan saat objek dibuat.

#
<img width="457" height="516" alt="image" src="https://github.com/user-attachments/assets/7284a4bd-e7b0-491b-985a-c461df8cc9b9" />

- Digunakan untuk mengambil nilai dari atribut yang bersifat private.
- Getter yang tersedia:
  - getNama() → mengembalikan nilai nama.
  - getNim() → mengembalikan nilai nim.
  - getDepartemen() → mengembalikan nilai departemen.
  - getBarang() → mengembalikan nilai barang.
  - getJumlah() → mengembalikan nilai jumlah.
- Dengan getter, data tetap terjaga (enkapsulasi) tetapi bisa diakses dari luar kelas dengan cara yang aman.

#
<img width="645" height="518" alt="image" src="https://github.com/user-attachments/assets/d29c4c43-7042-469a-8b2c-b1019796fbea" />

- Digunakan untuk mengubah atau menetapkan nilai pada atribut private.
- Setter yang tersedia:
  - setNama(String nama) → menetapkan nilai nama.
  - setNim(String nim) → menetapkan nilai nim.
  - setDepartemen(String departemen) → menetapkan nilai departemen.
  - setBarang(String barang) → menetapkan nilai barang.
  - setJumlah(int jumlah) → menetapkan nilai jumlah.
- Dengan setter, nilai atribut dapat dimodifikasi secara terkendali, tetap menjaga prinsip enkapsulasi.

#
<img width="713" height="224" alt="image" src="https://github.com/user-attachments/assets/60a16ddb-d9d6-45ba-9f77-c37fb1cd7127" />

Disediakan method `tampilkanInfo()` yang langsung menampilkan semua informasi peminjaman ke layar.


### PeminjamanElektronik.Java

<img width="193" height="29" alt="image" src="https://github.com/user-attachments/assets/86157f3b-bc18-46a7-8137-eacbfb4d00be" />

Package `model` berisi class yang merepresentasikan struktur data peminjaman.

#
<img width="668" height="56" alt="image" src="https://github.com/user-attachments/assets/13de4546-6c26-4fcc-b704-237083d8c899" />

`PeminjamanElektronik` adalah subclass dari `Peminjaman` yang menambahkan atribut **kondisiBarang** untuk menyimpan kondisi barang elektronik, dengan akses melalui getter-setter serta override method `tampilkanInfo()`.

#
<img width="1027" height="134" alt="image" src="https://github.com/user-attachments/assets/519c4b11-c124-4771-b64e-7d69dfbc4771" />

Konstruktor tersebut digunakan untuk menginisialisasi objek **`PeminjamanElektronik`** dengan memanggil konstruktor superclass `Peminjaman` dan menambahkan atribut baru **`kondisiBarang`**.

#
<img width="715" height="194" alt="image" src="https://github.com/user-attachments/assets/c930deec-284d-496c-b117-71d8a3ff0beb" />

Method **`getKondisiBarang()`** digunakan untuk mengambil nilai kondisi barang elektronik, sedangkan **`setKondisiBarang(String kondisiBarang)`** digunakan untuk mengubah atau menetapkan nilai kondisi barang tersebut.

#
<img width="929" height="181" alt="image" src="https://github.com/user-attachments/assets/57e717dd-9964-4429-8ae2-b137a3ee91e5" />

Method **`tampilkanInfo()`** dioverride untuk menambahkan informasi **kondisi barang elektronik** setelah menampilkan data umum dari superclass `Peminjaman`.


### PeminjamanNonElektronik.Java

<img width="193" height="29" alt="image" src="https://github.com/user-attachments/assets/86157f3b-bc18-46a7-8137-eacbfb4d00be" />

Package `model` berisi class yang merepresentasikan struktur data peminjaman.

#
<img width="703" height="63" alt="image" src="https://github.com/user-attachments/assets/ffadb215-1200-46ab-a805-97a61bae40f0" />

`PeminjamanNonElektronik` adalah subclass dari `Peminjaman` yang menambahkan atribut **kategoriBarang** untuk membedakan jenis barang non-elektronik, dengan pengelolaan melalui getter-setter serta override method `tampilkanInfo()`.

#
<img width="1075" height="150" alt="image" src="https://github.com/user-attachments/assets/365c1cd9-5271-4e3f-8fbb-9741a3bbe925" />

Itu adalah **konstruktor** dari kelas `PeminjamanElektronik`.
Fungsinya untuk membuat objek baru dengan mengisi data umum peminjaman (`nama`, `nim`, `departemen`, `barang`, `jumlah`) melalui pemanggilan `super(...)`, lalu menambahkan data khusus elektronik berupa **`kondisiBarang`**.

#
<img width="715" height="191" alt="image" src="https://github.com/user-attachments/assets/a56a8f50-4042-4df1-bfa7-a34d1f664a3f" />

Dua method ini adalah **getter dan setter**:

* `getKondisiBarang()` → mengambil nilai kondisi barang elektronik.
* `setKondisiBarang(String kondisiBarang)` → menetapkan atau mengubah nilai kondisi barang elektronik.

#
<img width="912" height="174" alt="image" src="https://github.com/user-attachments/assets/fad3f472-2326-496b-8330-29689eacc691" />

Method **`tampilkanInfo()`** dioverride untuk menambahkan informasi **kategori barang elektronik** setelah menampilkan data umum dari superclass `Peminjaman`.


### PeminjamanService.Java

<img width="366" height="133" alt="image" src="https://github.com/user-attachments/assets/0ecb16cc-1e36-4d3d-9c40-b6bc29a44436" />

- Package: kelas ini berada di package service.
- Import:
  - model.* → mengimpor semua kelas dari package model (seperti Peminjaman, PeminjamanElektronik, PeminjamanNonElektronik).
  - java.util.ArrayList → digunakan untuk menyimpan daftar data peminjaman.
  - java.util.Scanner → digunakan untuk input data dari pengguna.

 #
 <img width="658" height="95" alt="image" src="https://github.com/user-attachments/assets/60dd575a-8e80-4169-bb08-b3f86d69fb5e" />

Kelas PeminjamanService berfungsi untuk mengelola data peminjaman.
- ArrayList<Peminjaman> daftar → menyimpan kumpulan objek peminjaman (baik elektronik maupun non-elektronik).
- Scanner sc → digunakan untuk menerima input dari pengguna.

#
<img width="890" height="240" alt="image" src="https://github.com/user-attachments/assets/5773a51f-a24f-49df-a1a6-81f2ee9481e2" />

Method `inputString` berfungsi meminta input teks dari pengguna, memastikan tidak kosong, dan mengembalikan hasil yang sudah valid.

#
<img width="1112" height="238" alt="image" src="https://github.com/user-attachments/assets/53c45ece-170b-49a9-b1b5-3d3c95b92736" />

Method `inputNIM` digunakan untuk meminta input NIM dari pengguna, dengan validasi bahwa NIM harus berupa **10 digit angka**, jika tidak sesuai maka akan diminta ulang hingga benar.

#
<img width="926" height="366" alt="image" src="https://github.com/user-attachments/assets/11879948-0b7a-4bae-aaa1-f21d7b05b7c8" />

Method `inputJumlah` digunakan untuk meminta input jumlah barang dari pengguna, dengan validasi bahwa input harus berupa angka dan minimal **1**, jika kosong akan mengembalikan **-1**.

#
<img width="1185" height="538" alt="image" src="https://github.com/user-attachments/assets/d29098ec-4ec3-43f4-9572-d10c9b7f11d8" />

Method `tambah` berfungsi untuk menambahkan data peminjaman baru dengan meminta input pengguna. Data umum seperti **nama, NIM, departemen, barang, dan jumlah** dicatat, lalu pengguna memilih jenis barang. Jika **elektronik**, ditambahkan atribut kondisi barang, sedangkan jika **non-elektronik**, ditambahkan kategori barang. Data kemudian disimpan ke dalam daftar dan ditampilkan pesan bahwa data berhasil ditambah.

#
<img width="992" height="696" alt="image" src="https://github.com/user-attachments/assets/4f8a4782-ac11-45f0-ba80-682ec4f49e95" />

Method `lihat` digunakan untuk menampilkan seluruh data peminjaman. Jika belum ada data, akan muncul pesan **“Belum ada data”**. Data kemudian dipisahkan ke dalam dua daftar: **barang elektronik** dan **non-elektronik**, ditampilkan secara berurutan dengan nomor dan detail informasi tiap peminjaman.

#
<img width="833" height="547" alt="image" src="https://github.com/user-attachments/assets/32ef1282-b229-42e8-b858-065558724c91" />

Method `ubah` digunakan untuk mengedit data peminjaman. Jika daftar kosong, muncul pesan **“Belum ada data”**. Semua data ditampilkan dengan nomor urut, lalu pengguna memilih nomor data yang ingin diubah. Jika nomor yang dipilih tidak valid, sistem akan menolak dan memberi pesan kesalahan.

#
<img width="1115" height="701" alt="image" src="https://github.com/user-attachments/assets/d7ed659a-52e6-4990-9cd0-cb5609d2be89" />

Potongan lanjutan method `ubah` ini berfungsi untuk mengganti data lama dengan data baru.

* Data lama diambil dari daftar berdasarkan indeks pilihan.
* Pengguna mengisi ulang data baru (nama, NIM, departemen, barang, jumlah).
* Jika barang elektronik, diminta **kondisi barang**; jika non-elektronik, diminta **kategori barang**.
* Objek baru dibuat sesuai pilihan lalu **mengganti data lama** di posisi yang sama pada daftar.
* Terakhir, muncul pesan **“Data berhasil diubah!”**.

#
<img width="786" height="625" alt="image" src="https://github.com/user-attachments/assets/3ee62f79-5b5d-43df-8167-54fbcda78c0f" />

Method `hapus` digunakan untuk menghapus data peminjaman.

* Jika daftar masih kosong, tampil pesan **“Belum ada data.”**.
* Semua data ditampilkan dengan nomor urut.
* Pengguna memilih nomor data yang ingin dihapus. Jika nomor tidak valid, muncul pesan error.
* Jika valid, data akan dihapus dari daftar, lalu ditampilkan pesan **“Data berhasil dihapus!”**.

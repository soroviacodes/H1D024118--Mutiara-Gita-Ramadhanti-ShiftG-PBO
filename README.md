Responsi Akhir Praktikum PBO - Sistem Garasi Otomotif

Identitas
- Nama  : Mutiara Gita Ramadhanti
- NIM   : H1D025118
- Tema  : Otomotif

Deskripsi singkat
Program ini mensimulasikan sebuah garasi berisi mobil, motor, dan truk. Setiap kendaraan punya bensin (dalam liter) yang berkurang saat dijalankan dan bisa diisi ulang, dan sebagian bisa diservis. Program dibuat dengan konsep pewarisan (inheritance), abstract class, dan juga interface.

2. Penjelasan alur program
- Main membuat 4 objek: mobil1 (bensin penuh), mobil2 (bensin awal 3), motor, dan truk. Dua cara membuat Mobil itu membuktikan konstruktor overload.
- Tiap kendaraan dijalankan lewat jalankan(jarak). Di dalamnya dihitung bensin yang dibutuhkan (butuh).
- cukupBensin(butuh) mengembalikan true atau false. Kalau true, bensin berkurang dan total jarak bertambah. Kalau false, muncul pesan gagal.
- mobil2 sengaja gagal dulu (bensin 3, butuh 10), lalu isiPenuh(), lalu berhasil. Itu bukti if/else yang membaca dan mengubah state.
- BisaServis s = new Motor(...) dan BisaIsiBahanBakar b = new Truk(...) membuktikan pemanggilan lewat variabel interface.
- mobil1 dipegang lewat dua variabel interface sekaligus, membuktikan satu class meng-implement dua interface.

Struktur class
- `Kendaraan` (abstract superclass)
- `Mobil`, `Motor`, `Truk` (subclass)
- `BisaServis`, `BisaIsiBahanBakar` (interface)
- `Main` (alur pengujian)

Cara compile dan run (terminal)
```bash
javac *.java
java Main
```

Screenshot luaran (output) program
<img width="1366" height="727" alt="Screenshot Output 2" src="https://github.com/user-attachments/assets/6b7b8361-b862-4618-ac66-0817ef2e475b" />
<img width="1366" height="724" alt="Screenshot Output 1" src="https://github.com/user-attachments/assets/a375f9f9-461c-46f0-8ac4-357517fb549b" />

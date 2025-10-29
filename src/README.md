/*
=====================================================
🧮  TUGAS 2 - PEMROGRAMAN LANJUT (MODUL 3)
=====================================================

📘 DESKRIPSI PROGRAM
-----------------------------------------------------
Program ini merupakan hasil refactoring dari tugas Modul 2.
Tujuannya adalah untuk memeriksa apakah sebuah angka
termasuk bilangan GANJIL atau GENAP.

Program terdiri dari beberapa kelas dengan konsep
Object-Oriented Programming (OOP):
- InputReader.java   → membaca dan memvalidasi input pengguna
- ParityChecker.java → menentukan apakah angka ganjil atau genap
- Messeages.java     → menyimpan teks dan pesan utilitas
- MainApp.java       → kelas utama untuk menjalankan program

Setiap kelas dan method telah dilengkapi dokumentasi
menggunakan JavaDoc.

=====================================================
🧱 STRUKTUR PROYEK
-----------------------------------------------------
src/
├── InputReader.java     // Kelas pembaca input
├── ParityChecker.java   // Kelas pemeriksa ganjil/genap
├── Messeages.java       // Kelas penyimpan pesan
└── MainApp.java         // Program utama (entry point)

=====================================================
⚙️  CARA MENJALANKAN PROGRAM
-----------------------------------------------------
1️⃣ Buka proyek di IntelliJ IDEA.
2️⃣ Jalankan file `MainApp.java`.
3️⃣ Masukkan angka sesuai permintaan.
4️⃣ Program akan menampilkan apakah angka tersebut
GANJIL atau GENAP.

Contoh Output:
-----------------------------------------------------
Masukkan angka: 5
Angka 5 adalah bilangan GANJIL
-----------------------------------------------------

=====================================================
🧠  DOKUMENTASI JAVADOC
-----------------------------------------------------
Setiap class dan method dilengkapi dengan komentar JavaDoc.

🔹 Contoh komentar JavaDoc:
-----------------------------------------------------
/**
* Mengecek apakah bilangan genap.
* @param number angka yang akan diperiksa
* @return true jika genap, false jika ganjil
  */
-----------------------------------------------------

🔹 Cara membuat JavaDoc di IntelliJ IDEA:
1. Klik menu: Tools → Generate JavaDoc
2. Pilih folder: src/
3. Tentukan folder output, misal: out/javadoc
4. Klik OK → Dokumentasi otomatis dibuat.

📁 Hasilnya akan berupa folder HTML:
out/javadoc/index.html
├── InputReader.html
├── ParityChecker.html
├── Messeages.html
└── MainApp.html

=====================================================
📋  TAG-TAG JAVADOC YANG DIGUNAKAN
-----------------------------------------------------
@param    → Menjelaskan parameter method
@return   → Menjelaskan nilai balik method
@author   → Menuliskan nama pembuat program
@version  → Menunjukkan versi program
@since    → Menandai sejak modul atau versi tertentu
@see      → Memberi referensi ke class lain

=====================================================
🧩  CONTOH POTONGAN KODE (InputReader)
-----------------------------------------------------
/**
* Kelas InputReader digunakan untuk membaca input dari pengguna
* dan memastikan input berupa bilangan bulat (long).
*
* @author Juan
* @version 1.0
* @since Modul 3
  */
  public class InputReader {
  private final Scanner scanner;

  /**
    * Membuat objek InputReader baru dengan Scanner.
      */
      public InputReader() {
      this.scanner = new Scanner(System.in);
      }

  /**
    * Membaca input bilangan bulat dari pengguna.
    *
    * @param prompt teks yang ditampilkan sebelum input
    * @return nilai Long jika valid, atau null jika bukan angka
      */
      public Long readLongOrNull(String prompt) {
      System.out.print(prompt);
      if (!scanner.hasNextLong()) {
      scanner.next();
      return null;
      }
      return scanner.nextLong();
      }
      }

=====================================================
🧾  CONTOH HASIL JAVADOC (Setelah Generate)
-----------------------------------------------------
📄 index.html → Halaman utama dokumentasi
📄 ParityChecker.html → Menampilkan detail class dan method
📄 InputReader.html → Deskripsi input handling
📄 MainApp.html → Deskripsi alur program utama

Setiap halaman menampilkan deskripsi class, daftar method,
parameter, return value, dan contoh penggunaan.

=====================================================
🧰  TEKNOLOGI YANG DIGUNAKAN
-----------------------------------------------------
☕ Java JDK 17+
🖥️ IntelliJ IDEA
📜 JavaDoc Generator (bawaan IDE)

=====================================================
👨‍💻  IDENTITAS PEMBUAT
-----------------------------------------------------
Nama    : [M Juan Yafi Zaim Wibisono]
Nim     : [202410370110258]
Kelas   : [3D]
Matkul  : Pemrograman Lanjut
Tugas   : Modul 3 - Tugas 2
Versi   : 1.0
=====================================================

🏁  SELESAI
-----------------------------------------------------

# Penjelasan Form-Peminjaman-Buku

### 1. Tema Aplikasi
Aplikasi sederhana ini bertemakan tentang form peminjaman buku pada sistem operasi android.

### 2. Kegunaan Aplikasi
Untuk menampilkan cara meminjam buku melalui aplikasi android sederhana. Aplikasi sederhana ini hanya menampilkan data dari EditText ,RadioButton ,CheckBox ,Spinner dan menampilkan hasilnya melalui button. Di aplikas form peminjaman buku ini juga dilengkapi beberapa error detction.

### 3. Isi Aplikasi
* ImageView     (1)
* EditText      (2)
* TextView      (8)
* RadioButton   (2)
* CheckBox      (3)
* Spinner       (1)
* Button        (1)

### 4. Error Detection Aplikasi
* EditText "Nama" (2) 
  - Jika nama belum di isi akan muncul "Nama Belum Diisi"
  - Jika nama < 3 karekter akan muncul "Nama Minimal 3 Karakter"
* EditText "ID KTP" (2)  
  - Jika ID KTP belum di isi akan muncul "ID KTP Belum Diisi"
  - Jika nama < 4 digit akan muncul "ID Minimal 4 Digit"
* RadioButton "Jenis Kelamin" (1)  
  - Jika tidak di klik akan muncul "Anda Belum Memilih Status" pada textView di atas nya


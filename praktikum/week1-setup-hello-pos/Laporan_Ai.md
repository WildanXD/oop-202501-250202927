Di Minggu ini saya menngunaka AI untuk membantu tugas dan memberikan jawaban. Mula mula saya memberikan konteks kepada AI dengan memberikan alamat github saya menggunakan promp "kamu bisa melihat github ini ga [https://github.com/WildanXD/oop-202501-250202927/blob/main/praktikum/week1-setup-hello-pos/laporan.md](https://github.com/WildanXD/oop-202501-250202927/blob/main/praktikum/week1-setup-hello-pos/laporan.md)" dan "kalo yang ini [https://github.com/WildanXD/oop-202501-250202927/blob/main/docs/01_bab1_paradigma_setup.md](https://github.com/WildanXD/oop-202501-250202927/blob/main/docs/01_bab1_paradigma_setup.md)"
selanjutnya saya meminta AI untuk membantu mengisi laporan di bagian Analisis dengan menggunakan promp "bantu untuk mengisi yang analisis", lalu AI memberikan jawaban "## Analisis

### 1. Analisis Cara Kerja Program

Ketiga program dibuat menggunakan bahasa pemrograman Java dengan tujuan menampilkan informasi mahasiswa dan daftar produk beserta total harga seluruh produk. Meskipun menghasilkan keluaran yang serupa, ketiganya menggunakan pendekatan pemrograman yang berbeda.

Pada paradigma prosedural, program dijalankan melalui urutan instruksi di dalam method `main()`. Data produk dan harga disimpan dalam array, kemudian diproses menggunakan perulangan untuk menampilkan daftar produk sekaligus menghitung total harga.

Pada paradigma Object-Oriented Programming (OOP), data produk direpresentasikan menggunakan objek yang dibuat dari class `Produk`. Setiap objek memiliki atribut nama dan harga. Objek-objek tersebut kemudian disimpan dalam array dan diproses untuk menampilkan informasi serta menghitung total harga. Pendekatan ini membuat data dan representasi produk menjadi lebih terstruktur.

Pada paradigma fungsional, program memanfaatkan fitur Java seperti lambda expression dan Stream API. Daftar produk ditampilkan menggunakan `forEach()`, sedangkan total harga dihitung menggunakan `stream()` dan `sum()`. Pendekatan ini memungkinkan pemrosesan data dilakukan dengan kode yang lebih ringkas.

### 2. Perbandingan Ketiga Paradigma

Paradigma prosedural lebih mudah dipahami untuk program sederhana karena alur instruksinya jelas dan berurutan. Namun, ketika program semakin besar, pengelolaan data dan penambahan fitur dapat menjadi lebih sulit jika struktur program tidak dirancang dengan baik.

Paradigma OOP memisahkan data produk ke dalam objek sehingga program lebih mudah dikembangkan ketika terdapat penambahan atribut atau perilaku. Pendekatan ini sesuai untuk aplikasi yang memiliki banyak entitas, seperti produk, transaksi, dan pembayaran pada sistem POS (Point of Sale). Kekurangannya adalah memerlukan pemahaman mengenai class, object, dan hubungan antarobjek.

Paradigma fungsional memanfaatkan fungsi dan operasi untuk memproses data. Penggunaan Stream API dapat membuat proses pengolahan koleksi menjadi lebih ringkas. Namun, penggunaan lambda dan Stream API mungkin memerlukan pemahaman tambahan bagi pemula.

### 3. Kendala dan Cara Mengatasinya

Dalam praktikum ini, beberapa kendala yang mungkin dihadapi adalah kesalahan penulisan sintaks Java, konfigurasi JDK yang belum tepat, serta kesalahan dalam menentukan tipe data atau menghitung total harga. Kendala tersebut dapat diatasi dengan memeriksa kembali kode program, memastikan JDK telah terpasang dan dikenali oleh IDE, serta menjalankan program untuk melihat hasil dan pesan kesalahan.

Selain itu, setiap program perlu diperiksa agar nama dan NIM mahasiswa ditampilkan dengan benar serta total harga sesuai dengan data produk yang digunakan."

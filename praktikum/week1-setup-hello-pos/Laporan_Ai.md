**Di Minggu ini saya menngunaka AI untuk membantu tugas dan memberikan jawaban. Mula mula saya memberikan konteks kepada AI dengan memberikan alamat github saya menggunakan prompt "kamu bisa melihat github ini ga [https://github.com/WildanXD/oop-202501-250202927/blob/main/praktikum/week1-setup-hello-pos/laporan.md](https://github.com/WildanXD/oop-202501-250202927/blob/main/praktikum/week1-setup-hello-pos/laporan.md)" dan "kalo yang ini [https://github.com/WildanXD/oop-202501-250202927/blob/main/docs/01_bab1_paradigma_setup.md](https://github.com/WildanXD/oop-202501-250202927/blob/main/docs/01_bab1_paradigma_setup.md)"
selanjutnya saya meminta AI untuk membantu mengisi laporan di bagian Analisis dengan menggunakan prompt "bantu untuk mengisi yang analisis", lalu AI memberikan jawaban seperti ini**

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

Selain itu, setiap program perlu diperiksa agar nama dan NIM mahasiswa ditampilkan dengan benar serta total harga sesuai dengan data produk yang digunakan.

**Namun karna menurut saya jawaban yang diberikan kurang pas, saya mengganti jawaban pada point 3. Kendala dan Cara Mengatasinya yang berisi "Dalam praktikum ini, beberapa kendala yang mungkin dihadapi adalah kesalahan penulisan sintaks Java, konfigurasi JDK yang belum tepat, serta kesalahan dalam menentukan tipe data atau menghitung total harga. Kendala tersebut dapat diatasi dengan memeriksa kembali kode program, memastikan JDK telah terpasang dan dikenali oleh IDE, serta menjalankan program untuk melihat hasil dan pesan kesalahan." Menjadi "Di minggu ini saya belum mendapatkan kendala, semuanya berjallan dengan lancar."**


**Saya juga meminta AI untuk menarik kesimpulan dari  hasil praktikum saya dengan menggunakan promp "bagaumana dengan kesimpulannya" dan AI menjawab "**
## Kesimpulan

Berdasarkan praktikum yang telah dilakukan, dapat disimpulkan bahwa bahasa pemrograman Java dapat digunakan untuk menerapkan paradigma prosedural, Object-Oriented Programming (OOP), dan fungsional. Ketiga paradigma tersebut memiliki pendekatan yang berbeda dalam menyusun dan menjalankan program, meskipun dapat menghasilkan keluaran yang serupa.

Paradigma prosedural mengutamakan urutan instruksi, paradigma OOP mengorganisasikan data dan perilaku ke dalam objek, sedangkan paradigma fungsional memanfaatkan fungsi dan operasi untuk mengolah data. Setiap paradigma memiliki kelebihan dan kekurangan sesuai dengan kebutuhan program.

Melalui praktikum ini, mahasiswa dapat memahami perbedaan dasar ketiga paradigma serta pentingnya memilih pendekatan pemrograman yang sesuai. Paradigma OOP menjadi salah satu pendekatan yang sesuai untuk aplikasi yang lebih kompleks, seperti Point of Sale (POS), karena struktur program dapat dibagi menjadi objek-objek yang merepresentasikan komponen sistem."

**disini saya hanya mengganti kata "mahasiswa" menjadi "Saya" pada paragraph terakhir**

Saya juga meminta AI untuk membantu soal quiz di laporan pada point 3 dan 5 Mengggunakan prompt 
- 1.Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi? **Jawaban:** …
- Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (*boilerplate code*)? **Jawaban:** "

  *Lalu AI menjawab*
- Paradigma pemrograman memengaruhi maintainability (kemudahan pemeliharaan) dan scalability (kemudahan pengembangan) aplikasi dengan cara yang berbeda.
- 1.Prosedural: Program disusun berdasarkan urutan instruksi dan fungsi. Paradigma ini mudah dipahami untuk program sederhana, tetapi ketika aplikasi semakin besar, perubahan kode dapat memengaruhi bagian lain sehingga pemeliharaan menjadi lebih sulit.
- 2.OOP (Object-Oriented Programming): Program disusun menggunakan class dan objek yang menggabungkan data serta perilaku. Pemisahan komponen membuat kode lebih terstruktur, mudah diperbaiki, dan lebih mudah dikembangkan dengan menambahkan fitur atau objek baru.
- 3.Fungsional: Program memanfaatkan fungsi untuk mengolah data, idealnya dengan menghindari perubahan data (immutability) dan efek samping (side effects). Pendekatan ini dapat mempermudah pengujian dan mengurangi kesalahan, meskipun membutuhkan pemahaman tambahan jika menggunakan konsep fungsional yang lebih kompleks.
- Kesimpulannya, ketiga paradigma dapat digunakan untuk membangun aplikasi yang mudah dipelihara dan dikembangkan. Namun, OOP cocok untuk aplikasi besar yang memiliki banyak komponen dan hubungan antarobjek, sedangkan paradigma prosedural cocok untuk program sederhana dan paradigma fungsional efektif untuk pengolahan data yang terstruktur. Hasil akhirnya tetap bergantung pada desain dan kualitas kode program.


- Paradigma fungsional dapat mengurangi kode berulang (boilerplate code) dengan memanfaatkan fungsi, lambda expression, dan operasi seperti Stream API untuk memproses data secara ringkas. Misalnya, penggunaan forEach() dapat menggantikan perulangan manual untuk menampilkan setiap elemen, sedangkan map() dan filter() dapat digunakan untuk mengubah dan menyaring data tanpa menulis banyak instruksi berulang. Dengan demikian, kode menjadi lebih singkat, mudah dibaca, dan lebih mudah dipelihara.


Di jawaban ini saya tidak mengubah apapun, saya langsung memasukkannya di laporan


**NOTE!**

**Untuk kode yang saya gunakan di minggu ini, saya mengambilnya dari docs minggu pertama dan hanya mengubah isi kodenya sedikit**

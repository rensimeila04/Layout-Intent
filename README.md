# Layout And Intent

## Layout
> Layout merupakan suatu tampilan tata letak di Android untuk mengatur penempatan teks, gambar, ataupun komponen lainnya sehingga tampilan pada aplikasi yang dibuat terlihat rapih dan nyaman untuk dilihat oleh pengguna.

### Jenis & Fungsi Layout

<a href="https://www.fsf.org">
	<img align="right" width="150" src="https://static.cdn-cdpl.com/source/c7a41e9ac693eba07e1b036591d95601/linearlayout.png">
</a>


### 🔰Linear Layout
> Linear Layout merupakan Layout Paling simple karena menyejajarkan semua child view-nya dalam satu arah, secara vertikal atau horizontal.

<a href="https://www.fsf.org">
	<img align="right" width="150" src="https://static.cdn-cdpl.com/source/c7a41e9ac693eba07e1b036591d95601/relativelayout.png">
</a>



### 🔰Relative Layout
> Relative Layout merupakan layout yang penataannya lebih bebas (Relative) sehingga bisa di tata di mana saja.


<a href="https://www.fsf.org">
	<img align="right" width="250" src="https://static.cdn-cdpl.com/source/c7a41e9ac693eba07e1b036591d95601/1_zyvjCVJp1Ye62fCoCH50Wg.png">
</a>


### 🔰Constraint Layout
>Constraint Layout mirip dengan Relative Layout, karena letak View bergantung pada View lain dalam satu Layout ataupun dengan Parent Layoutnya.Kita dapat mengatur posisinya berdasarkan Parent Layout.

## Macam macam method dan urutan livecycle.
- Method onCreate() adalah kondisi awal saat Activity baru diciptakan, biasanya dilakukan inisialisasi pada tahapan ini. Untuk menginisiasi suatu activity, biasanya dipanggil dengan perintah setContentView(int) untuk resource yang didefinisikan di layout UI, dengan perintah findViewById(int) untuk memanggil widget yang dibutuhkan UI untuk berinteraksi dengan aplikasi.

- Method onStart() Ketika aktivitas memasuki status Dimulai, sistem memanggil callback ini. Panggilan onStart() membuat aktivitas terlihat oleh pengguna, saat aplikasi mempersiapkan aktivitas untuk memasuki latar depan dan menjadi interaktif. Misalnya, metode ini adalah tempat aplikasi menginisialisasi kode yang mengelola UI.

- Method onResume() Setelah aktivitas memasuki status Dilanjutkan, aktivitas tersebut masuk ke latar depan, kemudian sistem memanggil callback onResume(). Ini adalah status saat aplikasi berinteraksi dengan pengguna. Aplikasi tetap dalam status ini sampai terjadi sesuatu untuk mengambil fokus dari aplikasi. Peristiwa yang terjadi misalnya adalah menerima panggilan telepon, pengguna beralih ke aktivitas lain, atau layar perangkat mati.

- Method onPause() Untuk menyatakan ketika user meninggalkan suatu activity. Untuk penggunaan dengan Context.StartActivity(), Sistem akan memanggil metode ini sebagai indikasi pertama bahwa pengguna meninggalkan aktivitas Anda (meskipun tidak selalu berarti aktivitas sedang ditutup); hal ini menunjukkan bahwa aktivitas tidak lagi di latar depan (meskipun mungkin masih terlihat jika pengguna berada dalam mode multi-jendela).

- Method onStop() adalah kondisi saat Activity tidak ditampilkan dilayar (biasanya saat pengguna menekan tombol Home). Ini dapat terjadi, misalnya, ketika aktivitas yang baru diluncurkan menutupi seluruh layar. Sistem juga dapat memanggil onStop() ketika aktivitas telah selesai berjalan, dan akan segera dihentikan.

- Method onRestart() adalah kondisi saat Activity kembali dibuka oleh pengguna.Jika aktivitas kembali di lakukan, sistem akan memanggil onRestart(). Jika Activity selesai berjalan, sistem akan memanggil onDestroy(). Bagian selanjutnya menjelaskan callback onDestroy().

- Method onDestroy() adalah kondisi saat Activity dihancurkan pada memori.Saat aktivitas berpindah ke status ditutup, komponen berbasis siklus proses apa pun yang terkait dengan siklus proses aktivitas akan menerima peristiwa ON_DESTROY. Di sinilah komponen siklus proses dapat membersihkan apa pun yang diperlukan sebelum Aktivitas ditutup.

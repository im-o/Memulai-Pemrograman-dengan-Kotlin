## Repository ini memuat daftar contoh kode dan latihan yang ada pada kelas **Memulai Pemrograman dengan Kotlin**


**Latihan (Soal 1) - Kotlin Fundamental**  
---

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik. 

- TODO 1 :  
	Lengkapi inisialisasi variable result dengan melakukan operasi matematika pada argumen yang diberikan dengan rumus perhitungan berikut:
	valueA + (valueB - valueC)
	Jika valueC bernilai null berikan 100 untuk nilai defaultnya. 

- TODO 2 :  
	Lengkapi dengan kode untuk mengembalikan nilai berupa teks yang nantinya akan dicetak pada konsol. 


		Jika dijalankan, maka pada konsol akan menampilkan text: 
		ResultA is 39
		ResultB is 17


**Latihan (Soal 2) - Controll Flow**  
---

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik. 

- TODO 1 : 
	Lengkapi dengan ekspresi jika nilai number bernilai genap maka proses iterasi akan dilewatkan. 

- TODO 2 : 
	Lengkapi dengan ekspresi jika nilai number bernilai lebih dari 10 maka proses iterasi akan dihentikan. 

- TODO 3 : 
	Lengkapi inisialisasi variable result dengan rumus perhitungan berikut: 
	number x ( number + 2 )
	Jika dijalankan konsol akan menampilkan teks seperti berikut:

		result is 3
		result is 15
		result is 35
		result is 63
		result is 99


**Latihan (Soal 3) - Data Class dan Collections**  
---

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik. 

- TODO 1 : 
	Lengkapi dengan kode untuk inisialisasi objek user dengan ketentuan key dan value sebagai berikut:
	name = John
	age = 23
	address = St. Petersburg
- TODO 2 : 
	Lengkapi kode pada fungsi getValue() untuk mendapatkan nilai dari objek user. 

- TODO 3 : 
	Tambahkan fungsi untuk mencetak teks berikut pada konsol:

		User
		Name: John
		Age: 23
		Address: St. Petersburg


**Latihan (Soal 4) - Function**  
---

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik. 

- TODO 1 : 
	Buatlah fungsi getFirstAndLast yang menjadi ekstensi dari kelas String dengan tipe kembalian Map<String, Char> 

- TODO 2 : 
	Tambahkan fungsi untuk mencetak nilai dari variable firstChar dan lastChar pada konsol. 
	Jika dijalankan konsol akan menampilkan teks seperti berikut:
	First letter is K and n for second letter


**Latihan (Soal 5) - Object-Oriented**  
---

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik. 

- TODO 1 : 
	Lengkapi kode pada kelas Cat dengan ketentuan seperti berikut:
	Buatlah fungsi getter setter untuk properti sleep yang di dalamnya terdapat fungsi untuk mencetak teks:
	Fungsi getter/setter dipanggil
	Tambahkan kode pada fungsi toSleep() untuk mencetak teks:

		[name], sleep!
		jika sleep bernilai true dan teks:
		name, let's play!
		jika sleep bernilai false.

- TODO 2 : 
	Lengkapi inisialisasi dengan kelas Cat. 

	Jika dijalankan konsol akan menampilkan teks seperti berikut:

		Fungsi getter dipanggil
		Gippy, let's play!
		Fungsi setter dipanggil
		Fungsi getter dipanggil
		Gippy, sleep!


**Latihan (Soal 6) - Generics**  
---

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik. 

- TODO 1 : 
	Buatlah fungsi generics baru dengan ketentuan sebagai berikut:
	Nama fungsi adalah getResult.
	Memiliki satu tipe parameter.
	Jika argumen yang dilampirkan bertipe Int, maka nilai yang dikembalikan adalah nilai argumen yang dikalikan 5.
	Jika argumen yang dilampirkan bertipe String, maka nilai yang dikembalikan adalah panjang karakter.
	Jika argumen yang dilampirkan bertipe selain Int dan String, maka nilai yang dikembalikan adalah 0.

- TODO 2 : 
	Tambahkan fungsi untuk mencetak nilai dari variable stringResult dan intResult pada konsol.


**Latihan (Soal 7) - Coroutines**  
---

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik. 

- TODO 1: 
	Ubahlah menjadi suspend function dengan ketentuan sebagai berikut:
	Memiliki waktu tunggu 3 detik sebelum operasi selanjutnya berjalan.
	Mengembalikan nilai hasil penjumlahan valueA dan valueB.

- TODO 2:  
	Ubahlah menjadi suspend function dengan ketentuan sebagai berikut:
	Memiliki waktu tunggu 2 detik sebelum operasi selanjutnya berjalan.
	Mengembalikan nilai hasil perkalian valueA dan valueB.

- TODO 3:  
	Tambahkan fungsi untuk mencetak nilai tangguhan dari variable resultSum dan resultMultiple pada konsol. 

	Jika dijalankan, pada konsol akan menampilkan teks:
	
		Counting...
		Result sum: 20
		Result multiple: 400
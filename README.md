# Andini D.P.'s Assignments/JakartaLabs Batch 10
Repositori ini merupakan kumpulan tugas-tugas yang diberikan selama mengikuti bootcamp QA Automation di JakartaLabs

# Deskripsi Tugas
## Tugas 1 - Java Basic
Untuk mengakses tugas 1
```bash
Tugas1,2/src/com/javaprogram/TreeMapTreeSetDemo.java 
```
Dalam tugas pertama ini peserta di minta untuk membuat contoh class interface yaitu TreeMap dan TreeSet dengan minimum 3 member.

Di TreeMap ini, saya membuat daftar nama dengan tipe data String sebagai value, dan umur dengan tipe data Integer sebagai key(kunci).
Karena TreeMap ini akan mengurutkan collection berdasarkan key dari elemen berupa pasangan <key,value>, maka hasil yang akan didapatkan yaitu urutan nama dari umur yang paling kecil.
TreeMap hanya menampilkan key yang unik saja, apabila ada key yang sama, maka TreeMap akan menampilkan 1 key yang sama pada data di urutan bawah.

```bash
# Code
	treeMap.put(20, "Andini");
	treeMap.put(16, "Melod");
	treeMap.put(16, "Diyah");
	treeMap.put(24, "Pramesti");
	treeMap.put(10, "Lodi");
	treeMap.put(23, "Buti");
    
# Result
    Lodi's age is 10 Years
    Diyah's age is 16 Years
    Andini's age is 20 Years
    Buti's age is 23 Years
    Pramesti's age is 24 Years
```
TreeSet memiliki konsep yang sama pada TreeMap yaitu class ini akan memastikan elemen tersusun secara terurut dan hanya menampilkan data unik.
```java
# Code
	idNumber.add(202);
	idNumber.add(204);
	idNumber.add(203);
	idNumber.add(206);
	idNumber.add(202);
    
# Result
   	202
	203
	204
	206
```


## Tugas 2 - Java OOP
Untuk mengakses tugas 2
```bash
Tugas1,2/src/calculator/javaprogram/MainCalculator.java
```
Di tugas kedua ini peserta diminta untuk membuat aplikasi kalkulator sederhana dengan menerapkan java Oriented Project Programming (OOP).
Pada kalkulator ini peserta juga diminta menampilkan error jika tipe data input yang diberikan tidak sesuai (String). 

Untuk menangani error yang sebabkan dari inputan yang salah, saya menggunakan Try..catch statement untuk mengurung eksekusi yang menampilkan error dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung.

Program ini ditulis dengan alur seperti berikut:
1. Masukan angka pertama
2. Pilih salah satu aritmatik operator (+,-,/ or *) 
3. Masukan angka kedua
4. Jika user menginputkan diluar yang disediakan, maka try.. catch statement akan dijalankan.

Dibawah ini merupakan hasil ketika input yang dimasukan salah (String).
```java
# Result
	Enter a : 3
	Enter Operator (+, -, *, /) : +
	Enter b : e
	Wrong data input
```

Pada tugas ini saya menggunakan class scanner sebagai pengambil inputan.
Saya membuat class MyCalculator untuk menyimpan fungsi dari operator.
```java
import java.util.Scanner;
class MyCalculator{
	double a,b;
	
	MyCalculator(double a, double b){
		this.a=a;
		this.b=b;
	}
	double tambah() {
		return a+b; }
	double kurang() {
		return a-b; }
	double kali() {
		return a*b; }
	double bagi() {
		if (b == 0) {
			System.out.println("devided by zero is not allowed");
			return 0;
		}else {
			return a/b;
		}
	}
}
```
Saya menggunakan Switch Case untuk memeriksa operator +,-,/,* ke fungsi operator yang telah di inisiasi pada class MyCalculator.


## Tugas 3 - Website Automation Testing in yopmail.com
Untuk mengakses tugas 3
```bash
click Tugas3 -> src -> test -> YopMailWebTest.java as a child
click Tugas3 -> src -> test -> BaseWebTest.java as a parrent
```
Di tugas ketiga ini peserta diminta untuk membuat automation testing pada website yopmail.com menggunakan TestNG dan Maven framework.

Pada tugas ini dilakukan input automation sebagai email lalu print isi dari email tersebut.

Program ini ditulis dengan alur seperti berikut:
1. Masuk ke yopmail.com.
2. Input string sebagai email pada yopmail.com. 
3. Buka inbox pada email.
4. Print isi dari email yang diterima tersebut.

Karena website yopmail.com terdiri dari beberapa iframe, maka digunakan switch iframe untuk mendapatkan isi dari email tersebut.

Teknik parrent dan child digunakan pada BaseWebTest dan YopMailWebTest ini untuk mempermudah pembacaan code dimana BaseWebTest digunakan untuk membuat objek dari WebDriver dan WebDriverWait dan juga untuk menyimpan code pada Before dan After annotation pada YopMailWebTest.

Digunakannya WebDriverManager pada tugas ini dikarenakan WebDriverManager dapat melakukan menejemen seperti download, setup, dan maintenance dari driver yang dibutuhkan oleh selenium webdriver (chromedriver, edgedriver, firefoxdriver, dll) secara otomatis sehingga dapat mempermudah dalam melakukan web test automation.

WebDriverWait yang digunakan pada tugas ini yaitu explicitwait karena membuat webdriver menunggu kondisi tertentu pada level elemen sebelum melanjutkan eksekusi selanjutnya. Hal inilah yang membuat explicitWait dinilai lebih efektif dibanding jenis wait lainnya.


## Tugas 4 - Website Automation Testing in saucedemo.com using Page Object Model (POM)
Untuk mengakses tugas 4
```bash
click Tugas4-> src -> test -> SaucedemoWebTest.java as a child
click Tugas4 -> src -> test -> BaseWebTest.java as a parrent
```
Di tugas keempat ini peserta diminta untuk membuat automation testing pada website saucedemo.com menggunakan TestNG dan Maven framework dengan menerapkan konsep Page Object Model (POM).

Digunakannya Page Object Model (POM) ini adalah sebagai salah satu best practice dalam pembuatan automation test agar code yang dibuat menjadi lebih mudah dipahami.

Pada tugas ini peserta diminta untuk melakukan input username dan password, lalu menambahkan 2 produk, melakukan checkout dan pembayaran. Namun tidak hanya sampai pembayaran, pada tugas 4 ini setelah melakukan pembayaran saya lanjutkan untuk kembali ke profile menu untuk melakukan logout dan kembali ke menu login.

Program ini ditulis dengan alur seperti berikut:
1. Masuk ke saucedemo.com.
2. Input username
3. Input password
5. Click Login button
4. Pastikan kita berada di profile page/product page (menggunakan assertion tool class)
5. Menambahkan 2 produk kedalam cart
6. Click logo cart untuk melakukan checkout
7. Pastikan kita berada di dalam cart page
8. Lakukan pembelian dengan mengklik tombol checkout
9. Pastikan kita berada di dalam checkout page 
10. Input firstname, lastname, dan postal code sebagai informasi pembeli
11. Click continue button untuk melanjutkan proses checkout
12. Pastikan kita berada pada overview page untuk mengkonfirmasi barang yang akan di checkout.
13. Click Finish untuk menyelesaikan proses choeck out.
14. pastikkan kita berada pada success page yang menginformasikan bahwa kita telah berhasil membeli produk yang dipilih.
15. Click back home button untuk kembali pada profile page.
16. Click menu button lalu click logout.

Sama seperti pada tugas 3, teknik parrent dan child juga digunakan pada BaseWebTest dan SaucedemoWebTest untuk mempermudah pembacaan code dimana BaseWebTest digunakan untuk membuat objek dari WebDriver dan WebDriverWait dan juga untuk menyimpan Before dan After annotation pada SaucedemoWebTest. 

Pages yang di gunakan pada testing ini yaitu antara lain:
1. BasePage.java
2. CartPage.java
3. CheckOutCompletePage.java
4. CheckOutOverview.java
5. CheckOutPage.java
6. LoginPage.java
7. ProfilePage.java

Seluruh page tersebut merupakan page yang ada pada website saucedemo.com. Berikut cara untuk mengakses pages pada tugas ini:
```bash
click Tugas4 -> src -> main -> pages
```

## Tugas 5 - API Testing Automation

Untuk mengakses tugas 5
```bash
click Tugas5 -> src -> test -> APITestSignUp.java as a child
click Tugas5 -> src -> test -> BaseAPITestSignUp.java as a parrent
```
Pada tugas kelima ini peserta diminta untuk menemukan API signup pada engineer.ai dan melakukan proses signup secara otomatis menggunakan Rest Assured di java.
Untuk mengisi data user, peserta diminta untuk menggunakan faker agar data user terisi secara otomatis.
Hasil dari pencarian data user menggunakan faker saya masukan kedalam request body/payload.
Setelah itu lakukan assert untuk mendapatkan request response status code 200.


## Tugas 6 - Upload file.jmx
Untuk mengakses tugas 6
```bash
click Tugas -> Tugas5 -> src -> test -> 
```
Di tugas keenam ini peserta diminta untuk mengupload hasil test load test dengan ekstensi .jmx ke repositori tugas masing-masing peserta. Pada tugas ini peserta diminta untuk membuat load testing seperti :
 1. Simple load test
 2. Data driven load test
 3. GraphQL load test
 4. Spike load test
 5. Database load test


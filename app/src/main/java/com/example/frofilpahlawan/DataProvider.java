package com.example.frofilpahlawan;

import android.content.Context;

import com.example.frofilpahlawan.Model.Kemerdekaan;
import com.example.frofilpahlawan.Model.Pahlawan;
import com.example.frofilpahlawan.Model.Revolusi;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Pahlawan> pahlawans = new ArrayList<>();
    private static List<Kemerdekaan> initDataKemerdekaan(Context ctx) {
        List<Kemerdekaan> kemerdekaans = new ArrayList<>();
        kemerdekaans.add(new Kemerdekaan("Ir. H. Soekarno ",
                "Surabaya, Jawa Timur","Ir. Soekarno atau yang biasa dipanggil Bung Karno yang lahir di Surabaya, Jawa Timur pada tanggal 6 Juni 1901 dari pasangan Raden Soekemi Sosrodihardjo dengan Ida Ayu Nyoman Rai.\n" +
                "\n" +
                "Ayah Soekarno adalah seorang guru. Raden Soekemi bertemu dengan Ida Ayu ketika dia mengajar di Sekolah Dasar Pribumi Singaraja, Bali.\n" +
                "\n" +
                "Soekarno hanya menghabiskan sedikit masa kecilnya dengan orangtuanya hingga akhirnya dia tinggal bersama kakeknya, Raden Hardjokromo di Tulung Agung, Jawa Timur.\n" +
                "\n" +
                "Soekarno pertama kali bersekolah di Tulung Agung hingga akhirnya dia ikut kedua orangtuanya pindah ke Mojokerto.\n" +
                "\n" +
                "Di Mojokerto, ayahnya memasukan Soekarno ke Eerste Inlandse School. Di tahun 1911, Soekarno dipindahkan ke Europeesche Lagere School (ELS) untuk memudahkannya diterima di Hoogere Burger School (HBS).\n" +
                "\n" +
                "Setelah lulus pada tahun 1915, Soekarno melanjutkan pendidikannya di HBS, Surabaya, Jawa Timur. Di Surabaya, Soekarno banyak bertemu dengan para tokoh dari Sarekat Islam, organisasi yang kala itu dipimpin oleh HOS Tjokroaminoto yang juga memberi tumpangan ketika Soekarno tinggal di Surabaya.\n" +
                "\n" +
                "Dari sinilah, rasa nasionalisme dari dalam diri Soekarno terus menggelora. Di tahun berikutnya, Soekarno mulai aktif dalam kegiatan organisasi pemuda Tri Koro Darmo yang dibentuk sebagai organisasi dari Budi Utomo. Nama organisasi tersebut kemudian Soekarno ganti menjadi Jong Java (Pemuda Jawa) pada 1918. \n" +
                "\n" +
                "Di tahun 1920 seusai tamat dari HBS, Soekarno melanjutkan studinya ke Technische Hoge School  (sekarang berganti nama menjadi Institut Teknologi Bandung) di Bandung dan mengambil jurusan teknik sipil.\n" +
                "\n" +
                "Saat bersekolah di Bandung, Soekarno tinggal di kediaman Haji Sanusi yang merupakan anggota Sarekat Islam dan sahabat karib Tjokroaminoto. Melalui Haji Sanusi, Soekarno berinteraksi dengan Ki Hajar Dewantara, Tjipto Mangunkusumo dan Dr Douwes Dekker, yang saat itu merupakan pemimpin organisasi National Indische Partij.\n" +
                "\n" +
                "Pada tahun 1926, Soekarno mendirikan Algemene Studie Club di Bandung yang diinspirasi dari Indonesische Studie Club (dipimpin oleh Dr Soetomo). Algemene Studie Club  merupakan cikal bakal berdirinya Partai Nasional Indonesia pada tahun 1927.\n" +
                "\n" +
                "Bulan Desember 1929, Soekarno ditangkap oleh Belanda dan dipenjara di Penjara Banceuy karena aktivitasnya di PNI. Pada tahun 1930, Soekarno dipindahkan ke penjara Sukamiskin. Dari dalam penjara inilah, Soekarno membuat pledoi yang fenomenal, Indonesia Menggugat.\n" +
                "\n" +
                "Soekarno dibebaskan pada tanggal 31 Desember 1931. Pada bulan Juli 1932, Soekarno bergabung dengan Partai Indonesia (Partindo), yang merupakan pecahan dari PNI.\n" +
                "\n" +
                "Soekarno kembali ditangkap oleh Belanda pada bulan Agustus 1933 dan diasingkan ke Flores. Karena jauhnya tempat pengasingan, Soekarno hampir dilupakan oleh tokoh-tokoh nasional lainnya.\n" +
                "\n" +
                "Namun semangat Soekarno tetap membara seperti tersirat dalam setiap suratnya kepada seorang Guru Persatuan Islam bernama Ahmad Hasan. Pada tahun 1938 hingga tahun 1942 Soekarno diasingkan ke Provinsi Bengkulu. Soekarno baru benar-benar bebas setelah masa penjajahan Jepang pada tahun 1942.\n" +
                "\n" +
                "Di awal kependudukannya, Jepang tidak terlalu memperhatikan tokoh-tokoh pergerakan Indonesia hingga akhirnya sekitar tahun 1943 Jepang menyadari betapa pentingnya para tokoh ini. Jepang mulai memanfaatkan tokoh pergerakan Indonesia dimana salah satunya adalah Soekarno untuk menarik perhatian penduduk Indonesia terhadap propaganda Jepang.\n" +
                "\n" +
                "Akhirnya tokoh-tokoh nasional ini mulai bekerjasama dengan pemerintah pendudukan Jepang untuk dapat mencapai kemerdekaan Indonesia, meski ada pula yang tetap melakukan gerakan perlawanan seperti Sutan Sjahrir dan Amir Sjarifuddin karena menganggap Jepang adalah fasis yang berbahaya.\n" +
                "\n" +
                "Soekarno sendiri mulai aktif mempersiapkan kemerdekaan Indonesia, di antaranya adalah merumuskan Pancasila, UUD 1945 dan dasar-dasar pemerintahan Indonesia termasuk merumuskan naskah proklamasi Kemerdekaan.\n" +
                "\n" +
                "Pada bulan Agustus 1945, Soekarno diundang oleh Marsekal Terauchi, pimpinan Angkatan Darat wilayah Asia Tenggara ke Dalat, Vietnam. Marsekal Terauchi menyatakan bahwa sudah saatnya Indonesia merdekan dan segala urusan proklamasi kemerdekaan Indonesia adalah tanggung jawab rakyat Indonesia sendiri.\n" +
                "\n" +
                "Setelah menemui Marsekal Terauchi di Dalat, Vietnam, terjadilah Peristiwa Rengasdengklok pada tanggal 16 Agustus 1945. Para tokoh pemuda dari PETA menuntut agar Soekarno dan Hatta segera memproklamasikan kemerdekaan Republik Indonesia, karena pada saat itu di Indonesia terjadi kevakuman kekuasaan.\n" +
                "\n" +
                "Ini disebabkan karena Jepang telah menyerah dan pasukan Sekutu belum tiba. Namun Soekarno, Hatta dan beberapa tokoh lainnya menolak tuntutan ini dengan alasan menunggu kejelasan mengenai penyerahan Jepang.\n" +
                "\n" +
                "Pada akhirnya,Soekarno bersama tokoh-tokoh nasional lainnya mulai mempersiapkan diri menjelang Proklamasi Kemerdekaan Republik Indonesia. Berdasarkan sidang yang diadakan oleh Badan Penyelidik Usaha Persiapan Kemerdekaan Indonesia (BPUPKI) panitia kecil untuk upacara proklamasi yang terdiri dari delapan orang resmi dibentuk.\n" +
                "\n" +
                "Pada tanggal 17 Agustus 1945, Indonesia memplokamirkan kemerdekaannya. Teks proklamasi secara langsung dibacakan oleh Soekarno yang semenjak pagi telah memenuhi halaman rumahnya di Jl Pegangsaan Timur 56, Jakarta.\n" +
                "\n" +
                "Pada tanggal 18 Agustus 1945, Soekarno dan Mohammad Hatta diangkat oleh PPKI menjadi Presiden dan Wakil Presiden Republik Indonesia. Pada tanggal 29 Agustus 1945 pengangkatan Presiden Soekarno dan Wakil Presiden Mohammad Hatta dikukuhkan oleh KNIP.\n" +
                "\n" +
                "Kemerdekaan yang telah didapatkan ini tidak langsung bisa dinikmati karena di tahun-tahun berikutnya masih ada sekutu yang secara terang-terangan tidak mengakui kemerdekaan Indonesia dan bahkan berusaha untuk kembali menjajah Indonesia.\n" +
                "\n" +
                "Gencaran senjata dari pihak sekutu tak lantas membuat rakyat Indonesia menyerah, seperti yang terjadi di Surabaya ketika pasukan Belanda yang dipimpin oleh Brigadir Jendral A.W.S Mallaby berusaha untuk kembali menyerang Indonesia.\n" +
                "\n" +
                "Rakyat Indonesia di Surabaya dengan gigihnya terus berjuang untuk tetap mempertahankan kemerdekaan hingga akhirnya Brigadir Jendral AWS Mallaby tewas dan pemerintah Belanda menarik pasukannya kembali. Perang seperti ini tidak hanya terjadi di Surabaya tapi juga hampir di setiap kota. \n" +
                "\n" +
                "Republik Indonesia secara resmi mengadukan agresi militer Belanda ke PBB karena agresi militer tersebut dinilai telah melanggar suatu perjanjian Internasional, yaitu Persetujuan Linggajati.\n" +
                "\n" +
                "Walaupun telah dilaporkan ke PBB, Belanda tetap saja melakukan agresinya. Atas permintaan India dan Australia, pada 31 Juli 1947 masalah agresi militer yang dilancarkan Belanda dimasukkan ke dalam agenda rapat Dewan Keamanan PBB, di mana kemudian dikeluarkan Resolusi No 27 tanggal 1 Agustus 1947, yang isinya menyerukan agar konflik bersenjata dihentikan.\n" +
                "\n" +
                "Atas tekanan Dewan Keamanan PBB, pada tanggal 15 Agustus 1947, Pemerintah Belanda akhirnya menyatakan akan menerima resolusi Dewan Keamanan untuk menghentikan pertempuran.\n" +
                "\n" +
                "Pada 17 Agustus 1947, Pemerintah Republik Indonesia dan Pemerintah Belanda menerima Resolusi Dewan Keamanan untuk melakukan gencatan senjata dan pada 25 Agustus 1947 Dewan Keamanan membentuk suatu komite yang akan menjadi penengah konflik antara Indonesia dan Belanda.\n" +
                "\n" +
                "Setelah Pengakuan Kedaulatan (Pemerintah Belanda menyebutkan sebagai Penyerahan Kedaulatan), Presiden Soekarno kembali diangkat menjadi Presiden Republik Indonesia Serikat (RIS) dan Mohammad Hatta diangkat sebagai perdana menteri RIS.\n" +
                "\n" +
                "Karena tuntutan dari seluruh rakyat Indonesia yang ingin kembali ke negara kesatuan, maka pada tanggal 17 Agustus 1950, RIS kembali diubah menjadi Republik Indonesia dimana Ir Soekarno menjadi Presiden dan Mohammad Hatta menjadi wakilnya.\n" +
                "\n" +
                "Pemberontakan G30S/PKI melahirkan krisis politik hebat di Indonesia. Massa dari KAMI (Kesatuan Aksi Mahasiswa Indonesia) dan KAPI (Kesatuan Aksi Pelajar Indonesia) melakukan aksi demonstrasi dan menyampaikan Tri Tuntutan Rakyat (Tritura) yang salah satu isinya meminta agar PKI dibubarkan.\n" +
                "\n" +
                "Namun, Soekarno menolak untuk membubarkan PKI karena menilai bahwa tindakan tersebut bertentangan dengan pandangan Nasakom (Nasionalisme, Agama, Komunisme).\n" +
                "\n" +
                "Sikap Soekarno yang menolak membubarkan PKI kemudian melemahkan posisinya dalam politik. Lima bulan kemudian, dikeluarkanlah Surat Perintah Sebelas Maret (Supersemar) yang ditandatangani oleh Soekarno dimana isinya merupakan perintah kepada Letnan Jenderal Soeharto untuk mengambil tindakan yang perlu guna menjaga keamanan pemerintahan dan keselamatan pribadi presiden.\n" +
                "\n" +
                "Surat tersebut lalu digunakan oleh Soeharto yang telah diangkat menjadi Panglima Angkatan Darat untuk membubarkan PKI dan menyatakannya sebagai organisasi terlarang. MPRS pun mengeluarkan dua Ketetapannya, yaitu TAP No IX/1966 tentang pengukuhan Supersemar menjadi TAP MPRS dan TAP No XV/1966 yang memberikan jaminan kepada Soeharto sebagai pemegang Supersemar untuk setiap saat bisa menjadi presiden apabila presiden sebelumnya berhalangan.\n" +
                "\n" +
                "Pada 22 Juni 1966, Soekarno membacakan pidato pertanggungjawabannya mengenai sikapnya terhadap peristiwa G30S. Pidato pertanggungjawaban ini ditolak oleh MPRS hingga akhirnya pada 20 Februari 1967 Soekarno menandatangani Surat Pernyataan Penyerahan Kekuasaan di Istana Merdeka.\n" +
                "\n" +
                "Hari Minggu, 21 Juni 1970 Presiden Soekarno meninggal dunia di RSPAD (Rumah Sakit Pusat Angkatan Darat) Gatot Subroto, Jakarta. Presiden Soekarno disemayamkan di Wisma Yaso, Jakarta dan kemudian dimakamkan di Blitar, Jawa Timur berdekatan dengan makam ibundanya, Ida Ayu Nyoman Rai. Pemerintah kemudian menetapkan masa berkabung selama tujuh hari. \n" +
                "\n" +
                "Ir Soekarno adalah seorang sosok pahlawan yang sejati. Dia tidak hanya diakui berjasa bagi bangsanya sendiri tapi juga memberikan pengabdiannya untuk kedamaian di dunia. Semua sepakat bahwa Ir Soekarno adalah seorang manusia yang tidak biasa yang belum tentu dilahirkan kembali dalam waktu satu abad. Ir Soekarno adalah bapak bangsa yang tidak akan tergantikan.",R.drawable.kemerdekaan_presiden_sukarno));
        kemerdekaans.add(new Kemerdekaan("Drs. H. Mohammad Hatta",
                "Jakarta","Drs. H. Mohammad Hatta (populer sebagai Bung Hatta; lahir dengan nama Mohammad Athar di Fort de Kock, Hindia Belanda, 12 Agustus 1902 – meninggal di Jakarta, 14 Maret 1980 pada umur 77 tahun) adalah negarawan dan ekonom Indonesia yang menjabat sebagai Wakil Presiden Indonesia pertama. Ia bersama Soekarno memainkan peranan sentral dalam perjuangan kemerdekaan Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945. Ia pernah menjabat sebagai Perdana Menteri dalam Kabinet Hatta I, Hatta II, dan RIS. Pada 1956, ia mundur dari jabatan wakil presiden karena berselisih dengan Presiden Soekarno.\n" +
                "\n" +
                "Hatta dikenal akan komitmennya pada demokrasi. Ia mengeluarkan Maklumat  yang menjadi tonggak awal demokrasi Indonesia. Di bidang ekonomi, pemikiran dan sumbangsihnya terhadap perkembangan koperasi membuat ia dijuluki sebagai Bapak Koperasi.\n" +
                "\n" +
                "Hatta meninggal pada 1980 dan jenazahnya dimakamkan di Tanah Kusir, Jakarta. Pemerintah Indonesia menetapkannya sebagai salah seorang Pahlawan Nasional Indonesia pada tanggal 23 Oktober 1986 melalui Keppres nomor 081/TK/1986. Namanya bersanding dengan Soekarno sebagai Dwi-Tunggal dan disematkan pada Bandar Udara Soekarno-Hatta. Di Belanda, namanya diabadikan sebagai nama jalan di kawasan perumahan Zuiderpolder, Haarlem",R.drawable.kemerdekaan_atta));
        kemerdekaans.add(new Kemerdekaan("Jenderal Soedirman",
                "Purbalingga, Jawa Tengah","Jenderal Besar TNI (Anumerta) Raden Soedirman (EYD: Sudirman; lahir 24 Januari 1916 – meninggal 29 Januari 1950 pada umur 34 tahun) \n"+"adalah seorang perwira tinggi Indonesia pada masa Revolusi Nasional Indonesia. Sebagai panglima besar Tentara Nasional Indonesia pertama, ia adalah sosok yang dihormati di Indonesia. Terlahir dari pasangan rakyat biasa di Purbalingga, Hindia Belanda, Soedirman diadopsi oleh pamannya yang seorang priyayi. Setelah keluarganya pindah ke Cilacap pada tahun 1916, Soedirman tumbuh menjadi seorang siswa rajin; ia sangat aktif dalam kegiatan ekstrakurikuler, termasuk mengikuti program kepanduan yang dijalankan oleh organisasi Islam Muhammadiyah.\n"+
                "\n"+" Saat di sekolah menengah, Soedirman mulai menunjukkan kemampuannya dalam memimpin dan berorganisasi, dan dihormati oleh masyarakat karena ketaatannya pada Islam. Setelah berhenti kuliah keguruan, pada 1936 ia mulai bekerja sebagai seorang guru, dan kemudian menjadi kepala sekolah, di sekolah dasar Muhammadiyah; ia juga aktif dalam kegiatan Muhammadiyah lainnya dan menjadi pemimpin Kelompok Pemuda Muhammadiyah pada tahun 1937. Setelah Jepang menduduki Hindia Belanda pada 1942, Soedirman tetap mengajar. Pada tahun 1944, ia bergabung dengan tentara Pembela Tanah Air (PETA) yang disponsori Jepang, menjabat sebagai komandan batalion di Banyumas. Selama menjabat, Soedirman bersama rekannya sesama prajurit melakukan pemberontakan, namun kemudian diasingkan ke Bogor.", R.drawable.kemerdekaan_sudirman));
        kemerdekaans.add(new Kemerdekaan("Raden Adjeng Kartini",
                "Jepara Jawa Tengah", "Raden Adjeng Kartini berasal dari kalangan priyayi atau kelas bangsawan Jawa. Ia merupakan putri dari Raden Mas Adipati Ario Sosroningrat, seorang patih yang diangkat menjadi bupati Jepara segera setelah Kartini lahir. Kartini adalah putri dari istri pertama, tetapi bukan istri utama.Ibunya bernama M.A. Ngasirah, putri dari Nyai Haji Siti Aminah dan Kyai Haji Madirono, seorang guru agama di Telukawur, Jepara.[2] Dari sisi ayahnya, silsilah Kartini dapat dilacak hingga Hamengkubuwana VI. Garis keturunan Bupati Sosroningrat bahkan dapat ditilik kembali ke istana Kerajaan Majapahit.[2] Semenjak Pangeran Dangirin menjadi bupati Surabaya pada abad ke-18, nenek moyang Sosroningrat mengisi banyak posisi penting di Pangreh Praja.[2]\n" +
                "\n" +
                "Ayah Kartini pada mulanya adalah seorang wedana di Mayong. Peraturan kolonial waktu itu mengharuskan seorang bupati beristerikan seorang bangsawan. Karena M.A. Ngasirah bukanlah bangsawan tinggi, maka ayahnya menikah lagi dengan Raden Adjeng Woerjan (Moerjam), keturunan langsung Raja Madura. Setelah perkawinan itu, maka ayah Kartini diangkat menjadi bupati di Jepara menggantikan kedudukan ayah kandung R.A. Woerjan, R.A.A. Tjitrowikromo. ", R.drawable.kemerdekaan_kartini));
        kemerdekaans.add(new Kemerdekaan("Ki Hajar Dewantara",
                "Yogyakarta","Raden Mas Soewardi Soerjaningrat (EBI: Suwardi Suryaningrat, sejak 1922 menjadi Ki Hadjar Dewantara, EBI: Ki Hajar Dewantara, beberapa menuliskan bunyi bahasa Jawanya dengan Ki Hajar Dewantoro; lahir di Pakualaman, 2 Mei 1889 – meninggal di Yogyakarta, 26 April 1959 pada umur 69 tahun selanjutnya disingkat sebagai Soewardi atau KHD) adalah aktivis pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan pelopor pendidikan bagi kaum pribumi Indonesia dari zaman penjajahan Belanda. Ia adalah pendiri Perguruan Taman Siswa, suatu lembaga pendidikan yang memberikan kesempatan bagi para pribumi untuk bisa memperoleh hak pendidikan seperti halnya para priyayi maupun orang-orang Belanda.\n" +
                "\n" +
                "Tanggal kelahirannya sekarang diperingati di Indonesia sebagai Hari Pendidikan Nasional. Bagian dari semboyan ciptaannya, tut wuri handayani, menjadi slogan Kementerian Pendidikan Nasional Indonesia. Namanya diabadikan sebagai salah sebuah nama kapal perang Indonesia, KRI Ki Hajar Dewantara. Potret dirinya diabadikan pada uang kertas pecahan 20.000 rupiah tahun edisi 1998.\n" +
                "\n" +
                "Ia dikukuhkan sebagai pahlawan nasional yang ke-2 oleh Presiden RI, Sukarno, pada 28 November 1959 (Surat Keputusan Presiden Republik Indonesia No. 305 Tahun 1959, tanggal 28 November 1959)",R.drawable.kemerdekaan_kihajar));
      return kemerdekaans;
    }
    private static List<Revolusi> initDataRevolusi(Context ctx) {
        List<Revolusi> revolusis = new ArrayList<>();
        revolusis.add(new Revolusi("R. Suprapto ",
                "Purwokerto, Jawa Tengah","Suprapto yang lahir di Purwokerto, 20 Juni 1920, ini boleh dibilang hampir seusia dengan Panglima Besar Sudirman. Usianya hanya terpaut empat tahun lebih muda dari sang Panglima Besar. Pendidikan formalnya setelah tamat MULO (setingkat SLTP) adalah AMS (setingkat SMU) Bagian B di Yogyakarta yang diselesaikannya pada tahun 1941.\n" +
                "\n" +
                "Sekitar tahun itu pemerintah Hindia Belanda mengumumkan milisi sehubungan dengan pecahnya Perang Dunia Kedua. Ketika itulah ia memasuki pendidikan militer pada Koninklijke Militaire Akademie di Bandung. Pendidikan ini tidak bisa diselesaikannya sampai tamat karena Pasukan Jepang sudah keburu mendarat di Indonesia. Oleh Jepang, ia ditawan dan dipenjarakan, tetapi kemudian ia berhasil melarikan diri.\n" +
                "Perangko R. Suprapto keluaran tahun 1966\n" +
                "\n" +
                "Selepas pelariannya dari penjara, ia mengisi waktunya dengan mengikuti kursus Pusat Latihan Pemuda, latihan keibodan, seinendan, dan syuisyintai. Dan setelah itu, ia bekerja di Kantor Pendidikan Masyarakat. \n"+"\n"+
                "Di awal kemerdekaan, ia merupakan salah seorang yang turut serta berjuang dan berhasil merebut senjata pasukan Jepang di Cilacap. Selepas itu, ia kemudian masuk menjadi anggota Tentara Keamanan Rakyat di Purwokerto. Itulah awal dirinya secara resmi masuk sebagai tentara, sebab sebelumnya walaupun ia ikut dalam perjuangan melawan tentara Jepang seperti di Cilacap, namun perjuangan itu hanyalah sebagai perjuangan rakyat yang dilakukan oleh rakyat Indonesia pada umumnya.\n" +
                "\n" +
                "Selama di Tentara Keamanan Rakyat (TKR), ia mencatatkan sejarah dengan ikut menjadi salah satu yang turut dalam pertempuran di Ambarawa melawan tentara Inggris. Ketika itu, pasukannya dipimpin langsung oleh Panglima Besar Sudirman. Ia juga salah satu yang pernah menjadi ajudan dari Panglima Besar tersebut.\n" +
                "\n" +
                "Setelah Indonesia mendapat pengakuan kedaulatan, ia sering berpindah tugas. Pertama-tama ia ditugaskan sebagai Kepala Staf Tentara dan Teritorial (T&T) IV/ Diponegoro di Semarang. Dari Semarang ia kemudian ditarik ke Jakarta menjadi Staf Angkatan Darat, kemudian ke Kementerian Pertahanan. Setelah pemberontakan PRRI/Permesta padam, ia diangkat menjadi Deputi (Wakil) Kepala Staf Angkatan Darat untuk wilayah Sumatra yang bermarkas di Medan. Selama di Medan tugasnya sangat berat sebab harus menjaga agar pemberontakan seperti sebelumnya tidak terulang lagi. ", R.drawable.pahlawan_revolusi_soeprapto));
        revolusis.add(new Revolusi("Mas Tirtodarmo Haryono",
                "Surabaya, Jawa Timur","Letnan Jenderal TNI Anumerta Mas Tirtodarmo Haryono (lahir di Surabaya, Jawa Timur, 20 Januari 1924 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 41 tahun) adalah salah satu pahlawan revolusi Indonesia yang terbunuh pada persitiwa G30S. Ia dimakamkan di TMP Kalibata - Jakarta.\n" +
                "\n" +
                "Jenderal bintang tiga kelahiran Surabaya, 20 Januari 1924, ini sebelumnya memperoleh pendidikan di ELS (setingkat Sekolah Dasar) kemudian diteruskan ke HBS (setingkat Sekolah Menengah Umum). Setamat dari HBS, ia sempat masuk Ika Dai Gakko (Sekolah Kedokteran masa pendudukan Jepang) di Jakarta, namun tidak sampai tamat.\n" +
                "\n" +
                "Ketika kemerdekaan RI diproklamirkan, ia yang sedang berada di Jakarta segera bergabung dengan pemuda lain untuk berjuang mempertahankan kemerdekaan. Perjuangan itu sekaligus dilanjutkannya dengan masuk Tentara Keamanan Rakyat (TKR). Awal pengangkatannya, ia memperoleh pangkat Mayor.\n" +
                "\n" +
                "Selama terjadinya perang mempertahankan kemerdekaan yakni antara tahun 1945 sampai tahun 1950, ia sering dipindahtugaskan. Pertama-tama ia ditempatkan di Kantor Penghubung, kemudian sebagai Sekretaris Delegasi RI dalam perundingan dengan Inggris dan Belanda. Suatu kali ia juga pernah ditempatkan sebagai Sekretaris Dewan Pertahanan Negara dan di lain waktu sebagai Wakil Tetap pada Kementerian Pertahanan Urusan Gencatan Senjata. Dan ketika diselenggarakan Konferensi Meja Bundar (KMB), ia merupakan Sekretaris Delegasi Militer Indonesia. ", R.drawable.pahlawan_revolusi_mt_haryono));
        revolusis.add(new Revolusi("Ahmad Yani",
                "Purworejo, Jawa Tengah ","Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.\n"+
                "\n"+"Ahmad Yani lahir di Jenar, Purworejo, Jawa Tengah pada tanggal 19 Juni 1922 di keluarga Wongsoredjo, keluarga yang bekerja di sebuah pabrik gula yang dijalankan oleh pemilik Belanda. Pada tahun 1927, Yani pindah dengan keluarganya ke Batavia, di mana ayahnya kini bekerja untuk General Belanda. Di Batavia, Yani bekerja jalan melalui pendidikan dasar dan menengah. Pada tahun 1940, Yani meninggalkan sekolah tinggi untuk menjalani wajib militer di tentara Hindia Belanda pemerintah kolonial. Ia belajar topografi militer di Malang, Jawa Timur, tetapi pendidikan ini terganggu oleh kedatangan pasukan Jepang pada tahun 1942. Pada saat yang sama, Yani dan keluarganya pindah kembali ke Jawa Tengah.\n" +
                "\n" +
                "Pada tahun 1943, ia bergabung dengan tentara yang disponsori Jepang Peta (Pembela Tanah Air), dan menjalani pelatihan lebih lanjut di Magelang. Setelah menyelesaikan pelatihan ini, Yani meminta untuk dilatih sebagai komandan peleton Peta dan dipindahkan ke Bogor, Jawa Barat untuk menerima pelatihan. Setelah selesai, ia dikirim kembali ke Magelang sebagai instruktur. ", R.drawable.pahlawan_revolusi_ahmad_yani));
        revolusis.add(new Revolusi("S. Parman",
                "Wonosobo, Jawa Tengah","Letnan Jenderal TNI Anumerta Siswondo Parman (lahir di Wonosobo, Jawa Tengah, 4 Agustus 1918 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 47 tahun) atau lebih dikenal dengan nama S. Parman adalah salah satu pahlawan revolusi Indonesia dan tokoh militer Indonesia. Ia meninggal dibunuh pada persitiwa Gerakan 30 September dan mendapatkan gelar Letnan Jenderal Anumerta. Ia dimakamkan di TMP Kalibata, Jakarta\n"+
                "\n"+"Dia lulus dari sekolah tinggi di kota Belanda pada tahun 1940 dan masuk sekolah kedokteran, tetapi harus meninggalkan ketika Jepang menyerang. Dia kemudian bekerja untuk polisi militer Kempeitai Jepang. Namun, ia ditangkap karena keraguan atas kesetiaannya, namun kemudian dibebaskan. Setelah dibebaskan, ia dikirim ke Jepang untuk pelatihan intelijen, dan bekerja lagi untuk Kempeitai pada kembali sampai akhir perang, bekerja sebagai penerjemah di Yogyakarta. ", R.drawable.pahlawan_revolusi_s_parman));
        revolusis.add(new Revolusi("Sutoyo Siswomiharjo",
                "Kebumen, Jawa Tengah","Mayor Jenderal TNI Anumerta Sutoyo Siswomiharjo (lahir di Kebumen, Jawa Tengah, 28 Agustus 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah seorang perwira tinggi TNI-AD yang diculik dan kemudian dibunuh dalam peristiwa Gerakan 30 September di Indonesia.\n"+"\n"+
                "Ia menyelesaikan sekolahnya sebelum invasi Jepang pada tahun 1942, dan selama masa pendudukan Jepang, ia belajar tentang penyelenggaraan pemerintahan di Jakarta. Dia kemudian bekerja sebagai pegawai pemerintah di Purworejo, namun mengundurkan diri pada tahun 1944.\n"+"\n"+
                "Setelah proklamasi kemerdekaan Indonesia pada tahun 1945, Sutoyo bergabung ke dalam bagian Polisi Tentara Keamanan Rakyat (TKR), cikal bakal Tentara Nasional Indonesia. Hal ini kemudian menjadi Polisi Militer Indonesia. Pada Juni 1946, ia diangkat menjadi ajudan Kolonel Gatot Soebroto, komandan Polisi Militer. Ia terus mengalami kenaikan pangkat di dalam Polisi Militer, dan pada tahun 1954 ia menjadi kepala staf di Markas Besar Polisi Militer. Dia memegang posisi ini selama dua tahun sebelum diangkat menjadi asisten atase militer di kedutaan besar Indonesia di London. Setelah pelatihan di Sekolah Staf dan Komando Angkatan Darat di Bandung dari tahun 1959 hingga 1960, ia diangkat menjadi Inspektur Kehakiman Angkatan Darat, kemudian karena pengalaman hukumnya, pada tahun 1961 ia menjadi inspektur kehakiman/jaksa militer utama.\n", R.drawable.pahlawan_revolusi_sutoyo));
        revolusis.add(new Revolusi("Dr A.L Tendean",
                "Minahasa Sulawesi Utara","Kapten Czi. (Anumerta) Pierre Andries Tendean (lahir 21 Februari 1939 – meninggal 1 Oktober 1965 pada umur 26 tahun) adalah seorang perwira militer Indonesia yang menjadi salah satu korban peristiwa Gerakan 30 September pada tahun 1965. Mengawali karier militer dengan menjadi intelijen dan kemudian ditunjuk sebagai Ajudan Jenderal Besar TNI Abdul Haris Nasution menggantikan Kapten Kav Adolf Gustaf Manullang ajudan Pak Nas, yang gugur dalam misi perdamaian di Kongo Afrika tahun 1963.[butuh rujukan] dengan pangkat Letnan Satu Czi, ia dipromosikan menjadi Kapten Anumerta setelah kematiannya. Tendean dimakamkan di Taman Makam Pahlawan Kalibata dan bersama enam perwira korban Gerakan 30 September lainnya, ia ditetapkan sebagai Pahlawan Revolusi Indonesia pada tanggal 5 Oktober 1965.\n"+"\n"+
                "Pierre Andries Tendean terlahir dari pasangan Dr. A.L Tendean, seorang dokter yang berdarah Minahasa, dan Maria Elizabeth Cornet, seorang wanita Belanda yang berdarah Prancis[2], pada tanggal 21 Februari 1939 di Batavia (kini Jakarta), Hindia Belanda. Pierre adalah anak kedua dari tiga bersaudara; kakak dan adiknya masing-masing bernama Mitze Farre dan Rooswidiati. Tendean mengenyam sekolah dasar di Magelang, lalu melanjutkan SMP dan SMA di Semarang tempat ayahnya bertugas. Sejak kecil, ia sangat ingin menjadi tentara dan masuk Akademi Militer, namun orang tuanya ingin ia menjadi seorang dokter seperti ayahnya atau seorang insinyur. Karena tekadnya yang kuat, ia pun berhasil bergabung dengan Akademi Teknik Angkatan Darat (ATEKAD) di Bandung pada tahun 1958. Sewaktu menjadi taruna, Pierre pernah ikut tugas praktik lapangan dalam operasi militer penumpasan pemberontakan Pemerintah Revolusioner Republik Indonesia (PRRI) di Sumatera.", R.drawable.pahlawan_revolusi_pierre_tendean));
        return revolusis;
    }


    private static void initAllPahlawans(Context ctx) {
        pahlawans.addAll(initDataKemerdekaan(ctx));
        pahlawans.addAll(initDataRevolusi(ctx));

    }

    public static List<Pahlawan> getAllPahlawan(Context ctx) {
        if (pahlawans.size() == 0) {
            initAllPahlawans(ctx);
        }
        return  pahlawans;
    }

    public static List<Pahlawan> getPahlawansByTipe(Context ctx, String kategori) {
        List<Pahlawan> pahlawansByType = new ArrayList<>();
        if (pahlawans.size() == 0) {
            initAllPahlawans(ctx);
        }
        for (Pahlawan h : pahlawans) {
            if (h.getKategori().equals(kategori)) {
                pahlawansByType.add(h);
            }
        }
        return pahlawansByType;
    }

}


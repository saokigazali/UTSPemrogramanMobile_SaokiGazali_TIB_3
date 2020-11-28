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
        kemerdekaans.add(new Kemerdekaan("Hasyim Asyari Aat Uda", "Nasional",
                "Jombang, Jawa Timur","Kyai Haji Mohammad Hasyim Asyarie adalah pahlawan nasional yang mendirikan organisasi massa islam terbesar di Indonesia yaitu Nahdlatul Ulama.\n" +
                "\n" +
                "Beliau dilahirkan pada tanggal 10 April 1875 atau menurut penanggalan arab pada tanggal 24 Dzulqaidah 1287H di Desa Gedang, Kecamatan Diwek, Kabupaten Jombang, Jawa Timur."+"" +
                "Hasyim Asyari seorang intelektual muslim yang berjuang di massa kemerdekaan dengan memiliki gagasan-gagasan yang damai dan lestari hingga sekarang ini.",R.drawable.pahlawan_nasional_asyim_asyari_aat_uda));
        kemerdekaans.add(new Kemerdekaan("Cut Nyak Dien", "Nasional",
                "Aceh","Cut Nyak Dhien lahir di Lampadag, kerajaan Aceh pada tahun 1984 dan merupakan pahlawan wanita yang memiliki semangat juang tinggi dalam melawan penjajah.\n" +
                "\n" +
                "Beliau memiliki suami bernama Teuku Umar dan juga sebagai pahlawan nasional yang gugur di medan perang pada tahun 1899 sedangkan Cut Nyak Dhien wafat pada tanggal 6 November 1908.",R.drawable.pahlawan_nasional_cut_nyak_dien));
        kemerdekaans.add(new Kemerdekaan("Raden Dewi Srtika", "Nasional",
                "Jawa Barat","Raden Dewi Sartika adalah salah satu pahlawan kemerdekaan wanita Indonesia. Pendidikan yang diterimanya sebagai keturunan ningrat menginspirasi Raden Dewi Sartika untuk memperjuangkan hak pendidikan kepada rakyat pribumi dengan membangun sekolah khusus wanita.", R.drawable.pahlawan_nasional_dewi_artika));
        kemerdekaans.add(new Kemerdekaan("Dr. KH. Idham Chalid", "Nasional",
                "Kalimantan Selatan", "Dr. KH. Idham Chalid merupakan salah satu politisi yang berpengaruh pada massanya, dimana beliau pernah menjabat Wakil Perdana Menteri Indonesia dan juga pernah menjabat sebagai ketua MPR dan DPR.\n" +
                "\n" +
                "Tepatnya pada tanggal 19 Desember 2016, sebagai penghargaan atas jasa beliau bagi negara. Pemerintah Republik Indonesia mengabadikan beliau dalam uang kertas pecahan Rp. 5000.", R.drawable.pahlawan_nasional_idham_chalid));
        kemerdekaans.add(new Kemerdekaan("Ki Hajar Dewantara", "Nasional",
                "Yogyakarta","Ki Hajar Dewantara lahir di Yogyakarta pada tanggal 2 Mei 1889 dan meninggal pada tanggal 26 April 1959 di Yogyakarta.\n" +
                "\n" +
                "Ki Hajar Dewantara atau nama sebelumnya Raden Mas Soewardi Soerjaningrat diganti sejak tahun 1922. Beliau adalah pahlawan nasional Indonesia sekaligus sebagai seorang aktivis pergerakan kemerdekaan Indonesia, politisi dan juga seorang pelopor dalam bidang pendidikan kaum pribumi di masa penjajahan belanda.",R.drawable.pahlawan_nasional_ki_hajar_dewantara));
      return kemerdekaans;
    }
    private static List<Revolusi> initDataRevolusi(Context ctx) {
        List<Revolusi> revolusis = new ArrayList<>();
        revolusis.add(new Revolusi("R. Suprapto ", "Revolusi",
                "Purwokerto, Jawa Tengah","Letnan Jenderal TNI Anumerta R. Suprapto (lahir di Purwokerto, Jawa Tengah, 20 Juni 1920 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 45 tahun) adalah seorang pahlawan nasional Indonesia. Ia merupakan salah satu korban dalam G30S/PKI dan dimakamkan di Taman Makam Pahlawan Kalibata, Jakarta.", R.drawable.pahlawan_revolusi_soeprapto));
        revolusis.add(new Revolusi("Mas Tirtodarmo Haryono", "Revolusi",
                "Surabaya, Jawa Timur","Letnan Jenderal TNI Anumerta Mas Tirtodarmo Haryono (lahir di Surabaya, Jawa Timur, 20 Januari 1924 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 41 tahun) adalah salah satu pahlawan revolusi Indonesia yang terbunuh pada persitiwa G30S. Ia dimakamkan di TMP Kalibata - Jakarta.", R.drawable.pahlawan_revolusi_mt_haryono));
        revolusis.add(new Revolusi("Ahmad Yani", "Revolusi",
                "Purworejo, Jawa Tengah ","Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.", R.drawable.pahlawan_revolusi_ahmad_yani));
        revolusis.add(new Revolusi("S. Parman", "Revolusi",
                "Wonosobo, Jawa Tengah","Parman adalah anak keenam dari sebelas bersaudara yang dilahirkan di Wonosobo, Jawa Tengah pada tanggal 4 Agustus 1918. Ayahnya bernama Kromodihardjo bekerja sebagai seorang pedagang. S. Parman memiliki seorang kakak laki-laki bernama Ir. Sakirman dimana nanti kakaknya ini akan menjadi petinggi di Politbiro CC PKI.", R.drawable.pahlawan_revolusi_s_parman));
        revolusis.add(new Revolusi("Sutoyo Siswomiharjo", "Revolusi",
                "Kebumen, Jawa Tengah","Mayor Jenderal TNI Anumerta Sutoyo Siswomiharjo (lahir di Kebumen, Jawa Tengah, 28 Agustus 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah seorang perwira tinggi TNI-AD yang diculik dan kemudian dibunuh dalam peristiwa Gerakan 30 September di Indonesia.", R.drawable.pahlawan_revolusi_sutoyo));
        revolusis.add(new Revolusi("Dr A.L Tendean", "Revolusi",
                "Minahasa Sulawesi Utara","Kapten Czi Anumerta Pierre Andries Tendean adalah seorang perwira militer Indonesia yang lahir pada 21 Februari 1939 dan meninggal pada 1 Oktober 1965.\n" +
                "\n" +
                "Dia merupakan anak kandung dari Dr A.L Tendean yang berprofesi sebagai dokter yang berdarah Minahada dan sang ibu Maria Elizabeth Cornet seorang wanita Belanda berdara Perancis.", R.drawable.pahlawan_revolusi_pierre_tendean));
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


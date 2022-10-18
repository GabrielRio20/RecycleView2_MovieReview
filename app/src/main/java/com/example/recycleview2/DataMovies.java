package com.example.recycleview2;

import java.util.ArrayList;

public class DataMovies {

    private static int[] pictureMovie = {
            R.drawable.film1_dr_strange2,
            R.drawable.film2_nwh,
            R.drawable.film3_thor,
            R.drawable.film4_minion,
            R.drawable.film5_jw,
            R.drawable.film6_morbius,
            R.drawable.film7_topgun
    };

    private static String[] titleMovie= {
            "Doctor Strange: Multiverse of Madness",
            "Spiderman: No Way Home",
            "Thor: Love and Thunder",
            "Minion: Rise of Gru",
            "Jurassic World: Dominion",
            "Morbius",
            "Top Gun: Maverick"
    };

    private static String[] directorMovie = {
            "Sam Raimi",
            "Jon Watts",
            "Taika Waititi",
            "Kyle Balda",
            "Colin Trevorrow",
            "Daniel Espinosa",
            "Joseph Kosinski"
    };

    private static String[] reviewMovie = {
            "Doctor Strange 2 dibuka dengan adegan America Chavez (Xochitl Gomez) yang melarikan diri dari makhluk besar bersama dengan Strange (Benedict Cumberbatch)," +
            " tetapi bukan Strange yang kita kenal melainkan dari semesta lain. Namun, Strange hanya menganggap itu mimpi hingga dia tiba di pernikahan Christine Palmer" +
            " (Rachel McAdams) yang terganggu oleh kedatangan Gargantos, makhluk menyerupai gurita bermata satu. \n" +
            "Strange pun bertempur dan bertemu Chavez yang dikejar oleh Gargantos. Berawal dari situ, kekacauan portal multiverse dimulai. Berniat meminta bantuan Wanda Maximoff" +
            " (Elizabeth Olsen), Chavez justru menjadi incaran para musuh, termasuk Wanda. Strange dan Chavez pun melintasi realitas alternatif multiverse untuk menghadapi" +
            " penjahat baru yang misterius dan berbahaya.\n" + "\n"+
            "Sekuel film Doctor Strange seakan mengajak penonton untuk menjelajahi multiverse dengan gaya yang unik, menarik, dan seru. Bahkan, film ini enggak melulu soal" +
            " perkelahian, tetapi juga tentang kehidupan Strange dengan sedikit kisah cintanya dan Wanda yang belum menerima kepergian anak khayalannya.\n" +
            "Meskipun memiliki permasalahan inti, tapi bukan MCU namanya jika tidak menampilkan konflik dalam konflik. Meski begitu, plot film ini dikemas sedemikian rapi," +
            " mudah dicerna, dan jauh dari kata monoton.\n" + "\n"+
            "Pada dasarnya, Doctor Strange merupakan film superhero dengan genre aksi, fiksi, fantasi, dan petualangan. Tapi, dalam sekuel kedua ini, Sam Raimi yang dikenal" +
            " sering menggarap film bergenre horor, termasuk Evil Dead dan Drag Me to Hell, membawa elemen tersebut ke dalam film Doctor Strange 2.\n" +
            "Hasilnya, tentu saja film ini sukses membuat suasana terasa menegangkan. Belum lagi color grading dari film ini yang turut membuat elemen horor dalam film ini" +
            " semakin nyata. Well, congratulations Sam Raimi!",

            "Film Spider-Man: No Way Home berhasil menempati jajaran film akhir tahun terlaris. Film ini juga telah memecahkan rekor box office dan mengalahkan film Avengers:" +
            " End game.\n" +
            "Kesuksesan film yang diperankan oleh Tom Holland ini tidak lepas dari peran tangan dingin sang sutradara, Jon Watts. Ia berhasil menciptakan adegan-adegan yang" +
            " spektakuler. Tentunya, keberhasilan dari film Spider-Man ini tidak hanya karena ceritanya yang menenggangkan, tetapi juga menyuguhkan emosi yang mendalam.\n" +
            "Pada adegan pembuka, Anda akan langsung menyaksikan konflik lanjutan dari Spider-Man: Far From Home.\n" +
                    "\n" +
            "Berimbas dari terungkapnya identitas Peter Parker, film ini akan menuntun penonton ke arah konflik yang jauh lebih besar. Inilah yang akan membuat Anda" +
            " semakin tegang dengan kejadian berikutnya." +
            "Film ini memang membawa nostalgia pada film-film Spider-Man terdahulu. Dalam film Spider-Man: No Way Home, kita diajak untuk bertemu kembali dengan musuh-musuh" +
            " Spider-Man, seperti Doctor Octopus, Green Goblin, Electro, Sandman, dan Lizard.\n" +
                    "\n" +
            "Hal ini terjadi karena gerbang multiverse yang retak akibat mantra Doctor Strange. Namun, dalam menghadapi musuhnya tersebut, Peter Parker mendapat bantuan yang tidak terduga.\n" +
                    "\n" +
            "Anda akan benar-benar terkejut dengan kemunculan dari para penolong Peter Parker. Film ini pun semakin seru karena kita melihat kolaborasi epik yang sangat fresh dan menyenangkan.",

            "Masih disutradarai Taika Waititi, Marvel Studios’ “ Thor: Love and Thunder” disebut sebagai film Super Hero Marvel berbeda karena padat lawakan. Film berdurasi kurang lebih" +
            " dua jam ini menghadirkan nuansa berbeda dibanding dengan film Thor sebelumnya, yakni Thor: Ragnarok yang tayang pada 2017 silam.\n" +
                    "\n" +
            "Alih-alih membawa penonton pada tayangan yang penuh ketegangan, Marvel Studios’ “ Thor: Love and Thunder” menyuguhkan alur cerita syarat hiburan namun punya" +
            " pesan bermakna di dalamnya.\n" +
                    "\n" +
            "Sepanjang penayangannya, para penonton bisa langsung memahami situasi dan kondisi Thor hingga sampai pada konflik dengan Gorr dalam Thor: Love & Thunder.\n" +
                    "\n" +
            "Di bagian tayangan penonton akan diajak menjelajahi perjalanan Thor hingga sampai pada situasi terkininya. Berbeda dari film Thor yang sarat ketegangan konflik" +
            " dan perseteruan yang diperankan karakter pria, Thor: Love & Thunder kali ini bisa dibilang sebagai film yang menyuuguhkan karakter perempuan cukup dominan.\n" + "\n" +
            "Awal film dimulai dari penggambaran latar belakang Thor dengan nuansa hangat ‘hiburan’ di New Asgard yang lebih dikenal sebagai kota wisata di planet bumi." +
            " Nansa hangat itu dirusak sosok Gorr yang memiliki niat jahat ingin membantai para dewa.\n" +
            "Gorr datang ke New Asgard dengan bayangan hitam menyerang penduduk New Adgard. Thor kemudian hadir berusaha menyelamatkan penduduk New Asgard.",

            "Sebagai penggemar berat sebuah regu penjahat super yang dijuluki Vicious 6, Gru mencetuskan ide untuk menjadi jahat supaya bisa masuk regu tersebut.\n" +
            "Ketika Vicious 6 melengserkan pemimpin mereka, sang petarung legendaris Wild Knuckles, Gru pun ikut wawancara untuk menjadi anggota baru mereka.\n" +
                    "\n" +
            "Semua berubah menjadi kacau, setelah Gru mencuri permata berharga dari Vicious 6 dengan bantuan Kevin, Stuart, Bob, Otto, dan para Minion lain," +
            " hingga ia pun menjadi musuh utama para penjahat terbesar itu.\n" +
                    "\n" +
            "Dalam pelariannya, para Minion berusaha menguasai seni kungfu untuk membantu melawan musuh.\n" +
            "Hingga dalam pelarian itu, Gru dan para Minion mendapatkan bantuan dari sumber yang tak disangka-sangka, sang Wild Knuckles, dan menyadari bahwa penjahat" +
            " pun memerlukan bantuan dari kawan-kawannya.",

            "Jurassic World: Dominion berlatar 4 tahun setelah kejadian film Fallen Kingdom (2018). Konsekuensi dari keputusan yang diambil Owen (Chris Pratt), Claire" +
            " (Bryce Dallas Howard), dan Maisie (Isabella Sermon) untuk melepas dinosaurus ke dunia luar diperlihatkan di film ini.\n" + "\n" +
            "Berkat mereka, manusia kini harus hidup berdampingan bersama dengan dinosaurus, dan memasuki era baru yang dinamai Ian Malcolm sebagai Neo-Jurassic Age.\n" + "\n" +
            "Meski manusia sudah berusaha sekuatnya untuk hidup berdampingan dengan dinosaurus, segudang masalah keseimbangan alam pun masih terjadi di dunia berkat hal ini." +
            " Salah satunya adalah masalah krisis pangan yang berpotensi rusak dengan cepat dikarenakan hama belalang berukuran jumbo yang membawa DNA prasejarah.\n" + "\n" +
            "Hal inilah yang menjadi alasan trio jagoan dari film Jurassic Park, yaitu Alan Grant (Sam Neill), Ellie Satler (Laura Dern), dan Ian Malcom (Jeff Goldblum) untuk berkumpul" +
            " kembali untuk memecahkan masalah.\n" + "\n" +
            "Usut punya usut, hama ini merupakan pekerjaan kotor BioSyn, sebuah perusahaan teknologi baru yang kini meneliti sekaligus memberikan lahan agar dinosaurus terus tumbuh.\n" + "\n" +
            "Di sisi lain, Owen dan Claire kini tinggal bersama dan mengasuh Maisie, yang merupakan hasil kloning anak perempuan salah satu pembuatJurassic Park, Benjamin Lockwood." +
            " Masalah mulai datang ketika Maisie kini menjadi incaran BioSyn, sebab mereka percaya bahwa DNA yang ada di tubuhnya bisa menjadi penyeimbang krisis saat ini.\n" + "\n" +
            "Terlalu banyak isu yang dikembangkan di sini, terutama dengan hadirnya belalang raksasa, menjadikan film jadi tidak fokus lagi. Masalah utama jadi kabur, atau absurd." +
            " Dinosaurus tak lagi menjadi pokok masalah utama, seperti di film-film sebelumnya. Mau menyelesaikan masalah hama atau mengkhawatirkan masalah dinosaurus?",

            "Makhluk menyeramkan dijadikan simbol pahlawan memang agak-agak mengherankan, tapi plausible untuk dilakukan. Buktinya? Batman yang berlambang kelelawar dengan modus" +
            " operasi mengincar rasa takut di malam hari sukses juga jadi salah satu superhero paling ikonik di seluruh dunia. Counter Marvel untuk karakter DC Comic tersebut adalah" +
            " Morbius. Gak tanggung-tanggung, kekuatan Morbius berhubungan bukan dengan kelelawar biasa, melainkan kelelawar penghisap darah, yang literally membuatnya menjadi vampir." +
            " While the origin story dari Morbius sebenarnya lebih cocok sebagai cerita penjahat, sutradara Daniel Espinosa justru diembankan untuk membuat film ini jadi cerita pahlawan." +
            " Orang yang menghisap darah manusia demi kemampuan untuk berbuat kebaikan jelas jadi konsep yang menarik, genrenya filmnya otomatis akan menyerempet ke horor. Nyatanya," +
            " film Morbius ini memang menghisap, tapi lebih seperti Dementor ketimbang vampir. Film ini menghisap excitement kita saking boringnya. \n" + "\n" +
            "Espinosa kesusahan untuk mengimbangi tuntutan naskah membuat Morbius menjadi pahlawan. Set up karakternya tampak sebagai bagian paling mudah yang berhasil Espinosa lakukan." +
            " Morbius adalah seorang dokter yang mendedikasikan dirinya untuk mencari kesembuhan dari penyakit-penyakit, karena dirinya sendiri mengidap penyakit darah yang langka." +
            " Penyakit yang mengharuskan dirinya pakai tongkat untuk berjalan. Penyakit yang membuat dirinya – dan sahabatnya, Milo – sedari kecil dibully. Penyakit yang gak ada obatnya." +
            " See, Michael Morbius bisa banget dapat simpati. Dia dokter pintar yang ramah – ada adegan dia dekat dengan pasien anak-anak, yang mau cari perfect cure untuk mengobati" +
            " bukan saja dirinya dan sahabat, tapi juga seluruh umat manusia. Namun ketika elemen yang lebih gelap dari cerita ini tiba, Espinosa kehilangan segala keseimbangan." +
            " Michael menemukan cara menyatukan DNA manusia dengan kelelawar, dia mencoba serum ciptaannya kepada dirinya sendiri. Sekarang dia berubah menjadi vampir superkuat" +
            " yang dahaganya akan darah manusia nyaris tak-terkendali. Di titik yang mulai seru tersebut (bayangkan konflik luar-dalam, konflik moral, konflik dengan sahabat yang" +
            " menerpa Michael), film ini justru gagap dalam eksplorasi. Ini cerita orang yang mau jadi hero tapi harus relakan dirinya sebagai anti-hero, yang tidak tampil seunik itu.",

            "Sepanjang 2 jam 17 menit, film Top Gun: Maverick menyajikan kisah yang seru, fresh, dan penuh adegan mendebarkan. Bahkan, awal film ini saja sudah dibuka dengan adegan" +
            " yang menarik, di mana terlihat kesibukan petugas lapangan yang mengatur landasan di kapal induk serta dilanjutkan dengan Maverick yang mencatat rekor baru saat menerbangkan" +
            " pesawat. \n" + "\n" +
            "Meski jauh dari kehidupan sehari-hari, namun kisah film ini seakan memberi perspektif baru bagi para penonton, khususnya dalam hal pesawat tempur. Enggak cuma" +
            " soal pesawat saja, film ini juga memuat kisah romansa yang menyejukkan hati.\n" + "\n" +
            "FYI, Top Gun: Maverick memiliki kisah keterikatan dengan sekuel pertamanya, jadi saya sarankan agar dapat menyaksikan film pertamanya terlebih dahulu. Namun, jika" +
            " belum sempat, film ini tetap menampilkan beberapa adegan kilas balik yang akan membantu dalam memahami jalan ceritanya. \n" + "\n" +
            "Terlepas dari ceritanya yang apik, film ini tentu tak akan semenarik itu tanpa penampilan para aktor yang berbakat. Sebut saja Tom Cruise, pria 59 tahun itu mampu" +
            " membawakan perannya dengan sangat menjiwai baik saat bertugas sebagai pelatih pilot maupun dalam menampilkan emosinya. Selain Tom Cruise, Top Gun: Maverick juga" +
            " menampilkan beberapa aktor berbakat lainnya seperti Miles Teller, Jennifer Connelly, Jon Hamm, Glen Powell, dan masih banyak lagi. \n" + "\n" +
            "Overall, Top Gun: Maverick merupakan film yang sangat patut ditonton. Ceritanya sendiri dirangkai dengan sangat apik, mudah dimengerti, dan jauh dari kata monoton." +
            " Visual, suasana, konflik yang ditampilkan dalam film ini pun mampu membuat saya seperti merasakan sensasinya secara langsung. Terlebih, penampilan Tom Cruise yang" +
            " berbakat lengkap dengan kharismanya mampu membuat film ini tampak lebih bagus lagi."
    };

    static ArrayList<Movie> showMovie(){
        ArrayList<Movie> list = new ArrayList<>();
        for (int i = 0; i < pictureMovie.length; i++){
            Movie movie = new Movie();
            movie.setImage(pictureMovie[i]);
            movie.setTitle(titleMovie[i]);
            movie.setDirector(directorMovie[i]);
            movie.setReview(reviewMovie[i]);
            list.add(movie);
        }
        return list;
    }

}

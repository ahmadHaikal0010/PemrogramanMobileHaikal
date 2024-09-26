package com.haikal.mobileappmi2a.model

import com.haikal.mobileappmi2a.R

data class ModelWisata(
    val gambar : Int,
    val destinasi : String,
    val kota : String,
    val ket : String,
    val detail : String
)

object WisataList {
    fun getModel() : List<ModelWisata> {
        val itemModel1 = ModelWisata(
            R.drawable.tokyo_disney_resort,
            "Tokyo Disney Resort",
            "Tokyo",
            "Dengan dua taman hiburan Disney – Tokyo Disneyland dan Tokyo DisneySea – ditambah hotel, pertokoan, dan banyak lagi,  menawarkan banyak keseruan dan pengalaman magis buat kamu.",
            "Dengan dua taman hiburan Disney – Tokyo Disneyland dan Tokyo DisneySea – ditambah hotel, pertokoan, dan banyak lagi,  menawarkan banyak keseruan dan pengalaman magis buat kamu. " +
                    "Ada banyak wahana seru yang bisa kamu eskplor di Tokyo Disneyland. Namun, bersiaplah untuk mengantre untuk wahana-wahana populer. Tips dari Klook, utamakan untuk segera menaiki wahana populer begitu kamu tiba di Tokyo Disneyland. Percayalah, antrean panjang itu terjadi karena wahana tersebut benar-benar seru untuk dinaiki." +
                    "Kalau kamu penggemar rollercoaster, jangan pernah berpikir untuk tidak menaiki  Space Mountain, yang akan membawamu terbang melewati berbagai galaksi dengan kecepatan tinggi; dan Big Thunder Mountain, yang bakal membawamu melarikan diri dari Wild West menggunakan kereta tambang. Selain wahana, kamu dapat mengikuti parade siang hari yang menjadi favorit banyak turis, Dreaming Up! Di parade ini kamu dapat melihat bermacam-macam karakter Disney berjalan mengelilingi taman. Buat Klook, Dreaming Up! Adalah pawai paling magis yang bisa kamu saksikan. Jangan lupa untuk mengeksplor 7 area tematik Tokyo Disneyland: World Bazaar, Tomorrowland, Toontown, Fantasyland, Critter Country, Westernland, dan Adventureland." +
                    "Ini pertama kalinya kamu berkunjung ke Tokyo Disneyland? Tenang, Klook sudah merangkum panduannya buat kamu ." +
                    "Jangan lupa, Tokyo Disney Resort juga memiliki Tokyo DisneySea. Di taman hiburan ini, kamu dapat bermain air sepuasnya di wahana-wahana yang tentunya juga bertema Disney.",
            )


        val itemModel2 = ModelWisata(
            R.drawable.kuil_sensoji,
            "Kuil Senso-ji",
            "Tokyo",
            "Salah satu landmark ikonik di Asakusa, Senso-ji Temple adalah kuil tertua di kota ini, berdiri di tahun 645.",
            "Salah satu landmark ikonik di Asakusa, Senso-ji Temple adalah kuil tertua di kota ini, berdiri di tahun 645. Juga dikenal sebagai Asakusa Kannon Temple, kuil Buddha yang berwarna-warni ini menghormati Kannon, dewi belas kasihan. Di sini, kamu bisa menemukan landmark terkenal lainnya di Asakusa, termasuk Asakusa Shrine dan Kaminari Gate. Jika kamu melewati Hozomon Gate, kamu bisa melihat aula utama kuil dan pagoda berlantai lima." +
                    "Para wisatawan yang datang ke sini pada bulan Mei bisa menikmati festival Sanja Matsuri di Kuil Asakusa, salah satu dari tiga festival Shinto terbesar di Tokyo. Jangan lupa untuk sewa kimono atau yukata jika kamu berkunjung ke sini agar foto-fotomu semakin luar biasa!",
            )


        val itemModel3 = ModelWisata(
            R.drawable.akihabara,
            "Akihabara",
            "Tokyo",
            "distrik ini dipenuhi dengan toko yang menjual berbagai merchandise anime, manga, game, dan gadget.",
            "Mengunjungi distrik perbelanjaan  menghadirkan keasyikan tersendiri bagi para pencinta game dan anime. Pasalnya, distrik ini dipenuhi dengan toko yang menjual berbagai merchandise anime, manga, game, dan gadget. " +
                    "Namun, kamu tidak perlu menjadi seorang ‘wibu’ dahulu untuk menyukai kawasan ini. Akihabara akan membuat perjalanan ke Jepangmu tambah mengesankan karena menawarkan berbagai kafe dan restoran yang bisa kamu kunjungi. Mau tambah seru? Cobalah bermain di pusat-pusat arcade yang tersebar di Akihabara.",
            )


        val itemModel4 = ModelWisata(
            R.drawable.osaka_castle,
            "Osaka Castle",
            "Osaka",
            "yang berdiri kokoh di atas bukit dengan ketinggian yang melampaui bangunan perkantoran ibarat oase di tengah-tengah riuh dan kesibukan Osaka.",
            " yang berdiri kokoh di atas bukit dengan ketinggian yang melampaui bangunan perkantoran ibarat oase di tengah-tengah riuh dan kesibukan Osaka. " +
                    "Istana ini dikelilingi oleh taman raksasa yang populer Osaka Castle juga memiliki museum yang menyimpan lebih dari 1.000 artefak yang menjadi catatan penting sejarah panjang Jepang. Luangkan waktumu untuk bersantai sejenak dengan menikmati keasrian Taman Nishinomaru.",
            )

        val itemModel5 = ModelWisata(
            R.drawable.shibuya_crossing,
            "Shibuya Crossing",
            "Tokyo",
            "Shibuya Crossing menjadi magnet yang begitu kuat bagi para turis untuk berkunjung ke Tokyo. Shibuya merupakan satu dari 23 kota bagian di Tokyo.",
            "Selain Tokyo Tower, Shibuya Crossing menjadi magnet yang begitu kuat bagi para turis untuk berkunjung ke Tokyo. Shibuya merupakan satu dari 23 kota bagian di Tokyo. Area ini dipenuhi dengan tempat hiburan sehingga menjadi kawasan populer anak muda Tokyo. Sementara, Shibuya Crossing sendiri merupakan tempat yang paling ramai dan bisa dibilang pusat dari kawasan Shibuya." +
                    "Setidaknya ada 45.000 orang yang menyeberang di sini setiap 30 menit pada jam-jam sibuk. Enggak heran jika Shibuya Crossing dijuluki sebagai persimpangan tersibuk di dunia. Suasana Shibuya tambah semarak di malam hari karena dihiasi papan-papan reklame raksasa dengan berbagai lampu neon warna-warni. Di persimpangan ini pula, kamu dapet berfoto dengan patung Hachiko yang sangat terkenal." +
                    "Berfoto di tengah lautan manusia Shibuya Crossing tidak menjadi satu-satunya aktivitas yang dapat kamu lakukan di area ini. Shibuya memiliki observation deck terkenal, , yang membuatmu dapat menyaksikan pemandangan Shibuya Crossing dan Tokyo dari ketinggian 229 meter"
        )

        val itemModel6 = ModelWisata(
            R.drawable.fushimi_inari_taisha,
            "Fushimi Inari Taisha",
            "Tokyo",
            "adalah Kuil Shinto yang berada di Fushimi-ku, Kyoto, Jepang. Kuil ini merupakan kuil pusat bagi sekitar 40.000 kuil Inari.",
            " adalah Kuil Shinto yang berada di Fushimi-ku, Kyoto, Jepang. Kuil ini merupakan kuil pusat bagi sekitar 40.000 kuil Inari. Kuil utama terletak di kaki Gunung Inari dan tanah milik kuil mencakup gunung yang tingginya 233 meter. " +
                    "Berbeda dengan Kuil Shinto lainnya, Fushimi Inari memajang ‘kami’ atau apa yang disembah di kuil tersebut secara langsung, yakni sebuah cermin. Selain itu, kamu bisa menemukan banyak patung serigala (kitsune) di area kuil. Menurut kepercayaan, serigala dianggap sebagai pembawa pesan.Fushimi Inari begitu terkenal dengan seribu senbon torii (gerbang kuil) warna merah yang berderet di pinggir jalan masuk. Area ini menjadi spot foto favorit banyak orang karena begitu ikonik. Saking populernya, pintu gerbang ini kerap dijadikan lokasi syuting." +
                    "Pembangunan kuil dan senbon torii tidak dilakukan secara serentak. Keseribu senbon torii ditambahkan secara satu per satu dari tahun ke tahun. Penambahan ini merupakan hasil dari donasi dari berbagai individu, kelompok, maupun perusahaan bisnis. Makanya, kamu pasti akan menemukan nama donatur serta tanggal penyerahan donasi di tiap gerbang."
        )

        val itemModel7 = ModelWisata(
            R.drawable.nara_park,
            "Nara Park",
            "Nara",
            "Bermain bersama rusa-rusa menggemaskan cuma dapat kamu lakukan di nara.",
            "Bermain bersama rusa-rusa menggemaskan cuma dapat kamu lakukan di nara. Kamu enggak hanya bisa mengelu-elus kepala seribuan rusa yang berkeliaran bebas di taman ini, tetapi juga memberi mereka makan. Kamu bisa membeli senbei, sejenis kerupuk yang jadi makanan rusa-rusa ini di pintu masuk taman. Yang bikin tambah menggemaskan, rusa-rusa ini akan membungkukkan kepalanya ketika meminta makanan dari kamu." +
                    "Pertanyaannya, kenapa rusa? Nah, begini. Dari penuturan cerita yang diyakini oleh orang-orang Nara, Dewa Takemikazuchi-no-Mikoto, dewa yang akhirnya disembah di Kuil Kasuga-Taisha, datang ke Nara untuk pertama kalinya dengan menunggangi seekor rusa. Sejak saat itu, entah bagaimana caranya, mulai bermunculan rusa-rusa di sekitar Kuil Kasuga-Taisha. Penduduk Nara lantas meyakini bahwa rusa-rusa tersebut adalah utusan dewa. "
        )

        val itemModel8 = ModelWisata(
            R.drawable.tokyo_tower,
            "Tokyo Tower",
            "Tokyo",
            "tidak hanya berbicara tentang ketinggian, tetapi juga simbol kebangkitan orang-orang Jepang setelah perang. Sejak dibangun pada 1958 setelah Perang Dunia II usai, Tokyo Tower menjadi landmark paling ikonik di Jepang.",
            " tidak hanya berbicara tentang ketinggian, tetapi juga simbol kebangkitan orang-orang Jepang setelah perang. Sejak dibangun pada 1958 setelah Perang Dunia II usai, Tokyo Tower menjadi landmark paling ikonik di Jepang." +
                    "Dengan ketinggian 332,9 meter, Tokyo Tower memiliki 2 area observatori : yang pertama berada di ketinggian 150 meter dan yang kedua berada di ketinggian 250 meter. " +
                    "Tokyo Tower akan memanjakan matamu dengan pemandangan kota Tokyo karena terletak di area bisnis. Dari ketinggian kamu dapat menyaksikan kesibukan Kota Tokyo yang seolah tak pernah berhenti dari jam ke jam."
        )

        val itemList : ArrayList<ModelWisata> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)

        return itemList
    }
}
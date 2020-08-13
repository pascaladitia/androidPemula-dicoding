package com.pascal.callediting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_profil)
        btnMoveActivity.setOnClickListener(this)

        val imageList = listOf<Design>(
            Design(
                R.drawable.wpap,
                "WPAP",
                "WPAP merupakan singkatan dari Wedha's Pop Art Potrait adalah gaya seni pop art yang dipopulerkan oleh Wedha Abdul Rasyid yang sekaligus pembuat aliran ini. WPAP dahulu bernama FMB ( Foto Marak Berkotak ). Secara teknik, WPAP mempunyai ciri khas tertentu dalam penggambaran objek, dimana dalam WPAP anda akan menemukan bidang berkotak-kotak dan penuh dengan warna-warni antar bidang tanpa menghilangkan karakter objek atau model yang digambar. Dalam WPAP anda pasti tidak akan menemukan bidang-bidang lengkung sebab itulah WPAP mempunyai ciri khas tertentu yang membuat WPAP mempunyai keunikan tersendiri dalam segi teknik pembuatan."
            ),
            Design(
                R.drawable.shepard,
                "SHEPARD",
                "Frank Shepard Fairey lahir 15 Februari 1970.  Ia adalah seorang seniman jalanan kontemporer Amerika dan aktivis desainer grafis yang muncul dari adegan skateboard.  Pertama kali dikenal karena \"Andre Raksasa Memiliki Posse\" di mana ia taat menyesuaikan gambar dari supermarket tabloid komedi Weekly World News. Dan mulai dikenal luas Karena pemilihan presiden AS tahun 2008 untuk Barack Obama pada poster \"Harapan\".  The Institute of Contemporary Art menyebutnya salah satu yang terbaik dan berpengaruh bagi seniman jalanan. Shepard Fairey termasuk dalam koleksi di The Smithsonian, Los Angeles County Museum of Art, Museum of Modern Art di New York kota, Museum of Contemporary Art San Diego, National Portrait Gallery di Washington DC, Virginia Museum of Fine Arts di Richmond, dan Victoria and Albert Museum di London.\n"
            ),
            Design(
                R.drawable.kartun,
                "KARTUN",
                "Kartun Editing ini cukup populer dikalangan remaja, karena pembuatannya yang sangat mudah dan terlihat bagus hanya dengan memainkan garis dan warna, editan ini sangat digemari kaum remaja."
            ),
            Design(
                R.drawable.vector,
                "VECTOR",
                "Vektor adalah salah-satu jenis desain yang cukup populer pada saat ini. Berbeda dengan desain lainnya, vektor art cenderung akan membuat foto menjadi terlihat sangat unik dan menarik. Pada umumnya membuat vektor art akan membutuhkan sebuah software pada komputer. Namun jika kamu tidak memiliki komputer, maka kamu juga bisa mengandalkan aplikasi pembuat vektor Android."
            ),
            Design(
                R.drawable.lineart,
                "LINE ART",
                "Line art atau yang berarti seni garis adalah sebuah karya seni yang setiap gambarnya terdiri dari garis lurus atau melengkung hingga membentuk suatu objek. Juga bisa diartikan, line art yaitu seni grafis yang menggunakan garis sebagai dasar untuk membuat ilustrasi.Line art biasa digunakan untuk menggambar objek dua atau tiga dimensi, yang kemudian bagian dalam juga latarnya diberikan warna untuk beragam keperluan. Line art juga bisa diberi tambahan shading dan tekstur, demi terciptanya suatu seni yang bernilai. Sebelum adanya fotografi, line art merupakan standar ilustrasi untuk media cetak ketika menyampaikan sebuah informasi."
            ),
            Design(
                R.drawable.typograpi,
                "TYPOGRAPHY",
                "Typograpi adalah seni cetak atau tata huruf adalah suatu kesenian dan teknik memilih dan menata huruf dengan pengaturan penyebarannya pada ruang yang tersedia, untuk menciptakan kesan tertentu."
            ),
            Design(
                R.drawable.pelangi,
                "PELANGI",
                "Foto Pelangi, atau yang biasa dikenal dengan Gad's Photo Painting adalah, poto dengan efek warna warna - warni yang mempercantik photo kita. ada banyak cara untuk menghasilkan karya tersebut namun kebanyakan mengunakan software sotosop."
            ),
            Design(
                R.drawable.smudge,
                "SMUDGE",
                "Smudge painting adalah eksplorasi foto menggunakan tool smudge pada software photoshop. Hasilnya tidak jauh berbeda dengan sebuah lukisan. Itulah kenapa di tambahin painting di nama belakang. Metode smudge painting ini, dengan menggunaan tool smudge, ane nyebutnya dengan \"MENGGOSOK\". tool smudge ini layaknya sebagai pengganti kuas untuk sebuah lukisan.Cara nya dengan menggosok tiap bagian foto sehingga nampak seperti lukisan."
            ),
            Design(
                R.drawable.manipulasi,
                "MANIPULASI",
                "Manipulasi berimajinasi dengan ide yang gila dengan sentuhan kreatif tanpa batas dapat menghasilkan suatu karya yang luar biasa. Banyak seniman digital mengaplikasikan ide dan imajinasinya dengan keterampilan edit foto yang epik. Dengan kemungkinan pada masa sekarang untuk mengedit dan menambah foto apa pun dengan mengklik beberapa tombol dalam aplikasi hanya dalam hitungan detik."
            ),
            Design(
                R.drawable.kembar,
                "KEMBAR",
                "Mengkloning diri atau membuat foto kembar adalah teknik editing yang sangat mudah dengan cara menambahkan 2/3 objek menjadi satu. Yang  dimaksud mengkloning diri disini tentu bukan makna sebenarnya. Artinya saya bisa membuat kembaran saya dengan menggunakan photoshop. Itu artinya, hanya manipulasi photo."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_design)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ListDesignAdapter(this, imageList) {
            val intent = Intent(this, DetailDesignActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_profil -> {
                val moveIntent = Intent(this@MainActivity, ProfilActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
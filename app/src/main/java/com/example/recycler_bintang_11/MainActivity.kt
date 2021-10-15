package com.example.recycler_bintang_11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.luffy1,
                "Monkey D Luffy",
                "Monkey D. Luffy adalah seorang karakter fiksi dan tokoh protagonis utama dalam serial anime dan manga One Piece karya Eiichiro Oda. Ia merupakan putra kandung dari pemimpin Pasukan Revolusioner, Monkey D. Dragon, cucu kandung dari Angkatan Laut terkenal, Monkey D. "
            ),
            Superhero(
                R.drawable.nami,
                "Nami",
                "Nami adalah seorang karakter fiksi dari serial anime dan manga One Piece karya Eiichiro Oda. Ia adalah seorang bajak laut dan navigator dari Kelompok Bajak Laut Topi Jerami. Ia merupakan anggota ketiga di kelompoknya, dan orang kedua yang bergabung."
            ),
            Superhero(
                R.drawable.zoro,
                "Roronoa Zoro",
                "Roronoa Zoro adalah seorang karakter fiksi dalam serial anime dan manga One Piece karya Eiichiro Oda. Ia adalah seorang bajak laut, mantan pemburu perompak, dan salah satu tokoh protagonis utama."
            ),
            Superhero(
                R.drawable.usopp,
                "God Usopp",
                "Usopp adalah seorang karakter fiksi dari serial anime dan manga One Piece karya Eiichiro Oda. Terlahir di Desa Syrup, Usopp adalah seorang penembak jitu dari Kelompok Bajak Laut Topi Jerami dan mantan kapten dari Kelompok Bajak Laut Usopp."
            ),
            Superhero(
                R.drawable.sanji,
                "Vinsmoke Sanji",
                "Vinsmoke Sanji adalah seorang karakter fiksi dalam serial anime dan manga One Piece karya Eiichiro Oda. Ia merupakan anggota kelima di kelompoknya, serta orang keempat yang bergabung. Karena Sanji terlahir di North Blue, ia menjadi anggota Topi Jerami pertama yang tidak berasal dari East Blue."
            )
        )

        val  recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}
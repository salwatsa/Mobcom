package com.example.testutslagi

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

object MataKuliahData {
    val matakuliah = listOf(
        MataKuliah(
            nama = R.string.mataKuliah1,
            sks = R.string.sks1,
            img = R.drawable.p1
        ),
        MataKuliah(
            nama = R.string.mataKuliah2,
            sks = R.string.sks2,
            img = R.drawable.p2
        ),
        MataKuliah(
            nama = R.string.mataKuliah3,
            sks = R.string.sks3,
            img = R.drawable.p3
        ),
        MataKuliah(
            nama = R.string.mataKuliah4,
            sks = R.string.sks4,
            img = R.drawable.p3
        ),
        MataKuliah(
            nama = R.string.mataKuliah5,
            sks = R.string.sks5,
            img = R.drawable.p5
        ),
        MataKuliah(
            nama = R.string.mataKuliah6,
            sks = R.string.sks6,
            img = R.drawable.p6
        ),
        MataKuliah(
            nama = R.string.mataKuliah7,
            sks = R.string.sks7,
            img = R.drawable.p7
        ),
        MataKuliah(
            nama = R.string.mataKuliah8,
            sks = R.string.sks8,
            img = R.drawable.p8
        ),
        MataKuliah(
            nama = R.string.mataKuliah9,
            sks = R.string.sks9,
            img = R.drawable.p9
        ),
        MataKuliah(
            nama = R.string.mataKuliah10,
            sks = R.string.sks10,
            img = R.drawable.p10
        )

    )

    class MataKuliah(
        @StringRes val nama: Int,
        @StringRes val sks: Int,
        @DrawableRes val img: Int)

}
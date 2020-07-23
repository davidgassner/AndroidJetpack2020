package com.example.plainolnotes4.data

import java.util.*

class SampleDataProvider {

    companion object {
        private val sampleText1 = "A simple note"
        private val sampleText2 = "A note a\nline feed"
        private val sampleText3 = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque finibus, magna eget ullamcorper eleifend, neque justo cursus nibh, sit amet fermentum nisi dui sed justo. Nulla ac nisl ut nulla euismod mollis. Aenean ullamcorper eu odio a rutrum. Mauris eu augue tortor. Pellentesque erat justo, gravida sed maximus eu, faucibus at justo. Aliquam ut nulla consectetur odio vestibulum vulputate vel id est. Aliquam erat volutpat.

            Fusce maximus sagittis dolor in tempor. Duis vehicula congue lectus eu lobortis. Integer placerat fermentum sapien, vel feugiat sapien pellentesque non. Integer nec nibh sit amet ex lacinia pretium sed et eros. Nam id consequat erat, eleifend mollis quam. In dictum lobortis quam vel tincidunt. Vestibulum non lobortis neque. Phasellus pharetra malesuada mauris eget blandit. Sed ornare nisl id nisl tristique placerat.
        """.trimIndent()

        private fun getDate(diff: Long): Date {
            return Date(Date().time + diff)
        }

        fun getNotes() = arrayListOf(
            NoteEntity(getDate(0), sampleText1),
            NoteEntity(getDate(1), sampleText2),
            NoteEntity(getDate(2), sampleText3)
        )

    }
}
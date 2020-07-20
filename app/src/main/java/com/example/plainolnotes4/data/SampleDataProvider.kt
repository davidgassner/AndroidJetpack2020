package com.example.plainolnotes4.data

import java.util.*

class SampleDataProvider {

    companion object{
        private val sampleText1 = "A simple note"
        private val sampleText2 = "A note with\nline feed"
        private val sampleText3 = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque convallis magna in dolor sodales, tristique efficitur nisl placerat. Proin ultricies pulvinar mauris id imperdiet. Quisque molestie luctus suscipit. Vestibulum suscipit, erat a efficitur imperdiet, erat enim aliquet tortor, ac commodo massa elit convallis sem. Curabitur posuere risus id orci volutpat cursus. Nulla facilisi. Sed eleifend auctor eros, condimentum blandit dolor. In ac viverra metus. Nulla non vestibulum dui. Integer blandit metus nec ipsum venenatis malesuada. Nam sit amet egestas neque. Praesent urna est, lobortis sit amet tincidunt vel, porta sit amet orci. Lorem ipsum dolor sit amet, consectetur adipiscing elit.

            Suspendisse potenti. Maecenas mattis tempor magna vitae convallis. Sed arcu neque, suscipit blandit finibus at, finibus in odio. Sed a velit vitae purus rhoncus pharetra. Etiam iaculis arcu non purus tristique, ac viverra dui mattis. Morbi scelerisque libero pretium viverra dictum. Duis vestibulum metus venenatis, rutrum augue sit amet, porttitor felis. Etiam viverra ipsum turpis. Sed consequat, nulla vitae sollicitudin condimentum, magna tortor mollis augue, non feugiat erat libero ut magna. Aenean gravida massa vel odio lobortis posuere. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Fusce sed vestibulum eros, quis mollis sapien. Duis mollis vestibulum ullamcorper. 
        """.trimIndent()

        private fun getDate(diff: Long): Date {
            return Date(Date().time + diff)
        }

        fun getNotes() = arrayListOf(
            NoteEntity(1, getDate(0), sampleText1),
            NoteEntity(2, getDate(1), sampleText1),
            NoteEntity(3, getDate(2), sampleText1)
        )
    }
}
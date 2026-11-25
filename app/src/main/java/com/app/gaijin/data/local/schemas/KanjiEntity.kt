package com.app.gaijin.data.local.schemas

import io.objectbox.annotation.ConflictStrategy
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.Index
import io.objectbox.annotation.Unique

@Entity
data class KanjiEntity(
    @Id var id: Long = 0,
    @Unique(onConflict = ConflictStrategy.REPLACE) var character: String = "",
    @Index var jlptLevel: Int? = null,
    var strokes: Int = 0,
    var grade: Int? = null, // Grado escolar
    var frequency: Int? = null, // Rango de uso en periodicos
    var meanings: MutableList<String> = mutableListOf(),
    var onyomi: MutableList<String> = mutableListOf(),
    var kunyomi: MutableList<String> = mutableListOf(),
)

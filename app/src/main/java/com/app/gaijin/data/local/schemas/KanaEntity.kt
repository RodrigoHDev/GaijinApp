package com.app.gaijin.data.local.schemas

import io.objectbox.annotation.ConflictStrategy
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.Index
import io.objectbox.annotation.Unique

@Entity
data class KanaEntity(
    @Id var Id: Long = 0,
    @Unique(onConflict = ConflictStrategy.REPLACE) var character: String = "",
    var sound: String = "",
    var vowel: String = "",
    var family: String = "",
    @Index var type: String = "",
)

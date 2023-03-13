package com.example.mymemory.models

import android.icu.number.NumberRangeFormatter.RangeIdentityResult
import java.util.IdentityHashMap

data class MemoryCard(
    val identifier: Int,
    var isFaceUp: Boolean = false,
    var isMatched: Boolean =false
)
package com.inasie.examples.view

enum class ItemViewType {
    UNKNOWN,
    LIST_ITEM,
    ;

    companion object {
        fun fromOrdinal(ordinal: Int) = values().find { it.ordinal == ordinal } ?: UNKNOWN
    }
}
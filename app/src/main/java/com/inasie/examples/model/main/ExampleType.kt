package com.inasie.examples.model.main

enum class ExampleType(val text: String) {
    SELECT_EFFECT("터치 효과"),
    ELEVATION("그림자"),
    DATA_BINDING("데이터 바인딩"),
    MENU("메뉴"),
    THEME("테마"),
    FONT("폰트"),
    TAB("탭");

    companion object {
        fun fromName(name: String) = values().find { it.name == name } ?: SELECT_EFFECT
    }
}
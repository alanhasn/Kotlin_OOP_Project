package utils

enum class Days(val isWeekend: Boolean) {
    SUNDAY(false),
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(true),
    SATURDAY(true);

    fun printStatus() {
        if (isWeekend) println("$name is a weekend.")
        else println("$name is a weekday.")
    }
}
enum class Days(val isWeekend: Boolean) {
    SUNDAY(true),
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true);

    fun printStatus() {
        if (isWeekend) println("$name is a weekend.")
        else println("$name is a weekday.")
    }
}
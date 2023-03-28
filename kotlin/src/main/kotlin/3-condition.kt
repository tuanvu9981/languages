fun main() {
    // if - else
    val age = 19
    val humanType: String = if (age > 18) {"Adult"} else {"Child"}
    println(humanType)

    // when = switch
    val day = 3
    val wordDay: String = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Sunday"
    }
    println(wordDay)

    val dayType: String = when(day) {
        1,2,3,4,5 -> "平日"
        else -> "週末"
    }
    println(dayType)
}
fun main() {
    println(agoToText(680))
}

fun agoToText(time: Int): String {
    return when (time) {
        in 0..60 -> "был(а) в сети только что"
        in 61..60*60 -> "был(а) в сети ${countMinutes(time)} назад"
        in 60*60+1..24*60*60 -> "был(а) в сети ${countHours(time)} назад"
        in 24*60*60+1..24*60*60*2 -> "был(а) в сети сегодня"
        in 24*60*60*2+1..24*60*60*3 -> "был(а) в сети вчера"
        else -> "был(а) в сети давно"
    }
}

fun countMinutes(time: Int): String {
    val minutes = time/60
    return when {
        minutes in 11..14 -> "$minutes минут"
        minutes % 10 == 1 -> "$minutes минуту"
        minutes % 10 > 1 && minutes % 10 < 5 -> "$minutes минуты"
        else -> "$minutes минут"
    }
}

fun countHours(time: Int): String {
    val hours = time/3600
    return when {
        hours in 11..14 -> "$hours часов"
        hours % 10 == 1 -> "$hours час"
        hours % 10 > 1 && hours % 10 < 5 -> "$hours часа"
        else -> "$hours часов"
    }
}
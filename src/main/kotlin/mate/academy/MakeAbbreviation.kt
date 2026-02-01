package mate.academy

fun makeAbbr(source: String) : String {
    var result = ""
    if (!source.isEmpty()) {
        result += source[0].uppercase()
    }
    for (i in 0 until source.length - 1) {
        if (source[i] == ' ')
        result += source[i + 1].uppercase()
    }
    return result
}

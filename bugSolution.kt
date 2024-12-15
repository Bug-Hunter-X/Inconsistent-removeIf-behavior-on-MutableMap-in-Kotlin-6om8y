fun main() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")

    // Correct way to remove elements from a MutableMap based on a condition
    val iterator = map.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        if (entry.key > 2) {
            iterator.remove()
        }
    }
    println(map) // Output: {1=one, 2=two}
}
object tute_10 extends App{

    def countLetterOccurrences(w: List[String]):Int = {
        w.map(x => x.length).reduce(_ + _)
    }

    val words: List[String] = List  ("apple", "banana", "cherry", "date")

    println(words)
    println("length = " + countLetterOccurrences(words))
}

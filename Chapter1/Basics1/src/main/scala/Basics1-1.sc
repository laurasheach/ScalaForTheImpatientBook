println("Welcome to the Scala worksheet")

val answer = 8 * 5 + 2
answer * 0.5
("Hello, " + answer).toLowerCase

val greeting: String = null
//println(greeting)
val greeting: Any = "Hello"
//println(greeting)

val xmax, ymax = 100 //Sets xmax and ymax to 100
var greeting, message: String = null
//greeting and message are both strings, initialised with null

1.toString // Yields the string "1"

1.to(10) // Yields Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

"Hello".toSeq.intersect("World")

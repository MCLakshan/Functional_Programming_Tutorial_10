object tute_10 extends App{

    def toFhar(c:Double):Double = (c * (9.0/5.0)) + 32.0

    def calculateAverage(temps: List[Double]): Double  = {
        temps.map(x => toFhar(x)).reduce(_+_) / temps.length
    }

    val list1: List[Double] = List(0, 10, 20, 30)

    println(list1);
    println(calculateAverage(list1));
}

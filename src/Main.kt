fun main(){
    argument(test = *intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12))
    /* println(arimaticSeriesSum(n=10))
     println(arimaticSeriesSum(a=3,n=10, d=2))
     println(arimaticSeriesSum(3,n=10))
 */
}

fun arithmeticSeriesSum(a : Int =1, n : Int, d : Int=1): Int {
    return n/2 * (2 * a+(n-1)*d)
}

fun argument(vararg test: Int){
    println(test[0])
    println(test[1])
    println(test[2])
    println(test[3])
}
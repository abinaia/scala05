import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object Fibonacci {
    def main(args: Array[String]): Unit = {
        
        def fibonacci_series(n: Int): Int = n match {
            case 0 => 0
            case 1 => 1
            case _ => fibonacci_series(n - 1) + fibonacci_series(n - 2)
        }

        def printFibonacci(n: Int, current: Int = 0): Unit = {
            if (current < n) {
                print(s"${fibonacci_series(current)}, ")
                printFibonacci(n, current + 1)
            }
        }

        print("Enter how many numbers should be displayed: ")
        val a = readInt()
        printFibonacci(a)
    }
}

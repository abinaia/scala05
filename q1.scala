import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object inventory_management {
    def main(args: Array[String]): Unit ={
        

        def add_productlist(n: List[String]): List[String] = {
            val word = readLine("Enter string or type 'done' to stop: ")
            word match {
                case "done" => n
                case _ => add_productlist(n :+ word)
            }
        }

        def printProductList(n:List[String],index: Int = 1): Any = if(!n.isEmpty)
            {
            println(s"$index => ${n.head}");
            printProductList(n.tail,index + 1)
            }

        def getTotalProducts(n:List[String]): Unit = {
            println(s"The total number of list entered is: ${n.length}")

        }

        val initialList=List[String]()
        val productList=add_productlist(initialList)
        printProductList(productList)
        getTotalProducts(productList)



    }
}
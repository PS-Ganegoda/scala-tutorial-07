// . Write a Scala function called filterPrime that takes a list of integers as input and uses a lambda
// function to filter out the prime numbers from the list. The function should return a new list
// containing only the prime numbers.
// Example:
// Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Output: [2, 3, 5, 7]

object Q3{
    def isPrime(number: Int): Boolean = {
    if (number <= 1)
      false
    else if (number == 2)
      true
    else {
      val sqrtOfNumber = math.sqrt(number).toInt
      !(2 to sqrtOfNumber).exists(number % _ == 0)
    }
  }
    def primefilter(numbers:List[Int]):List[Int]={
    numbers.filter(isPrime);
     }
    def main(args:Array[String]):Unit={
    val input =List(1,2,3,4,5,6,7,8,9,10);
    val result = primefilter(input);
    print(result);
    }

}
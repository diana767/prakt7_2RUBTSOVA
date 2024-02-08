fun main()
{
    try {
        println("введите a")
        var a= readLine()!!.toDouble()
        println("введите b")
        var b= readLine()!!.toDouble()
        println("введите x")
        var x= readLine()!!.toDouble()
        println("введите y")
        var y= readLine()!!.toDouble()
        println("введите z")
        var z= readLine()!!.toDouble()
        var k=0;
        if(a<b)
        {
          if(x>=a&&x<=b)
          {
              println("число x попадает в отрезок")
              k++
          }
            else println("число x не попадает в отрезок")
            if(y>=a&&y<=b)
            {
                println("число y попадает в отрезок")
                k++
            }
            else println("число y не попадает в отрезок")
            if(z>=a&&z<=b)
            {
                println("число z попадает в отрезок")
                k++
            }
            else println("число z не попадает в отрезок")

            println("кол-во чисел попадающих в отрезок ${k}")


        }

    } catch (e:Exception){println("неккоректно введены значения")}
}
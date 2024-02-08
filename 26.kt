fun main()
{
    try {
        println("введите координату x")
        var x= readLine()!!.toDouble()
        println("введите координату y")
        var y= readLine()!!.toDouble()
        when(x>0&&y>0)
        {
            true->println("точка лежит в верхней полуплоскости")
            false->when (x<0&&y<0){
                true->println("точка лежит в нижней полуплоскости")
            }
        }

    } catch (e:Exception){println("неккоректно введены значения")}
}
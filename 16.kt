fun main()
{
    try {
        println("введите четырёхзначный номер билета")
        var b= readLine()
        var a= b!!.toInt()
        when(a/1000>0)
        {
            true->{
               var sum1=b[0].toInt()+b[1].toInt()
                var sum2=b[2].toInt()+b[3].toInt()
                when (sum1==sum2)
                {

                true->println("билет счастливый, сумма двух первых и двух последних цифр равна")
                    false->println("билет не счастливый, сумма двух первых и двух последних цифр не равна")
            }
            }
            false->println("число не четырёхзначное")
        }
    } catch (e:Exception){println("неккоректно введены значения")}
}
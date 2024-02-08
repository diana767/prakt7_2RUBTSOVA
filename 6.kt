fun main()
{
    try {
        println("введите a")
        var a= readLine()!!.toDouble()
        println("введите b")
        var b= readLine()!!.toDouble()
        println("введите c")
        var c= readLine()!!.toDouble()
        when(a<b&&b<c)
        {
           true->println("неравенства выполняются")
            false->println("неравенства не выполняются")
        }

        } catch (e:Exception){println("неккоректно введены значения")}
}
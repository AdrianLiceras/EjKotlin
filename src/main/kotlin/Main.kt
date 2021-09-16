
    fun main(){

       /* val numConstante=13L
        var num=numConstante
        print("El número $num es mi número favorito \n")
        //var num2: Double=num
        print("Sin embargo, ${num.toDouble()} no me gusta")*/
    /*var num=1
     println(transformarADouble(num))

    var nomb="Adrián"
        println(diHola(nomb))

    var edad=18
        println(diEdad(nomb,edad))
    }
    fun transformarADouble(param: Int): Double {
       var num=0.0
        num=param.toDouble()
        return num
    }

    fun diHola(param: String): String{
        var pres="Soy $param"
        return pres
    }

    fun diEdad(param1: String, param2: Int): String{
        var ed="Soy $param1 y tengo $param2 numero de años"
        return ed*/

        var num1=2
        var num2=4

        println(sumaIntegers(num1,num2))
        var nums="3"
        var nums2="4"
        println(sumaStrings(nums,nums2))

        println(diResultado(sumaIntegers(num1,num2),sumaStrings(nums,nums2)))
    }

    fun sumaIntegers(param1: Int, param2: Int): Double{
        var res= param1+param2
        return res.toDouble()
    }
    fun sumaStrings(param1: String, param2: String): Double {
        var num: Int = param1.toInt()
        var num2: Int = param2.toInt()
        var res = (num + num2).toDouble()
        return res
    }

    fun diResultado(param: Double, param2: Double):Double{

        var res=param+param2

        return res
    }
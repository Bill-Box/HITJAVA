fun main(args: Array<String>) {
    println("Hello Welcom to Kotlin")
    var a:Int = 12
    val b: Int = 24
    println("a $a")
    println("a $b")
    var c:Double = 5.7
    var d = 5.7
    var e:Float = 5.3f
    println("kieu dl cua c la: ${c::class.java.typeName}")
    println("kieu dl cua d la: ${d::class.java.typeName}")
    println("kieu dl cua f la: ${e::class.java.typeName}")
    //khai bao tat kieu int
    var k = 9
    var g =8L
    var ch:String = "Hom Nay Cum On"
    var chh = "Hom Nay Tam Tam"
    println("kieu dl cua f  la: " + (k::class.java.typeName))
    println("kieu dl cua g  la: " + (g::class.java.typeName))
    println("kieu dl cua ch la: " + (ch::class.java.typeName))
    println("kieu dl cua chh la: " + (chh::class.java.typeName))
    println(ch)
    var chd = """
        Công cha như núi Thái Sơn
        Nghĩa Mẹ như nước trong nguồn chảy ra
    """.trimIndent()
    println(chd)


}
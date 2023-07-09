open class Celular
{
    var sistema : String = ""
    var modelo : String = ""
    var preco : Double = 0.0
    var desconto : Double = 0.0

    constructor(sistema:String, modelo:String, preco:Double, desconto:Double)
    {
        this.sistema = sistema
        this.modelo = modelo
        this.preco = preco
        this.desconto = desconto
    }

    open fun calculaDesconto(): Double
    {
        return preco - desconto
    }
}
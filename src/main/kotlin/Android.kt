class Android : Celular
{
    var fabricante: String = " "

    constructor(sistema:String, modelo:String, preco:Double, desconto:Double, fabricante:String) :
            super(sistema, modelo, preco, desconto)
    {
        this.fabricante = fabricante

    }
    override fun calculaDesconto(): Double
    {
        var precoFinalA : Double = 0.0

        if (this.fabricante == "S" || this.fabricante == "M")
        {
            precoFinalA = this.preco - this.desconto * (1.1)

        }
        else if (this.fabricante == "LG" || this.fabricante == "X")
        {
            precoFinalA = this.preco - this.desconto * (1.2)

        }
        return precoFinalA
    }

}
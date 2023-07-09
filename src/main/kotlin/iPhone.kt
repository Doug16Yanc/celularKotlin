class iPhone : Celular
{
    var tipo : Int = 0

    constructor(sistema:String, modelo : String, preco : Double, desconto : Double, tipo: Int) :
            super(sistema, modelo, preco, desconto)
    {
                this.tipo = tipo
            }

    override fun calculaDesconto():Double
    {
        var precoFinalI : Double = 0.0

        if (this.tipo == 1)
        {
            precoFinalI = this.preco - this.desconto * (1.05)
        }
        else if (this.tipo == 2)
        {
            precoFinalI = this.preco - this.desconto * (1.1)

        }
        return precoFinalI
    }
}
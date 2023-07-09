import java.util.Scanner


val scan = Scanner(System.`in`)
fun main(args: Array<String>)
{
    val scan = Scanner(System.`in`)


    System.out.println("Bem-vindo(a) ao nosso sistema de celulares")

    while (true)
    {

        System.out.println("==================================")
        System.out.println("===Escolha uma alternativa=========")
        System.out.println("=====================================")
        System.out.printf("  | Alternativa 1: Cadastrar android |\n")
        System.out.printf("  | Alternativa 2: Cadastrar iPhone  |\n")
        System.out.printf("  | Alternativa 3: Encerrar o programa |\n")

        val opcao = scan.nextInt()

        if (opcao == 1)
        {
            cadastrar_android()
        }
        else if (opcao == 2)
        {
                cadastrar_iphone()
        }
        else if (opcao == 3)
        {
            println("Douglas agradece sua preferência! Até logo!")

            System.exit(0)
        }
        else
        {
            println("Opção inexistente!")
        }
    }
}

fun cadastrar_android()
{

    System.out.println("Digite o sistema operacional:")
    var nome = scan.next()

    System.out.println("Digite o modelo do dispositivo:")
    var modelo = scan.next()

    System.out.println("Digite, em reais, o preço do dispositivo:")
    var preco = scan.nextDouble()

    System.out.println("Digite, em reais, o desconto bruto:")
    var desconto = scan.nextDouble()

    System.out.println("Digite a fabricante:\nS-Samsung\nM-Motorola\nLG-Life´s Good\nX-Xiaomi\n")
    var fabricante = scan.next()

    val android = Android(nome, modelo, preco, desconto, fabricante)

    println("Tal aparelho cadastrado custa R$ ${android.calculaDesconto()}")
}

fun cadastrar_iphone()
{
    System.out.println("Digite o sistema operacional:")
    var nome = scan.next()

    System.out.println("Digite o modelo do dispositivo:")
    var modelo = scan.next()

    System.out.println("Digite, em reais, o preço do dispositivo:")
    var preco = scan.nextDouble()

    System.out.println("Digite, em reais, o desconto bruto:")
    var desconto = scan.nextDouble()

    System.out.println("Digite o tipo:\n1-Plus\n2-Comum\n")
    var tipo = scan.nextInt()


    val iphone = iPhone(nome, modelo, preco, desconto, tipo)

    println("Tal aparelho cadastrado custa R$ ${iphone.calculaDesconto()}")
}


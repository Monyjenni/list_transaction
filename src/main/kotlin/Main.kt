import java.math.BigDecimal

fun main(args: Array<String>) {

    val listTransactions = mutableListOf(

        transaction(id=1, amount = BigDecimal.valueOf(10), description = "not null"),
        transaction(id = 2, amount = BigDecimal.valueOf(20), description = "not null"),
        transaction(id=3, amount = BigDecimal.valueOf(30)),
        transaction(id=4, amount = BigDecimal.valueOf(40)),
        transaction(id=5, amount = BigDecimal.valueOf(50))
    )



    // sum all the amounts of the list above
    val sumOfAmount = listTransactions.sumOf { it.amount }

    println("This is all the amounts of the list ${sumOfAmount}\n")



    // filter and get only the amounts which are greater than 35 and make it i
    val filterBigtransaction = listTransactions.filter { it.amount > BigDecimal.valueOf(35) }


    // sum the amounts which are greater than 35 tgt
    val sumOfNewTransaction = filterBigtransaction.sumOf { it.amount }

    println("This lists are greater than 35 ${filterBigtransaction}\n")

    println("The sum of these is : ${sumOfNewTransaction}\n")


    // Map through the null descriptions and get their Ids and Amounts to sum tgt


    val modifyList = listTransactions.map{
        transaction ->

        if(transaction.description == null){
            println(">>>>>>>>> ${transaction.id.toBigDecimal() + transaction.amount}")

            val newTransaction = "${transaction.id} - ${transaction.amount}"
            transaction.description= newTransaction
            transaction

        }else {
            println("It doesn't have.")
        }


    }

    val addDescriptionList = listTransactions.filter { it.description == null }

    addDescriptionList.map{it to it}

    println("This list contains null description only ${addDescriptionList}")


    println("This is the new list ${modifyList}")















}
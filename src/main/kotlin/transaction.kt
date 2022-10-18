import java.math.BigDecimal

data class transaction (

    val id: Int ,

    // BigDecimal is bigger than double
    val amount : BigDecimal,
    var description: String?=null
        )
class Eksekusi ( pilihan1 : String?,  pilihan2: String?) {

    private val pilihan1: String? = pilihan1
    private val pilihan2: String? = pilihan2


    fun eksekusiHasil() {
        if ((pilihan1 == "Batu") &&( pilihan2 == "Batu"))
        {
            println( "Seri")
        }else if ((pilihan1 == "Batu")&&( pilihan2 == "Gunting"))
        {
           println("Player 1 Menang")
        }
        else if ((pilihan1 == "Batu")&&( pilihan2 == "Kertas"))
        {
            println( "Player 2 Menang")
        }
        else if ((pilihan1 == "Kertas")&&(pilihan2 == "Kertas"))
        {
            println( "Seri")
        }
        else if ((pilihan1 == "Kertas")&& (pilihan2 == "Batu"))
        {
            println("Player 1 Menang")
        }
        else if ((pilihan1 == "Kertas")&&(pilihan2 == "Gunting"))
        {
            println("Player 2 Menang")
        }
        else if ((pilihan1 == "Gunting")&&(pilihan2 == "Gunting"))
        {
            println( "Seri")
        }
        else if ((pilihan1 == "Gunting")&&(pilihan2 == "Kertas"))
        {
            println( "Player 1 Menang")
        }
        else if ((pilihan1 == "Gunting")&& (pilihan2 == "Batu")){
            println( "Player 2 Menang")
        }
        else{
            println( "error")
        }

    }
}
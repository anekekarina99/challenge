fun main(args: Array<String>){
    println ("Selamat datang, permainan batu gunting kertas, pilih (Batu),(Gunting) atau (Kertas)")
    println("Masukan Pilihan 1 :")
    val pilihan1 : String? = readLine()
    println("Masukan Pilihan 2 :")
    val pilihan2 : String? = readLine()
    //*eksekusi
    val eksekusi = Eksekusi(pilihan1,pilihan2)
    var hasil = eksekusi.eksekusiHasil()
    //print
    println(hasil)
}

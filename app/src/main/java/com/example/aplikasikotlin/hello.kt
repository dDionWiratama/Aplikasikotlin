package com.example.aplikasikotlin

class Hobi(val nama: String, val deskripsi: String)

class Manusia(val nama: String, val hobi: Hobi)

fun main() {
    val hobiBacaBuku = Hobi("Mancing ", "Memancing adalah suatu kegiatan yang bisa meredakan stress.")

    val john = Manusia("Dion Wiratama", hobiBacaBuku)

    println("Nama: ${john.nama}, Hobi: ${john.hobi.nama} (${john.hobi.deskripsi})")
}
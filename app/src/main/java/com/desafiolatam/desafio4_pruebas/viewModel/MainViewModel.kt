package com.desafiolatam.desafio4_pruebas.viewModel

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var firstAnswer: ArrayList<String> = arrayListOf()

    private var thirdAnswer: ArrayList<String> = arrayListOf()

    private var fourthAnswer: ArrayList<String> = arrayListOf()

    private var userEmail: String? = null
    private var userComment: String? = null

    fun addFirstAnswer(value: String): List<String> {
        firstAnswer.add(value)
        return firstAnswer.distinct().sorted().toList()
    }

    fun removeFirstAnswer(value: String): List<String> {
        if (firstAnswer.contains(value)) {
            firstAnswer.remove(value)
        }
        return firstAnswer.toList()
    }

    fun getFirstAnswer(): String {
        return when(firstAnswer.size) {
            1 -> "Color: ${firstAnswer.joinToString("")}"
            else -> "Colores: ${firstAnswer.joinToString(" - ")}"
        }
    }



    fun saveUserEmail(email: String) {
        userEmail = email
    }

    fun saveUserComment(comment: String) {
        userComment = comment
    }

    fun getUserEmail(): String = "Correo electronico: $userEmail"

    fun getUserComment(): String = "Comentarios: $userComment"


}
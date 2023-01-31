package gabriel.br.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Austrália",
            "Armênia", "Honduras",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Áustria",
            "Austrália", "Armênia", 3
        )

        questionsList.add(que2)


        val que3 = Question(
            3, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_brazil,
            "Bielorrússia", "Belize",
            "Brunei", "Brasil", 4
        )

        questionsList.add(que3)


        val que4 = Question(
            4, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Bélgica",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)


        val que5 = Question(
            5, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_germany,
            "Alemanha", "Holanda",
            "Grécia", "Nenhuma das opções", 1
        )

        questionsList.add(que5)


        val que6 = Question(
            6, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_india,
            "Irlanda", "Irã",
            "Húngria", "Índia", 4
        )

        questionsList.add(que6)


        val que7 = Question(
            7, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Nova Zêlandia",
            "Tuvalu", "Inglaterra", 2
        )

        questionsList.add(que7)


        val que8 = Question(
            8, "A qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordânia",
            "Sudão", "Egito", 1
        )

        questionsList.add(que8)
        return questionsList

    }

}
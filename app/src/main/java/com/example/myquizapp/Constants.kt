package com.example.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Choose the right name of Disney Princess",
            R.drawable.snowwhite3,
            "Snow white", "Cinderella",
            "Elsa", "Anna",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Choose the right name of Disney Princess",
            R.drawable.bell3,
            "Snow white", "bell",
            "Elsa", "Cinderella",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Choose the right name of Disney Princess",
            R.drawable.cinderella3,
            "Snow white", "Bell",
            "Cinderella", "Mermaid",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Choose the right name of Disney Princess",
            R.drawable.mermaid3,
            "Elsa", "Bell",
            "Cinderella", "Mermaid",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Choose the right name of Disney Princess",
            R.drawable.rapunzel3,
            "Rapunzel", "Anna",
            "Elsa", "Mermaid",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Choose the right name of Disney Princess",
            R.drawable.elsa3,
            "Snow white", "Elsa",
            "Cinderella", "Mermaid",
            2
        )
        questionsList.add(que6)

        return questionsList
    }
}
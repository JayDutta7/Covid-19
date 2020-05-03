package com.dcc.covidtracker.localDatabase.staticValue


class StaticValue {

    companion object {
        /*todo Application--Name*/
        const val applicationName = "Chatbot"
        /*todo Networking Connectivity */
        const val CONNECT_TO_WIFI = "WIFI"
        const val CONNECT_TO_MOBILE = "MOBILE"
        const val NOT_CONNECT = "NOT_CONNECT"
        const val CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE"

        /*ChatLayout Name*/
        const val TypeEducation = "DCC-EduBot"
        const val TypeFinance = "DCC-FinanceBot"
        const val TypeHR = "DCC-HRBot"
        const val TypeBanking = "DCC-BankingBot"
        const val TypeInsurace = "DCC-InsuranceBot"

        /*Category List*/
        val categoryList =
            arrayListOf("Education", "Finance", "HR", "Banking", "Insurance", "Travel")


    }
}
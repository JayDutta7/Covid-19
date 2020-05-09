package com.dcc.covidtracker.networking

object WebService {
    /**Protocol Type**/
    private const val protocolTypeLive: String = "https://"

    const val LiveUrl = "${protocolTypeLive}e096bm03f4.execute-api.ap-south-1.amazonaws.com/dev/dialogflow/"

    /*call-url*/
    const val speechText: String = "getreply"
    const val speechTextDeafult: String = "getDeafultreply"

}
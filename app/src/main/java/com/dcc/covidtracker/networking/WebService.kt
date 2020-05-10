package com.dcc.covidtracker.networking

object WebService {
    /**Protocol Type**/
    private const val protocolTypeLive: String = "https://"

    const val LiveUrl = "${protocolTypeLive}api.covid19india.org/"

    /*call-url*/
    const val speechText: String = "getreply"
    const val speechTextDeafult: String = "getDeafultreply"

}
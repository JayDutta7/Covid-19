package com.dcc.covidtracker.utility.network

interface ConnectivityReceiverListener {
    fun onNetworkConnectionChanged(isConnected: Boolean)
}
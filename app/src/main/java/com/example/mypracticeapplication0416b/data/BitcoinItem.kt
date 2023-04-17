package com.example.mypracticeapplication0416b.data


import com.google.gson.annotations.SerializedName

data class BitcoinItem(
    @SerializedName("circulating_supply")
    var circulatingSupply: String? = "",
    @SerializedName("id")
    var id: String? = "",
    @SerializedName("last_updated")
    var lastUpdated: String? = "",
    @SerializedName("market_cap_usd")
    var marketCapUsd: String? = "",
    @SerializedName("max_supply")
    var maxSupply: String? = "",
    @SerializedName("name")
    var name: String? = "",
    @SerializedName("percent_change_1h")
    var percentChange1h: String? = "",
    @SerializedName("percent_change_24h")
    var percentChange24h: String? = "",
    @SerializedName("percent_change_7d")
    var percentChange7d: String? = "",
    @SerializedName("price_btc")
    var priceBtc: String? = "",
    @SerializedName("price_usd")
    var priceUsd: String? = "",
    @SerializedName("rank")
    var rank: String? = "",
    @SerializedName("symbol")
    var symbol: String? = "",
    @SerializedName("total_supply")
    var totalSupply: String? = "",
    @SerializedName("volume_24h_usd")
    var volume24hUsd: String? = ""
)
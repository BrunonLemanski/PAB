package PAB06

import groovy.json.JsonSlurper

def txt = 'krzeslo 50 PLN komplet 2000.99 PLN tablet -1.11 PLN'
def regex = /([+-]?(?:\d+\.?\d*|\d*\.\d+)) PLN/

def urlString = 'https://api.exchangeratesapi.io/latest?base=EUR'
def apiResult = (new JsonSlurper()).parse(
        new InputStreamReader(
                (new URL(urlString)).newInputStream()
        )
)
def plnValue = apiResult.rates.PLN

txt = txt.replaceAll(regex) { all, price ->
    String.format("%.2f", price.toBigDecimal()/plnValue.toBigDecimal()) + ' EUR'
}

println txt

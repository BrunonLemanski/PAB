package PAB07

import groovy.json.JsonSlurper

def urlString = 'https://api.exchangeratesapi.io/latest?base=EUR'
def apiResult = (new JsonSlurper()).parse(
        new InputStreamReader(
                (new URL(urlString)).newInputStream()
        )
)
def plnValue = apiResult.rates.PLN

def MenuEURFile = new File('Pab07resources\\MenuEUR')
new File('E:\\Pliki\\GitHub\\PAB_Groovy\\src\\PAB07\\Pab07resources\\MenuPl').eachLine { line ->
    def tokens = line.tokenize('\t')
    def food = tokens.first()
    def price = tokens.last().tokenize(' ').first()
    def priceEUR = String.format("%.2f", price.toBigDecimal()/plnValue.toBigDecimal())

    MenuEURFile << "$food: $priceEUR EUR\n"
}



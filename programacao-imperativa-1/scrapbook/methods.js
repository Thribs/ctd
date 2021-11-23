const country = {
    countryName: "Brasil",
    capital: "Brasília",
    printName: function() {return `A capital do país ${this.countryName} é ${this.capital}`},
}
console.log(country.printName());
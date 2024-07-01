function maiorNumero(numero1, numero2) {
    if (numero1 > numero2){
        return numero1
    } else if (numero1 < numero2) {
        return numero2
    } else {
        return "Os números são iguais"
    }
}

console.log(maiorNumero(10, 10));
function fatorial(numero) {
    let fatorial =  numero-1;
    while (fatorial > 1) {
        numero = numero * fatorial;
        fatorial --;
    }
    return numero;
}

console.log(fatorial(5));
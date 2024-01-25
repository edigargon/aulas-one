function conversaoReal(valor) {
    let valorDolar =  4.80;
    let conversao = (valor / valorDolar).toFixed(2);
    let mensagem = ` O valor de $1.00 é R$4.80.
    A conversão de R$${valor} para dolar é: $${conversao}`;
    return mensagem 
}

console.log(conversaoReal(10));
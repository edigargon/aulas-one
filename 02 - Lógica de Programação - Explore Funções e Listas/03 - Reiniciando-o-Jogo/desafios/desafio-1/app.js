function IMC(altura, peso) {
    let imc = (peso / (altura * altura)).toFixed(2);
    return imc;
}

console.log(IMC(1.66, 96.6));
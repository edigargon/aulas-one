
function calcularArea(raio, pi) {
    let area = pi * (raio * raio);
    return area;
}

function calcularPerimetro(raio, pi) {
    let perimetro = 2 * pi * raio
    return perimetro;
}

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

function ativarBotao() {
    let pi = 3.14
    let raio = document.getElementById('raio').value;
    let area = calcularArea(raio, pi);
    let perimetro = calcularPerimetro(raio, pi);
    let mensagem = `A area do circulo é : ${area} m².
    O perimetro do circulo é : ${perimetro} m.`;
    exibirTextoNaTela('h2', mensagem);
}
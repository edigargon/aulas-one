
function calcularArea(altura, largura) {
    area = largura * altura;
    return area;
}

function calcularPerimetro(altura, largura) {
    perimetro = 2 * (altura + largura)
    return perimetro;
}

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

function ativarBotao() {
    let altura = document.getElementById('input_altura').value;
    let largura = document.getElementById('input_largura').value;
    area = calcularArea(altura, largura);
    perimetro = calcularPerimetro(altura, largura);
    mensagem = `A area da sala é : ${area} m².
    O perimetro da sala é : ${perimetro} m.`;
    exibirTextoNaTela('h2', mensagem);
}

function mostrarTabuada(numero) {
    let contador = 0;
    let lista = [];
    while (contador < 11) {
       let tabuada = numero * contador;
       lista.push(tabuada);
       contador ++;
    }
    return lista;
}

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

function ativarBotao() {
    let numeroTabuada = document.getElementById('tabuada').value;
    let tabuada = mostrarTabuada(numeroTabuada);
    let contador = 0;
    let casa = 0;
    let mensagem = [];
    while (tabuada.length > contador) {
        let texto = `${numeroTabuada} x ${contador} = ${tabuada[casa]}`
        mensagem.push(texto)
        casa ++;
        contador++;
    }
    exibirTextoNaTela('h2', mensagem);
}
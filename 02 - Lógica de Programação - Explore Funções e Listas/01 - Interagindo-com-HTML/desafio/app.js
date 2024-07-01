let mudancaH1 = document.querySelector('h1');
mudancaH1.innerHTML = ('Hora do Desafio');

function acionarBotao() {
    console.log('O Botão foi clicado');
}

function acionarAlerta() {
    alert('EU AMO JS');
}

function acionarPrompt() {
    let cidade = prompt('Informe uma cidade do Brasil');
    alert(`Estive em ${cidade} e lembrei de você. <3`)
}

function acionarSoma() {
    let numero1 = parseInt(prompt('Informe o 1º número'));
    let numero2 = parseInt(prompt('Informe o 2º números'));
    soma = numero1 + numero2;
    alert(`A soma entre os números ${numero1} e ${numero2} é ${soma}`);
}


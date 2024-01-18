alert('Boas Vindas ao Jogo do Número Secreto');
let numeroSecreto = 29;
console.log(numeroSecreto);
let chute;
let tentativas = 1;

while (chute != numeroSecreto) {
    chute = prompt(' Escolha um número entre 1 e 30');

    if (numeroSecreto == chute) {
        alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativas.`); //Template String (Usar acraze ``)
    } else {
        if (numeroSecreto < chute) {
            alert(`O número secreto é menor que o chute ${chute}`);
        } else {
            alert(`O número secreto é maior que o chute ${chute}`);
        }
        tentativas++;//adicionando +1 em tentativas
    }
}

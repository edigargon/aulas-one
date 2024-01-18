alert('Boas Vindas ao Jogo do Número Secreto');
let numeroSecreto = 29;
console.log(numeroSecreto);
let chute 

while (chute != numeroSecreto) {
    chute = prompt(' Escolha um número entre 1 e 30');

    if (numeroSecreto == chute) {
        alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto}`); //Template String (Usar acraze ``)
    } else {
        if (numeroSecreto < chute) {
            alert(`O número secreto é menor que o chute ${chute}`);
        } else {
            alert(`O número secreto é maior que o chute ${chute}`);
        }
    }
}

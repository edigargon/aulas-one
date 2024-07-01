alert('Boas Vindas ao Jogo do Número Secreto');
let numeroSecreto = 29;
console.log(numeroSecreto);
let chute = prompt(' Escolha um número entre 1 e 30');

if (numeroSecreto == chute) {
    alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto}`); //Template String (Usar acraze ``)
} else {
    alert('Você Errou ;(');
}
function mergeSort(arr) {
    if (arr.length <= 1) {
      return arr;
    }
    
    // Divide o array em duas partes
    const meio = Math.floor(arr.length / 2);
    const esquerda = arr.slice(0, meio);
    const direita = arr.slice(meio);
    
    // Ordena recursivamente cada parte
    const esquerdaOrdenada = mergeSort(esquerda);
    const direitaOrdenada = mergeSort(direita);
    
    // Combina as partes ordenadas em um único array
    return merge(esquerdaOrdenada, direitaOrdenada);
  }
  
  function merge(esquerda, direita) {
    const resultado = [];
    let i = 0;
    let j = 0;
    
    while (i < esquerda.length && j < direita.length) {
      if (esquerda[i] < direita[j]) {
        resultado.push(esquerda[i]);
        i++;
      } else {
        resultado.push(direita[j]);
        j++;
      }
    }
    
    // Adiciona o restante dos elementos de cada parte
    return resultado.concat(esquerda.slice(i)).concat(direita.slice(j));
  }
  
  // Exemplo de uso
  let arr = [5, 3, 8, 4, 2, 7, 1, 6];
  let resultado = mergeSort(arr);
  console.log(resultado);
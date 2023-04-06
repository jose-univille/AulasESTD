function quicksort(array) {
    if (array.length <= 1) {
      return array;
    }
  
    const pivotIndex = Math.floor(Math.random() * array.length);
    const pivot = array[pivotIndex];
    const left = [];
    const right = [];
    const equal = [];
  
    for (let element of array) {
      if (element < pivot) {
        left.push(element);
      } else if (element > pivot) {
        right.push(element);
      } else {
        equal.push(element);
      }
    }

    return quicksort(left).concat(equal, quicksort(right));
  }
  
  const unsortedArray = [5, 3, 8, 4, 2, 7, 1, 10, 6, 9, 0];
  //const unsortedArray = ['d', 'c', 'b', 'a', 'z', 'q', 'x', 'h', 'i', 'j', 'k']
  const sortedArray = quicksort(unsortedArray);
  console.log(sortedArray);
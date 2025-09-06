let arr = [1,6,4,8,7];

// console.log(arr[1]);
// console.log(arr.length);
// arr[0] = 10;
// console.log(arr);
// console.log(arr.toString());
// console.log(arr.join("/"));
// console.log(arr.pop());
// console.log(arr.push(5));
// // (delete arr[3]);
// console.log(arr.reverse());

arr.forEach((value, index, arr) =>{
    console.log(value, index, arr)
})

arr.map((value, index) =>{
    console.log(`${value} ${"*"} ${index} ${"="} ${value*index} `)
})

const two = (e) =>{
    if (e>2){
        return true
    }
    return false
}

console.log(arr.filter(two));

let arr2 = [1,2,3,4,5,6]

const red = (a, b)=>{
    return a+b
}

console.log(arr2.reduce(red))



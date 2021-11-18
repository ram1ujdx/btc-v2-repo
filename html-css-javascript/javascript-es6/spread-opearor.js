let avg=(...nums)=>{
    let sum=0;
    for(let item of nums){
        sum+=item;
    }
    return sum/nums.length;
}

let average = avg(10,20,30,40,26,18);
console.log(average);

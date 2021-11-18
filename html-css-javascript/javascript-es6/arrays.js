//var nums=[];

var nums = new Set();

nums.add(10);
nums.add(30);
nums.add(70);
nums.add(25);
nums.add(10);

// for(let i=0;i<nums.length; i++){
//     console.log(nums[i]);
// }

for(let x of nums){
    console.log(x)
}

nums.filter(item=>item%10==0)
        .map(item=>item*item)
        .forEach(item=>console.log(item));

let x=10;
console.log("Before calling - "+x);

var myFunction=()=>{
    let x=20;
    console.log("From function - "+x);
    if(x>10){
        let y=50;
        console.log("From IF block - "+y);
    }
   // console.log("From function after IF - "+y);
}
myFunction();
console.log("After calling - "+x);
// console.log("Y from outside - "+y);
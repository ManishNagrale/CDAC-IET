// // first way: using function
// function f2(arr,largest){
    
//        for(let i=0;i<=arr.length;i++){
//           if(largest<arr[i]){
//              largest=arr[i];
//           }
         
//        }
    
//       return largest;
// }
 
let arr = [10,20,50,15,70,30];
 let largest =arr[0];
//    console.log(f2(arr,largest))


  //second way:
// arr.forEach(Element=>{
//     if (Element>largest)
//         largest=Element;
// })
// console.log(largest)


//2nd in diff way

// for(const e of arr){
// if (e>largest)
//     largest=e;
// }
// console.log(largest)


//third way

function find_largest(arr){
    arr.sort((a,b)=>a-b);
    return arr[arr.length-1];
}
console.log(find_largest(arr))
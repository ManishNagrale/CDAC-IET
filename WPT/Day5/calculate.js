function add(...arr){
    let sum=0;
    for(let i=0;i<arr.length;i++)
        sum=sum+arr[i];
    
        console.log(arr)
    

    console.log("Addition of array is  "+sum)
}
 function oddnum(...arr){
     console.log("odd numbers are")
for(let i=0;i<arr.length ;i++){
        if(arr[i]%2!= 0){
           
            console.log(+arr[i])
        }
    }
 }
add(1,3)
add(2,8,9)
add(8,9,6,3)
oddnum(15,20,31,17,28,25)



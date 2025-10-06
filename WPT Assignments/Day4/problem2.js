function arrayOperations(operation) {
    let arr = [10, 20, 30, 40, 50];

    switch(operation) {
        case 'push':
     
            arr.push(60);
            console.log('After push:', arr);
            break;
        
        case 'pop':
      
            let popped = arr.pop();
            console.log('Popped element:', popped);
            console.log('After pop:', arr);
            break;

        case 'shift':
            
            let shifted = arr.shift();
            console.log('Shifted element:', shifted);
            console.log('After shift:', arr);
            break;

        case 'unshift':
        
            arr.unshift(5);
            console.log('After unshift:', arr);
            break;

        case 'slice':
            
            let sliced = arr.slice(1, 4); 
            console.log('Sliced array:', sliced);
            break;

        case 'splice':
           
            let spliced = arr.splice(2, 2, 25, 35);
            console.log('Removed elements:', spliced);
            console.log('After splice:', arr);
            break;

        case 'indexOf':
           
            let idx = arr.indexOf(30);
            console.log('Index of 30:', idx);
            break;

        case 'includes':
           
            let has40 = arr.includes(40);
            console.log('Array includes 40:', has40);
            break;

        case 'forEach':
          
            console.log('Array elements:');
            arr.forEach((elem, idx) => {
                console.log(`Index ${idx}: ${elem}`);
            });
            break;

        case 'map':
        
            let mapped = arr.map(x => x * 2);
            console.log('Mapped array (doubled):', mapped);
            break;

        case 'filter':
         
            let filtered = arr.filter(x => x > 25);
            console.log('Filtered array (>25):', filtered);
            break;

        case 'reduce':
       
            let sum = arr.reduce((acc, curr) => acc + curr, 0);
            console.log('Sum of elements:', sum);
            break;

        default:
            console.log('Invalid operation');
    }
}


arrayOperations('push');
arrayOperations('pop');
arrayOperations('slice');
arrayOperations('map');
arrayOperations('reduce');
arrayOperations('filter')

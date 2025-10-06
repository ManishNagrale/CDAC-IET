const nums = process.argv.slice(2, 12).map(Number);

let evenSum = 0, evenIdxSum = 0, primeSum = 0;

function isPrime(x) {
  if (x < 2) return false;
  for(let i=2; i*i<=x; i++)
    if(x % i === 0) return false;
  return true;
}

for(let i=0; i<nums.length; i++) {
  if(nums[i] % 2 === 0) evenSum += nums[i];
  if(i % 2 === 0) evenIdxSum += nums[i];
  if(isPrime(nums[i])) primeSum += nums[i];
}

console.log("Even sum:", evenSum);
console.log("Even index sum:", evenIdxSum);
console.log("Prime sum:", primeSum);

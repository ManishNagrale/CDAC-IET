export default function Calculator(props){
    let n1=parseFloat(props.num1);
    let n2=parseFloat(props.num2);

    return<>

    <h2>Addition of num1 and num2 is {n1+n2}</h2>
    <h2>Substraction of num1 and num2 is {n1-n2}</h2>
    <h2>Multiplication of num1 and num2 is {n1*n2}</h2>
    <h2>Division of nuum1 and num2 is {n2/n1}</h2>
    </>
}
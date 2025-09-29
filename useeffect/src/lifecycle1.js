import { useEffect, useState } from "react";

export default function Counter() {

  const [count, setCount] = useState(0);

 
  useEffect(() => {
    console.log("Component mounted");
  }, []);

 
  useEffect(() => {
    console.log("Count updated:", count);
   
    return () => {
      console.log("Cleanup for count:", count);
    };
  }, [count]);

  function handler() {
    setCount(count + 1);
  }

  return (
    <>
      Counter = {count}
      <br />
      <button onClick={handler}> Click Me </button>
    </>
  );
}

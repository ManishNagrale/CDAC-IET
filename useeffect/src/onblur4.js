import React, { useState } from "react";

export default function ListOnBlur() {
  const [inputValue, setInputValue] = useState("");
  const [listItems, setListItems] = useState([]);

  const handleBlur = () => {
    if (inputValue.trim() !== "") {
      setListItems([...listItems, inputValue.trim()]);
      setInputValue("");
    }
  };
   return (
    <div>
      <h2>Input and Display Ordered List</h2>
      <input
        type="text"
        value={inputValue}
        onChange={(e) => setInputValue(e.target.value)}
        onBlur={handleBlur}
        placeholder="Enter text and click outside"
      />
      <ol>
          {listItems.map((item, index) => (
            <li key={index}>{item}</li>
          ))}
        </ol>
    </div>
  );
}

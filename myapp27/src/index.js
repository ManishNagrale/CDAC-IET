import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import MyFunction, { Function2, Function3 } from './myfunction';
import  factorial  from './Factorial';
import Calculator from './Calculator';




const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <>
    <App />
    <Factorial/>
    <Calculator/>
    <MyFunction data="Welcome!" skills={['JavaScript', 'React']} />
      <Function2 />
      <Function3 />
   </>
  </React.StrictMode>
);
            
reportWebVitals();

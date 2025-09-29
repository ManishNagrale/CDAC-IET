import logo from './logo.svg';
import './App.css';
import Counter from './lifecycle1';
import Handler from './lifecycle1';
import Counts from './counter3';
import Counte from './counter2';
import ListOnBlur from './onblur4';
function App() {
  return (
    <div className="App">

       <h1>My React App</h1>

      <Counter />
    
      <hr />
      <Handler/>

      <hr/>
      <Counte/>

      <hr/>

      <Counts/>

      <hr/>

      <ListOnBlur/>

    </div>
  );
}

export default App;

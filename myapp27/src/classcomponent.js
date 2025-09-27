import React, { Component } from 'react';

class TextConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      text: ''
    };
  }

  handleChange = (event) => {
    this.setState({ text: event.target.value });
  };

  handleUpperCase = () => {
    this.setState({text: this.state.text.toUpperCase()});
  };

  handleLowerCase = () => {
    this.setState({text:this.state.text.toLowerCase()});
  };

  render() {
    return (
      <div>
        <input 
          type="text"
          value={this.state.text}
          onChange={this.handleChange}
          placeholder="Type something"
        />
        <button onClick={this.handleUpperCase}>Upper Case</button>
        <button onClick={this.handleLowerCase}>Lower Case</button>
      </div>
    );
  }
}

export default TextConverter;

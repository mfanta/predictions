import React from 'react';
import ReactDOM from 'react-dom';

const HelloNameContainer = require('./components/helloName/HelloNameContainer');

let render = () => {
  const container = document.getElementById('react-root');

  ReactDOM.render(<HelloNameContainer/>, container);
};

render();

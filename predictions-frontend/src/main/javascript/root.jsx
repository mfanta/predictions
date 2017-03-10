import React from 'react';
import ReactDOM from 'react-dom';

let render = () => {
  const MainComponent = require('./components/main/main');
  const container = document.getElementById('react-root');

  ReactDOM.render(<MainComponent/>, container);
};

render();

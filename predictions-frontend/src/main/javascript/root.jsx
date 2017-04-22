import React from 'react';
import ReactDOM from 'react-dom';

import HelloNameContainer from './components/helloName/HelloNameContainer.jsx';

const render = () => {
  const container = document.getElementById('react-root');

  ReactDOM.render(<HelloNameContainer/>, container);
};

render();

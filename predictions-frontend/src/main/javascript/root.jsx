import React from 'react';

let render = () => {
  const MainComponent = require('./components/main/main');
  const container = document.getElementById('react-root');

  MainComponent.render(<MainComponent/>, container);
};

render();

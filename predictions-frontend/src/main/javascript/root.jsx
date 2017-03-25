import React from 'react';
import ReactDOM from 'react-dom';

const API_ROOT = 'http://localhost:8080/';
const USER_NAME_URL = API_ROOT + 'username';

let render = () => {
  const MainComponent = require('./components/main/main');
  const container = document.getElementById('react-root');

  fetch(USER_NAME_URL)
    .then((response) => response.json())
    .then((responseJson) => {
      ReactDOM.render(<MainComponent userName={responseJson.userName}/>, container);
    })
    .catch((error) => {
      console.log(error)
    });
};

render();

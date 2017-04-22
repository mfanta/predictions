import React from 'react';

import HelloName from './HelloName.jsx';

const USER_NAME_URL = 'http://localhost:8095/username';

export default class HelloNameContainer extends React.Component {

  constructor() {
    super();
    this.state = {
      userName: 'Harry-son',
    };
  }

  componentDidMount() {
    const self = this;
    fetch(USER_NAME_URL)
      .then(response => response.json())
      .then((responseJson) => {
        self.setState(responseJson);
      })
      .catch((error) => {
        window.console.log(error);
      });
  }

  render() {
    return <HelloName userName={this.state.userName}/>;
  }
}

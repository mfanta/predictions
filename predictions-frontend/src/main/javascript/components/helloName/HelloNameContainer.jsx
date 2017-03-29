import React from 'react';

const HelloName = require('./HelloName');

const API_ROOT = 'http://localhost:8095/';
const USER_NAME_URL = API_ROOT + 'username';

export default class HelloNameContainer extends React.Component {

  constructor() {
    super();
    this.state = {
      userName: "Harry-son"
    };
  }

  componentDidMount() {
    let self = this;
    fetch(USER_NAME_URL)
      .then((response) => response.json())
      .then((responseJson) => {
        self.setState(responseJson);
      })
      .catch((error) => {
        console.log(error);
      })
  }

  render() {
    return <HelloName userName={this.state.userName}/>;
  }
}

module.exports = HelloNameContainer;
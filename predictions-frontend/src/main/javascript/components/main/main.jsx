import React from 'react';

export default class MainComponent extends React.Component {

  constructor(props, context) {
    super(props, context);
    this.state = {
      userName: 'Martin'
    };
  }

  render() {
    return <div>Hello {this.state.userName}!</div>;
  }

  componentDidMount() {
    this.setState({
      userName: 'Tonda'
    });
  }
}

module.exports = MainComponent;

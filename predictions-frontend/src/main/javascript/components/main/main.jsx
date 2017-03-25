import React from 'react';

export default class MainComponent extends React.Component {

  render() {
    return <div>Hello {this.props.userName}!</div>;
  }
}

module.exports = MainComponent;

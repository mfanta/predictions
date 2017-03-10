import React from 'react';

export default class MainComponent extends React.Component {
  //noinspection JSMethodCanBeStatic
  render() {
    return <div>Hello {this.props.userName}!</div>;
  }
}

module.exports = MainComponent;

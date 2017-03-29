import React from 'react';

export default class HelloNameComponent extends React.Component {

  render() {
    return <div>Hello {this.props.userName}!</div>;
  }
}

module.exports = HelloNameComponent;

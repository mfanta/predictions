import React from 'react';
import PropTypes from 'prop-types';

export default class HelloNameComponent extends React.Component {

  render() {
    return <div>Hello {this.props.userName}!</div>;
  }
}

HelloNameComponent.propTypes = {
  userName: PropTypes.string,
};

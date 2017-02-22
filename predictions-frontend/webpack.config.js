var path = require('path');
// var webpack = require('webpack');

module.exports = {

  entry: path.resolve(__dirname, 'src/main/javascript/components/main/main.jsx'),

  output: {
    path: path.resolve(__dirname, 'src/main/resources/static'),
    filename: 'bundle.js'
  },

  module: {
    loaders: [
      {
        test: /src\/.+.jsx$/,
        exclude: /node_modules/,
        loader: 'babel-loader',
        query: {
          presets: ['es2015', 'react']
        }
      }
    ]
  }
};

var webpack = require('webpack');
var path = require('path');

module.exports = {

  entry: path.resolve(__dirname, 'src/main/javascript/root.jsx'),

  devtool: "cheap-eval-source-map",

  resolve: {
    modules: ['node_modules'],
    extensions: ['.json', '.js', '.jsx']
  },

  output: {
    path: path.resolve(__dirname, 'src/main/resources/static'),
    filename: 'bundle.js'
  },

  module: {
    loaders: [
      {
        test: /src\/.+.jsx$/,
        exclude: /node_modules/,
        loaders: ['babel-loader', 'eslint-loader']
      }
    ]
  }
};

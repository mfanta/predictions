var webpack = require('webpack');
var path = require('path');
// var webpack = require('webpack');

module.exports = {

  entry: path.resolve(__dirname, 'src/main/javascript/root.jsx'),

  plugins: [
    // hot reload
    new webpack.HotModuleReplacementPlugin()
  ],

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
        loader: 'babel-loader',
        query: {
          presets: ['es2015', 'react']
        }
      }
    ]
  }
};

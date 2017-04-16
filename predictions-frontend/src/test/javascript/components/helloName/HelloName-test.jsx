import React from 'react';

import renderer from 'react-test-renderer';
import {shallow} from 'enzyme';

import HelloName from '../../../../main/javascript/components/helloName/HelloName';

test('Renders hello name snapshot test', () => {

  const userName = 'Albert';
  const helloNameComponent = renderer.create(
    <HelloName userName={userName}/>
  );

  let tree = helloNameComponent.toJSON();
  expect(tree).toMatchSnapshot();
});

test('Renders hello name DOM test', () => {
  const userName = 'Albert';
  const helloNameComponent = shallow(
    <HelloName userName={userName}/>
  );

  expect(helloNameComponent.text()).toEqual('Hello ' + userName + '!');
});
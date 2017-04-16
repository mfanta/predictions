import React from 'react';
import HelloName from '../../../../main/javascript/components/helloName/HelloName';
import renderer from 'react-test-renderer';

test('Renders hello name', () => {

  const userName = 'Albert';
  const helloNameComponent = renderer.create(
    <HelloName userName={userName}/>
  );

  let tree = helloNameComponent.toJSON();
  expect(tree).toMatchSnapshot();
});

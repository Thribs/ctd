import Button from './Button'
import Title from './Title'
import Person from './Person'

function App() {

  return (
    <>
    <Title text='Hello, world' />
    <Title />
    <Button title="click me" color="red" />
    {/* <Button title="don't click me" color="blue" />
    <Button title='you do you' color="green" /> */}
    <Person name="Thiago" age={28} weight={83} />
    <Person name="Ciclana" age={4} weight={34} />
    <Person name="Fulano" age={12} weight={60} />
    <Person name="Ana" age={28} />
    </>

  )
}

export default App
import ItemList from './components/ItemList'

import { carros } from './mock/carros'

function App() {

  return (
    <>
    <ul>
      { carros.map(carro => 
        <ItemList key={`list-item-carro-${ carro.id } `} item={ carro } />
      ) }
    </ul>
    </>
  )
}

export default App

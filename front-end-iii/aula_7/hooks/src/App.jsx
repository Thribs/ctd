import { useState } from "react"
import Counter from "./Counter"
import Names from "./Names"
import Values from "./Values"

const App = () => {
  const [name, setName] = useState("Thiago")
  return (
    <div >
      <h1>Hello, world!</h1>
      <Counter />
      <Values />
      <Names />
    </div>
    )
  }

export default App
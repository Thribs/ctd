import { useRef, useState } from "react"

function App() {

  const [inputValue, setInputValue] = useState("")
  const [error, setError] = useState(null)
  const [isChecked, setIsChecked] = useState(false)
  const [users, setUsers] = useState([])

  const handleFormSubmit = ev => {
    ev.preventDefault()
    if (!inputValue.trim()) return setError("Campo não pode estar vazio")
    if (!isChecked) return setError("A caixa deve estar marcada")
    setUsers([...users, inputValue])
    setInputValue("")
    setIsChecked(false)
  }

  return (
    <>
    <div style={ isChecked ? { background: "red" } : { } }>
      <h1>Users</h1>
      <ul>
        { users.map(user => 
          <li key={ `user-${ user }` }>{ user }</li>)
        }
      </ul>
      <form onSubmit={ handleFormSubmit }>
        <input value={ inputValue } onChange={ ev => setInputValue(ev.target.value) } />
        <input type="checkbox" onChange={ ev => setIsChecked(ev.target.checked) } checked={ isChecked } />
        <p>{ error }</p>
        <input type="submit" />
      </form>
    </div>
    </>
  )
}

export default App
import { useState } from 'react'

function App() {
  const [count, setCount] = useState(10)
  const [name, setName] = useState("")
  const [subject, setSubject] = useState("")
  const [formData, setFormData] = useState({ name: "", subject: "" })
  const [error, setError] = useState()

  const increment = () => {setCount(count + 1)}
  const signUp = event => {
    event.preventDefault()
    setFormData({ name: "", subject: "" })
  }

  return (
    <>
    <div>
      <h1>count: {count}</h1>
      <button onClick={increment}>Increment</button>
    </div>
    <div>
      <h1>Sign up form</h1>
      <h2>Name: {formData.name}</h2>
      <h2>Subject: {formData.subject}</h2>
      <form onSubmit={ev => signUp(ev)}>
        <input value={formData.name} onChange={ev => setFormData({...formData, name: ev.target.value})} />
        <select value={formData.subject} onChange={ev => setFormData({...formData, subject: ev.target.value})}>
          <option value="0">backend</option>
          <option value="1">frontend</option>
          <option value="2">UX/UI</option>
        </select>
        <input type="submit"/>
      </form>
    </div>
    </>
  )
}

export default App
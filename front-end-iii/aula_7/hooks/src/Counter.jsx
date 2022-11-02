import { useState } from "react"

const Counter = () => {
    const [counter, setCounter] = useState(0)
    const [increment, setIncrement] = useState(1)
    const handleButtonClick = () => {
        setIncrement(increment * 2)
        setCounter(counter + increment)
    }
    return (
        <>
        <h1>Counter</h1>
        <h2>{counter}</h2>
        <button onClick={ handleButtonClick }>count up</button>
        </>
    )
}

export default Counter
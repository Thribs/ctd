import { useState } from "react"

const Values = () => {
    const values1 = [5, 32, 43, 45, 60, 90]
    const values2 = [110, 120, 2, 132, 400]
    const [values, setValues] = useState([...values1, ...values2])
    const handleButtonClick = () => { setValues([...values, Math.floor(Math.random() * 1000)]) }
    return (
        <>
        <h1>Values</h1>
        { values.map(value => <h2 key={ `value-${ value }` }>{ value }</h2>) }
        <button onClick={ handleButtonClick }>click</button>
        </>
    )
}

export default Values
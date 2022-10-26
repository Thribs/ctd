export default ({ name, age, weight }) => 
    weight ?
    <>
    <h1>{ name || "Thiago" }</h1>
    <h2>{ age >= 18 ? "Adult" : "Child" }</h2>
    <h2>{ weight }</h2>
    </> 
    : <></>
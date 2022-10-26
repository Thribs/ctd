const Container = ({ text = 'text', color = 'black', children }) => 
    <>
    <h1 style={ { color:color } }>{ text }</h1>
    { children }
    </>

export default Container
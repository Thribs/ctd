const handleClick = () => alert('ouch')

const Button = ({title, color}) => 
    <button onClick={ handleClick } style={ { backgroundColor:color } }>
        {title}
    </button>

// export { Button }
export default Button
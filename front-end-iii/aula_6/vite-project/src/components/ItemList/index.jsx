import styles from './styles.module.css'

const ItemList = ({ item:{ modelo, marca, cor, descricao, img } }) => 
    <>
    <li className={ styles['list-item'] } style={ { background: cor } }>
        <h2>{ modelo }</h2>
        <h3>{ marca }</h3>
        <p>{ descricao }</p>
        <img src={ img } alt={ modelo } />
    </li>
    </>

export default ItemList
const items = [
    {id: 0, name: 'Coke'},
    {id: 1, name: 'Coxinha'},
    {id: 2, name: 'Pizza'},
    {id: 3, name: 'Fanta'},
]

export default function ShoppingList() { return (
    <>
    <ul>
        {items.map((item, index) => <li key={ `shopping-list-item-${index}` }>{ item.id } - { item.name }</li>)}
    </ul>
    </>
)}
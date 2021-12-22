import React, { useContext } from 'react';
import {LoginContext} from '../contexts/LoginContext';
import {  Link } from 'react-router-dom';


function ProductDetailsComponent (props) {
    
    const { cart, setCart, setProductdetails } = useContext(LoginContext);
    var needsDefaultImage = props.product.imageUrl!==null?false:true;
    var needsDefaultDescription = props.product.description!==""?false:true;
    return (
        <div className="card" style={{width: "18 rem"}}>
            <img src={(needsDefaultImage)?props.product.imageUrl:"https://miro.medium.com/max/880/0*H3jZONKqRuAAeHnG.jpg"} className="card-img-top" alt="item"></img>
            <div className="card-body ">
                <h5 className="card-title">{props.product.title}</h5>
                <p className="card-text">{(needsDefaultDescription)?props.product.description:"Description is comming soon"}</p>
                <p className="card-text">Price: {props.product.price}</p>
                <p className="card-text">Items in stock: {props.product.quantity}</p>
                <button className="btn btn-primary" onClick={()=>setCart(cart+1)}>Add to cart</button>
                <Link to={`/${props.id}`} >
                <button className="btn btn-primary" onClick={()=>setProductdetails(props.product)}>To product</button>
                </Link>
            </div>
        </div>
    )
}
export default ProductDetailsComponent;


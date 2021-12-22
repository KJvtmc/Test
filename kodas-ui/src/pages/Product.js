
import {  Link } from 'react-router-dom';
import React, { useContext } from 'react';
import {LoginContext} from '../contexts/LoginContext';
import Login from '../components/Login';
import ShowUser from '../components/ShowUser';

function Product () {

    const { cart, setCart, productdetails, showusername} = useContext(LoginContext);
    var needsDefaultImage = productdetails.imageUrl!==null?false:true;
    var needsDefaultDescription = productdetails.description!==""?false:true;
    
    // console.log({match});
    // const productdetailssFromServer="";
    // const id="";
    // const productdetails="";
   
    // const loadproductdetailss = async () => {
    //     const response = await axios.get("http://localhost:8081/hello-world-calc/productdetails/list/");
    //     // console.log("state ");
    //     // console.log(response);
    //     productdetailssFromServer = response.data;
    //     console.log("from service ");
    //     console.log(productdetailssFromServer);
    //     id=Number(match.id);
    //     productdetails =productdetailssFromServer[0];
    //     console.log("state ");
    //     console.log(productdetails);
    // };

    // const fetchItem = await fetch()

    return (
        <div>
        <div className="row">
        <div className="col ">
          {/* <LoginContext.Provider value={{username, setUsername, setShowusername}}> */}
            {showusername ? <ShowUser /> : <Login />}
          {/* </LoginContext.Provider> */}
        </div>
        <div className="col-2">
          <button className="btn btn-primary" >Your cart {cart}</button>
        </div>
        </div>
        <div className="card" style={{width: "18 rem"}}>
            <h1>item {productdetails.title} </h1>
            
            <img src={(needsDefaultImage)?productdetails.imageUrl:"https://miro.medium.com/max/880/0*H3jZONKqRuAAeHnG.jpg"} className="card-img-top" alt="item"></img>
            <div className="card-body ">
                <h5 className="card-title">{productdetails.title}</h5>
                <p className="card-text">{(needsDefaultDescription)?productdetails.description:"Description is comming soon"}</p>
                <p className="card-text">Price: {productdetails.price}</p>
                <p className="card-text">Items in stock: {productdetails.quantity}</p>
                <button className="btn btn-primary" onClick={()=>setCart(cart+1)}>Add to cart</button>
                <Link to='/' >
                <button className="btn btn-primary" >To Home</button>
                </Link>
            </div>
        </div>
        </div>
    )
}
export default Product;
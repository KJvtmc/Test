
import './App.css';
import React, { useContext } from 'react';
import ProductListContainer from './containers/ProductListContainer';
// import ServicesContext from './ServicesContext';
import Login from './components/Login';
import ShowUser from './components/ShowUser';
import { LoginContext } from './contexts/LoginContext';


function App() {
  const { showusername, cart } = useContext(LoginContext);
  return (
    <div className="App">
      
      <main>
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
          <ProductListContainer />
      </main>
      {/* </LoginContext.Provider> */}
    </div>
  );
}
// isimta i6 package json pabaigos
// "devDependencies": {
//   "@babel/cli": "^7.16.0",
//   "@babel/core": "^7.16.5",
//   "@babel/preset-env": "^7.16.5"
// }

export default App;

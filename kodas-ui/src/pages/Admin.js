import React, {Component} from 'react';
import UserContainer from '../containers/UserContainer';
import AddProductClass from '../components/AddProductClass';

class Admin extends Component {
    render() {
        return (
            <div >
                <header className="px-3 text-center">
                    <h2>Hello Admin   </h2>
                </header>
                <main className="px-3">
                    <h3>Products</h3>
                    <AddProductClass />
                    <h3>Registered users</h3>
                    <UserContainer />
                </main>
            </div>
        );
    }
}


export default Admin;
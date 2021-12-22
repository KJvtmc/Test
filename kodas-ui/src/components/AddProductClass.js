import { Form, Button, Table } from "react-bootstrap";
import React, { Component, createRef } from 'react';
import axios from 'axios';

export default class AddProductClass extends Component {
    constructor() {
        super();
        this.state = {
            products: [],
        }
        this.api = axios.create({
            baseURL: "http://localhost:8081/hello-world-calc/product/list"
        });
        this.loadProducts();
        setTimeout(this.loadProducts, 1000);
        this.formData = createRef();
        

    }

    loadProducts = async () => {
        try {
            const response = await this.api.get("/");
            // console.log("state ");
            // console.log(response);
            const productsFromServer = response.data;
            // console.log("from service ");
            // console.log(usersFromServer);
            this.setState({ products: productsFromServer });
            // console.log("state ");
            // console.log(this.state.products);
        } catch (error) {
            console.log(error);
        }
    }

    addProduct = async (e) => {
        e.preventDefault();

        const newProduct = {
            title: this.formData.current.productName.value,
            price: this.formData.current.productPrice.value,
            quantity: Number(this.formData.current.productQuantity.value),
            maxQuantity: Number(this.formData.current.productQuantity.value)
        }
        let res = await this.api.post('/', { newProduct });
        console.log(res);
        this.state.products.push(newProduct);
        this.loadProducts();
    }
    // increment Quantity by 1
    incrementQuantity = (e) => {
        const currentIndex = e.target.value;
        this.state.products[currentIndex].productQuantity = this.state.products[currentIndex].productQuantity + 1;
        this.setState({
            products: this.state.products
        });
    }

    // decrement Quantity by 1
    decrementQuantity = (e) => {
        const currentIndex = e.target.value;
        if (this.state.products[currentIndex].productQuantity > 0) {
            this.state.products[currentIndex].productQuantity = this.state.products[currentIndex].productQuantity - 1;
            this.setState({
                products: this.state.products
            });
        }
    }



    render() {
        return (
            <div >
                <Form onSubmit={this.addProduct} ref={this.formData} >
                    <Form.Group className="mb-3" controlId="formBasicProductName">
                        <Form.Label>Product name</Form.Label>
                        <Form.Control type="text" placeholder="Enter product name" name="productName" />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicPrice">
                        <Form.Label>Product price</Form.Label>
                        <Form.Control type="number" min="0" step="0.01" precision="2" placeholder="Product price in eur" name="productPrice" />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicQuantity">
                        <Form.Label>Product Quantity</Form.Label>
                        <Form.Control type="number" min="0" placeholder="Quantity" name="productQuantity" />
                    </Form.Group >
                    <Button className="mb-3" variant="primary" type="submit">
                        Add to inventory
                    </Button>
                </Form>
                <Table striped bordered hover variant="dark">
                    <thead>
                        <tr>
                            <th>Nr.</th>
                            <th>Product name</th>
                            <th>Product price</th>
                            <th>Product Quantity</th>
                            <th>+/-</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.products.map((item, index) => {
                                return (
                                    <tr key={index}>
                                        <td>{index + 1}</td>
                                        <td>{item.title}</td>
                                        <td>{item.price}</td>
                                        <td>{item.quantity}</td>
                                        <td>
                                            <Button variant="success" onClick={(e) => this.incrementQuantity(e)}
                                                value={index} >+</Button>
                                            <Button variant="danger" onClick={(e) => this.decrementQuantity(e)}
                                                value={index}
                                            >-</Button>
                                        </td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </Table>
            </div >

        )

    };
}
import React, { Component } from "react";
import ProductListComponent from "../components/ProductListComponent";
import axios from 'axios';
// axios.get('https://itpro2017.herokuapp.com/api/products')
// .then( (response) => {
// console.log(response);
// })
// .catch( (error) => {
// console.log(error);
// });


class ProductListContainer extends Component {
    constructor() {
        super();
        this.state = {
            products: [
                {
                    id: 0,
                    title: 'Loading',
                    imageUrl: "https://miro.medium.com/max/880/0*H3jZONKqRuAAeHnG.jpg",
                    price: "Loading",
                    description: "Loading",
                    quantity: "Loading",
                },
                // {
                //     id: 12,
                //     title: 'arbatinukas',
                //     imageUrl: "https://www.ikea.com/us/en/images/products/riklig-teapot-glass__0900677_pe607789_s5.jpg?f=xxxs",
                //     price: 75.5,
                //     description: "indas arbatai laikyti prieš pilant į puodelį",
                //     quantity: 1,
                // },
                // {
                //     id: 13,
                //     title: 'šaukštelis',
                //     imageUrl: "https://www.ikea.com/us/en/images/products/dragon-teaspoon-stainless-steel__0711347_pe728190_s5.jpg?f=xxxs",
                //     price: 1.5,
                //     description: "metalinis objektas arbatos maišymui",
                //     quantity: 4,
                // },
                // {
                //     id: 14,
                //     title: 'arbata',
                //     imageUrl: "https://www.ikea.com/us/en/images/products/egentid-black-chai-ginger-elderberries-utz-certified-organic__0629623_pe694388_s5.jpg?f=xxxs",
                //     price: 5.5,
                //     description: "skani žolė",
                //     quantity: 1,
                // },
                // {
                //     id: 15,
                //     title: 'sausainis',
                //     imageUrl: "https://www.ikea.com/us/en/images/products/kafferep-ginger-thins-with-almonds__0539226_pe652393_s5.jpg?f=xxxs",
                //     price: 2,
                //     description: "ipraktiškai cukrus",
                //     quantity: 3,
                // },
            ]
        };
        this.api = axios.create({
            baseURL: "http://localhost:8081/hello-world-calc/product/list/"
        });
    }

    componentDidMount() {
        const loadProducts = async () => {
            const response = await this.api.get("/");
            // console.log("state ");
            // console.log(response);
            const productsFromServer = response.data;
            // console.log("from service ");
            // console.log(productsFromServer);
            this.setState({ products: productsFromServer });
            // console.log("state ");
            // console.log(this.state.products);
        }
        setTimeout(loadProducts, 1000)
    }


    render() {
        return (
            <div className="container">
                <div className="row">
                        <ProductListComponent products={this.state.products} />
                </div>
            </div>
        );
    }
}
export default ProductListContainer
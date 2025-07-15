import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams } from "react-router-dom";

    const Update = () => {
    const { id } = useParams();
    // const [title, setTitle] = useState('');
    // const [price, setPrice] = useState('');
    // const[description,setDescription]=useState('');
    const [formData,setFormData] = useState({title:"",price:0 ,description:""})

    const handleChange = (e) =>{
        setFormData({...formData,[e.target.name]:e.target.value})
    }

        useEffect(() => {
        axios.get('http://localhost:8000/api/product/' + id)
            .then(res => {
                // setTitle(res.data.title);
                // setPrice(res.data.price);
                // setDescription(res.data.description);
                setFormData(res.data)

            })    
        }, []);  

        const updateProduct= e => {
        e.preventDefault();

        axios.patch('http://localhost:8000/api/product/' + id, 
            formData)     
            .then(res => console.log(res))
            .catch(err => console.error(err));
    }        
    return (
        <div>
            <h1>Update a Person</h1>
            <form onSubmit={updateProduct}><p>
                <label>Title </label><br />
                <input type="text"name="title"value={formData.title} onChange={handleChange} /></p>
                <p><label>Price</label><br />
                <input type="text"name="price"value={formData.price} onChange={handleChange} /></p>
                <p><label>Description</label><br />
                <input type="text"name="description"value={formData.description} onChange={handleChange} /></p>            
                <input type="submit" />
            </form>
        </div>
    )
}
    
export default Update;
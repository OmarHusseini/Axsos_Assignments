import axios from 'axios'
import React from 'react'
import { useEffect } from 'react'
import { useState } from 'react'
import {Link} from 'react-router-dom'


const ListComponent = () => {
    const [data,setData]=useState([])
    
    useEffect(()=>{
    axios.get('http://localhost:8000/api/products')
    .then(res=>{
      setData(res.data)
      console.log("Sucsess")
    })
    .catch(err=>{
            console.log(err)
        })},[]

    )
    const list = data.map(product=>(<li><Link to={`/products/${product._id}`}>{product.title}</Link></li>))
      return (
    <div>
      <h1>All Products</h1>
      <ul>
        
      {list}
      </ul>
    </div>
  )
}

export default ListComponent

import axios from 'axios'
import { useState,useEffect } from 'react'
import { useParams , Link, useNavigate} from 'react-router-dom'





const DetailsProduct = () => {
    const [data,setData]=useState({})
    const {id} = useParams()
    const redirect = useNavigate()

    
    
    const handleDelete=(e)=>{
         axios.delete('http://localhost:8000/api/product/' + id)
            .then(res => {
              // removeFromDom(id)
              redirect("/")

            })
            .catch(err => console.error(err));
        
    }

    useEffect(()=>{
    axios.get(`http://localhost:8000/api/product/${id}`)
    .then(res=>{
      setData(res.data)
      console.log("Sucsess")
    })
    .catch(err=>{
            console.log(err)
        })},[]

    )
  return (
    <div>
      <h3>{data.title}</h3>
        <h3>{data.price}</h3>
      <h3>{data.description}</h3>
      <button onClick={handleDelete}>Delete</button>
      <Link to={"/products/update/"+data._id}>Edit</Link>


    </div>
  )
}

export default DetailsProduct

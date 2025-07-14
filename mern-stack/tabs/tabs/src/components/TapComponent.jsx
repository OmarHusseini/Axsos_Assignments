import React, { useState } from 'react'

const TapComponent = (props) => {
const [msg,setmsg]=useState()
const [msgc,setmsgc]=useState()
const {info}=props
const handleClick=(msg,batata)=>{
    setmsg(msg)
    setmsgc(batata)
}
// info[0].author

return (
    <div>
    {info.map((book,idx)=>(
        <button key={idx} onClick={(e)=>handleClick(book.author,book.title)}>{book.title} </button>
    ))}
    <h1>{msgc}</h1>
    <p>{msg}</p>

    </div>
  )
}

export default TapComponent

import React from 'react'
import { useParams } from 'react-router-dom'

const Style = () => {
    const{word,txcolor,bgcolor}=useParams()
  return (
    <div>
        <h1 style={{
            color:txcolor,
            background:bgcolor
        }}>
            The word is : {word}
        </h1>
      
    </div>
  )
}

export default Style

import { useParams } from 'react-router-dom'

const Number = () => {
    const {number}=useParams()
 
  return (
    <div>
      {isNaN(+number)? (
        <h1> The word is : {number}</h1>
      ):
      <h1> My Number is : {number}</h1>
    }
      
    </div>
  )
}

export default Number

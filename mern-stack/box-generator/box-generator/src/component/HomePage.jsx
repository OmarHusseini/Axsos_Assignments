import React,{useState} from "react";

const HomePage=(props)=>{
    const[boxes,setBoxes]=useState([])
    const[color,setColor]=useState("")

const createBox=(e)=>{    console.log(boxes) 

    e.preventDefault();
    setBoxes([...boxes,{color,id:Date.now()}])   
    console.log(boxes) 
}

return(
    <>
     <form onSubmit={createBox}>
        <label> Color</label>
        <input type="text" value={color} onChange={(e)=> setColor(e.target.value)}/>
        <button>Add</button>
    </form>

    <div>
    {boxes.map((box,k)=> <div style={{backgroundColor:box.color,width:'100px',height:'100px',borderRadius:'10%',margin:'10px'}}>
    </div>)}
    </div>
    </>
   
)

}


export default HomePage;
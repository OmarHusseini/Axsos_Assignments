import React from "react";

const PersonCard=(props)=>{


const {firstname,lastname,age,haircolour}=props

    return(
    
    <>
    <h1>{lastname},{firstname}</h1>
    <h6>Age:{age}</h6>
    <h6>Hair color: {haircolour}</h6>
    </>
    )

}


export default PersonCard;
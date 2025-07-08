import react, { useState } from 'react';
    
    
const MainComponent = (props) => {
    const {message} = props
    return (
        <>
            <h1>Current User</h1>
            <h2><ul>
                {message.map((item,index)=>
                <li key={index}>{item}</li>
                )}
                </ul></h2>
        </>
    );
};
    
export default MainComponent
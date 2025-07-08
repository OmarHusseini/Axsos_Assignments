import React, { useState } from  'react';
import "./Home.css"
    
const Home = (props) => {
    const [firstname, setFirstname] = useState("");
    const [lastname, setLastname] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");  

 const createUser = (e) => {
        e.preventDefault();
        
        const newUser = { firstname,lastname, email, password };
        console.log("Welcome", newUser);
        setFirstname("");
        setLastname("");
        setEmail("");
        setPassword("");
    };

    return( 
        <> <form className='Home' onSubmit={ createUser }>
                <div>
                    <label>First name: </label> 
                    <input type="text" value={firstname} onChange={ (e) => setFirstname(e.target.value) } />
                </div>
                <div>
                    <label>Last name: </label> 
                    <input type="text" value={lastname} onChange={ (e) => setLastname(e.target.value) } />
                </div>
                <div>
                    <label>Email Address: </label> 
                    <input type="text" value={email} onChange={ (e) => setEmail(e.target.value) } />
                </div>
                <div>
                    <label>Password: </label>
                    <input type="password" value={password} onChange={ (e) => setPassword(e.target.value) } />
                </div>

            </form>

            <div className='info'>
                    <label>First Name <p>{firstname}</p> </label>
                    <label>Last Name <p>{lastname}</p> </label>
                    <label>Email <p>{email}</p> </label>
                    <label>Password <p>{password}</p> </label>

                </div>
                
            
        </> 
         

            

    );
}

    
export default Home;
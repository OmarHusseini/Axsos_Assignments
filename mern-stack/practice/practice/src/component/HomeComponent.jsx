import React,{ useState} from "react";
// import validator from "validator";

const HomeComponent = (props) => {
    const [username, setUsername] = useState("");
    const [usernameError, setUsernameError] = useState("");
    const [email, setEmail] = useState("");
    const [emailError, setEmailError] = useState("");
    const [password, setPassword] = useState("")
    const [passwordError, setPasswordError] = useState("");


const createUser = (e) => {
        e.preventDefault();
        
        const newUser = { username, email, password };
        console.log("Welcome", newUser);
        setUsername("");
        setEmail("");
        setPassword("");
        props.onNewMessage( username)
        
    };

const handleUserName = (e) => {
        setUsername(e.target.value);
        if(e.target.value.length < 1) {
            setUsernameError("Username is required!");
        } else if(e.target.value.length < 4) {
            setUsernameError("Username must be 3 characters or longer!");
        } else {
            setUsernameError("");
        }
    }


const handlePassword = (e) => {
        setPassword(e.target.value);
        if(e.target.value.length < 1) {
            setPasswordError("Password is required!");
        } else if(e.target.value.length < 6) {
            setPasswordError("Password must be 5 characters or longer!");
        } else {
            setEmailError("");
        }
    }
const validateEmail = (e) => {
    setEmail(e.target.value);
    
    const emailValue = e.target.value;
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; 

    if (emailValue.length < 1) {
        setEmailError("Email is required!");
    } else if (!emailRegex.test(emailValue)) {
        setEmailError("Invalid email format!");
    } else {
        setEmailError("");
    }
};
		
	
    return (
        <form onSubmit={ createUser }>
            <div>
                <label>Username: </label> 
                <input type="text" value={username} onChange={  handleUserName }  />
                {
                    usernameError ?
                    <p>{ usernameError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Email Address: </label> 
                <input type="text" value={email} onChange={ validateEmail } />
                {
                    emailError ?
                    <p>{ emailError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Password: </label>
                <input type="password" value={password} onChange={ handlePassword } />
                {
                        passwordError ?
                        <p>{ passwordError }</p> :
                        ''
                    }
                
            </div>
            <input type="submit" value="Create User" />
        </form>
    );
};
    
export default HomeComponent;
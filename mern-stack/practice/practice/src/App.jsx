import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HomeComponent from './component/HomeComponent'
import MainComponent from './component/Maincomponent'

function App() {
  const [currentMsg, setCurrentMsg] = useState("There are no messages");
  const youveGotMail = ( newMessage ) => {
        setCurrentMsg( newMessage );
    }

  return (
    <>
      <HomeComponent onNewMassege={youveGotMail}></HomeComponent>
      <MainComponent message={currentMsg}></MainComponent>
    </>
  )
}

export default App

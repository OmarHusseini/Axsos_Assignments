import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import PersonCard from './component/personcard'

function App() {
 
  return (
    <>
     <PersonCard firstname="Jane" lastname="Doe" age={45} haircolour="Black"/>
     <PersonCard firstname="Smith" lastname="John" age={88} haircolour="brown"/>
     <PersonCard firstname="wasemm" lastname="nada" age={25} haircolour="Black"/>
     <PersonCard firstname="Shatha " lastname="Bast" age={29} haircolour="unknown"/>

    </>
  )
}

export default App

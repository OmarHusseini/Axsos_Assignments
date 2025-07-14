import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import TapComponent from './components/TapComponent'

function App() {
const books=[
  {title:"The Gambler",author:"Dostoevsky"},
  {title:"seven habits of highly effective teens",author:"Sean Covey"},
  {title:"Game of thrones",author:"George R.R. Martin"}
]

  return (
    <>
     <TapComponent info={books} />
    </>
  )
}

export default App

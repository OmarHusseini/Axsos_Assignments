
import HomeComponent from './component/HomeComponent'
import ListComponent from './component/ListComponent'
import './App.css'
import { Routes ,Route} from 'react-router-dom'
import DetailsProduct from './component/DetailsProduct'
import Update from './component/updateComponent'

function App() {

  return (
    <>
    <Routes>

      <Route path="/" element={<><HomeComponent />  <ListComponent/></>} />
      <Route path="/products/:id" element={<DetailsProduct/>} />
      <Route path="/products/update/:id" element={<Update/>} />
     
    </Routes>
    </>
  )
}

export default App

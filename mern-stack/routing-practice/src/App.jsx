import './App.css'
import {Routes,Route} from 'react-router-dom';
import LandinPage from './component/LandinPage';
import Number from'./component/Number';
import Style from './component/Style';
function App() {

  return (
    <>
     
      <Routes>
        <Route path="/home" element={<LandinPage />} />
        <Route path="/:number" element={<Number/>} />
        <Route path="/:word/:txcolor/:bgcolor" element={<Style/>} /> 

      </Routes>
    </>
  )
}

export default App

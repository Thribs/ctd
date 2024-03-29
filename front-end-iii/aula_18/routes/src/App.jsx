import { BrowserRouter, Routes, Route } from "react-router-dom"
import Details from "../pages/Details"
import Home from "../pages/Home"
import NotFound from "../pages/NotFound"

function App() {

  return (
      <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/details" element={<Details />} />
          <Route path="*" element={<NotFound />} />
        </Routes>
      </BrowserRouter>
      </>
  )
}

export default App
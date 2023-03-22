import logo from './logo.svg';
import './App.css';

export default function App() {
  return (
    <h1 className="text-7xl text-primary p-6 ">
      Hello world!
      <TailwindButton></TailwindButton>
    </h1>

  )

  function TailwindButton(){
    return(
    <button className="bg-blue-450 block px-5 py-3 text-white rounded hover:bg-blue-500 ">
       testing button</button>
    )
    
  }
}



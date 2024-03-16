import { useEffect } from "react";
import "./App.css";
import { useState } from "react";

function App() {
  const [d, setD] = useState("loading");
  useEffect(() => {
    fetch("http://localhost:8080/api/test")
      .then((response) => response.json())
      .then((data) => setD(data.data))
      .catch((error) => console.log(error));
  }, []);
  return <div>{d}</div>;
}

export default App;

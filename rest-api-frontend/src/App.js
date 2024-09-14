import React, { useState, useEffect } from 'react';
import { BrowserRouter, useRoutes } from 'react-router-dom';
//import axios from 'axios';

import HomePage from './Home';
import './App.css';

function App() {
  /*const [products, setProducts] = useState([]);
  useEffect(() => {
    axios.get('http://localhost:8080/product')
      .then(response => {
        setProducts(response.data);
      })
      .catch(error => {
        console.error('Error fetching products:', error);
      });
  }, []);*/

  return (
    <div>
      <BrowserRouter>
        <AppRoutes />
    </BrowserRouter>
    </div>
  );
}

function AppRoutes() {
  let routes = useRoutes([
    { path: '/', element: <HomePage /> },
  ]);

  return routes;
}

export default App;

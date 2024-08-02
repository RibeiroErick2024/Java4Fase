import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App'; // Certifique-se de que a extensão .jsx pode ser omitida
import './index.css'; // Opcional, se você tiver um arquivo CSS

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

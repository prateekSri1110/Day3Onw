import { Routes, Route } from "react-router-dom";
import Login from "./Components/pages/Login.jsx";
import Dashboard from "./Components/pages/Dashboard.jsx";
import Error from "./Components/pages/Error.jsx";
import Counter from "./Components/pages/Counter.jsx";
import DigitalWatch from "./Components/pages/DigitalWatch.jsx";
import ProtectedRoute from "./Components/ProtectedRoute.jsx";

export default function App() {
  return (
    <Routes>
      <Route path="/" element={<Login />} />
      <Route path="*" element={<Error />} />
      <Route path="/login" element={<Login />} />
      <Route element={<ProtectedRoute />}>
        <Route path="/dashboard" element={<Dashboard />}>
          <Route path="counter" element={<Counter />} />
          <Route path="digitalWatch" element={<DigitalWatch />} />
        </Route>
      </Route>
    </Routes>
  );
}

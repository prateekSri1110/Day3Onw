import { Routes, Route } from "react-router-dom";
import Login from "./Components/Login.jsx";
import Dashboard from "./Components/Dashboard.jsx";
import Error from "./Components/Error.jsx";
import Counter from "./Components/Counter.jsx";
import DigitalWatch from "./Components/DigitalWatch.jsx";
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

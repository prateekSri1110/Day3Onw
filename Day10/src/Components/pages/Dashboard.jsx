import { Link, useNavigate, Outlet } from "react-router-dom";
import dashboard from "../../assets/dashboard.gif";
import "../../App.css";

export default function Dashboard() {
  const navigate = useNavigate();

  const handleLogout = () => {
    alert("Loggin out from the session!");

    const email = localStorage.getItem("loggedInUser");
    localStorage.removeItem("loggedInUser");
    localStorage.removeItem(email);
    navigate("/login");
  };

  return (
    <>
      <div className="container-fluid p-0" style={{ position: "fixed" }}>
        <nav className="navbar bg-dark text-white p-3">
          <ul className="d-flex nav gap-5 mx-auto">
            <li className="nav-item btn btn-primary Navbtn">
              <Link to="/dashboard">Dashboard</Link>
            </li>
            <li className="nav-item btn btn-primary Navbtn">
              <Link to="counter">Counter</Link>
            </li>
            <li className="nav-item btn btn-primary Navbtn">
              <Link className="list-style-none" to="digitalWatch">
                Digital Watch
              </Link>
            </li>
            <li
              className="nav-item btn btn-danger Navbtn"
              onClick={handleLogout}
            >
              Logout
            </li>
          </ul>
        </nav>

        <Outlet />
        
        <div className="container-fluid d-flex bg-dark justify-content-center align-items-center vh-100">
          <img
            className="mx-auto"
            width={800}
            src={dashboard}
            alt="Dashboard image"
          />
        </div>
      </div>
    </>
  );
}

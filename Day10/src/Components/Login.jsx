import cloudkeeper from "../assets/cloudkeeper.png";
import { useNavigate } from "react-router-dom";

export default function Login() {
  const navigate = useNavigate();

  const handleLogin = (e) => {
    e.preventDefault();

    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();

    if (email === "" || password === "") return;

    // store user if not stored
    if (!localStorage.getItem(email)) {
      localStorage.setItem("loggedInUser", email);
      localStorage.setItem(email, password);
      navigate("/dashboard");
      console.log("logged as signup.");
    } else if (localStorage.getItem(email) == password) {
      console.log("logged from login");
      navigate("/dashboard");
    } else {
      alert("User does not exist!");
    }

    console.log("loggin In");
    // navigate("/dashboard");
  };

  return (
    <div className="d-flex justify-content-center align-items-center vh-100 bg-dark">
      <div className="p-4 bg-light border rounded">
        <img
          src={cloudkeeper}
          className="rounded mx-auto d-block"
          style={{ width: "300px" }}
          alt="cloudkeeper"
        />

        <form className="text-center mb-4 p-5" onSubmit={handleLogin}>
          <input
            className="form-control mb-3"
            type="email"
            id="email"
            placeholder="Email"
            required
          />

          <input
            className="form-control mb-3"
            type="password"
            id="password"
            placeholder="Password"
            required
          />

          <button className="btn btn-primary mt-4 fw-bold" type="submit">
            LOGIN
          </button>
        </form>
      </div>
    </div>
  );
}

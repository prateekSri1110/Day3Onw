import { useState } from "react";

export default function Counter() {
  const [count, setCount] = useState(0);

  localStorage.setItem("count",count);

  return (
    <div className="container-fluid bg-dark text-white d-flex vh-100 justify-content-center align-items-center">
      <div className="text-center">
        <h1 style={{ fontSize: "10em" }}>{count}</h1>

        <div className="d-flex gap-3 justify-content-center">
          <button
            className="btn btn-primary fw-bold"
            style={{ width: "5em" }}
            onClick={() => setCount((count) => count + 1)}
          >
            + 1
          </button>

          <button
            className="btn btn-danger fw-bold"
            style={{ width: "5em" }}
            onClick={() => setCount((count) => count - 1)}
          >
            - 1
          </button>
        </div>
      </div>
    </div>
  );
}

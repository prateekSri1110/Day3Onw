import { useEffect, useState } from "react";

export default function DigitalWatch() {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    const interval = setInterval(() => {
      setTime(new Date());
    }, 1000);

    return () => clearInterval(interval);
  }, []);

  const formatTime = (date) => {
    return date.toLocaleTimeString("en-IN", {
      hour12: false,
    });
  };

  return (
    <div className="container-fluid bg-dark
     text-white min-vh-100 d-flex justify-content-center align-items-center">
      <div className="text-center">
        <h1 style={{ fontSize: "6em", fontWeight: "bold" }}>
          {formatTime(time)}
        </h1>
        <h4>{time.toDateString()}</h4>
      </div>
    </div>
  );
}

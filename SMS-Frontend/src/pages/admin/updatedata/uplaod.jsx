import React from "react";
import "./upload.css";

function Upload() {
  const Optiondata = ["dac", "dbda", "desd"],
    CourseOption = function (x) {
      return <option>{x}</option>;
    };

  return (
    <>
      <div className="upload_container">
        <select name="" id="" className="upload_select">
          {Optiondata.map(CourseOption)}
        </select>

        <input type="file" name="" id="" className="upload_input" />
        <button formAction="submit" className="upload_btn">
          upload
        </button>
      </div>
    </>
  );
}

export default Upload;

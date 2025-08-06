import React from 'react';

const courses = [
  { id: 1, name: 'Angular', date: '4/5/2021' },
  { id: 2, name: 'React', date: '6/3/2021' }
];

export default function CourseDetails() {
  return (
    <div className="box">
      <h1><b>Course Details</b></h1>
      <ul>
        {courses.map(course => (
          <li key={course.id}>
           <h2><b>{course.name}</b></h2> <br />
            <b>{course.date}</b>
          </li>
        ))}
      </ul>
    </div>
  );
}

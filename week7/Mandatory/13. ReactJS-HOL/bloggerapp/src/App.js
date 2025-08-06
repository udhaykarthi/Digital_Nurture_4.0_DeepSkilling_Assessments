import React from 'react';
import CourseDetails from './CourseDetails';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import './App.css';

function App() {
  return (
    <div className="container">
      <CourseDetails />
      <BookDetails />
      <BlogDetails />
    </div>
  );
}

export default App;

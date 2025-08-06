import React from 'react';

const blogs = [
  { id: 1, title: 'React Learning', author: 'Stephen Biz', quote : 'Welcome to learning React!' },
  { id: 2, title: 'Installation', author: 'Schewzdenier', quote : 'You can install React from npm.' }
];

export default function BlogDetails() {
  return (
    <div className="box">
      <h1><b>Blog Details</b></h1>
      <ul>
        {blogs.map(blog => (
          <li key={blog.id}>
            <strong><h2>{blog.title}</h2></strong><br />
            <b>{blog.author}</b><br /> 
            {blog.quote}
          </li>
        ))}
      </ul>
    </div>
  );
}

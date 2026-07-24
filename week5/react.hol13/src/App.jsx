import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";
import "./App.css";

function App() {
  const showBook = true;
  const showBlog = true;
  const showCourse = true;

  // Method 1: if...else
  let bookComponent;

  if (showBook) {
    bookComponent = <BookDetails />;
  } else {
    bookComponent = <p>Book Details Hidden</p>;
  }

  return (
    <div className="container">
      <h1>Blogger App</h1>

      {/* Method 1 - if else */}
      {bookComponent}

      {/* Method 2 - Ternary Operator */}
      {showBlog ? <BlogDetails /> : <p>Blog Details Hidden</p>}

      {/* Method 3 - Logical AND */}
      {showCourse && <CourseDetails />}
    </div>
  );
}

export default App;

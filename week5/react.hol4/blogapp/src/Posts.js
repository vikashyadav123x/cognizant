import React from 'react'
import Post from './Post'

class Posts extends React.Component {
  constructor(props) {
    super(props)
    this.state = {
      posts: [],
    }
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        const posts = data.map((item) => new Post(item.userId, item.id, item.title, item.body))
        this.setState({ posts })
      })
      .catch((error) => {
        throw error
      })
  }

  componentDidMount() {
    this.loadPosts()
  }

  componentDidCatch(error) {
    alert(error.message)
  }

  render() {
    return (
      <div className="posts-container">
        {this.state.posts.map((post) => (
          <article key={post.id} className="post-card">
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </article>
        ))}
      </div>
    )
  }
}

export default Posts

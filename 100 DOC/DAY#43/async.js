// JavaScript code to simulate asynchronous javascript through callbacks.

const posts = [
    { title: 'Post 1', body: 'this is first post'},
    { title: 'Post 2', body: 'this is second post'}
]

function getPosts() {
    setTimeout(() => {
        let output = '';
        posts.forEach((post, index) => {
            output += `<li>${post.title}</li>`;
        document.body.innerHTML = output;
        })
    }, 1000)
}

function createPost(post, callback) {
    setTimeout(() => {
        posts.push(post);
        callback();
    }, 2000);
}

createPost({title: 'post 3', body: '3'}, getPosts)

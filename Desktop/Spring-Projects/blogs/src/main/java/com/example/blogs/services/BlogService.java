package com.example.blogs.services;

import com.example.blogs.models.Blog;
import com.example.blogs.models.User;
import com.example.blogs.repositories.BlogRepository;
import com.example.blogs.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository1;

    @Autowired
    UserRepository userRepository1;

    public Blog createAndReturnBlog(Integer userId, String title, String content) {
        //create a blog at the current time
       Blog blog = new Blog();
       User user = userRepository1.findById(userId).get();
        blog.setUser(user);
        blog.setTitle(title);
        blog.setContent(content);

        blog.setPubDate(new Date());
        List<Blog> currentList = user.getBlogList();
        currentList.add(blog);
        user.setBlogList(currentList);
        userRepository1.save(user);
        return blog;

    }

    public void deleteBlog(int blogId){
        //delete blog and corresponding images

        blogRepository1.deleteById(blogId);
    }
}

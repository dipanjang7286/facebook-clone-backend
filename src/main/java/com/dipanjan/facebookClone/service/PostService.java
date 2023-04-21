package com.dipanjan.facebookClone.service;

import com.dipanjan.facebookClone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}

package com.harrybro.springbootwebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    public List<Posts> findAllByOrderByIdDesc();

}

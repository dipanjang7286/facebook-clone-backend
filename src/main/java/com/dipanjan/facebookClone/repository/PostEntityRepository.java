package com.dipanjan.facebookClone.repository;

import com.dipanjan.facebookClone.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostEntityRepository extends JpaRepository<PostEntity, Long> {
}

package com.blogger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BloggerRepository extends JpaRepository<Blogger, Integer> {
}

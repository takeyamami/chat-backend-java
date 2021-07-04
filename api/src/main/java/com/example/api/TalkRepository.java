package com.example.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TalkRepository extends JpaRepository<Talk, Integer> {

    public List<Talk> findByRidOrderByTid(Long rid);
}

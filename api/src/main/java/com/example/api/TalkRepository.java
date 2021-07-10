package com.example.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TalkRepository extends JpaRepository<Talk, Integer> {
    
    @Query("SELECT t.tid, t.rid, t.message, t.created_at, t.user.uid, t.user.name FROM Talk t INNER JOIN t.user u ORDER BY t.created_at")
    public List<Object> findTalkMessage(Long rid);
}

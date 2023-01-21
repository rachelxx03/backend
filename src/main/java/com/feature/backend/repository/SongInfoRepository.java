package com.feature.backend.repository;

import com.feature.backend.model.SongInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

@org.springframework.stereotype.Repository

public interface SongInfoRepository extends JpaRepository<SongInfo,Integer> {
}
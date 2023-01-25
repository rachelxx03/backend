package com.feature.backend.repository;

import com.feature.backend.model.SongInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface SongInfoRepository extends JpaRepository<SongInfo,Integer> {
    @Query("SELECT s FROM SongInfo s WHERE s.year BETWEEN :startYear AND :endYear")
    List<SongInfo> findByYearBetween(@Param("startYear") int startYear, @Param("endYear") int endYear);

    @Query(value = "SELECT GROUP_CONCAT(Lyric) FROM SongInfo", nativeQuery = true)
    String concatLyrics();
}
package com.feature.backend.repository;

import com.feature.backend.model.SongInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

@org.springframework.stereotype.Repository

public interface SongInfoRepository extends JpaRepository<SongInfo,Integer> {
    @Query("SELECT s FROM SongInfo s WHERE s.year BETWEEN :startYear AND :endYear")
    List<SongInfo> findByYearBetween(@Param("startYear") int startYear, @Param("endYear") int endYear);


    @Query("SELECT s FROM SongInfo s WHERE s.year BETWEEN :startYear AND :endYear")
   String findLyricsByRankingAndYearBetween( @Param("startYear") int startYear, @Param("endYear") int endYear);


    @Query(value = "SELECT GROUP_CONCAT(DISTINCT CONCAT(lyric)) AS combined_A FROM song_info", nativeQuery = true)
    String concatLyrics();
}
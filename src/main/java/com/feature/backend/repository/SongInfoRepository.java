package com.feature.backend.repository;

import com.feature.backend.model.SongInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

@org.springframework.stereotype.Repository

public interface SongInfoRepository extends JpaRepository<SongInfo,Integer> {

    @Query(value = "SELECT GROUP_CONCAT(lyric) as combined_lyrics FROM song_info " +
            "WHERE ranking BETWEEN :rankStart AND :rankEnd AND year BETWEEN :yearStart AND :yearEnd", nativeQuery = true)
    String findCombinedLyricsByRankIntervalAndYearInterval(@Param("rankStart") int rankStart,
                                                           @Param("rankEnd") int rankEnd,
                                                           @Param("yearStart") int yearStart,
                                                           @Param("yearEnd") int yearEnd);

}
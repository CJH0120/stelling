package com.team1.stelling.mapper;

import com.team1.stelling.domain.criteria.MainCriteria;
import com.team1.stelling.domain.dto.NewIllustDTO;
import com.team1.stelling.domain.dto.NovelDTO;
import com.team1.stelling.domain.dto.NovelRankingDTO;
import com.team1.stelling.domain.vo.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
    //소설 신작 리스트
    public List<NovelDTO> getNewNovelList();
    
    //일러스트 신작 리스트
    public List<NewIllustDTO> getNewIllustList();

    //실시간 조회수 리스트
    public List<NovelRankingDTO> getViewCountSearch(MainCriteria mainCriteria);

    //실시한 좋아요 리스트
    public List<NovelRankingDTO> getLikeCountSearch(MainCriteria mainCriteria);
}

package com.human.notice.notice_prjt.repository;

import com.human.notice.notice_prjt.vo.NoticeVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface NoticeDAO {

    public List<NoticeVO> selectAllNotices() throws DataAccessException;
}

package com.human.notice.notice_prjt.service;

import com.human.notice.notice_prjt.repository.NoticeDAO;
import com.human.notice.notice_prjt.vo.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("noticeService")
@Transactional(propagation = Propagation.REQUIRED)
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> listNotices() throws Exception {
        return noticeDAO.selectAllNotices();
    }
}

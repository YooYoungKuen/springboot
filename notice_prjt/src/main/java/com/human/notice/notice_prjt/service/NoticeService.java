package com.human.notice.notice_prjt.service;

import com.human.notice.notice_prjt.vo.NoticeVO;

import java.util.List;

public interface NoticeService {


    public List<NoticeVO> listNotices() throws Exception;
}

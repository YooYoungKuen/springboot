package com.human.notice.notice_prjt.controller;

import com.human.notice.notice_prjt.service.NoticeService;
import com.human.notice.notice_prjt.vo.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/notice")
public class NoticeControllerImpl implements NoticeController {

    @Autowired
    NoticeService noticeService;

    @GetMapping("/notice_list.do")
    public String listNotice(Model model) throws Exception {

        List<NoticeVO> noticeVOList = noticeService.listNotices();
        model.addAttribute("noticeVOList", noticeVOList);
        return "notice/notice_list";
    }
}

package com.human.notice.notice_prjt.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class NoticeVO {

    private int nIdx;
    private String nCategory;
    private String nTitle;
    private String nContent;
    private Date nRegdate;
    private Date nUpdate;
    private String nStatus;
}

package com.ShoppingMall.demo.vo;

import java.sql.Timestamp;

public class BoardVo{

    private int boardno;
    private String boardtitle;
    private String boardcontent;
    private String userid;
    private String boardpassword;
    private Timestamp noticedate;

    public BoardVo() {
        super();
    }

    public int getBoardno() {
        return boardno;
    }

    public void setBoardno(int boardno) {
        this.boardno = boardno;
    }

    public String getBoardtitle() {
        return boardtitle;
    }

    public void setBoardtitle(String boardtitle) {
        this.boardtitle = boardtitle;
    }

    public String getBoardcontent() {
        return boardcontent;
    }

    public void setBoardcontent(String boardcontent) {
        this.boardcontent = boardcontent;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBoardpassword() {
        return boardpassword;
    }

    public void setBoardpassword(String boardpassword) {
        this.boardpassword = boardpassword;
    }

    public Timestamp getNoticedate() {
        return noticedate;
    }

    public void setNoticedate(Timestamp noticedate) {
        this.noticedate = noticedate;
    }

    @Override
    public String toString() {
        return "BoardVo [boardno=" + boardno + ", boardtitle=" + boardtitle + ", boardcontent=" + boardcontent
                + ", userid=" + userid + ", boardpassword=" + boardpassword + ", noticedate=" + noticedate + "]";
    }

}


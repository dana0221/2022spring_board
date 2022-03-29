package com.mirim.biz.board.impl;

import com.mirim.biz.board.BoardService;
import com.mirim.biz.board.BoardVO;
import com.mirim.biz.common.Log4jAdvice;
import com.mirim.biz.common.LogAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardDAO boardDAO;
    private Log4jAdvice log;

    public BoardServiceImpl() {
        log = new Log4jAdvice();
    }

    @Override
    public void insertBoard(BoardVO vo) {
        log.printLogging();
        boardDAO.insertBoard(vo);
    }

    @Override
    public void updateBoard(BoardVO vo) {
        log.printLogging();
        boardDAO.updateBoard(vo);
    }

    @Override
    public void deleteBoard(BoardVO vo) {
        log.printLogging();
        boardDAO.deleteBoard(vo);
    }

    @Override
    public BoardVO getBoard(BoardVO vo) {
        log.printLogging();
        return boardDAO.getBoard(vo);
    }

    @Override
    public List<BoardVO> getBoardList(BoardVO vo) {
        log.printLogging();
        return boardDAO.getBoardList(vo);
    }
}

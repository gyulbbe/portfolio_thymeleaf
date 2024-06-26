package com.hg.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.dao.AttFileDao;
import com.hg.service.AttFileService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AttFileServiceImpl implements AttFileService{

	private final AttFileDao attFileDao;

	//해당게시글의 모든첨부파일(다중이니까)
	@Override
	public List<HashMap<String, Object>> readAttFiles(HashMap<String, Object> params) {

		return attFileDao.readAttFiles(params);
	}

	//첨부파일 pk로 읽어오기 
	@Override
	public HashMap<String, Object> readAttFileByPk(int fileIdx) {

		return attFileDao.readAttFileByPk(fileIdx);
	}

	@Override
	public int updateLinkedInfo() {
		// TODO Auto-generated method stub
		return 0;
	}
}

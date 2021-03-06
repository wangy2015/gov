package cn.gov.service.impl;

import java.util.List;
import java.util.Map;

import cn.gov.dao.ExtraMapper;
import cn.gov.dao.LogMapper;
import cn.gov.model.Log;
import cn.gov.model.LogExample;
import cn.gov.service.LogService;

public class LogServiceImpl implements LogService {
	private LogMapper logMapper;
	private ExtraMapper extraMapper;
	public void insert(Log log) {
		logMapper.insert(log);
	}

	public int delete(Integer id) {
		return logMapper.deleteByPrimaryKey(id);
	}

	public List query(Map map) {
		return extraMapper.queryLog(map);
	}

	public int queryCount() {
		return logMapper.countByExample(null);
	}

	public LogMapper getLogMapper() {
		return logMapper;
	}

	public void setLogMapper(LogMapper logMapper) {
		this.logMapper = logMapper;
	}

	public ExtraMapper getExtraMapper() {
		return extraMapper;
	}

	public void setExtraMapper(ExtraMapper extraMapper) {
		this.extraMapper = extraMapper;
	}
	
}

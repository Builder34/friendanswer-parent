package com.qing.dao;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author builder34
 * @email lcbiao34@gmail.com
 * @date 2017年1月17日
 */
public interface SysGeneratorDao {
	
	List<Map<String, Object>> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);
}

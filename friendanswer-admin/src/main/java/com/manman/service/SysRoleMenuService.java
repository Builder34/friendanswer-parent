package com.manman.service;

import java.util.List;



/**
 * 角色与菜单对应关系
 *
 * @author builder34
 * @email lcbiao34@gmail.com
 * @date 2017年1月17日
 */
public interface SysRoleMenuService {
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
	
}

package com.cy.pj.sys.service;

import java.util.List;
import java.util.Map;

import com.cy.pj.common.vo.Node;
import com.cy.pj.sys.entity.SysMenu;

public interface SysMenuService {
	int deleteObject(Integer id);
	int updateObject(SysMenu entity);
	int saveObject(SysMenu entity);
	List<Node> findZtreeMenuNodes();
	List<Map<String,Object>> findObjects();
}

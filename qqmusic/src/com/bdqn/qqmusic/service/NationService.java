package com.bdqn.qqmusic.service;

import java.util.List;

import com.bdqn.qqmusic.pojo.Nation;

public interface NationService {
	//1	�޸�or���
	public void merge(Nation nation);
	//2 ɾ��
	public void delete(Nation nation);
	//3	class���Ի�ȡ
	public List<Nation> findByNclass(Nation nation);	
	//4 id��ѯ
	public Nation findById(Integer id);
	//5 ��ѯ����
	public List findAll();
	//6 Nation���ѯ
	public List<Nation> findByNnation(Nation nation);	
	//7 ����+�������ݲ�ѯ
	public List<Nation> findByProperty(String propertyName, Object value);	
	
}

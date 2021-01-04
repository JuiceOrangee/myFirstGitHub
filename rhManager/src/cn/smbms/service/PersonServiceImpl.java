package cn.smbms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.PersonMapper;
import cn.smbms.pojo.Person;

@Service
public class PersonServiceImpl implements PersonService {
	@Resource
	PersonMapper personMapper;

	/*
	 * 查询所有的员工信息
	 */
	@Override
	public List<Person> getPersonList() {
		
		return personMapper.getPersonList();
	}
	
	
}

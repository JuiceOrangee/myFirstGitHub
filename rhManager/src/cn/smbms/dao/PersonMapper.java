package cn.smbms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.smbms.pojo.Person;

@Repository
public interface PersonMapper {

	List<Person> getPersonList();
	
}

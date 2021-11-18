package com.main.dalluce.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


public interface MemberDAO {

	 public String getEmail(@Param("id")String id);

}

package com.zking.dao;

import java.util.List;




import com.zking.enetity.admin.User;

public interface NewUserMapper {
	
    List<User> findAllUser();

}
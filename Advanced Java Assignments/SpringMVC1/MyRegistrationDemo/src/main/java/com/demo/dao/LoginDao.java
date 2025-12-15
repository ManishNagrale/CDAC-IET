package com.demo.dao;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser autheticateUser(String uname, String pwd);

	void registeruser(MyRegisterUser user);

}

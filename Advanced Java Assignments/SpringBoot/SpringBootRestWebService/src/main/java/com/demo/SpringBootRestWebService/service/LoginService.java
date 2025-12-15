package com.demo.SpringBootRestWebService.service;

import com.demo.SpringBootRestWebService.beans.MyUSer;

public interface LoginService {

	MyUSer validateUser(String uname, String passwd);

}

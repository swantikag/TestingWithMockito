package com.knoldus.userservice.services

import com.knoldus.userservice.dao.{UserDao, UserDaoImpl}
import com.knoldus.userservice.model.UserDetails


trait UserServiceImpl extends UserService {

  val userDao : UserDao
  def registerUser(user: UserDetails): String = userDao.registerUser(user)

}

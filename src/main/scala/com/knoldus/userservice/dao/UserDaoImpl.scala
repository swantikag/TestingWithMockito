package com.knoldus.userservice.dao

import com.knoldus.userservice.model.UserDetails

class UserDaoImpl extends UserDao {

  def registerUser(user: UserDetails): String = "This is the actual DAO implementation of UserDao"

}

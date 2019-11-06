package com.knoldus.userservice.dao

import com.knoldus.userservice.model.UserDetails

trait UserDao {

  def registerUser(user:UserDetails) : String

}

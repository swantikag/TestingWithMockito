package com.knoldus.userservice.services

import com.knoldus.userservice.model.UserDetails

import scala.concurrent.Future

trait UserService {

  def registerUser(user:UserDetails):String

}

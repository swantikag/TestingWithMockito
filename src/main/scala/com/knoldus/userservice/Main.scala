package com.knoldus.userservice

import com.knoldus.userservice.dao.UserDaoImpl
import com.knoldus.userservice.model.UserDetails
import com.knoldus.userservice.services.UserServiceImpl
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.LogManager

object Main extends App with UserServiceImpl {

  val logger:Logger = LogManager.getLogger(Main)
  val userDao = new UserDaoImpl
  logger.info("Calling registerUser() method of user service")
  val message = registerUser(UserDetails(1, "Demo"))
  logger.info(message)

}

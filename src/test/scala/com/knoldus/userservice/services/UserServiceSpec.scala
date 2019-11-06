package com.knoldus.userservice.services

import com.knoldus.userservice.dao.UserDao
import com.knoldus.userservice.model.UserDetails
import org.scalatest.{Matchers, WordSpec}
import org.scalatestplus.mockito.MockitoSugar
import org.mockito.Mockito._

class UserServiceSpec extends WordSpec with Matchers
  with MockitoSugar with UserServiceImpl {

  //Mocking the UserDao trait which would be called by the component being tested
  val mockedDao = mock[UserDao]

  //Assigning mockedDao reference to the userDao value used in UserServiceImpl
  val userDao = mockedDao

  lazy val mockedMessage = "This is the mocked DAO implementation of UserDao"

  "The service" should {
    "print a relevant message when called from test" in {
      //Specifying the message to be returned when the mocked Dao method is called
      when(mockedDao.registerUser(UserDetails(1, "test"))).thenReturn(mockedMessage)

      //Accessing the mocked method
      val message = userDao.registerUser(UserDetails(1, "test"))

      //Verifying that the result is same or not
      assert(message === mockedMessage)
    }

  }
}

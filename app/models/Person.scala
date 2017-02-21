package models

import play.api.libs.json.Json

/**
  * Created by omokehinde on 2/21/2017.
  */
case class Person(name: String)

object Person {


  implicit val personFormat = Json.format[Person]
}

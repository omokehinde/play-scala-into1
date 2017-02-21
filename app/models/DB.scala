package models

import sorm._

/**
  * Created by omokehinde on 2/21/2017.
  */
object DB extends Instance(entities = Seq(Entity[Person]()), url = "jdbc:h2:mem:test")
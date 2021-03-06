package morphir.ir.typeclass.instances

import cats.Show
import morphir.ir.Name

trait NameInstances {
  implicit val showName: Show[Name] =
    Show.show(name => name.value.map(segment => s""""$segment"""").mkString("[", ",", "]"))
}

object NameInstances extends NameInstances

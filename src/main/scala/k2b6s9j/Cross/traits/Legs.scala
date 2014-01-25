package k2b6s9j.Cross.traits

trait Legs {
  
  val amount: Int = 0

  trait Biped extends Legs {

    override val amount: Int = 2

  }

  trait Quadruped extends Legs {

    override val amount: Int = 4

  }

  trait Hectaped extends Legs {

    override val amount: Int = 6

  }

  trait Octoped extends Legs {

    override val amount: Int = 8
    
  }

}

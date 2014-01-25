package k2b6s9j.Cross.traits

trait Legs {
  
  var amount: Int = 0

  trait Biped extends Legs {

    override var amount: Int = 2

  }

  trait Quadruped extends Legs {

    override var amount: Int = 4

  }

  trait Hectaped extends Legs {

    override var amount: Int = 6

  }

  trait Octoped extends Legs {

    override var amount: Int = 8
    
  }

}

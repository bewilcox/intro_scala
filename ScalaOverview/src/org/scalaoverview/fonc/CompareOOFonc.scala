package org.scalaoverview.fonc

/* L'exemple ici permet de comparer une approche OO avec une approche fonctionnelle sur un exemple simple d'exécution d'une méthode
 * à un intervalle régulier
 */

// La version OO
// -----------------------------------------------------------------------------------------------------------------
trait Action {
  def doSomething()
}

object PingAction extends Action {
  def doSomething() = {
    println("ping")
  }
}

object ScalaMethods {
  def doPeriodically(action:Action, period:Int) = {
    while(true) {
      action.doSomething
      Thread.sleep(period)
    }
  }

  def main(args: Array[String]):Unit = {
	  doPeriodically(PingAction, 1000)
  }
}


// La version fonctionnelle
// -----------------------------------------------------------------------------------------------------------------
object ScalaFoncMethods {
  def doPeriodically(action:()=>Unit, period:Int) = {
    while (true) {
      action()
      Thread.sleep(1000)
    }
  }
  
  def pong() = {
    println("pong")
  }
  
  def main(args: Array[String]):Unit = {
	  doPeriodically(pong, 1000)
  }
  
}


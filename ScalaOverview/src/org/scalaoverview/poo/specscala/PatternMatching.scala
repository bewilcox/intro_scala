package org.scalaoverview.poo.specscala

import org.scalaoverview.poo.classic.Personne

object PatternMatching {

  // Approche Classique
  // ----------------------------------------------------------------------------
  def toSayYesOrNo(choice: Int): String = choice match {
    case 1 | 2 | 3 => "yes"
    case 0 => "no"
    case _ => "error"
  }

  // Pattern Typé
  // ----------------------------------------------------------------------------
  def whichType(obj: Any): String = obj match {
    case i: Int => s"le chiffre $i est un entier"
    case _: Double => "C'est un double"
    case s: String => "C'est une chaine de caractères : " + s
  }

  // Pattern Matching de liste
  // ----------------------------------------------------------------------------
  def firstElem(list: List[Any]): Any = {
    val head :: tail = list
    // head prend le premier élément de la liste et tail est une liste des éléments restants
    head // on retourne head
  }

  def printAllElem(list: List[String]): Unit = list match {
    case Nil => println("Liste Vide")
    case last :: Nil =>
      println("dernier element " + last)
    case first :: tail =>
      println("element : " + first)
      printAllElem(tail)
  }

  // Pattern Matching avancé (Tuples)
  // ----------------------------------------------------------------------------
  def parseArgument(arg: String, value: Any) = (arg, value) match {
    case ("-l", lang) => s"Modif de la langue $lang demandé"
    case ("-o" | "--optim", n: Int) if ((0 < n) && (n <= 5)) => s"Optimisation demandé à $n"
    case ("-o" | "--optim", badLevel) => "Niveau incorrect d'optimisation"
    case ("-h" | "--help", _) => "Affichage de l'aide"
    case bad => "Argument inconnu"
  }

  // Pattern Matching avec des cases classes
  // ----------------------------------------------------------------------------
  def canFly10YearsOld(canard:SuperCanard):Boolean = canard match {
    case subject:(SuperCanard with Flying) if subject.age >= 10 => true
    case _ => false
  }
  
}
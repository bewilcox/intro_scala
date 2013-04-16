package org.scalaoverview.poo

import org.scalaoverview.poo.classic.Personne
import org.scalaoverview.poo.classic.PersonneSansConstruteur
import org.scalaoverview.poo.classic.MonSingleton
import org.scalaoverview.poo.classic.PersonneFactory

object Main {

  /**
   * 
   */
  def main(args: Array[String]): Unit = {
    
    println("Hello world!")
    
    // Instantiation d'un object sans construteur
    var sansConstruct = new PersonneSansConstruteur
    sansConstruct.nom = "Nom1"
    sansConstruct.prenom = "Prenom1"
    println(s"la personne 1 cr��e est ${sansConstruct.nom} ${sansConstruct.prenom}")
    
    // Instantiation d'un objet avec Constructeur principal et secondaire
    var personne = new Personne("Nom2", "Prenom2", 35)
    println(s"la personne 2 cr��e est ${personne.nom} ${personne.prenom}")
    personne = new Personne("Nom3")
    println(s"la personne 3 cr��e est ${personne.nom} ${personne.prenom}")
    // Utilisation d'un accesseur explicitement �crit
    personne.prenom = "Prenom"
    println(s"la personne 3 modifi�e est ${personne.nom} ${personne.prenom}")
    
    // Scala int�gre le pattern Singleton nativement.
    var mesInfos = MonSingleton.infos
    println(s"Mes informations : $mesInfos")
    
    // Scala int�gre aussi le pattern Factory comme ici pour la cr�ation d'un objet personne.
    var newPersonne = PersonneFactory("Nom4","Prenom4",40);
    println(s"la personne 4 cr��e est ${newPersonne.nom} ${newPersonne.prenom}")
  }

}
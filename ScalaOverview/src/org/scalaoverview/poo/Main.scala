package org.scalaoverview.poo

import org.scalaoverview.poo.classic.Personne
import org.scalaoverview.poo.classic.PersonneSansConstruteur
import org.scalaoverview.poo.classic.MonSingleton
import org.scalaoverview.poo.classic.PersonneFactory
import org.scalaoverview.poo.specscala.PatternMatching

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
    
    // Le pattern matching
    var maListe = List("un","deux","trois")
    PatternMatching.printAllElem(maListe)
    
    // Le parcours de collections
    // Ne r�cup�rer que les positifs
    val liste = List(-1,2,-3,4,-5,6)
    val positifs = liste.filter(x => x > 0) // ou aussi liste.filter(_>0)
    // Afficher tous les positifs incr�ment�s de 1
    liste.filter(_>0).foreach(x => {println(x+1)})
    // Affiche la somme des �l�ments de la liste
    println(liste.reduceLeft((x,y)=>x+y)) // ou liste.sum :-)
    // Affiche la somme des carr�s pairs des �l�ments
    println(liste.map(_^2).filter(_%2==0).reduceLeft(_+_))
    // R�aliser un traitement en parall�le
    (1 to 10).par.foreach(x => print (" " + x))
    
    
  }

}
/*
 * Scala bean class for entity table AUTHOR 
 * Created on 18 avr. 2013 ( Date ISO 2013-04-18 - Time 11:51:36 )
 * Generated by Telosys Tools Generator ( version 2.0.3 )
 */

package org.demo.bean

import scala.beans.BeanProperty


/**
 * Entity bean for table "AUTHOR"
 * 
 * @author Telosys Tools Generator
 *
 */
class Author extends Serializable
{
    private val serialVersionUID = 1L


    /**
     * This field is mapped on the database column "ID" ( type "INTEGER", NotNull : true ) 
     */
	@BeanProperty
    var id          :Int   =_   // Primary Key
    


    /**
     * This field is mapped on the database column "FIRST_NAME" ( type "VARCHAR", NotNull : false ) 
     */
	@BeanProperty
    var firstName   : String    =_      

    /**
     * This field is mapped on the database column "LAST_NAME" ( type "VARCHAR", NotNull : false ) 
     */
	@BeanProperty
    var lastName    : String    =_      

}
/*
 * Java bean class for entity table AUTHOR 
 * Created on 17 avr. 2013 ( Date ISO 2013-04-17 - Time 14:45:36 )
 * Generated by Telosys Tools Generator ( version 2.0.3 )
 */

package org.demo.bean;

import java.io.Serializable;


/**
 * Entity bean for table "AUTHOR"
 * 
 * @author Telosys Tools Generator
 *
 */
public class Author implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int        id           ; // Primary Key

    private String     firstName    ;
    private String     lastName     ;

    /**
     * Default constructor
     */
    public Author()
    {
        super();
    }
    
    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR THE PRIMARY KEY 
    //----------------------------------------------------------------------
    /**
     * Set the "id" field value
     * This field is mapped on the database column "ID" ( type "INTEGER", NotNull : true ) 
     * @param id
     */
	public void setId( int id )
    {
        this.id = id ;
    }
    /**
     * Get the "id" field value
     * This field is mapped on the database column "ID" ( type "INTEGER", NotNull : true ) 
     * @return the field value
     */
	public int getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR DATA FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : FIRST_NAME ( VARCHAR ) 
    /**
     * Set the "firstName" field value
     * This field is mapped on the database column "FIRST_NAME" ( type "VARCHAR", NotNull : false ) 
     * @param firstName
     */
    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }
    /**
     * Get the "firstName" field value
     * This field is mapped on the database column "FIRST_NAME" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    //--- DATABASE MAPPING : LAST_NAME ( VARCHAR ) 
    /**
     * Set the "lastName" field value
     * This field is mapped on the database column "LAST_NAME" ( type "VARCHAR", NotNull : false ) 
     * @param lastName
     */
    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }
    /**
     * Get the "lastName" field value
     * This field is mapped on the database column "LAST_NAME" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getLastName()
    {
        return this.lastName;
    }

    

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString()
    {
        StringBuffer sb = new StringBuffer(); 
        sb.append(id); 
        sb.append("|"); 
        sb.append(firstName); 
        sb.append( "|" ); 
        sb.append(lastName); 
        return sb.toString();
    }

}
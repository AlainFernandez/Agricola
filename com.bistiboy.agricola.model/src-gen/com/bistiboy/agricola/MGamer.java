/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MGamer#getName <em>Name</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MGamer#getGamerboard <em>Gamerboard</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getGamer()
 * @model
 * @generated
 */
public interface MGamer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getGamer_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MGamer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gamerboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gamerboard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamerboard</em>' containment reference.
	 * @see #setGamerboard(GamerBoard)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getGamer_Gamerboard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GamerBoard getGamerboard();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MGamer#getGamerboard <em>Gamerboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamerboard</em>' containment reference.
	 * @see #getGamerboard()
	 * @generated
	 */
	void setGamerboard(GamerBoard value);

} // MGamer

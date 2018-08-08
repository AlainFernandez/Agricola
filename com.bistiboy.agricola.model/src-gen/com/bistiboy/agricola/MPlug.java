/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plug</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MPlug#getName <em>Name</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MPlug#getPipe <em>Pipe</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getPlug()
 * @model
 * @generated
 */
public interface MPlug extends EObject {
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
	 * @see com.bistiboy.agricola.MAgricolaPackage#getPlug_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MPlug#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pipe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipe</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipe</em>' containment reference.
	 * @see #setPipe(Pipe)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getPlug_Pipe()
	 * @model containment="true"
	 * @generated
	 */
	Pipe getPipe();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MPlug#getPipe <em>Pipe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipe</em>' containment reference.
	 * @see #getPipe()
	 * @generated
	 */
	void setPipe(Pipe value);

} // MPlug

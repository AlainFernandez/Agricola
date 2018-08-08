/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MRound#getName <em>Name</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MRound#getActioncard <em>Actioncard</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getRound()
 * @model
 * @generated
 */
public interface MRound extends EObject {
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
	 * @see com.bistiboy.agricola.MAgricolaPackage#getRound_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MRound#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actioncard</b></em>' reference list.
	 * The list contents are of type {@link com.bistiboy.agricola.ActionCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actioncard</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actioncard</em>' reference list.
	 * @see com.bistiboy.agricola.MAgricolaPackage#getRound_Actioncard()
	 * @model
	 * @generated
	 */
	EList<ActionCard> getActioncard();

} // MRound

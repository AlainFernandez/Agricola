/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MCreationCard#getCreations <em>Creations</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MCreationCard#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getCreationCard()
 * @model
 * @generated
 */
public interface MCreationCard extends ActionCard {
	/**
	 * Returns the value of the '<em><b>Creations</b></em>' containment reference list.
	 * The list contents are of type {@link com.bistiboy.agricola.Creation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creations</em>' containment reference list.
	 * @see com.bistiboy.agricola.MAgricolaPackage#getCreationCard_Creations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Creation> getCreations();

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creation Card can be done more than once.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getCreationCard_Unique()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MCreationCard#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // MCreationCard

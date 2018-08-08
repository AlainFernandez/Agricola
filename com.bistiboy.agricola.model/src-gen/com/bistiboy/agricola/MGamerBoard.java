/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamer Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MGamerBoard#getParcels <em>Parcels</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getGamerBoard()
 * @model
 * @generated
 */
public interface MGamerBoard extends EObject {
	/**
	 * Returns the value of the '<em><b>Parcels</b></em>' containment reference list.
	 * The list contents are of type {@link com.bistiboy.agricola.Parcel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parcels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parcels</em>' containment reference list.
	 * @see com.bistiboy.agricola.MAgricolaPackage#getGamerBoard_Parcels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parcel> getParcels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int computeScore();

} // MGamerBoard

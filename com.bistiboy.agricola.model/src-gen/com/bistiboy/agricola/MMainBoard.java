/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MMainBoard#getFixedCards <em>Fixed Cards</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MMainBoard#getRounds <em>Rounds</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getMainBoard()
 * @model
 * @generated
 */
public interface MMainBoard extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed Cards</b></em>' reference list.
	 * The list contents are of type {@link com.bistiboy.agricola.ActionCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Cards</em>' reference list.
	 * @see com.bistiboy.agricola.MAgricolaPackage#getMainBoard_FixedCards()
	 * @model lower="10" upper="16"
	 * @generated
	 */
	EList<ActionCard> getFixedCards();

	/**
	 * Returns the value of the '<em><b>Rounds</b></em>' containment reference list.
	 * The list contents are of type {@link com.bistiboy.agricola.Round}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounds</em>' containment reference list.
	 * @see com.bistiboy.agricola.MAgricolaPackage#getMainBoard_Rounds()
	 * @model containment="true" required="true" upper="14"
	 * @generated
	 */
	EList<Round> getRounds();

} // MMainBoard

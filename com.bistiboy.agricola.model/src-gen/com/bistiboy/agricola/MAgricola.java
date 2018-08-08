/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agricola</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MAgricola#getGamers <em>Gamers</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MAgricola#getCards <em>Cards</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MAgricola#getMainboard <em>Mainboard</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getAgricola()
 * @model
 * @generated
 */
public interface MAgricola extends EObject {
	/**
	 * Returns the value of the '<em><b>Gamers</b></em>' containment reference list.
	 * The list contents are of type {@link com.bistiboy.agricola.Gamer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gamers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamers</em>' containment reference list.
	 * @see com.bistiboy.agricola.MAgricolaPackage#getAgricola_Gamers()
	 * @model containment="true" required="true" upper="5"
	 * @generated
	 */
	EList<Gamer> getGamers();

	/**
	 * Returns the value of the '<em><b>Cards</b></em>' containment reference list.
	 * The list contents are of type {@link com.bistiboy.agricola.ActionCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' containment reference list.
	 * @see com.bistiboy.agricola.MAgricolaPackage#getAgricola_Cards()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionCard> getCards();

	/**
	 * Returns the value of the '<em><b>Mainboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainboard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainboard</em>' containment reference.
	 * @see #setMainboard(MainBoard)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getAgricola_Mainboard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MainBoard getMainboard();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MAgricola#getMainboard <em>Mainboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainboard</em>' containment reference.
	 * @see #getMainboard()
	 * @generated
	 */
	void setMainboard(MainBoard value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void play(Gamer g);

} // MAgricola

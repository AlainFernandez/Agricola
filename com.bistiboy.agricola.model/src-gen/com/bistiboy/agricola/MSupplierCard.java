/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MSupplierCard#getSupply <em>Supply</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MSupplierCard#getBankSupply <em>Bank Supply</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getSupplierCard()
 * @model
 * @generated
 */
public interface MSupplierCard extends ActionCard {
	/**
	 * Returns the value of the '<em><b>Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply</em>' containment reference.
	 * @see #setSupply(Supply)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getSupplierCard_Supply()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Supply getSupply();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MSupplierCard#getSupply <em>Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply</em>' containment reference.
	 * @see #getSupply()
	 * @generated
	 */
	void setSupply(Supply value);

	/**
	 * Returns the value of the '<em><b>Bank Supply</b></em>' containment reference list.
	 * The list contents are of type {@link com.bistiboy.agricola.Supply}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Supply</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Supply</em>' containment reference list.
	 * @see com.bistiboy.agricola.MAgricolaPackage#getSupplierCard_BankSupply()
	 * @model containment="true"
	 * @generated
	 */
	EList<Supply> getBankSupply();

} // MSupplierCard

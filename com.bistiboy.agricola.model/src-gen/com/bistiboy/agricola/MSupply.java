/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MSupply#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MSupply#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getSupply()
 * @model
 * @generated
 */
public interface MSupply extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getSupply_Quantity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MSupply#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.bistiboy.agricola.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see com.bistiboy.agricola.Resource
	 * @see #setResourceType(Resource)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getSupply_ResourceType()
	 * @model
	 * @generated
	 */
	Resource getResourceType();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MSupply#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see com.bistiboy.agricola.Resource
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(Resource value);

} // MSupply

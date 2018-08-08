/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parcel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.MParcel#getType <em>Type</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MParcel#getX <em>X</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MParcel#getY <em>Y</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MParcel#getIn <em>In</em>}</li>
 *   <li>{@link com.bistiboy.agricola.MParcel#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see com.bistiboy.agricola.MAgricolaPackage#getParcel()
 * @model
 * @generated
 */
public interface MParcel extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.bistiboy.agricola.ParcelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.bistiboy.agricola.ParcelType
	 * @see #setType(ParcelType)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getParcel_Type()
	 * @model
	 * @generated
	 */
	ParcelType getType();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MParcel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.bistiboy.agricola.ParcelType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParcelType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getParcel_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MParcel#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getParcel_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MParcel#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(InPlug)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getParcel_In()
	 * @model containment="true"
	 * @generated
	 */
	InPlug getIn();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MParcel#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(InPlug value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference.
	 * @see #setOut(OutPlug)
	 * @see com.bistiboy.agricola.MAgricolaPackage#getParcel_Out()
	 * @model containment="true"
	 * @generated
	 */
	OutPlug getOut();

	/**
	 * Sets the value of the '{@link com.bistiboy.agricola.MParcel#getOut <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' containment reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(OutPlug value);

} // MParcel

/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.bistiboy.agricola.MAgricolaPackage
 * @generated
 */
public interface MAgricolaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MAgricolaFactory eINSTANCE = com.bistiboy.agricola.impl.MAgricolaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gamer Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamer Board</em>'.
	 * @generated
	 */
	GamerBoard createGamerBoard();

	/**
	 * Returns a new object of class '<em>Parcel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parcel</em>'.
	 * @generated
	 */
	Parcel createParcel();

	/**
	 * Returns a new object of class '<em>Gamer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamer</em>'.
	 * @generated
	 */
	Gamer createGamer();

	/**
	 * Returns a new object of class '<em>Agricola</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agricola</em>'.
	 * @generated
	 */
	Agricola createAgricola();

	/**
	 * Returns a new object of class '<em>Supplier Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier Card</em>'.
	 * @generated
	 */
	SupplierCard createSupplierCard();

	/**
	 * Returns a new object of class '<em>Creation Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation Card</em>'.
	 * @generated
	 */
	CreationCard createCreationCard();

	/**
	 * Returns a new object of class '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply</em>'.
	 * @generated
	 */
	Supply createSupply();

	/**
	 * Returns a new object of class '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation</em>'.
	 * @generated
	 */
	Creation createCreation();

	/**
	 * Returns a new object of class '<em>Main Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Board</em>'.
	 * @generated
	 */
	MainBoard createMainBoard();

	/**
	 * Returns a new object of class '<em>Round</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round</em>'.
	 * @generated
	 */
	Round createRound();

	/**
	 * Returns a new object of class '<em>In Plug</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Plug</em>'.
	 * @generated
	 */
	InPlug createInPlug();

	/**
	 * Returns a new object of class '<em>Plug</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plug</em>'.
	 * @generated
	 */
	Plug createPlug();

	/**
	 * Returns a new object of class '<em>Out Plug</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Plug</em>'.
	 * @generated
	 */
	OutPlug createOutPlug();

	/**
	 * Returns a new object of class '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipe</em>'.
	 * @generated
	 */
	Pipe createPipe();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MAgricolaPackage getAgricolaPackage();

} //MAgricolaFactory

/**
 */
package com.bistiboy.agricola.util;

import com.bistiboy.agricola.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.bistiboy.agricola.MAgricolaPackage
 * @generated
 */
public class AgricolaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MAgricolaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgricolaSwitch() {
		if (modelPackage == null) {
			modelPackage = MAgricolaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MAgricolaPackage.GAMER_BOARD: {
				GamerBoard gamerBoard = (GamerBoard)theEObject;
				T result = caseGamerBoard(gamerBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.PARCEL: {
				Parcel parcel = (Parcel)theEObject;
				T result = caseParcel(parcel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.GAMER: {
				Gamer gamer = (Gamer)theEObject;
				T result = caseGamer(gamer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.AGRICOLA: {
				Agricola agricola = (Agricola)theEObject;
				T result = caseAgricola(agricola);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.ACTION_CARD: {
				ActionCard actionCard = (ActionCard)theEObject;
				T result = caseActionCard(actionCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.SUPPLIER_CARD: {
				SupplierCard supplierCard = (SupplierCard)theEObject;
				T result = caseSupplierCard(supplierCard);
				if (result == null) result = caseActionCard(supplierCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.CREATION_CARD: {
				CreationCard creationCard = (CreationCard)theEObject;
				T result = caseCreationCard(creationCard);
				if (result == null) result = caseActionCard(creationCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.SUPPLY: {
				Supply supply = (Supply)theEObject;
				T result = caseSupply(supply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.CREATION: {
				Creation creation = (Creation)theEObject;
				T result = caseCreation(creation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.MAIN_BOARD: {
				MainBoard mainBoard = (MainBoard)theEObject;
				T result = caseMainBoard(mainBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.ROUND: {
				Round round = (Round)theEObject;
				T result = caseRound(round);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.IN_PLUG: {
				InPlug inPlug = (InPlug)theEObject;
				T result = caseInPlug(inPlug);
				if (result == null) result = casePlug(inPlug);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.PLUG: {
				Plug plug = (Plug)theEObject;
				T result = casePlug(plug);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.OUT_PLUG: {
				OutPlug outPlug = (OutPlug)theEObject;
				T result = caseOutPlug(outPlug);
				if (result == null) result = casePlug(outPlug);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MAgricolaPackage.PIPE: {
				Pipe pipe = (Pipe)theEObject;
				T result = casePipe(pipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gamer Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gamer Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamerBoard(GamerBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parcel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parcel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParcel(Parcel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gamer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gamer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamer(Gamer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agricola</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agricola</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgricola(Agricola object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionCard(ActionCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplierCard(SupplierCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationCard(CreationCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupply(Supply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreation(Creation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainBoard(MainBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRound(Round object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Plug</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Plug</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPlug(InPlug object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plug</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plug</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlug(Plug object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Plug</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Plug</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPlug(OutPlug object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipe(Pipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AgricolaSwitch

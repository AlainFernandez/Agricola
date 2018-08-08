/**
 */
package com.bistiboy.agricola.util;

import com.bistiboy.agricola.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.bistiboy.agricola.MAgricolaPackage
 * @generated
 */
public class AgricolaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MAgricolaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgricolaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MAgricolaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgricolaSwitch<Adapter> modelSwitch =
		new AgricolaSwitch<Adapter>() {
			@Override
			public Adapter caseGamerBoard(GamerBoard object) {
				return createGamerBoardAdapter();
			}
			@Override
			public Adapter caseParcel(Parcel object) {
				return createParcelAdapter();
			}
			@Override
			public Adapter caseGamer(Gamer object) {
				return createGamerAdapter();
			}
			@Override
			public Adapter caseAgricola(Agricola object) {
				return createAgricolaAdapter();
			}
			@Override
			public Adapter caseActionCard(ActionCard object) {
				return createActionCardAdapter();
			}
			@Override
			public Adapter caseSupplierCard(SupplierCard object) {
				return createSupplierCardAdapter();
			}
			@Override
			public Adapter caseCreationCard(CreationCard object) {
				return createCreationCardAdapter();
			}
			@Override
			public Adapter caseSupply(Supply object) {
				return createSupplyAdapter();
			}
			@Override
			public Adapter caseCreation(Creation object) {
				return createCreationAdapter();
			}
			@Override
			public Adapter caseMainBoard(MainBoard object) {
				return createMainBoardAdapter();
			}
			@Override
			public Adapter caseRound(Round object) {
				return createRoundAdapter();
			}
			@Override
			public Adapter caseInPlug(InPlug object) {
				return createInPlugAdapter();
			}
			@Override
			public Adapter casePlug(Plug object) {
				return createPlugAdapter();
			}
			@Override
			public Adapter caseOutPlug(OutPlug object) {
				return createOutPlugAdapter();
			}
			@Override
			public Adapter casePipe(Pipe object) {
				return createPipeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MGamerBoard <em>Gamer Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MGamerBoard
	 * @generated
	 */
	public Adapter createGamerBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MParcel <em>Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MParcel
	 * @generated
	 */
	public Adapter createParcelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MGamer <em>Gamer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MGamer
	 * @generated
	 */
	public Adapter createGamerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MAgricola <em>Agricola</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MAgricola
	 * @generated
	 */
	public Adapter createAgricolaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MActionCard <em>Action Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MActionCard
	 * @generated
	 */
	public Adapter createActionCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MSupplierCard <em>Supplier Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MSupplierCard
	 * @generated
	 */
	public Adapter createSupplierCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MCreationCard <em>Creation Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MCreationCard
	 * @generated
	 */
	public Adapter createCreationCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MSupply
	 * @generated
	 */
	public Adapter createSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MCreation
	 * @generated
	 */
	public Adapter createCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MMainBoard <em>Main Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MMainBoard
	 * @generated
	 */
	public Adapter createMainBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MRound <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MRound
	 * @generated
	 */
	public Adapter createRoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MInPlug <em>In Plug</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MInPlug
	 * @generated
	 */
	public Adapter createInPlugAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MPlug <em>Plug</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MPlug
	 * @generated
	 */
	public Adapter createPlugAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MOutPlug <em>Out Plug</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MOutPlug
	 * @generated
	 */
	public Adapter createOutPlugAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bistiboy.agricola.MPipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bistiboy.agricola.MPipe
	 * @generated
	 */
	public Adapter createPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AgricolaAdapterFactory

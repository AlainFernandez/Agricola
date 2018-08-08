/**
 */
package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MAgricolaFactoryImpl extends EFactoryImpl implements MAgricolaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MAgricolaFactory init() {
		try {
			MAgricolaFactory theAgricolaFactory = (MAgricolaFactory)EPackage.Registry.INSTANCE.getEFactory(MAgricolaPackage.eNS_URI);
			if (theAgricolaFactory != null) {
				return theAgricolaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MAgricolaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAgricolaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MAgricolaPackage.GAMER_BOARD: return createGamerBoard();
			case MAgricolaPackage.PARCEL: return createParcel();
			case MAgricolaPackage.GAMER: return createGamer();
			case MAgricolaPackage.AGRICOLA: return createAgricola();
			case MAgricolaPackage.SUPPLIER_CARD: return createSupplierCard();
			case MAgricolaPackage.CREATION_CARD: return createCreationCard();
			case MAgricolaPackage.SUPPLY: return createSupply();
			case MAgricolaPackage.CREATION: return createCreation();
			case MAgricolaPackage.MAIN_BOARD: return createMainBoard();
			case MAgricolaPackage.ROUND: return createRound();
			case MAgricolaPackage.IN_PLUG: return createInPlug();
			case MAgricolaPackage.PLUG: return createPlug();
			case MAgricolaPackage.OUT_PLUG: return createOutPlug();
			case MAgricolaPackage.PIPE: return createPipe();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MAgricolaPackage.PARCEL_TYPE:
				return createParcelTypeFromString(eDataType, initialValue);
			case MAgricolaPackage.RESOURCE:
				return createResourceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MAgricolaPackage.PARCEL_TYPE:
				return convertParcelTypeToString(eDataType, instanceValue);
			case MAgricolaPackage.RESOURCE:
				return convertResourceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamerBoard createGamerBoard() {
		GamerBoardImpl gamerBoard = new GamerBoardImpl();
		return gamerBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parcel createParcel() {
		ParcelImpl parcel = new ParcelImpl();
		return parcel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gamer createGamer() {
		GamerImpl gamer = new GamerImpl();
		return gamer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agricola createAgricola() {
		AgricolaImpl agricola = new AgricolaImpl();
		return agricola;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierCard createSupplierCard() {
		SupplierCardImpl supplierCard = new SupplierCardImpl();
		return supplierCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationCard createCreationCard() {
		CreationCardImpl creationCard = new CreationCardImpl();
		return creationCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply createSupply() {
		SupplyImpl supply = new SupplyImpl();
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creation createCreation() {
		CreationImpl creation = new CreationImpl();
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBoard createMainBoard() {
		MainBoardImpl mainBoard = new MainBoardImpl();
		return mainBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Round createRound() {
		RoundImpl round = new RoundImpl();
		return round;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPlug createInPlug() {
		InPlugImpl inPlug = new InPlugImpl();
		return inPlug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plug createPlug() {
		PlugImpl plug = new PlugImpl();
		return plug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPlug createOutPlug() {
		OutPlugImpl outPlug = new OutPlugImpl();
		return outPlug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipe createPipe() {
		PipeImpl pipe = new PipeImpl();
		return pipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelType createParcelTypeFromString(EDataType eDataType, String initialValue) {
		ParcelType result = ParcelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParcelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResourceFromString(EDataType eDataType, String initialValue) {
		Resource result = Resource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAgricolaPackage getAgricolaPackage() {
		return (MAgricolaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MAgricolaPackage getPackage() {
		return MAgricolaPackage.eINSTANCE;
	}

} //MAgricolaFactoryImpl

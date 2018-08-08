/**
 */
package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.ActionCard;
import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.Creation;
import com.bistiboy.agricola.CreationCard;
import com.bistiboy.agricola.Gamer;
import com.bistiboy.agricola.GamerBoard;
import com.bistiboy.agricola.InPlug;
import com.bistiboy.agricola.MAgricolaFactory;
import com.bistiboy.agricola.MAgricolaPackage;
import com.bistiboy.agricola.MainBoard;
import com.bistiboy.agricola.OutPlug;
import com.bistiboy.agricola.Parcel;
import com.bistiboy.agricola.ParcelType;
import com.bistiboy.agricola.Pipe;
import com.bistiboy.agricola.Plug;
import com.bistiboy.agricola.Resource;
import com.bistiboy.agricola.Round;
import com.bistiboy.agricola.SupplierCard;
import com.bistiboy.agricola.Supply;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MAgricolaPackageImpl extends EPackageImpl implements MAgricolaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamerBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parcelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agricolaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inPlugEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plugEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outPlugEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parcelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.bistiboy.agricola.MAgricolaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MAgricolaPackageImpl() {
		super(eNS_URI, MAgricolaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MAgricolaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MAgricolaPackage init() {
		if (isInited) return (MAgricolaPackage)EPackage.Registry.INSTANCE.getEPackage(MAgricolaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAgricolaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MAgricolaPackageImpl theAgricolaPackage = registeredAgricolaPackage instanceof MAgricolaPackageImpl ? (MAgricolaPackageImpl)registeredAgricolaPackage : new MAgricolaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAgricolaPackage.createPackageContents();

		// Initialize created meta-data
		theAgricolaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAgricolaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MAgricolaPackage.eNS_URI, theAgricolaPackage);
		return theAgricolaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamerBoard() {
		return gamerBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamerBoard_Parcels() {
		return (EReference)gamerBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamerBoard__ComputeScore() {
		return gamerBoardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParcel() {
		return parcelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcel_Type() {
		return (EAttribute)parcelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcel_X() {
		return (EAttribute)parcelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcel_Y() {
		return (EAttribute)parcelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcel_In() {
		return (EReference)parcelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcel_Out() {
		return (EReference)parcelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamer() {
		return gamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamer_Name() {
		return (EAttribute)gamerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamer_Gamerboard() {
		return (EReference)gamerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgricola() {
		return agricolaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgricola_Gamers() {
		return (EReference)agricolaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgricola_Cards() {
		return (EReference)agricolaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgricola_Mainboard() {
		return (EReference)agricolaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgricola__Start() {
		return agricolaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgricola__Play__MGamer() {
		return agricolaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionCard() {
		return actionCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionCard_Name() {
		return (EAttribute)actionCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplierCard() {
		return supplierCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplierCard_Supply() {
		return (EReference)supplierCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplierCard_BankSupply() {
		return (EReference)supplierCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationCard() {
		return creationCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreationCard_Creations() {
		return (EReference)creationCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationCard_Unique() {
		return (EAttribute)creationCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupply() {
		return supplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupply_Quantity() {
		return (EAttribute)supplyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupply_ResourceType() {
		return (EAttribute)supplyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreation() {
		return creationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreation_Name() {
		return (EAttribute)creationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreation_Cost() {
		return (EReference)creationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainBoard() {
		return mainBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainBoard_FixedCards() {
		return (EReference)mainBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainBoard_Rounds() {
		return (EReference)mainBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRound() {
		return roundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRound_Name() {
		return (EAttribute)roundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRound_Actioncard() {
		return (EReference)roundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInPlug() {
		return inPlugEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlug() {
		return plugEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlug_Name() {
		return (EAttribute)plugEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlug_Pipe() {
		return (EReference)plugEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutPlug() {
		return outPlugEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipe() {
		return pipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipe_Name() {
		return (EAttribute)pipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipe_Unit() {
		return (EAttribute)pipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipe_Value() {
		return (EAttribute)pipeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipe_In() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipe_Out() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParcelType() {
		return parcelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResource() {
		return resourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAgricolaFactory getAgricolaFactory() {
		return (MAgricolaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gamerBoardEClass = createEClass(GAMER_BOARD);
		createEReference(gamerBoardEClass, GAMER_BOARD__PARCELS);
		createEOperation(gamerBoardEClass, GAMER_BOARD___COMPUTE_SCORE);

		parcelEClass = createEClass(PARCEL);
		createEAttribute(parcelEClass, PARCEL__TYPE);
		createEAttribute(parcelEClass, PARCEL__X);
		createEAttribute(parcelEClass, PARCEL__Y);
		createEReference(parcelEClass, PARCEL__IN);
		createEReference(parcelEClass, PARCEL__OUT);

		gamerEClass = createEClass(GAMER);
		createEAttribute(gamerEClass, GAMER__NAME);
		createEReference(gamerEClass, GAMER__GAMERBOARD);

		agricolaEClass = createEClass(AGRICOLA);
		createEReference(agricolaEClass, AGRICOLA__GAMERS);
		createEReference(agricolaEClass, AGRICOLA__CARDS);
		createEReference(agricolaEClass, AGRICOLA__MAINBOARD);
		createEOperation(agricolaEClass, AGRICOLA___START);
		createEOperation(agricolaEClass, AGRICOLA___PLAY__MGAMER);

		actionCardEClass = createEClass(ACTION_CARD);
		createEAttribute(actionCardEClass, ACTION_CARD__NAME);

		supplierCardEClass = createEClass(SUPPLIER_CARD);
		createEReference(supplierCardEClass, SUPPLIER_CARD__SUPPLY);
		createEReference(supplierCardEClass, SUPPLIER_CARD__BANK_SUPPLY);

		creationCardEClass = createEClass(CREATION_CARD);
		createEReference(creationCardEClass, CREATION_CARD__CREATIONS);
		createEAttribute(creationCardEClass, CREATION_CARD__UNIQUE);

		supplyEClass = createEClass(SUPPLY);
		createEAttribute(supplyEClass, SUPPLY__QUANTITY);
		createEAttribute(supplyEClass, SUPPLY__RESOURCE_TYPE);

		creationEClass = createEClass(CREATION);
		createEAttribute(creationEClass, CREATION__NAME);
		createEReference(creationEClass, CREATION__COST);

		mainBoardEClass = createEClass(MAIN_BOARD);
		createEReference(mainBoardEClass, MAIN_BOARD__FIXED_CARDS);
		createEReference(mainBoardEClass, MAIN_BOARD__ROUNDS);

		roundEClass = createEClass(ROUND);
		createEAttribute(roundEClass, ROUND__NAME);
		createEReference(roundEClass, ROUND__ACTIONCARD);

		inPlugEClass = createEClass(IN_PLUG);

		plugEClass = createEClass(PLUG);
		createEAttribute(plugEClass, PLUG__NAME);
		createEReference(plugEClass, PLUG__PIPE);

		outPlugEClass = createEClass(OUT_PLUG);

		pipeEClass = createEClass(PIPE);
		createEAttribute(pipeEClass, PIPE__NAME);
		createEAttribute(pipeEClass, PIPE__UNIT);
		createEAttribute(pipeEClass, PIPE__VALUE);
		createEReference(pipeEClass, PIPE__IN);
		createEReference(pipeEClass, PIPE__OUT);

		// Create enums
		parcelTypeEEnum = createEEnum(PARCEL_TYPE);
		resourceEEnum = createEEnum(RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		supplierCardEClass.getESuperTypes().add(this.getActionCard());
		creationCardEClass.getESuperTypes().add(this.getActionCard());
		inPlugEClass.getESuperTypes().add(this.getPlug());
		outPlugEClass.getESuperTypes().add(this.getPlug());

		// Initialize classes, features, and operations; add parameters
		initEClass(gamerBoardEClass, GamerBoard.class, "GamerBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamerBoard_Parcels(), this.getParcel(), null, "parcels", null, 0, -1, GamerBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGamerBoard__ComputeScore(), theXMLTypePackage.getInt(), "computeScore", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parcelEClass, Parcel.class, "Parcel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParcel_Type(), this.getParcelType(), "type", null, 0, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcel_X(), theXMLTypePackage.getInt(), "x", null, 0, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcel_Y(), theXMLTypePackage.getInt(), "y", null, 0, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcel_In(), this.getInPlug(), null, "in", null, 0, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcel_Out(), this.getOutPlug(), null, "out", null, 0, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gamerEClass, Gamer.class, "Gamer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGamer_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Gamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamer_Gamerboard(), this.getGamerBoard(), null, "gamerboard", null, 1, 1, Gamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agricolaEClass, Agricola.class, "Agricola", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgricola_Gamers(), this.getGamer(), null, "gamers", null, 1, 5, Agricola.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgricola_Cards(), this.getActionCard(), null, "cards", null, 0, -1, Agricola.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgricola_Mainboard(), this.getMainBoard(), null, "mainboard", null, 1, 1, Agricola.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAgricola__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAgricola__Play__MGamer(), null, "play", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGamer(), "g", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionCardEClass, ActionCard.class, "ActionCard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionCard_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ActionCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplierCardEClass, SupplierCard.class, "SupplierCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupplierCard_Supply(), this.getSupply(), null, "supply", null, 1, 1, SupplierCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplierCard_BankSupply(), this.getSupply(), null, "bankSupply", null, 0, -1, SupplierCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationCardEClass, CreationCard.class, "CreationCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreationCard_Creations(), this.getCreation(), null, "creations", null, 1, -1, CreationCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationCard_Unique(), theXMLTypePackage.getBoolean(), "unique", null, 0, 1, CreationCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplyEClass, Supply.class, "Supply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupply_Quantity(), theXMLTypePackage.getInt(), "quantity", null, 0, 1, Supply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupply_ResourceType(), this.getResource(), "resourceType", null, 0, 1, Supply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationEClass, Creation.class, "Creation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreation_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Creation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreation_Cost(), this.getSupply(), null, "cost", null, 0, -1, Creation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainBoardEClass, MainBoard.class, "MainBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainBoard_FixedCards(), this.getActionCard(), null, "fixedCards", null, 10, 16, MainBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainBoard_Rounds(), this.getRound(), null, "rounds", null, 1, 14, MainBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundEClass, Round.class, "Round", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRound_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Round.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRound_Actioncard(), this.getActionCard(), null, "actioncard", null, 0, -1, Round.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inPlugEClass, InPlug.class, "InPlug", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plugEClass, Plug.class, "Plug", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlug_Name(), ecorePackage.getEString(), "name", null, 0, 1, Plug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlug_Pipe(), this.getPipe(), null, "pipe", null, 0, 1, Plug.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outPlugEClass, OutPlug.class, "OutPlug", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pipeEClass, Pipe.class, "Pipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipe_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipe_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipe_In(), this.getInPlug(), null, "in", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipe_Out(), this.getOutPlug(), null, "out", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parcelTypeEEnum, ParcelType.class, "ParcelType");
		addEEnumLiteral(parcelTypeEEnum, ParcelType.UNDEFINED);
		addEEnumLiteral(parcelTypeEEnum, ParcelType.FIELD);
		addEEnumLiteral(parcelTypeEEnum, ParcelType.ENCLOSURE);
		addEEnumLiteral(parcelTypeEEnum, ParcelType.SHED);
		addEEnumLiteral(parcelTypeEEnum, ParcelType.HOUSE);

		initEEnum(resourceEEnum, Resource.class, "Resource");
		addEEnumLiteral(resourceEEnum, Resource.UNDEFINED);
		addEEnumLiteral(resourceEEnum, Resource.CLAY);
		addEEnumLiteral(resourceEEnum, Resource.REED);
		addEEnumLiteral(resourceEEnum, Resource.WOOD);
		addEEnumLiteral(resourceEEnum, Resource.STONE);
		addEEnumLiteral(resourceEEnum, Resource.CEREAL);
		addEEnumLiteral(resourceEEnum, Resource.CARROT);
		addEEnumLiteral(resourceEEnum, Resource.COIN);

		// Create resource
		createResource(eNS_URI);
	}

} //MAgricolaPackageImpl

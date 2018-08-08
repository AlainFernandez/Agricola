/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.bistiboy.agricola.MAgricolaFactory
 * @model kind="package"
 * @generated
 */
public interface MAgricolaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agricola";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.bistiboy.agricola/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agricola";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MAgricolaPackage eINSTANCE = com.bistiboy.agricola.impl.MAgricolaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MGamerBoardImpl <em>Gamer Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MGamerBoardImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getGamerBoard()
	 * @generated
	 */
	int GAMER_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Parcels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_BOARD__PARCELS = 0;

	/**
	 * The number of structural features of the '<em>Gamer Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_BOARD_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Compute Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_BOARD___COMPUTE_SCORE = 0;

	/**
	 * The number of operations of the '<em>Gamer Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_BOARD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MParcelImpl <em>Parcel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MParcelImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getParcel()
	 * @generated
	 */
	int PARCEL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__Y = 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__IN = 3;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__OUT = 4;

	/**
	 * The number of structural features of the '<em>Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MGamerImpl <em>Gamer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MGamerImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getGamer()
	 * @generated
	 */
	int GAMER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gamerboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER__GAMERBOARD = 1;

	/**
	 * The number of structural features of the '<em>Gamer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gamer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MAgricolaImpl <em>Agricola</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MAgricolaImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getAgricola()
	 * @generated
	 */
	int AGRICOLA = 3;

	/**
	 * The feature id for the '<em><b>Gamers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICOLA__GAMERS = 0;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICOLA__CARDS = 1;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICOLA__MAINBOARD = 2;

	/**
	 * The number of structural features of the '<em>Agricola</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICOLA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICOLA___START = 0;

	/**
	 * The operation id for the '<em>Play</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICOLA___PLAY__MGAMER = 1;

	/**
	 * The number of operations of the '<em>Agricola</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICOLA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MActionCardImpl <em>Action Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MActionCardImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getActionCard()
	 * @generated
	 */
	int ACTION_CARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CARD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MSupplierCardImpl <em>Supplier Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MSupplierCardImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getSupplierCard()
	 * @generated
	 */
	int SUPPLIER_CARD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CARD__NAME = ACTION_CARD__NAME;

	/**
	 * The feature id for the '<em><b>Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CARD__SUPPLY = ACTION_CARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bank Supply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CARD__BANK_SUPPLY = ACTION_CARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supplier Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CARD_FEATURE_COUNT = ACTION_CARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Supplier Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CARD_OPERATION_COUNT = ACTION_CARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MCreationCardImpl <em>Creation Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MCreationCardImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getCreationCard()
	 * @generated
	 */
	int CREATION_CARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CARD__NAME = ACTION_CARD__NAME;

	/**
	 * The feature id for the '<em><b>Creations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CARD__CREATIONS = ACTION_CARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CARD__UNIQUE = ACTION_CARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Creation Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CARD_FEATURE_COUNT = ACTION_CARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Creation Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CARD_OPERATION_COUNT = ACTION_CARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MSupplyImpl <em>Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MSupplyImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getSupply()
	 * @generated
	 */
	int SUPPLY = 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__RESOURCE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MCreationImpl <em>Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MCreationImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getCreation()
	 * @generated
	 */
	int CREATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__COST = 1;

	/**
	 * The number of structural features of the '<em>Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MMainBoardImpl <em>Main Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MMainBoardImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getMainBoard()
	 * @generated
	 */
	int MAIN_BOARD = 9;

	/**
	 * The feature id for the '<em><b>Fixed Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BOARD__FIXED_CARDS = 0;

	/**
	 * The feature id for the '<em><b>Rounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BOARD__ROUNDS = 1;

	/**
	 * The number of structural features of the '<em>Main Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Main Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MRoundImpl <em>Round</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MRoundImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getRound()
	 * @generated
	 */
	int ROUND = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actioncard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__ACTIONCARD = 1;

	/**
	 * The number of structural features of the '<em>Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MPlugImpl <em>Plug</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MPlugImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getPlug()
	 * @generated
	 */
	int PLUG = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pipe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUG__PIPE = 1;

	/**
	 * The number of structural features of the '<em>Plug</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plug</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MInPlugImpl <em>In Plug</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MInPlugImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getInPlug()
	 * @generated
	 */
	int IN_PLUG = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PLUG__NAME = PLUG__NAME;

	/**
	 * The feature id for the '<em><b>Pipe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PLUG__PIPE = PLUG__PIPE;

	/**
	 * The number of structural features of the '<em>In Plug</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PLUG_FEATURE_COUNT = PLUG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Plug</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PLUG_OPERATION_COUNT = PLUG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MOutPlugImpl <em>Out Plug</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MOutPlugImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getOutPlug()
	 * @generated
	 */
	int OUT_PLUG = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PLUG__NAME = PLUG__NAME;

	/**
	 * The feature id for the '<em><b>Pipe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PLUG__PIPE = PLUG__PIPE;

	/**
	 * The number of structural features of the '<em>Out Plug</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PLUG_FEATURE_COUNT = PLUG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Out Plug</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PLUG_OPERATION_COUNT = PLUG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MPipeImpl <em>Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MPipeImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getPipe()
	 * @generated
	 */
	int PIPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__IN = 3;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__OUT = 4;

	/**
	 * The number of structural features of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.ParcelType <em>Parcel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.ParcelType
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getParcelType()
	 * @generated
	 */
	int PARCEL_TYPE = 15;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.Resource <em>Resource</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.Resource
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 16;


	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MGamerBoard <em>Gamer Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamer Board</em>'.
	 * @see com.bistiboy.agricola.MGamerBoard
	 * @generated
	 */
	EClass getGamerBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link com.bistiboy.agricola.MGamerBoard#getParcels <em>Parcels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parcels</em>'.
	 * @see com.bistiboy.agricola.MGamerBoard#getParcels()
	 * @see #getGamerBoard()
	 * @generated
	 */
	EReference getGamerBoard_Parcels();

	/**
	 * Returns the meta object for the '{@link com.bistiboy.agricola.MGamerBoard#computeScore() <em>Compute Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Score</em>' operation.
	 * @see com.bistiboy.agricola.MGamerBoard#computeScore()
	 * @generated
	 */
	EOperation getGamerBoard__ComputeScore();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MParcel <em>Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcel</em>'.
	 * @see com.bistiboy.agricola.MParcel
	 * @generated
	 */
	EClass getParcel();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MParcel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.bistiboy.agricola.MParcel#getType()
	 * @see #getParcel()
	 * @generated
	 */
	EAttribute getParcel_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MParcel#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.bistiboy.agricola.MParcel#getX()
	 * @see #getParcel()
	 * @generated
	 */
	EAttribute getParcel_X();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MParcel#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.bistiboy.agricola.MParcel#getY()
	 * @see #getParcel()
	 * @generated
	 */
	EAttribute getParcel_Y();

	/**
	 * Returns the meta object for the containment reference '{@link com.bistiboy.agricola.MParcel#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see com.bistiboy.agricola.MParcel#getIn()
	 * @see #getParcel()
	 * @generated
	 */
	EReference getParcel_In();

	/**
	 * Returns the meta object for the containment reference '{@link com.bistiboy.agricola.MParcel#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out</em>'.
	 * @see com.bistiboy.agricola.MParcel#getOut()
	 * @see #getParcel()
	 * @generated
	 */
	EReference getParcel_Out();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MGamer <em>Gamer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamer</em>'.
	 * @see com.bistiboy.agricola.MGamer
	 * @generated
	 */
	EClass getGamer();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MGamer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.bistiboy.agricola.MGamer#getName()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.bistiboy.agricola.MGamer#getGamerboard <em>Gamerboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gamerboard</em>'.
	 * @see com.bistiboy.agricola.MGamer#getGamerboard()
	 * @see #getGamer()
	 * @generated
	 */
	EReference getGamer_Gamerboard();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MAgricola <em>Agricola</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agricola</em>'.
	 * @see com.bistiboy.agricola.MAgricola
	 * @generated
	 */
	EClass getAgricola();

	/**
	 * Returns the meta object for the containment reference list '{@link com.bistiboy.agricola.MAgricola#getGamers <em>Gamers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gamers</em>'.
	 * @see com.bistiboy.agricola.MAgricola#getGamers()
	 * @see #getAgricola()
	 * @generated
	 */
	EReference getAgricola_Gamers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.bistiboy.agricola.MAgricola#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cards</em>'.
	 * @see com.bistiboy.agricola.MAgricola#getCards()
	 * @see #getAgricola()
	 * @generated
	 */
	EReference getAgricola_Cards();

	/**
	 * Returns the meta object for the containment reference '{@link com.bistiboy.agricola.MAgricola#getMainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mainboard</em>'.
	 * @see com.bistiboy.agricola.MAgricola#getMainboard()
	 * @see #getAgricola()
	 * @generated
	 */
	EReference getAgricola_Mainboard();

	/**
	 * Returns the meta object for the '{@link com.bistiboy.agricola.MAgricola#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see com.bistiboy.agricola.MAgricola#start()
	 * @generated
	 */
	EOperation getAgricola__Start();

	/**
	 * Returns the meta object for the '{@link com.bistiboy.agricola.MAgricola#play(com.bistiboy.agricola.MGamer) <em>Play</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play</em>' operation.
	 * @see com.bistiboy.agricola.MAgricola#play(com.bistiboy.agricola.MGamer)
	 * @generated
	 */
	EOperation getAgricola__Play__MGamer();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MActionCard <em>Action Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Card</em>'.
	 * @see com.bistiboy.agricola.MActionCard
	 * @generated
	 */
	EClass getActionCard();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MActionCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.bistiboy.agricola.MActionCard#getName()
	 * @see #getActionCard()
	 * @generated
	 */
	EAttribute getActionCard_Name();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MSupplierCard <em>Supplier Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier Card</em>'.
	 * @see com.bistiboy.agricola.MSupplierCard
	 * @generated
	 */
	EClass getSupplierCard();

	/**
	 * Returns the meta object for the containment reference '{@link com.bistiboy.agricola.MSupplierCard#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supply</em>'.
	 * @see com.bistiboy.agricola.MSupplierCard#getSupply()
	 * @see #getSupplierCard()
	 * @generated
	 */
	EReference getSupplierCard_Supply();

	/**
	 * Returns the meta object for the containment reference list '{@link com.bistiboy.agricola.MSupplierCard#getBankSupply <em>Bank Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bank Supply</em>'.
	 * @see com.bistiboy.agricola.MSupplierCard#getBankSupply()
	 * @see #getSupplierCard()
	 * @generated
	 */
	EReference getSupplierCard_BankSupply();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MCreationCard <em>Creation Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Card</em>'.
	 * @see com.bistiboy.agricola.MCreationCard
	 * @generated
	 */
	EClass getCreationCard();

	/**
	 * Returns the meta object for the containment reference list '{@link com.bistiboy.agricola.MCreationCard#getCreations <em>Creations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creations</em>'.
	 * @see com.bistiboy.agricola.MCreationCard#getCreations()
	 * @see #getCreationCard()
	 * @generated
	 */
	EReference getCreationCard_Creations();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MCreationCard#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see com.bistiboy.agricola.MCreationCard#isUnique()
	 * @see #getCreationCard()
	 * @generated
	 */
	EAttribute getCreationCard_Unique();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply</em>'.
	 * @see com.bistiboy.agricola.MSupply
	 * @generated
	 */
	EClass getSupply();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MSupply#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.bistiboy.agricola.MSupply#getQuantity()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MSupply#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see com.bistiboy.agricola.MSupply#getResourceType()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_ResourceType();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation</em>'.
	 * @see com.bistiboy.agricola.MCreation
	 * @generated
	 */
	EClass getCreation();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MCreation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.bistiboy.agricola.MCreation#getName()
	 * @see #getCreation()
	 * @generated
	 */
	EAttribute getCreation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.bistiboy.agricola.MCreation#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cost</em>'.
	 * @see com.bistiboy.agricola.MCreation#getCost()
	 * @see #getCreation()
	 * @generated
	 */
	EReference getCreation_Cost();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MMainBoard <em>Main Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Board</em>'.
	 * @see com.bistiboy.agricola.MMainBoard
	 * @generated
	 */
	EClass getMainBoard();

	/**
	 * Returns the meta object for the reference list '{@link com.bistiboy.agricola.MMainBoard#getFixedCards <em>Fixed Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Cards</em>'.
	 * @see com.bistiboy.agricola.MMainBoard#getFixedCards()
	 * @see #getMainBoard()
	 * @generated
	 */
	EReference getMainBoard_FixedCards();

	/**
	 * Returns the meta object for the containment reference list '{@link com.bistiboy.agricola.MMainBoard#getRounds <em>Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rounds</em>'.
	 * @see com.bistiboy.agricola.MMainBoard#getRounds()
	 * @see #getMainBoard()
	 * @generated
	 */
	EReference getMainBoard_Rounds();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MRound <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round</em>'.
	 * @see com.bistiboy.agricola.MRound
	 * @generated
	 */
	EClass getRound();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MRound#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.bistiboy.agricola.MRound#getName()
	 * @see #getRound()
	 * @generated
	 */
	EAttribute getRound_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.bistiboy.agricola.MRound#getActioncard <em>Actioncard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actioncard</em>'.
	 * @see com.bistiboy.agricola.MRound#getActioncard()
	 * @see #getRound()
	 * @generated
	 */
	EReference getRound_Actioncard();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MInPlug <em>In Plug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Plug</em>'.
	 * @see com.bistiboy.agricola.MInPlug
	 * @generated
	 */
	EClass getInPlug();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MPlug <em>Plug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plug</em>'.
	 * @see com.bistiboy.agricola.MPlug
	 * @generated
	 */
	EClass getPlug();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MPlug#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.bistiboy.agricola.MPlug#getName()
	 * @see #getPlug()
	 * @generated
	 */
	EAttribute getPlug_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.bistiboy.agricola.MPlug#getPipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pipe</em>'.
	 * @see com.bistiboy.agricola.MPlug#getPipe()
	 * @see #getPlug()
	 * @generated
	 */
	EReference getPlug_Pipe();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MOutPlug <em>Out Plug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Plug</em>'.
	 * @see com.bistiboy.agricola.MOutPlug
	 * @generated
	 */
	EClass getOutPlug();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MPipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe</em>'.
	 * @see com.bistiboy.agricola.MPipe
	 * @generated
	 */
	EClass getPipe();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MPipe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.bistiboy.agricola.MPipe#getName()
	 * @see #getPipe()
	 * @generated
	 */
	EAttribute getPipe_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MPipe#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.bistiboy.agricola.MPipe#getUnit()
	 * @see #getPipe()
	 * @generated
	 */
	EAttribute getPipe_Unit();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MPipe#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.bistiboy.agricola.MPipe#getValue()
	 * @see #getPipe()
	 * @generated
	 */
	EAttribute getPipe_Value();

	/**
	 * Returns the meta object for the reference '{@link com.bistiboy.agricola.MPipe#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see com.bistiboy.agricola.MPipe#getIn()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_In();

	/**
	 * Returns the meta object for the reference '{@link com.bistiboy.agricola.MPipe#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see com.bistiboy.agricola.MPipe#getOut()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Out();

	/**
	 * Returns the meta object for enum '{@link com.bistiboy.agricola.ParcelType <em>Parcel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parcel Type</em>'.
	 * @see com.bistiboy.agricola.ParcelType
	 * @generated
	 */
	EEnum getParcelType();

	/**
	 * Returns the meta object for enum '{@link com.bistiboy.agricola.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource</em>'.
	 * @see com.bistiboy.agricola.Resource
	 * @generated
	 */
	EEnum getResource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MAgricolaFactory getAgricolaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MGamerBoardImpl <em>Gamer Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MGamerBoardImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getGamerBoard()
		 * @generated
		 */
		EClass GAMER_BOARD = eINSTANCE.getGamerBoard();

		/**
		 * The meta object literal for the '<em><b>Parcels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMER_BOARD__PARCELS = eINSTANCE.getGamerBoard_Parcels();

		/**
		 * The meta object literal for the '<em><b>Compute Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAMER_BOARD___COMPUTE_SCORE = eINSTANCE.getGamerBoard__ComputeScore();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MParcelImpl <em>Parcel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MParcelImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getParcel()
		 * @generated
		 */
		EClass PARCEL = eINSTANCE.getParcel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL__TYPE = eINSTANCE.getParcel_Type();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL__X = eINSTANCE.getParcel_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL__Y = eINSTANCE.getParcel_Y();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL__IN = eINSTANCE.getParcel_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL__OUT = eINSTANCE.getParcel_Out();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MGamerImpl <em>Gamer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MGamerImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getGamer()
		 * @generated
		 */
		EClass GAMER = eINSTANCE.getGamer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMER__NAME = eINSTANCE.getGamer_Name();

		/**
		 * The meta object literal for the '<em><b>Gamerboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMER__GAMERBOARD = eINSTANCE.getGamer_Gamerboard();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MAgricolaImpl <em>Agricola</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MAgricolaImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getAgricola()
		 * @generated
		 */
		EClass AGRICOLA = eINSTANCE.getAgricola();

		/**
		 * The meta object literal for the '<em><b>Gamers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRICOLA__GAMERS = eINSTANCE.getAgricola_Gamers();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRICOLA__CARDS = eINSTANCE.getAgricola_Cards();

		/**
		 * The meta object literal for the '<em><b>Mainboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRICOLA__MAINBOARD = eINSTANCE.getAgricola_Mainboard();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGRICOLA___START = eINSTANCE.getAgricola__Start();

		/**
		 * The meta object literal for the '<em><b>Play</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGRICOLA___PLAY__MGAMER = eINSTANCE.getAgricola__Play__MGamer();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MActionCardImpl <em>Action Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MActionCardImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getActionCard()
		 * @generated
		 */
		EClass ACTION_CARD = eINSTANCE.getActionCard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CARD__NAME = eINSTANCE.getActionCard_Name();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MSupplierCardImpl <em>Supplier Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MSupplierCardImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getSupplierCard()
		 * @generated
		 */
		EClass SUPPLIER_CARD = eINSTANCE.getSupplierCard();

		/**
		 * The meta object literal for the '<em><b>Supply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_CARD__SUPPLY = eINSTANCE.getSupplierCard_Supply();

		/**
		 * The meta object literal for the '<em><b>Bank Supply</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_CARD__BANK_SUPPLY = eINSTANCE.getSupplierCard_BankSupply();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MCreationCardImpl <em>Creation Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MCreationCardImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getCreationCard()
		 * @generated
		 */
		EClass CREATION_CARD = eINSTANCE.getCreationCard();

		/**
		 * The meta object literal for the '<em><b>Creations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATION_CARD__CREATIONS = eINSTANCE.getCreationCard_Creations();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_CARD__UNIQUE = eINSTANCE.getCreationCard_Unique();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MSupplyImpl <em>Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MSupplyImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getSupply()
		 * @generated
		 */
		EClass SUPPLY = eINSTANCE.getSupply();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__QUANTITY = eINSTANCE.getSupply_Quantity();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__RESOURCE_TYPE = eINSTANCE.getSupply_ResourceType();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MCreationImpl <em>Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MCreationImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getCreation()
		 * @generated
		 */
		EClass CREATION = eINSTANCE.getCreation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION__NAME = eINSTANCE.getCreation_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATION__COST = eINSTANCE.getCreation_Cost();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MMainBoardImpl <em>Main Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MMainBoardImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getMainBoard()
		 * @generated
		 */
		EClass MAIN_BOARD = eINSTANCE.getMainBoard();

		/**
		 * The meta object literal for the '<em><b>Fixed Cards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BOARD__FIXED_CARDS = eINSTANCE.getMainBoard_FixedCards();

		/**
		 * The meta object literal for the '<em><b>Rounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BOARD__ROUNDS = eINSTANCE.getMainBoard_Rounds();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MRoundImpl <em>Round</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MRoundImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getRound()
		 * @generated
		 */
		EClass ROUND = eINSTANCE.getRound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND__NAME = eINSTANCE.getRound_Name();

		/**
		 * The meta object literal for the '<em><b>Actioncard</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUND__ACTIONCARD = eINSTANCE.getRound_Actioncard();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MInPlugImpl <em>In Plug</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MInPlugImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getInPlug()
		 * @generated
		 */
		EClass IN_PLUG = eINSTANCE.getInPlug();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MPlugImpl <em>Plug</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MPlugImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getPlug()
		 * @generated
		 */
		EClass PLUG = eINSTANCE.getPlug();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUG__NAME = eINSTANCE.getPlug_Name();

		/**
		 * The meta object literal for the '<em><b>Pipe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUG__PIPE = eINSTANCE.getPlug_Pipe();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MOutPlugImpl <em>Out Plug</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MOutPlugImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getOutPlug()
		 * @generated
		 */
		EClass OUT_PLUG = eINSTANCE.getOutPlug();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MPipeImpl <em>Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MPipeImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getPipe()
		 * @generated
		 */
		EClass PIPE = eINSTANCE.getPipe();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPE__NAME = eINSTANCE.getPipe_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPE__UNIT = eINSTANCE.getPipe_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPE__VALUE = eINSTANCE.getPipe_Value();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__IN = eINSTANCE.getPipe_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__OUT = eINSTANCE.getPipe_Out();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.ParcelType <em>Parcel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.ParcelType
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getParcelType()
		 * @generated
		 */
		EEnum PARCEL_TYPE = eINSTANCE.getParcelType();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.Resource <em>Resource</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.Resource
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getResource()
		 * @generated
		 */
		EEnum RESOURCE = eINSTANCE.getResource();

	}

} //MAgricolaPackage

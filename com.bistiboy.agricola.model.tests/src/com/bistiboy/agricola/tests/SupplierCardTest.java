/**
 */
package com.bistiboy.agricola.tests;

import com.bistiboy.agricola.MAgricolaFactory;
import com.bistiboy.agricola.SupplierCard;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Supplier Card</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SupplierCardTest extends ActionCardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SupplierCardTest.class);
	}

	/**
	 * Constructs a new Supplier Card test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierCardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Supplier Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SupplierCard getFixture() {
		return (SupplierCard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MAgricolaFactory.eINSTANCE.createSupplierCard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SupplierCardTest

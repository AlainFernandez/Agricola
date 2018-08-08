/**
 */
package com.bistiboy.agricola.tests;

import com.bistiboy.agricola.CreationCard;
import com.bistiboy.agricola.MAgricolaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Creation Card</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreationCardTest extends ActionCardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreationCardTest.class);
	}

	/**
	 * Constructs a new Creation Card test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationCardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Creation Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreationCard getFixture() {
		return (CreationCard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MAgricolaFactory.eINSTANCE.createCreationCard());
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

} //CreationCardTest

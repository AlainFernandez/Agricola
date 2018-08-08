/**
 */
package com.bistiboy.agricola.tests;

import com.bistiboy.agricola.MAgricolaFactory;
import com.bistiboy.agricola.Plug;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plug</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlugTest extends TestCase {

	/**
	 * The fixture for this Plug test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Plug fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlugTest.class);
	}

	/**
	 * Constructs a new Plug test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlugTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Plug test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Plug fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Plug test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Plug getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MAgricolaFactory.eINSTANCE.createPlug());
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

} //PlugTest

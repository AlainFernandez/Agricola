/**
 */
package com.bistiboy.agricola.tests;

import com.bistiboy.agricola.MAgricolaFactory;
import com.bistiboy.agricola.OutPlug;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Out Plug</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutPlugTest extends PlugTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutPlugTest.class);
	}

	/**
	 * Constructs a new Out Plug test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPlugTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Out Plug test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutPlug getFixture() {
		return (OutPlug)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MAgricolaFactory.eINSTANCE.createOutPlug());
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

} //OutPlugTest

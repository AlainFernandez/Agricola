/**
 */
package com.bistiboy.agricola.tests;

import com.bistiboy.agricola.InPlug;
import com.bistiboy.agricola.MAgricolaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>In Plug</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InPlugTest extends PlugTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InPlugTest.class);
	}

	/**
	 * Constructs a new In Plug test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPlugTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this In Plug test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InPlug getFixture() {
		return (InPlug)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MAgricolaFactory.eINSTANCE.createInPlug());
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

} //InPlugTest

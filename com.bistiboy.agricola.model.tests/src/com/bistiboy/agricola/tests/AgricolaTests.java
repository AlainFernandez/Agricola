/**
 */
package com.bistiboy.agricola.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>agricola</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgricolaTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AgricolaTests("agricola Tests");
		suite.addTestSuite(GamerBoardTest.class);
		suite.addTestSuite(AgricolaTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgricolaTests(String name) {
		super(name);
	}

} //AgricolaTests

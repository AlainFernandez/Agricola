/**
 */
package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.Gamer;
import com.bistiboy.agricola.GamerBoard;
import com.bistiboy.agricola.MAgricolaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gamer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.impl.MGamerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.bistiboy.agricola.impl.MGamerImpl#getGamerboard <em>Gamerboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MGamerImpl extends MinimalEObjectImpl.Container implements Gamer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGamerboard() <em>Gamerboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamerboard()
	 * @generated
	 * @ordered
	 */
	protected GamerBoard gamerboard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGamerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MAgricolaPackage.Literals.GAMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MAgricolaPackage.GAMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamerBoard getGamerboard() {
		return gamerboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGamerboard(GamerBoard newGamerboard, NotificationChain msgs) {
		GamerBoard oldGamerboard = gamerboard;
		gamerboard = newGamerboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MAgricolaPackage.GAMER__GAMERBOARD, oldGamerboard, newGamerboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamerboard(GamerBoard newGamerboard) {
		if (newGamerboard != gamerboard) {
			NotificationChain msgs = null;
			if (gamerboard != null)
				msgs = ((InternalEObject)gamerboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MAgricolaPackage.GAMER__GAMERBOARD, null, msgs);
			if (newGamerboard != null)
				msgs = ((InternalEObject)newGamerboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MAgricolaPackage.GAMER__GAMERBOARD, null, msgs);
			msgs = basicSetGamerboard(newGamerboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MAgricolaPackage.GAMER__GAMERBOARD, newGamerboard, newGamerboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MAgricolaPackage.GAMER__GAMERBOARD:
				return basicSetGamerboard(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MAgricolaPackage.GAMER__NAME:
				return getName();
			case MAgricolaPackage.GAMER__GAMERBOARD:
				return getGamerboard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MAgricolaPackage.GAMER__NAME:
				setName((String)newValue);
				return;
			case MAgricolaPackage.GAMER__GAMERBOARD:
				setGamerboard((GamerBoard)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MAgricolaPackage.GAMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MAgricolaPackage.GAMER__GAMERBOARD:
				setGamerboard((GamerBoard)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MAgricolaPackage.GAMER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MAgricolaPackage.GAMER__GAMERBOARD:
				return gamerboard != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MGamerImpl

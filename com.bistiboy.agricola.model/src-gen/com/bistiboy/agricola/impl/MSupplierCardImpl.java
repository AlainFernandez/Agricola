/**
 */
package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.MAgricolaPackage;
import com.bistiboy.agricola.SupplierCard;
import com.bistiboy.agricola.Supply;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.impl.MSupplierCardImpl#getSupply <em>Supply</em>}</li>
 *   <li>{@link com.bistiboy.agricola.impl.MSupplierCardImpl#getBankSupply <em>Bank Supply</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSupplierCardImpl extends ActionCardImpl implements SupplierCard {
	/**
	 * The cached value of the '{@link #getSupply() <em>Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply()
	 * @generated
	 * @ordered
	 */
	protected Supply supply;

	/**
	 * The cached value of the '{@link #getBankSupply() <em>Bank Supply</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankSupply()
	 * @generated
	 * @ordered
	 */
	protected EList<Supply> bankSupply;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSupplierCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MAgricolaPackage.Literals.SUPPLIER_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply getSupply() {
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupply(Supply newSupply, NotificationChain msgs) {
		Supply oldSupply = supply;
		supply = newSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MAgricolaPackage.SUPPLIER_CARD__SUPPLY, oldSupply, newSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply(Supply newSupply) {
		if (newSupply != supply) {
			NotificationChain msgs = null;
			if (supply != null)
				msgs = ((InternalEObject)supply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MAgricolaPackage.SUPPLIER_CARD__SUPPLY, null, msgs);
			if (newSupply != null)
				msgs = ((InternalEObject)newSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MAgricolaPackage.SUPPLIER_CARD__SUPPLY, null, msgs);
			msgs = basicSetSupply(newSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MAgricolaPackage.SUPPLIER_CARD__SUPPLY, newSupply, newSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supply> getBankSupply() {
		if (bankSupply == null) {
			bankSupply = new EObjectContainmentEList<Supply>(Supply.class, this, MAgricolaPackage.SUPPLIER_CARD__BANK_SUPPLY);
		}
		return bankSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MAgricolaPackage.SUPPLIER_CARD__SUPPLY:
				return basicSetSupply(null, msgs);
			case MAgricolaPackage.SUPPLIER_CARD__BANK_SUPPLY:
				return ((InternalEList<?>)getBankSupply()).basicRemove(otherEnd, msgs);
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
			case MAgricolaPackage.SUPPLIER_CARD__SUPPLY:
				return getSupply();
			case MAgricolaPackage.SUPPLIER_CARD__BANK_SUPPLY:
				return getBankSupply();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MAgricolaPackage.SUPPLIER_CARD__SUPPLY:
				setSupply((Supply)newValue);
				return;
			case MAgricolaPackage.SUPPLIER_CARD__BANK_SUPPLY:
				getBankSupply().clear();
				getBankSupply().addAll((Collection<? extends Supply>)newValue);
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
			case MAgricolaPackage.SUPPLIER_CARD__SUPPLY:
				setSupply((Supply)null);
				return;
			case MAgricolaPackage.SUPPLIER_CARD__BANK_SUPPLY:
				getBankSupply().clear();
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
			case MAgricolaPackage.SUPPLIER_CARD__SUPPLY:
				return supply != null;
			case MAgricolaPackage.SUPPLIER_CARD__BANK_SUPPLY:
				return bankSupply != null && !bankSupply.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MSupplierCardImpl

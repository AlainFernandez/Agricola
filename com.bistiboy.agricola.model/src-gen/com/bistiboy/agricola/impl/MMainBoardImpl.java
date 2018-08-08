/**
 */
package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.ActionCard;
import com.bistiboy.agricola.MAgricolaPackage;
import com.bistiboy.agricola.MainBoard;
import com.bistiboy.agricola.Round;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.impl.MMainBoardImpl#getFixedCards <em>Fixed Cards</em>}</li>
 *   <li>{@link com.bistiboy.agricola.impl.MMainBoardImpl#getRounds <em>Rounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMainBoardImpl extends MinimalEObjectImpl.Container implements MainBoard {
	/**
	 * The cached value of the '{@link #getFixedCards() <em>Fixed Cards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCards()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionCard> fixedCards;

	/**
	 * The cached value of the '{@link #getRounds() <em>Rounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounds()
	 * @generated
	 * @ordered
	 */
	protected EList<Round> rounds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMainBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MAgricolaPackage.Literals.MAIN_BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionCard> getFixedCards() {
		if (fixedCards == null) {
			fixedCards = new EObjectResolvingEList<ActionCard>(ActionCard.class, this, MAgricolaPackage.MAIN_BOARD__FIXED_CARDS);
		}
		return fixedCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Round> getRounds() {
		if (rounds == null) {
			rounds = new EObjectContainmentEList<Round>(Round.class, this, MAgricolaPackage.MAIN_BOARD__ROUNDS);
		}
		return rounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MAgricolaPackage.MAIN_BOARD__ROUNDS:
				return ((InternalEList<?>)getRounds()).basicRemove(otherEnd, msgs);
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
			case MAgricolaPackage.MAIN_BOARD__FIXED_CARDS:
				return getFixedCards();
			case MAgricolaPackage.MAIN_BOARD__ROUNDS:
				return getRounds();
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
			case MAgricolaPackage.MAIN_BOARD__FIXED_CARDS:
				getFixedCards().clear();
				getFixedCards().addAll((Collection<? extends ActionCard>)newValue);
				return;
			case MAgricolaPackage.MAIN_BOARD__ROUNDS:
				getRounds().clear();
				getRounds().addAll((Collection<? extends Round>)newValue);
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
			case MAgricolaPackage.MAIN_BOARD__FIXED_CARDS:
				getFixedCards().clear();
				return;
			case MAgricolaPackage.MAIN_BOARD__ROUNDS:
				getRounds().clear();
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
			case MAgricolaPackage.MAIN_BOARD__FIXED_CARDS:
				return fixedCards != null && !fixedCards.isEmpty();
			case MAgricolaPackage.MAIN_BOARD__ROUNDS:
				return rounds != null && !rounds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MMainBoardImpl

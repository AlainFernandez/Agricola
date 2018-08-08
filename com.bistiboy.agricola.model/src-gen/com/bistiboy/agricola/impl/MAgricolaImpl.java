/**
 */
package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.ActionCard;
import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.Gamer;
import com.bistiboy.agricola.MAgricolaPackage;
import com.bistiboy.agricola.MainBoard;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agricola</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.bistiboy.agricola.impl.MAgricolaImpl#getGamers <em>Gamers</em>}</li>
 *   <li>{@link com.bistiboy.agricola.impl.MAgricolaImpl#getCards <em>Cards</em>}</li>
 *   <li>{@link com.bistiboy.agricola.impl.MAgricolaImpl#getMainboard <em>Mainboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAgricolaImpl extends MinimalEObjectImpl.Container implements Agricola {
	/**
	 * The cached value of the '{@link #getGamers() <em>Gamers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamers()
	 * @generated
	 * @ordered
	 */
	protected EList<Gamer> gamers;

	/**
	 * The cached value of the '{@link #getCards() <em>Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCards()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionCard> cards;

	/**
	 * The cached value of the '{@link #getMainboard() <em>Mainboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainboard()
	 * @generated
	 * @ordered
	 */
	protected MainBoard mainboard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAgricolaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MAgricolaPackage.Literals.AGRICOLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gamer> getGamers() {
		if (gamers == null) {
			gamers = new EObjectContainmentEList<Gamer>(Gamer.class, this, MAgricolaPackage.AGRICOLA__GAMERS);
		}
		return gamers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionCard> getCards() {
		if (cards == null) {
			cards = new EObjectContainmentEList<ActionCard>(ActionCard.class, this, MAgricolaPackage.AGRICOLA__CARDS);
		}
		return cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBoard getMainboard() {
		return mainboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainboard(MainBoard newMainboard, NotificationChain msgs) {
		MainBoard oldMainboard = mainboard;
		mainboard = newMainboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MAgricolaPackage.AGRICOLA__MAINBOARD, oldMainboard, newMainboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainboard(MainBoard newMainboard) {
		if (newMainboard != mainboard) {
			NotificationChain msgs = null;
			if (mainboard != null)
				msgs = ((InternalEObject)mainboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MAgricolaPackage.AGRICOLA__MAINBOARD, null, msgs);
			if (newMainboard != null)
				msgs = ((InternalEObject)newMainboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MAgricolaPackage.AGRICOLA__MAINBOARD, null, msgs);
			msgs = basicSetMainboard(newMainboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MAgricolaPackage.AGRICOLA__MAINBOARD, newMainboard, newMainboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void play(Gamer g) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MAgricolaPackage.AGRICOLA__GAMERS:
				return ((InternalEList<?>)getGamers()).basicRemove(otherEnd, msgs);
			case MAgricolaPackage.AGRICOLA__CARDS:
				return ((InternalEList<?>)getCards()).basicRemove(otherEnd, msgs);
			case MAgricolaPackage.AGRICOLA__MAINBOARD:
				return basicSetMainboard(null, msgs);
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
			case MAgricolaPackage.AGRICOLA__GAMERS:
				return getGamers();
			case MAgricolaPackage.AGRICOLA__CARDS:
				return getCards();
			case MAgricolaPackage.AGRICOLA__MAINBOARD:
				return getMainboard();
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
			case MAgricolaPackage.AGRICOLA__GAMERS:
				getGamers().clear();
				getGamers().addAll((Collection<? extends Gamer>)newValue);
				return;
			case MAgricolaPackage.AGRICOLA__CARDS:
				getCards().clear();
				getCards().addAll((Collection<? extends ActionCard>)newValue);
				return;
			case MAgricolaPackage.AGRICOLA__MAINBOARD:
				setMainboard((MainBoard)newValue);
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
			case MAgricolaPackage.AGRICOLA__GAMERS:
				getGamers().clear();
				return;
			case MAgricolaPackage.AGRICOLA__CARDS:
				getCards().clear();
				return;
			case MAgricolaPackage.AGRICOLA__MAINBOARD:
				setMainboard((MainBoard)null);
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
			case MAgricolaPackage.AGRICOLA__GAMERS:
				return gamers != null && !gamers.isEmpty();
			case MAgricolaPackage.AGRICOLA__CARDS:
				return cards != null && !cards.isEmpty();
			case MAgricolaPackage.AGRICOLA__MAINBOARD:
				return mainboard != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MAgricolaPackage.AGRICOLA___START:
				start();
				return null;
			case MAgricolaPackage.AGRICOLA___PLAY__MGAMER:
				play((Gamer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MAgricolaImpl

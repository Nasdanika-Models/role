/**
 */
package org.nasdanika.models.role.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

import org.nasdanika.models.role.Actor;
import org.nasdanika.models.role.RolePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActorImpl extends NamedPeriodImpl implements Actor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RolePackage.Literals.ACTOR;
	}

} //ActorImpl

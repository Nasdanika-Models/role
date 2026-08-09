/**
 */
package org.nasdanika.models.role;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.role.ActorDomain#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.role.RolePackage#getActorDomain()
 * @model
 * @generated
 */
public interface ActorDomain extends NamedElement, AbstractActor {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.role.AbstractActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see org.nasdanika.models.role.RolePackage#getActorDomain_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractActor> getActors();

} // ActorDomain

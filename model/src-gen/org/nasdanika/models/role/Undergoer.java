/**
 */
package org.nasdanika.models.role;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undergoer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.role.Undergoer#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.role.RolePackage#getUndergoer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Undergoer extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.role.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.role.RolePackage#getUndergoer_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Undergoer

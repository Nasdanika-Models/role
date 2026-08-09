/**
 */
package org.nasdanika.models.role;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedPeriod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.role.Role#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.role.RolePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedPeriod {
	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.role.RoleAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see org.nasdanika.models.role.RolePackage#getRole_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleAssignment> getAssignments();

} // Role

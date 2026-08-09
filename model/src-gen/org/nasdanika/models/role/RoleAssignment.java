/**
 */
package org.nasdanika.models.role;

import org.nasdanika.models.nxcore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.role.RoleAssignment#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.role.RoleAssignment#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.role.RolePackage#getRoleAssignment()
 * @model
 * @generated
 */
public interface RoleAssignment extends Period {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.models.role.RolePackage#getRoleAssignment_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.role.RoleAssignment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference.
	 * @see #setActors(AbstractActor)
	 * @see org.nasdanika.models.role.RolePackage#getRoleAssignment_Actors()
	 * @model containment="true"
	 * @generated
	 */
	AbstractActor getActors();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.role.RoleAssignment#getActors <em>Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actors</em>' containment reference.
	 * @see #getActors()
	 * @generated
	 */
	void setActors(AbstractActor value);

} // RoleAssignment

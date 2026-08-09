import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.role.capability.RoleEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.role {
	
	exports org.nasdanika.models.role;
	exports org.nasdanika.models.role.impl;
	exports org.nasdanika.models.role.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.nxcore;
	
	
	provides CapabilityFactory with 
		RoleEPackageResourceSetCapabilityFactory;
	
}
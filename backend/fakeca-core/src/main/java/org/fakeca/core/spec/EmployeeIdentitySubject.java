package org.fakeca.core.spec;

import org.fakeca.core.GeographicAddress;

import java.util.Set;


public final class EmployeeIdentitySubject extends PersonalIdentitySubject {

    public EmployeeIdentitySubject(PersonName personName, GeographicAddress address, String telephone, String email, String username, OrganizationBinding organizationBinding) {
        super(personName, address, telephone, Set.of(email), Set.of(username), organizationBinding);
    }


}

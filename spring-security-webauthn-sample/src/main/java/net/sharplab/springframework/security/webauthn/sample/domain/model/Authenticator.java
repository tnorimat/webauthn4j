package net.sharplab.springframework.security.webauthn.sample.domain.model;

import lombok.Data;
import com.webauthn4j.webauthn.attestation.authenticator.WebAuthnAttestedCredentialData;
import com.webauthn4j.webauthn.attestation.statement.WebAuthnAttestationStatement;
import net.sharplab.springframework.security.webauthn.authenticator.WebAuthnAuthenticator;


/**
 * Authenticator
 */
@Data
public class Authenticator implements WebAuthnAuthenticator {

    //~ Instance fields ================================================================================================
    private Integer id;
    private String name;
    private User user;
    private byte[] rpIdHash;
    private long counter;
    private WebAuthnAttestedCredentialData attestationData;
    private WebAuthnAttestationStatement attestationStatement;

    /**
     * Constructor
     */
    public Authenticator() {
        //nop
    }

    /**
     * Constructor
     *
     * @param name authenticator's friendly name
     */
    public Authenticator(String name) {
        this.setName(name);
    }

    @Override
    public String getFormat() {
        return attestationStatement.getFormat();
    }
}
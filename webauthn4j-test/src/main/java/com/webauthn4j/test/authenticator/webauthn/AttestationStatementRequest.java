/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webauthn4j.test.authenticator.webauthn;

import java.security.KeyPair;

public class AttestationStatementRequest {

    private byte[] signedData;
    private KeyPair credentialKeyPair;
    private byte[] clientDataHash;

    public AttestationStatementRequest(byte[] signedData, KeyPair credentialKeyPair, byte[] clientDataHash) {
        this.signedData = signedData;
        this.credentialKeyPair = credentialKeyPair;
        this.clientDataHash = clientDataHash;
    }

    public byte[] getSignedData() {
        return signedData;
    }

    public KeyPair getCredentialKeyPair() {
        return credentialKeyPair;
    }

    public byte[] getClientDataHash() {
        return clientDataHash;
    }
}

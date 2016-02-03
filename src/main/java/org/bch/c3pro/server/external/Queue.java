package org.bch.c3pro.server.external;

import org.bch.c3pro.server.exception.C3PROException;

import java.security.PublicKey;

/**
 * Created by CH176656 on 5/4/2015.
 */
public interface Queue {
    public void sendMessage(String resource) throws C3PROException;
    public void sendMessageEncrypted(String resource, PublicKey key, String UUIDKey, String version)
            throws C3PROException;
    public void sendMessageAlreadyEncrypted(String resource, String key, String UUIDKey, String version)
            throws C3PROException;
}

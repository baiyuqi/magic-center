package com.idhub.magic.clientlib.interfaces;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;

public interface CredentialProvider {
	Credentials getByAddress(String address);
	Credentials getDefaultCredentials();
	Credentials getRecoverCredentials();
	Web3j web3j();
}

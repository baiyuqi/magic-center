package com.idhub.magic.clientlib.test;

import com.idhub.magic.clientlib.ApiFactory;
import com.idhub.magic.clientlib.ProviderFactory;
import com.idhub.magic.clientlib.interfaces.Identity;


public class ClientTest {

	public static void main(String[] args) {
		String addr = ProviderFactory.getProvider().getDefaultCredentials().getAddress();
		long ein = ApiFactory.getIdentityChainViewer().getEIN(addr);
		System.out.println(ein);
		Identity dd = ApiFactory.getIdentityChainViewer().getIdentity(1l);
		System.out.println(dd.getRecoveryAddress());
	}

}

package com.idhub.magic.clientlib;

import com.idhub.magic.clientlib.delegatiton.IdentityChainDelegate;
import com.idhub.magic.clientlib.interfaces.ArchiveStorage;
import com.idhub.magic.clientlib.interfaces.IdentityChain;
import com.idhub.magic.clientlib.interfaces.IdentityChainViewer;
import com.idhub.magic.clientlib.local.IdentityChainLocal;

public class ApiFactory {
	static IdentityChainLocal local = new IdentityChainLocal();
	static IdentityChain delegation = new IdentityChainDelegate();
	static ArchiveStorage archiveStorage;
	public static ArchiveStorage getArchiveStorage() {
		return archiveStorage;
	}
	static public IdentityChain getIdentityChainLocal() {
		return local;
	}
	static public IdentityChainViewer getIdentityChainViewer() {
		return local;
	}
	static public IdentityChain getIdentityChainDelegate() {
		return delegation;
	}
}

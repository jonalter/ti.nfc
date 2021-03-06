/**
 * Appcelerator NFC module
 * Copyright (c) 2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */

package ti.nfc.api;

import android.net.Uri;
import android.nfc.NdefRecord;

public class NdefRecordApi10 extends NdefRecordApi {

	@Override
	public NdefRecord createApplication(String packageName) {
		return NdefRecordSupport.createApplicationRecord(packageName);
	}

	@Override
	public NdefRecord createUri(Uri uri) {
		return NdefRecordSupport.createUri(uri);
	}

	@Override
	public NdefRecord createMime(String mimeType, byte[] mimeData) {
		return NdefRecordSupport.createMime(mimeType, mimeData);
	}

	@Override
	public NdefRecord createExternal(String domain, String type, byte[] data) {
		return NdefRecordSupport.createExternal(domain, type, data);
	}
}

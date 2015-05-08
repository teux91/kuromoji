/**
 * Copyright 2010-2013 Atilika Inc. and contributors (see CONTRIBUTORS.md)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  A copy of the
 * License is distributed with this work in the LICENSE.md file.  You may
 * also obtain a copy of the License from
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.atilika.kuromoji.util;

import com.atilika.kuromoji.trie.DoubleArrayTrie;
import com.atilika.kuromoji.trie.Trie;

import java.util.List;

public class DoubleArrayTrieBuilder {

	public static DoubleArrayTrie build(List<String> surfaces, boolean compactTries) {
		Trie tempTrie = buildTrie(surfaces);
		DoubleArrayTrie daTrie = new DoubleArrayTrie(compactTries);
		daTrie.build(tempTrie);
		return daTrie;
	}
	
	public static Trie buildTrie(List<String> surfaces) {
		Trie trie = new Trie();
		for (String surface : surfaces) {
			trie.add(surface);
		}
		return trie;
	}
}

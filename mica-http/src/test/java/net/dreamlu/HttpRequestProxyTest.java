/*
 * Copyright (c) 2019-2029, Dreamlu (596392912@qq.com & www.dreamlu.net).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dreamlu;

import net.dreamlu.mica.http.HttpRequest;
import org.junit.Test;

import java.io.IOException;

public class HttpRequestProxyTest {

	@Test(expected = IOException.class)
	public void test1() {
		// 代理都不可用
		HttpRequest.get("https://www.baidu.com")
			.retry()
			.proxySelector(new MicaProxySelector())
			.execute()
			.asString();
	}
}

/*
 * Copyright open knowledge GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 *
 * This package contains a CdiTestRunner for junit 4 that enables
 * CDI injection for unit tests. As of today it assumes  Apache Open Webbeans
 * as runtime. As soon as CDI provides means to programmatically start and
 * stop the runtime this dependency will be removed.
 *
 */
package de.openknowledge.cdi.test;
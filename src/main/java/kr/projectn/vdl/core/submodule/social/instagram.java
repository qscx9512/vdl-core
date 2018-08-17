/**
 * Copyright 2016-2018 qscx9512 <moonrise917@gmail.com>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kr.projectn.vdl.core.submodule.social;

import kr.projectn.vdl.core.Response;
import kr.projectn.vdl.core.frame.SubmoduleFrame;

public class instagram extends SubmoduleFrame {
    public instagram(String url) {
        super(url);
    }


    @Override
    public void parsePage() {

    }

    @Override
    public void retrieveMediaSpec() {

    }

    @Override
    public Response getFinalMediaSpec() {
        return null;
    }
}

/*
 * Copyright 2019 Kirill Rozov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kirich1409.svgimageloaderplugins;

import android.net.Uri;
import android.support.annotation.NonNull;

public enum ImageSource {

    NETWORK_STRING_URL("http://thenewcode.com/assets/images/thumbnails/homer-simpson.svg"),
    NETWORK_URI(Uri.parse("http://thenewcode.com/assets/images/thumbnails/homer-simpson.svg")),
    RAW_RESOURCE(R.raw.bart_simpson),
    ASSETS_URI(Uri.parse("file:///android_asset/marge_simpson.svg")),
    STRING("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n" +
            "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n" +
            "<svg version=\"1.1\" id=\"Capa_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\"\n" +
            "\t width=\"553.048px\" height=\"553.048px\" viewBox=\"0 0 553.048 553.048\" style=\"enable-background:new 0 0 553.048 553.048;\"\n" +
            "\t xml:space=\"preserve\">\n" +
            "<g>\n" +
            "\t<g>\n" +
            "\t\t<path d=\"M76.774,179.141c-9.529,0-17.614,3.323-24.26,9.969c-6.646,6.646-9.97,14.621-9.97,23.929v142.914\n" +
            "\t\t\tc0,9.541,3.323,17.619,9.97,24.266c6.646,6.646,14.731,9.97,24.26,9.97c9.522,0,17.558-3.323,24.101-9.97\n" +
            "\t\t\tc6.53-6.646,9.804-14.725,9.804-24.266V213.039c0-9.309-3.323-17.283-9.97-23.929C94.062,182.464,86.082,179.141,76.774,179.141z\"\n" +
            "\t\t\t/>\n" +
            "\t\t<path d=\"M351.972,50.847L375.57,7.315c1.549-2.882,0.998-5.092-1.658-6.646c-2.883-1.34-5.098-0.661-6.646,1.989l-23.928,43.88\n" +
            "\t\t\tc-21.055-9.309-43.324-13.972-66.807-13.972c-23.488,0-45.759,4.664-66.806,13.972l-23.929-43.88\n" +
            "\t\t\tc-1.555-2.65-3.77-3.323-6.646-1.989c-2.662,1.561-3.213,3.764-1.658,6.646l23.599,43.532\n" +
            "\t\t\tc-23.929,12.203-42.987,29.198-57.167,51.022c-14.18,21.836-21.273,45.698-21.273,71.628h307.426\n" +
            "\t\t\tc0-25.924-7.094-49.787-21.273-71.628C394.623,80.045,375.675,63.05,351.972,50.847z M215.539,114.165\n" +
            "\t\t\tc-2.552,2.558-5.6,3.831-9.143,3.831c-3.55,0-6.536-1.273-8.972-3.831c-2.436-2.546-3.654-5.582-3.654-9.137\n" +
            "\t\t\tc0-3.543,1.218-6.585,3.654-9.137c2.436-2.546,5.429-3.819,8.972-3.819s6.591,1.273,9.143,3.819\n" +
            "\t\t\tc2.546,2.558,3.825,5.594,3.825,9.137C219.357,108.577,218.079,111.619,215.539,114.165z M355.625,114.165\n" +
            "\t\t\tc-2.441,2.558-5.434,3.831-8.971,3.831c-3.551,0-6.598-1.273-9.145-3.831c-2.551-2.546-3.824-5.582-3.824-9.137\n" +
            "\t\t\tc0-3.543,1.273-6.585,3.824-9.137c2.547-2.546,5.594-3.819,9.145-3.819c3.543,0,6.529,1.273,8.971,3.819\n" +
            "\t\t\tc2.438,2.558,3.654,5.594,3.654,9.137C359.279,108.577,358.062,111.619,355.625,114.165z\"/>\n" +
            "\t\t<path d=\"M123.971,406.804c0,10.202,3.543,18.838,10.63,25.925c7.093,7.087,15.729,10.63,25.924,10.63h24.596l0.337,75.454\n" +
            "\t\t\tc0,9.528,3.323,17.619,9.969,24.266s14.627,9.97,23.929,9.97c9.523,0,17.613-3.323,24.26-9.97s9.97-14.737,9.97-24.266v-75.447\n" +
            "\t\t\th45.864v75.447c0,9.528,3.322,17.619,9.969,24.266s14.73,9.97,24.26,9.97c9.523,0,17.613-3.323,24.26-9.97\n" +
            "\t\t\ts9.969-14.737,9.969-24.266v-75.447h24.928c9.969,0,18.494-3.544,25.594-10.631c7.086-7.087,10.631-15.723,10.631-25.924V185.45\n" +
            "\t\t\tH123.971V406.804z\"/>\n" +
            "\t\t<path d=\"M476.275,179.141c-9.309,0-17.283,3.274-23.93,9.804c-6.646,6.542-9.969,14.578-9.969,24.094v142.914\n" +
            "\t\t\tc0,9.541,3.322,17.619,9.969,24.266s14.627,9.97,23.93,9.97c9.523,0,17.613-3.323,24.26-9.97s9.969-14.725,9.969-24.266V213.039\n" +
            "\t\t\tc0-9.517-3.322-17.552-9.969-24.094C493.888,182.415,485.798,179.141,476.275,179.141z\"/>\n" +
            "\t</g>\n" +
            "</g>\n" +
            "</svg>\n");

    private final Object mValue;

    ImageSource(@NonNull Object value) {
        mValue = value;
    }

    @NonNull
    public Object getValue() {
        return mValue;
    }
}

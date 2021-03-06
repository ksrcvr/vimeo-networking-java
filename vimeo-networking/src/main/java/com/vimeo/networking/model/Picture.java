/*
 * Copyright (c) 2015 Vimeo (https://vimeo.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.vimeo.networking.model;

import com.google.gson.annotations.SerializedName;
import com.vimeo.stag.UseStag;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * Created by hanssena on 4/23/15.
 */
@SuppressWarnings("unused")
@UseStag
public class Picture implements Serializable, Entity {

    private static final long serialVersionUID = 5278427992827202066L;

    @SerializedName("width")
    protected int mWidth;

    @SerializedName("height")
    protected int mHeight;

    @SerializedName("link")
    protected String mLink;

    @SerializedName("link_with_play_button")
    protected String mLinkWithPlayButton;

    @Nullable
    @SerializedName("resource_key")
    private String mResourceKey;

    @Nullable
    public String getResourceKey() {
        return mResourceKey;
    }

    protected void setResourceKey(@Nullable String resourceKey) {
        mResourceKey = resourceKey;
    }

    public int getWidth() {
        return mWidth;
    }

    public int getHeight() {
        return mHeight;
    }

    public String getLink() {
        return mLink;
    }

    public String getLinkWithPlayButton() {
        return mLinkWithPlayButton;
    }

    @Nullable
    @Override
    public String getIdentifier() {
        return mResourceKey;
    }
}

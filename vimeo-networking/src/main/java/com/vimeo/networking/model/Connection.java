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
import java.util.ArrayList;

/**
 * This model object represents a Connection.
 * Created by hanssena on 4/23/15.
 */
@SuppressWarnings("unused")
@UseStag
public class Connection implements Serializable {

    private static final long serialVersionUID = -840088720891343176L;

    @Nullable
    @SerializedName("uri")
    private String mUri;

    @Nullable
    @SerializedName("options")
    private ArrayList<String> mOptions;

    @SerializedName("total")
    private int mTotal;

    @SerializedName("main_total")
    private int mMainTotal;

    @SerializedName("extra_total")
    private int mExtraTotal;

    @SerializedName("viewable_total")
    private int mViewableTotal;

    @Nullable
    @SerializedName("name")
    private String mName;

    // -----------------------------------------------------------------------------------------------------
    // Getters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters">
    @Nullable
    public String getUri() {
        return mUri;
    }

    @Nullable
    public ArrayList<String> getOptions() {
        return mOptions;
    }

    public int getTotal() {
        return mTotal;
    }

    public int getMainTotal() {
        return mMainTotal;
    }

    public int getExtraTotal() {
        return mExtraTotal;
    }

    public int getViewableTotal() {
        return mViewableTotal;
    }

    @Nullable
    public String getName() {
        return mName;
    }
    // </editor-fold>


    public void setTotal(int total) {
        mTotal = total;
    }

    public void setUri(@Nullable String uri) {
        mUri = uri;
    }

    public void setOptions(@Nullable ArrayList<String> options) {
        mOptions = options;
    }

    public void setMainTotal(int mainTotal) {
        mMainTotal = mainTotal;
    }

    public void setExtraTotal(int extraTotal) {
        mExtraTotal = extraTotal;
    }

    public void setViewableTotal(int viewableTotal) {
        mViewableTotal = viewableTotal;
    }

    public void setName(@Nullable String name) {
        mName = name;
    }
}

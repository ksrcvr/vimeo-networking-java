/*
 * Copyright (c) 2017 Vimeo (https://vimeo.com)
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

package com.vimeo.networking.model.notifications;

import com.google.gson.annotations.SerializedName;
import com.vimeo.stag.UseStag;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Date;

/**
 * A representation of the {@link Subscriptions} that a user has.
 *
 * @see Subscriptions
 * <p>
 * Created by zetterstromk on 12/15/16.
 */
@SuppressWarnings("unused")
@UseStag
public class SubscriptionCollection implements Serializable {

    private static final long serialVersionUID = 2411419059914710417L;

    @Nullable
    @SerializedName("uri")
    private String mUri;

    @Nullable
    @SerializedName("modified_time")
    private Date mModifiedTime;

    @Nullable
    @SerializedName("subscriptions")
    private Subscriptions mSubscriptions;

    @Nullable
    public String getUri() {
        return mUri;
    }

    public void setUri(@Nullable String uri) {
        mUri = uri;
    }

    @Nullable
    public Date getModifiedTime() {
        return mModifiedTime;
    }

    public void setModifiedTime(@Nullable Date modifiedTime) {
        mModifiedTime = modifiedTime;
    }

    @Nullable
    public Subscriptions getSubscriptions() {
        return mSubscriptions;
    }

    public void setSubscriptions(@Nullable Subscriptions subscriptions) {
        mSubscriptions = subscriptions;
    }
}

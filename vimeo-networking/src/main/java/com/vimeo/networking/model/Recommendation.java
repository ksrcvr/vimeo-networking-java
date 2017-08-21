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

package com.vimeo.networking.model;

import com.google.gson.annotations.SerializedName;
import com.vimeo.stag.UseStag;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * A model that contains recommendations for a User to follow.
 * A recommendation can either be a {@link User} or {@link Channel}
 * <p>
 * Created by zetterstromk on 8/15/16.
 */
@SuppressWarnings("unused")
@UseStag
public class Recommendation implements Serializable {

    private static final long serialVersionUID = 6967333008727998573L;

    static final String TYPE_CHANNEL = "channel";
    static final String TYPE_USER = "user";

    @SuppressWarnings("WeakerAccess")
    public enum RecommendationType {
        NONE,
        CHANNEL,
        USER
    }

    /**
     * Null if not recommended by a category
     */
    @Nullable
    @SerializedName("category")
    private Category mCategory;

    @Nullable
    @SerializedName("type")
    private String mRecommendationType;

    /**
     * Null if type is not user
     */
    @Nullable
    @SerializedName("user")
    private User mUser;

    /**
     * Null if type is not channel
     */
    @Nullable
    @SerializedName("channel")
    private Channel mChannel;

    @Nullable
    @SerializedName("description")
    private String mDescription;

    @Nullable
    @SerializedName("resource_key")
    private String mResourceKey;

    // -----------------------------------------------------------------------------------------------------
    // Getters and Setters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters and Setters">
    @Nullable
    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(@Nullable Category category) {
        mCategory = category;
    }

    @Nullable
    public User getUser() {
        return mUser;
    }

    public void setUser(@Nullable User user) {
        mUser = user;
    }

    @Nullable
    public Channel getChannel() {
        return mChannel;
    }

    public void setChannel(@Nullable Channel channel) {
        mChannel = channel;
    }

    @Nullable
    public String getDescription() {
        return mDescription;
    }

    public void setDescription(@Nullable String description) {
        mDescription = description;
    }

    @Nullable
    public String getResourceKey() {
        return mResourceKey;
    }

    public void setResourceKey(@Nullable String resourceKey) {
        mResourceKey = resourceKey;
    }

    @NotNull
    public RecommendationType getRecommendationType() {
        if (TYPE_CHANNEL.equals(mRecommendationType)) {
            return RecommendationType.CHANNEL;
        } else if (TYPE_USER.equals(mRecommendationType)) {
            return RecommendationType.USER;
        } else {
            return RecommendationType.NONE;
        }
    }

    public void setRecommendationType(@Nullable String recommendationType) {
        mRecommendationType = recommendationType;
    }
    // </editor-fold>
}

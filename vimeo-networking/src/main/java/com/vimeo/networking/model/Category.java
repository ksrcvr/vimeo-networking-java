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
 * Created by zetterstromk on 8/20/15.
 */
@SuppressWarnings("unused")
@UseStag
public class Category implements Serializable, Followable {

    private static final long serialVersionUID = -2093166655035824913L;

    @Nullable
    @SerializedName("uri")
    private String mUri;

    @Nullable
    @SerializedName("name")
    private String mName;

    @Nullable
    @SerializedName("link")
    private String mLink;

    @SerializedName("top_level")
    private boolean mTopLevel;

    @Nullable
    @SerializedName("pictures")
    private PictureCollection mPictures;

    @Nullable
    @SerializedName("icon")
    private PictureCollection mIcon;

    @Nullable
    @SerializedName("subcategories")
    private ArrayList<Category> mSubcategories;

    @Nullable
    @SerializedName("parent")
    private Category mParent;

    @Nullable
    @SerializedName("metadata")
    private Metadata mMetadata;

    // -----------------------------------------------------------------------------------------------------
    // Getters and Setters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters and Setters">
    @Nullable
    public String getUri() {
        return mUri;
    }

    public void setUri(@Nullable String uri) {
        mUri = uri;
    }

    @Nullable
    public String getName() {
        return mName;
    }

    public void setName(@Nullable String name) {
        mName = name;
    }

    @Nullable
    public String getLink() {
        return mLink;
    }

    public void setLink(@Nullable String link) {
        mLink = link;
    }

    public boolean isTopLevel() {
        return mTopLevel;
    }

    public void setTopLevel(boolean topLevel) {
        mTopLevel = topLevel;
    }

    @Nullable
    public PictureCollection getPictures() {
        return mPictures;
    }

    public void setPictures(@Nullable PictureCollection pictures) {
        mPictures = pictures;
    }

    @Nullable
    public ArrayList<Category> getSubcategories() {
        return mSubcategories;
    }

    public void setSubcategories(@Nullable ArrayList<Category> subcategories) {
        mSubcategories = subcategories;
    }

    @Nullable
    public Category getParent() {
        return mParent;
    }

    public void setParent(@Nullable Category parent) {
        mParent = parent;
    }

    @Nullable
    public Metadata getMetadata() {
        return mMetadata;
    }

    public void setMetadata(@Nullable Metadata metadata) {
        mMetadata = metadata;
    }

    @Nullable
    public Connection getVideosConnection() {
        if (mMetadata != null && mMetadata.getConnections() != null && mMetadata.getConnections().getVideos() != null) {
            return mMetadata.getConnections().getVideos();
        }
        return null;
    }

    public int getVideoCount() {
        if (getVideosConnection() != null) {
            return getVideosConnection().getTotal();
        }
        return 0;
    }

    @Nullable
    @Override
    public Interaction getFollowInteraction() {
        if (mMetadata != null && mMetadata.getInteractions() != null && mMetadata.getInteractions().getFollow() != null) {
            return mMetadata.getInteractions().getFollow();
        }
        return null;
    }

    @Override
    public boolean canFollow() {
        return getFollowInteraction() != null;
    }

    @Override
    public boolean isFollowing() {
        Interaction interaction = getFollowInteraction();
        return interaction != null && interaction.isAdded();
    }

    @Nullable
    public Connection getUserConnection() {
        if (mMetadata != null && mMetadata.getConnections() != null && mMetadata.getConnections().getUsers() != null) {
            return mMetadata.getConnections().getUsers();
        }
        return null;
    }

    public int getFollowerCount() {
        if (getUserConnection() != null) {
            return getUserConnection().getTotal();
        }
        return 0;
    }

    /**
     * Returns the icon associated with this category, in the form of a {@link PictureCollection}
     */
    @Nullable
    public PictureCollection getIcon() {
        return mIcon;
    }

    public void setIcon(@Nullable PictureCollection icon) {
        mIcon = icon;
    }
    // </editor-fold>

    @Override
    public int hashCode() {
        return this.mUri != null ? this.mUri.hashCode() : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Category that = (Category) o;

        return ((this.mUri != null && that.mUri != null) && this.mUri.equals(that.mUri));
    }
}

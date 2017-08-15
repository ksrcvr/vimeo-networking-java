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
import java.util.Date;

/**
 * Created by zetterstromk on 6/11/15.
 */
@SuppressWarnings("unused")
@UseStag
public class Channel implements Serializable, Followable {

    private static final long serialVersionUID = 3190410523525111858L;

    @SerializedName("uri")
    private String mUri;

    @SerializedName("name")
    private String mName;

    @SerializedName("description")
    private String mDescription;

    @SerializedName("link")
    private String mLink;

    @SerializedName("created_time")
    private Date mCreatedTime;

    @SerializedName("modified_time")
    private Date mModifiedTime;

    @SerializedName("user")
    private User mUser;

    @SerializedName("pictures")
    private PictureCollection mPictures;

    @SerializedName("header")
    private PictureCollection mHeader;

    @SerializedName("privacy")
    private Privacy mPrivacy;

    @SerializedName("metadata")
    private Metadata mMetadata;

    public void setUri(String uri) {
        mUri = uri;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public String getUri() {
        return mUri;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getLink() {
        return mLink;
    }

    public Date getCreatedTime() {
        return mCreatedTime;
    }

    public Date getModifiedTime() {
        return mModifiedTime;
    }

    public User getUser() {
        return mUser;
    }

    public PictureCollection getPictures() {
        return mPictures;
    }

    public PictureCollection getHeader() {
        return mHeader;
    }

    public Privacy getPrivacy() {
        return mPrivacy;
    }

    public Metadata getMetadata() {
        return mMetadata;
    }

    @Nullable
    public Connection getUsersConnection() {
        if (mMetadata != null && mMetadata.getConnections() != null && mMetadata.getConnections().getUsers() != null) {
            return mMetadata.getConnections().getUsers();
        }
        return null;
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

    public int getFollowerCount() {
        if (getUsersConnection() != null) {
            return getUsersConnection().getTotal();
        }
        return 0;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Channel that = (Channel) o;

        return ((this.mUri != null && that.mUri != null) && this.mUri.equals(that.mUri));
    }

    @Override
    public int hashCode() {
        return this.mUri != null ? this.mUri.hashCode() : 0;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public void setCreatedTime(Date createdTime) {
        mCreatedTime = createdTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        mModifiedTime = modifiedTime;
    }

    public void setPictures(PictureCollection pictures) {
        mPictures = pictures;
    }

    public void setHeader(PictureCollection header) {
        mHeader = header;
    }

    public void setPrivacy(Privacy privacy) {
        mPrivacy = privacy;
    }

    public void setMetadata(Metadata metadata) {
        mMetadata = metadata;
    }
}

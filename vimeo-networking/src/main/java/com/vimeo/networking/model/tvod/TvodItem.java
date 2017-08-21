/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Vimeo
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

package com.vimeo.networking.model.tvod;

import com.google.gson.annotations.SerializedName;
import com.vimeo.networking.model.Connection;
import com.vimeo.networking.model.ConnectionCollection;
import com.vimeo.networking.model.InteractionCollection;
import com.vimeo.networking.model.Metadata;
import com.vimeo.networking.model.PictureCollection;
import com.vimeo.networking.model.User;
import com.vimeo.networking.model.Video;
import com.vimeo.stag.UseStag;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Date;

/**
 * This class represents the model for a Video On Demand (VOD) container
 * Created by rigbergh on 4/25/16.
 */
@SuppressWarnings("unused")
@UseStag
public class TvodItem implements Serializable {

    private static final long serialVersionUID = -5609726371596038290L;
    private static final String S_FILM = "film";
    private static final String S_SERIES = "series";

    @UseStag
    public enum TvodType {
        @SerializedName(S_FILM)
        FILM(S_FILM),
        @SerializedName(S_SERIES)
        SERIES(S_SERIES);

        @NotNull
        private final String mType;

        TvodType(@NotNull String type) {
            mType = type;
        }

        @Override
        public String toString() {
            return mType;
        }
    }

    @Nullable
    @SerializedName("trailer")
    protected Video mTrailer;

    @Nullable
    @SerializedName("name")
    private String mName;

    @Nullable
    @SerializedName("description")
    private String mDescription;

    @Nullable
    @SerializedName("type")
    private TvodType mType;

    @Nullable
    @SerializedName("link")
    private String mLink;

    @Nullable
    @SerializedName("publish")
    private Publish mPublish;

    @Nullable
    @SerializedName("pictures")
    private PictureCollection mPictures;

    @Nullable
    @SerializedName("metadata")
    private Metadata mMetadata;

    @Nullable
    @SerializedName("user")
    private User mUser;

    @Nullable
    @SerializedName("film")
    private Video mFilm;

    // -----------------------------------------------------------------------------------------------------
    // Getters and Setters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters and Setters">
    @Nullable
    public String getName() {
        return mName;
    }

    public void setName(@Nullable String name) {
        mName = name;
    }

    @Nullable
    public String getDescription() {
        return mDescription;
    }

    public void setDescription(@Nullable String description) {
        mDescription = description;
    }

    @Nullable
    public Publish getPublish() {
        return mPublish;
    }

    public void setPublish(@Nullable Publish publish) {
        mPublish = publish;
    }

    @Nullable
    public PictureCollection getPictures() {
        return mPictures;
    }

    public void setPictures(@Nullable PictureCollection pictures) {
        mPictures = pictures;
    }

    @Nullable
    public Metadata getMetadata() {
        return mMetadata;
    }

    public void setMetadata(@Nullable Metadata metadata) {
        mMetadata = metadata;
    }

    @Nullable
    public InteractionCollection getInteractions() {
        return mMetadata != null ? mMetadata.getInteractions() : null;
    }

    @Nullable
    public ConnectionCollection getConnections() {
        return mMetadata != null ? mMetadata.getConnections() : null;
    }

    @Nullable
    public User getUser() {
        return mUser;
    }

    public void setUser(@Nullable User user) {
        mUser = user;
    }

    @Nullable
    public Video getFilm() {
        return mFilm;
    }

    public void setFilm(@Nullable Video film) {
        mFilm = film;
    }

    @Nullable
    public Video getTrailer() {
        return mTrailer;
    }

    public void setTrailer(@Nullable Video trailer) {
        mTrailer = trailer;
    }

    @Nullable
    public String getLink() {
        return mLink;
    }

    public void setLink(@Nullable String link) {
        mLink = link;
    }

    @Nullable
    public TvodType getType() {
        return mType;
    }

    public void setType(@Nullable TvodType type) {
        mType = type;
    }

    public int getViewableVideoCount() {
        Connection videos = getVideosConnection();
        return videos != null ? videos.getViewableTotal() : 0;
    }

    @Nullable
    public String getVideosUri() {
        Connection videos = getVideosConnection();
        return videos != null ? videos.getUri() : null;
    }

    @Nullable
    public Connection getVideosConnection() {
        ConnectionCollection connections = getConnections();
        return connections != null ? connections.getVideos() : null;
    }

    @Nullable
    public Connection getSeasonsConnection() {
        ConnectionCollection connections = getConnections();
        return connections != null ? connections.getSeasons() : null;
    }

    @Nullable
    public String getSeasonsUri() {
        Connection seasons = getSeasonsConnection();
        return seasons != null ? seasons.getUri() : null;
    }
    // </editor-fold>

    @Override
    public int hashCode() {
        return mLink != null ? mLink.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TvodItem)) {
            return false;
        }
        TvodItem that = (TvodItem) obj;

        return (mLink != null && that.getLink() != null) && mLink.equals(that.getLink());
    }

    @UseStag
    public static class Publish implements Serializable {

        private static final long serialVersionUID = -994389241935894370L;

        @Nullable
        @SerializedName("time")
        private Date mTime;

        @Nullable
        public Date getTime() {
            return mTime;
        }

        public void setTime(@Nullable Date time) {
            mTime = time;
        }
    }
}

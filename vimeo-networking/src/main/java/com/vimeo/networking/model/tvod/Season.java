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
import com.vimeo.networking.model.Metadata;
import com.vimeo.networking.model.User;
import com.vimeo.stag.UseStag;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * This model represents a "season" of content. Seasons are logical groupings
 * of videos set up by creators. All TVODs will have a Season, even if it is
 * a feature film - the season would contain the film in this case.
 * <p>
 * Created by zetterstromk on 10/4/16.
 */
@SuppressWarnings("unused")
@UseStag
public class Season implements Serializable {

    private static final long serialVersionUID = 8580165038587916815L;

    private static final String SEASON_TYPE_MAIN = "main";
    private static final String SEASON_TYPE_EXTRAS = "extras";

    @SuppressWarnings("WeakerAccess")
    public enum SeasonType {
        MAIN,
        EXTRAS
    }

    @Nullable
    @SerializedName("uri")
    private String mUri;

    @Nullable
    @SerializedName("name")
    private String mName;

    @Nullable
    @SerializedName("type")
    private String mType;

    @Nullable
    @SerializedName("description")
    private String mDescription;

    @Nullable
    @SerializedName("user")
    private User mUser;

    @SerializedName("position")
    private int mPosition;

    @Nullable
    @SerializedName("metadata")
    private Metadata mMetadata;

    @Nullable
    @SerializedName("resource_key")
    private String mResourceKey;

    // -----------------------------------------------------------------------------------------------------
    // Getters and Setters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters and Setters">

    @Nullable
    public String getType() {
        return mType;
    }

    public void setType(@Nullable String type) {
        mType = type;
    }

    @Nullable
    public String getUri() {
        return mUri;
    }

    public void setUri(@Nullable String uri) {
        mUri = uri;
    }

    /**
     * @return the name of this season
     */
    @Nullable
    public String getName() {
        return mName;
    }

    public void setName(@Nullable String name) {
        mName = name;
    }

    /**
     * Seasons can be either "main" or "extras", and the type
     * is always provided.
     *
     * @return the {@link SeasonType}
     */
    @NotNull
    public SeasonType getSeasonType() {
        if (SEASON_TYPE_EXTRAS.equals(mType)) {
            return SeasonType.EXTRAS;
        }
        return SeasonType.MAIN;
    }

    /**
     * @return the description of this season
     */
    @Nullable
    public String getDescription() {
        return mDescription;
    }

    public void setDescription(@Nullable String description) {
        mDescription = description;
    }

    // </editor-fold>

    // -----------------------------------------------------------------------------------------------------
    // Helpers
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Helpers">

    /**
     * @return the Creator of this content
     */
    @Nullable
    public User getUser() {
        return mUser;
    }

    public void setUser(@Nullable User user) {
        mUser = user;
    }

    /**
     * Seasons are given a position that details the order in which they
     * should be shown. The lower the position, the sooner the content should
     * be made available to show to the consumer.
     *
     * @return the position of the season
     */
    public int getPosition() {
        return mPosition;
    }
    // </editor-fold>

    public void setPosition(int position) {
        mPosition = position;
    }

    /**
     * There will be a ConnectionCollection object holding a "videos" connection
     * for this season, as well as an InteractionCollection holding
     * possible purchase data
     *
     * @return the {@link Metadata}
     */
    @Nullable
    public Metadata getMetadata() {
        return mMetadata;
    }

    public void setMetadata(@Nullable Metadata metadata) {
        mMetadata = metadata;
    }

    @Nullable
    public String getResourceKey() {
        return mResourceKey;
    }

    public void setResourceKey(@Nullable String resourceKey) {
        mResourceKey = resourceKey;
    }

    @Nullable
    public ConnectionCollection getConnections() {
        return mMetadata != null ? mMetadata.getConnections() : null;
    }

    @Nullable
    public Connection getVideosConnection() {
        ConnectionCollection connections = getConnections();
        return connections != null ? connections.getVideos() : null;
    }

    @Nullable
    public String getVideosUri() {
        Connection videos = getVideosConnection();
        return videos != null ? videos.getUri() : null;
    }

    @Override
    public int hashCode() {
        return mUri != null ? mUri.hashCode() : 0;
    }
    // </editor-fold>

    // -----------------------------------------------------------------------------------------------------
    // Comparison methods
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Comparison methods">
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Season)) {
            return false;
        }
        Season that = (Season) obj;

        return (mUri != null && that.getUri() != null) && mUri.equals(that.getUri());
    }
    // </editor-fold>
}

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

package com.vimeo.networking.model.cinema;

import com.google.gson.annotations.SerializedName;
import com.vimeo.networking.model.Category;
import com.vimeo.networking.model.Channel;
import com.vimeo.networking.model.Connection;
import com.vimeo.networking.model.ConnectionCollection;
import com.vimeo.networking.model.Metadata;
import com.vimeo.networking.model.Video;
import com.vimeo.networking.model.VideoList;
import com.vimeo.stag.UseStag;
import com.vimeo.stag.UseStag.FieldOption;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This class represents the data returned from the Cinema endpoint. It contains a short list of videos as well
 * as the data object that represents its root source (e.g. category/channel).
 * <p>
 * Created by rigbergh on 3/1/17.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
@UseStag(FieldOption.SERIALIZED_NAME)
public class ProgramContentItem implements Serializable {

    private static final long serialVersionUID = -8919865439752715939L;

    private static final String S_CATEGORY = "category";
    private static final String S_CHANNEL = "channel";
    @Nullable
    @SerializedName("uri")
    private String mUri;
    @Nullable
    @SerializedName("name")
    private String mName;
    @Nullable
    @SerializedName("type")
    private Type mType;
    @Nullable
    @SerializedName("content")
    private ArrayList<Video> mVideoList;
    @Nullable
    @SerializedName("metadata")
    private Metadata mMetadata;
    /**
     * Non-null when {@link #mType} is {@link Type#CHANNEL}
     */
    @Nullable
    @SerializedName("channel")
    private Channel mChannel;
    /**
     * Non-null when {@link #mType} is {@link Type#CATEGORY}
     */
    @Nullable
    @SerializedName("category")
    private Category mCategory;

    @UseStag
    public enum Type {
        @SerializedName(S_CATEGORY)
        CATEGORY(S_CATEGORY),
        @SerializedName(S_CHANNEL)
        CHANNEL(S_CHANNEL);

        private final String mType;

        Type(@NotNull String type) {
            mType = type;
        }

        @Override
        public String toString() {
            return mType;
        }
    }

    /**
     * @return The uri to the original data source (as a String)
     */
    @Nullable
    public String getUri() {
        return mUri;
    }

    public void setUri(@Nullable String uri) {
        mUri = uri;
    }

    /**
     * @return The display name of the content item.
     */
    @Nullable
    public String getName() {
        return mName;
    }

    public void setName(@Nullable String name) {
        mName = name;
    }

    /**
     * @return The {@link Type} of the content item. Use this type to determine the internal data that will
     * be available for the data source. Currently, this can be either a {@link Channel} when the type is
     * {@link Type#CHANNEL} or a {@link Category} when the type is {@link Type#CATEGORY}.
     */
    @Nullable
    public Type getType() {
        return mType;
    }

    public void setType(@Nullable Type type) {
        mType = type;
    }

    /**
     * @return A short (currently 5 count) {@link VideoList} containing the first page of video content for the
     * content item.
     */
    @Nullable
    public ArrayList<Video> getVideoList() {
        return mVideoList;
    }

    public void setVideoList(@Nullable ArrayList<Video> videoList) {
        mVideoList = videoList;
    }

    /**
     * @return A {@link Metadata} item containing the uri for the next page of videos in
     * metadata.connections.contents.uri
     */
    @Nullable
    public Metadata getMetadata() {
        return mMetadata;
    }

    public void setMetadata(@Nullable Metadata metadata) {
        mMetadata = metadata;
    }

    /**
     * @return A {@link Channel} when {@link #getType()} returns {@link Type#CHANNEL}, otherwise null
     */
    @Nullable
    public Channel getChannel() {
        return mChannel;
    }

    public void setChannel(@Nullable Channel channel) {
        mChannel = channel;
    }

    /**
     * @return A {@link Category} when {@link #getType()} returns {@link Type#CATEGORY}, otherwise null
     */
    @Nullable
    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(@Nullable Category category) {
        mCategory = category;
    }

    /**
     * @return a uri (as a String) to the next page of data after the videos returned from {@link #getVideoList}
     */
    @Nullable
    public String getNextPageUri() {

        ConnectionCollection connections = mMetadata != null ? mMetadata.getConnections() : null;
        Connection contents = connections != null ? connections.getContents() : null;

        return contents != null ? contents.getUri() : null;
    }
}

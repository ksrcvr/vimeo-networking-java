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
import com.vimeo.stag.UseStag.FieldOption;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Date;

/**
 * Base representation of a Video stream/playback file
 * <p>
 * Created by alfredhanssen on 4/25/15.
 */
@SuppressWarnings("unused")
@UseStag(FieldOption.SERIALIZED_NAME)
public abstract class VideoFile implements Serializable {

    private static final long serialVersionUID = -7880082086500468183L;

    public enum VideoQuality {
        NONE("N/A"),
        DASH("dash"),
        HLS("hls"),
        HD("hd"),
        SD("sd");

        private final String mTypeName;

        VideoQuality(String typeName) {
            mTypeName = typeName;
        }

        @Override
        // Overridden for analytics.
        public String toString() {
            return mTypeName;
        }
    }

    // -----------------------------------------------------------------------------------------------------
    // Fields common between all file types - HLS, Dash, Progressive
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Fields common between all file types">
    @Nullable
    @SerializedName("link_expiration_time")
    private Date mLinkExpirationTime;

    @SerializedName("link")
    private String mLink;

    @Nullable
    @SerializedName("log")
    private String mLog;

    @NotNull
    public abstract VideoQuality getQuality();

    @Nullable
    public Date getLinkExpirationTime() {
        return mLinkExpirationTime;
    }

    public void setLinkExpirationTime(@Nullable Date linkExpirationTime) {
        mLinkExpirationTime = linkExpirationTime;
    }

    /** @return true if this VideoFile doesn't have an expired field or if the expires date is before the current date */
    public boolean isExpired() {
        // If expires is null, we should probably refresh the video object regardless [KV] 3/31/16
        return mLinkExpirationTime == null || mLinkExpirationTime.before(new Date());
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    @Nullable
    public String getLog() {
        return mLog;
    }

    public void setLog(@Nullable String log) {
        mLog = log;
    }
    // </editor-fold>

    // -----------------------------------------------------------------------------------------------------
    // Equals/Hashcode
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Equals/Hashcode">
    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        VideoFile videoFile = (VideoFile) o;

        return mLink != null ? mLink.equals(videoFile.mLink) : videoFile.mLink == null;

    }

    @Override
    public int hashCode() {
        return mLink != null ? mLink.hashCode() : 0;
    }

    // </editor-fold>
}

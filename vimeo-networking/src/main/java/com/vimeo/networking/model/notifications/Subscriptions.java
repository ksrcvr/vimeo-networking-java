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

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * A model that holds the type of push subscriptions a user has. This class
 * has both getters and setters since a user can update their subscriptions
 * using a Patch.
 * <p>
 * Created by zetterstromk on 12/15/16.
 */
@SuppressWarnings("unused")
@UseStag
public class Subscriptions implements Serializable {

    private static final long serialVersionUID = 3088065484753327987L;


    @SerializedName(NotificationConstants.NOTIFICATION_COMMENT)
    private boolean mComment;

    @SerializedName(NotificationConstants.NOTIFICATION_CREDIT)
    private boolean mCredit;

    @SerializedName(NotificationConstants.NOTIFICATION_LIKE)
    private boolean mLike;

    @SerializedName(NotificationConstants.NOTIFICATION_REPLY)
    private boolean mReply;

    @SerializedName(NotificationConstants.NOTIFICATION_FOLLOW)
    private boolean mFollow;

    @SerializedName(NotificationConstants.NOTIFICATION_VIDEO_AVAILABLE)
    private boolean mVideoAvailable;

    @SerializedName(NotificationConstants.NOTIFICATION_FOLLOWED_USER_VIDEO_AVAILABLE)
    private boolean mFollowedUserVideoAvailable;

    public boolean isReceivingComment() {
        return mComment;
    }

    public void receiveComment(boolean receive) {
        mComment = receive;
    }

    public boolean isReceivingCredit() {
        return mCredit;
    }

    public void receiveCredit(boolean receive) {
        mCredit = receive;
    }

    public boolean isReceivingLike() {
        return mLike;
    }

    public void receiveLike(boolean receive) {
        mLike = receive;
    }

    public boolean isReceivingReply() {
        return mReply;
    }

    public void receiveReply(boolean receive) {
        mReply = receive;
    }

    public boolean isReceivingFollow() {
        return mFollow;
    }

    public void receiveFollow(boolean receive) {
        mFollow = receive;
    }

    public boolean isReceivingVideoAvailable() {
        return mVideoAvailable;
    }

    public void receiveVideoAvailable(boolean receive) {
        mVideoAvailable = receive;
    }

    /**
     * @return true if this user is subscribed to receiving the push notification
     * for {@link NotificationConstants#NOTIFICATION_FOLLOWED_USER_VIDEO_AVAILABLE}
     */
    public boolean isReceivingFollowedUserVideoAvailable() {
        return mFollowedUserVideoAvailable;
    }

    /**
     * Allows the followed user video available subscription to be set for use in
     * {@link #getMapFromSubscriptions()} or {@link #isReceivingFollowedUserVideoAvailable()}
     *
     * @param receive true if the user should receive the notification, false otherwise
     */
    public void receiveFollowedUserVideoAvailable(boolean receive) {
        mFollowedUserVideoAvailable = receive;
    }

    @NotNull
    public Map<String, Boolean> getMapFromSubscriptions() {
        Map<String, Boolean> map = new HashMap<>();

        map.put(NotificationConstants.NOTIFICATION_COMMENT, mComment);
        map.put(NotificationConstants.NOTIFICATION_CREDIT, mCredit);
        map.put(NotificationConstants.NOTIFICATION_LIKE, mLike);
        map.put(NotificationConstants.NOTIFICATION_REPLY, mReply);
        map.put(NotificationConstants.NOTIFICATION_FOLLOW, mFollow);
        map.put(NotificationConstants.NOTIFICATION_VIDEO_AVAILABLE, mVideoAvailable);
        map.put(NotificationConstants.NOTIFICATION_FOLLOWED_USER_VIDEO_AVAILABLE, mFollowedUserVideoAvailable);

        return map;
    }

    public boolean isComment() {
        return mComment;
    }

    public void setComment(boolean comment) {
        mComment = comment;
    }

    public boolean isCredit() {
        return mCredit;
    }

    public void setCredit(boolean credit) {
        mCredit = credit;
    }

    public boolean isLike() {
        return mLike;
    }

    public void setLike(boolean like) {
        mLike = like;
    }

    public boolean isReply() {
        return mReply;
    }

    public void setReply(boolean reply) {
        mReply = reply;
    }

    public boolean isFollow() {
        return mFollow;
    }

    public void setFollow(boolean follow) {
        mFollow = follow;
    }

    public boolean isVideoAvailable() {
        return mVideoAvailable;
    }

    public void setVideoAvailable(boolean videoAvailable) {
        mVideoAvailable = videoAvailable;
    }

    public boolean isFollowedUserVideoAvailable() {
        return mFollowedUserVideoAvailable;
    }

    public void setFollowedUserVideoAvailable(boolean followedUserVideoAvailable) {
        mFollowedUserVideoAvailable = followedUserVideoAvailable;
    }
}

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
import com.vimeo.networking.model.Connection;
import com.vimeo.stag.UseStag;
import com.vimeo.stag.UseStag.FieldOption;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * A specialized {@link Connection} returned for notification connections.
 * <p>
 * Created by zetterstromk on 2/22/17.
 */
@UseStag(FieldOption.SERIALIZED_NAME)
public class NotificationConnection extends Connection {

    private static final long serialVersionUID = 4908222195478449252L;

    @SerializedName("new_total")
    private int mNewTotal;

    @SerializedName("unread_total")
    private int mUnreadTotal;

    @Nullable
    @SerializedName("type_count")
    private NotificationTypeCount mTypeCount;

    public int getNewTotal() {
        return mNewTotal;
    }

    public int getUnreadTotal() {
        return mUnreadTotal;
    }

    @Nullable
    public NotificationTypeCount getTypeCount() {
        return mTypeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        NotificationConnection that = (NotificationConnection) o;

        if (mNewTotal != that.mNewTotal) { return false; }
        if (mUnreadTotal != that.mUnreadTotal) { return false; }
        if (getTotal() != that.getTotal()) { return false; }
        if (mTypeCount != null ? !mTypeCount.equals(that.mTypeCount) : that.mTypeCount != null) { return false; }
        return getUri() != null ? getUri().equals(that.getUri()) : that.getUri() == null;

    }

    @Override
    public int hashCode() {
        int result = mNewTotal;
        result = 31 * result + mUnreadTotal;
        result = 31 * result + (mTypeCount != null ? mTypeCount.hashCode() : 0);
        result = 31 * result + (getUri() != null ? getUri().hashCode() : 0);
        result = 31 * result + getTotal();
        return result;
    }

    @Override
    public String toString() {
        return "NotificationConnection{" +
               "newTotal=" + mNewTotal +
               ", unreadTotal=" + mUnreadTotal +
               ", mTypeCount=" + mTypeCount +
               ", uri='" + getUri() + '\'' +
               ", total=" + getTotal() +
               '}';
    }

    public void setNewTotal(int newTotal) {
        mNewTotal = newTotal;
    }

    public void setUnreadTotal(int unreadTotal) {
        mUnreadTotal = unreadTotal;
    }

    public void setTypeCount(@Nullable NotificationTypeCount typeCount) {
        mTypeCount = typeCount;
    }

    @UseStag(FieldOption.SERIALIZED_NAME)
    public static final class NotificationTypeCount implements Serializable {

        private static final long serialVersionUID = 6893381498380227512L;

        @SerializedName(NotificationConstants.NOTIFICATION_COMMENT)
        private int mCommentTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_CREDIT)
        private int mCreditTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_LIKE)
        private int mLikeTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_SHARE)
        private int mShareTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_VIDEO_AVAILABLE)
        private int mVideoAvailableTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_FOLLOWED_USER_VIDEO_AVAILABLE)
        private int mFollowedUserVideoAvailableTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_MENTION)
        private int mMentionTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_REPLY)
        private int mReplyTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_STORAGE_WARNING)
        private int mStorageWarningTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_FOLLOW)
        private int mFollowTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_ACCOUNT_EXPIRATION_WARNING)
        private int mAccountExpirationWarningTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_TVOD_PURCHASE)
        private int mTvodPurchaseTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_TVOD_PREORDER_AVAILABLE)
        private int mTvodPreorderAvailableTotal;

        @SerializedName(NotificationConstants.NOTIFICATION_TVOD_RENTAL_EXPIRATION_WARNING)
        private int mTvodRentailExpirationWarningTotal;

        public int getCommentTotal() {
            return mCommentTotal;
        }

        public int getCreditTotal() {
            return mCreditTotal;
        }

        public int getLikeTotal() {
            return mLikeTotal;
        }

        public int getShareTotal() {
            return mShareTotal;
        }

        public int getVideoAvailableTotal() {
            return mVideoAvailableTotal;
        }

        /**
         * @return the count of followed user video available notifications
         */
        public int getFollowedUserVideoAvailableTotal() {
            return mFollowedUserVideoAvailableTotal;
        }

        public int getMentionTotal() {
            return mMentionTotal;
        }

        public int getReplyTotal() {
            return mReplyTotal;
        }

        public int getStorageWarningTotal() {
            return mStorageWarningTotal;
        }

        public int getFollowTotal() {
            return mFollowTotal;
        }

        public int getAccountExpirationWarningTotal() {
            return mAccountExpirationWarningTotal;
        }

        public int getTvodPurchaseTotal() {
            return mTvodPurchaseTotal;
        }

        public int getTvodPreorderAvailableTotal() {
            return mTvodPreorderAvailableTotal;
        }

        public int getTvodRentailExpirationWarningTotal() {
            return mTvodRentailExpirationWarningTotal;
        }

        public void setCommentTotal(int commentTotal) {
            mCommentTotal = commentTotal;
        }

        public void setCreditTotal(int creditTotal) {
            mCreditTotal = creditTotal;
        }

        public void setLikeTotal(int likeTotal) {
            mLikeTotal = likeTotal;
        }

        public void setShareTotal(int shareTotal) {
            mShareTotal = shareTotal;
        }

        public void setVideoAvailableTotal(int videoAvailableTotal) {
            mVideoAvailableTotal = videoAvailableTotal;
        }

        public void setFollowedUserVideoAvailableTotal(int followedUserVideoAvailableTotal) {
            mFollowedUserVideoAvailableTotal = followedUserVideoAvailableTotal;
        }

        public void setMentionTotal(int mentionTotal) {
            mMentionTotal = mentionTotal;
        }

        public void setReplyTotal(int replyTotal) {
            mReplyTotal = replyTotal;
        }

        public void setStorageWarningTotal(int storageWarningTotal) {
            mStorageWarningTotal = storageWarningTotal;
        }

        public void setFollowTotal(int followTotal) {
            mFollowTotal = followTotal;
        }

        public void setAccountExpirationWarningTotal(int accountExpirationWarningTotal) {
            mAccountExpirationWarningTotal = accountExpirationWarningTotal;
        }

        public void setTvodPurchaseTotal(int tvodPurchaseTotal) {
            mTvodPurchaseTotal = tvodPurchaseTotal;
        }

        public void setTvodPreorderAvailableTotal(int tvodPreorderAvailableTotal) {
            mTvodPreorderAvailableTotal = tvodPreorderAvailableTotal;
        }

        public void setTvodRentailExpirationWarningTotal(int tvodRentailExpirationWarningTotal) {
            mTvodRentailExpirationWarningTotal = tvodRentailExpirationWarningTotal;
        }
    }
}

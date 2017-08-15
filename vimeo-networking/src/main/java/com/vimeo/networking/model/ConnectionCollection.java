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
import com.vimeo.networking.model.notifications.NotificationConnection;
import com.vimeo.stag.UseStag;
import com.vimeo.stag.UseStag.FieldOption;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * Stores a collection of Connection objects.
 * Created by hanssena on 4/23/15.
 */
@SuppressWarnings("unused")
@UseStag(FieldOption.SERIALIZED_NAME)
public class ConnectionCollection implements Serializable {

    private static final long serialVersionUID = -4523270955994232839L;

    @Nullable
    @SerializedName("videos")
    private Connection mVideos;

    @Nullable
    @SerializedName("categories")
    private Connection mCategories;

    @Nullable
    @SerializedName("comments")
    private Connection mComments;

    @Nullable
    @SerializedName("credits")
    private Connection mCredits;

    @Nullable
    @SerializedName("likes")
    private Connection mLikes;

    @Nullable
    @SerializedName("pictures")
    private Connection mPictures;

    @Nullable
    @SerializedName("texttracks")
    private Connection mTexttracks;

    @Nullable
    @SerializedName("activities")
    private Connection mActivities;

    @Nullable
    @SerializedName("albums")
    private Connection mAlbums;

    @Nullable
    @SerializedName("channels")
    private Connection mChannels;

    @Nullable
    @SerializedName("moderated_channels")
    private Connection mModeratedChannels;

    @Nullable
    @SerializedName("feed")
    private Connection mFeed;

    @Nullable
    @SerializedName("followers")
    private Connection mFollowers;

    @Nullable
    @SerializedName("following")
    private Connection mFollowing;

    @Nullable
    @SerializedName("groups")
    private Connection mGroups;

    @Nullable
    @SerializedName("portfolios")
    private Connection mPortfolios;

    @Nullable
    @SerializedName("shared")
    private Connection mShared;

    @Nullable
    @SerializedName("recommendations")
    private Connection mRecommendations;

    @Nullable
    @SerializedName("appearances")
    private Connection mAppearances;

    @Nullable
    @SerializedName("related")
    private Connection mRelated;

    @Nullable
    @SerializedName("replies")
    private Connection mReplies;

    @Nullable
    @SerializedName("users")
    private Connection mUsers;

    @Nullable
    @SerializedName("watchlater")
    private Connection mWatchlater;

    @Nullable
    @SerializedName("ondemand")
    private Connection mTvod;

    @Nullable
    @SerializedName("season")
    private Connection mSeason;

    @Nullable
    @SerializedName("seasons")
    private Connection mSeasons;

    @Nullable
    @SerializedName("trailer")
    private Connection mTrailer;

    @Nullable
    @SerializedName("playback")
    private Connection mPlaybackFailureReason;

    @Nullable
    @SerializedName("recommended_channels")
    private Connection mRecommendedChannels;

    @Nullable
    @SerializedName("recommended_users")
    private Connection mRecommendedUsers;

    @Nullable
    @SerializedName("watched_videos")
    private Connection mWatchedVideos;

    @Nullable
    @SerializedName("notifications")
    private NotificationConnection mNotifications;

    @Nullable
    @SerializedName("contents")
    private Connection mContents;

    @Nullable
    public Connection getVideos() {
        return mVideos;
    }

    @Nullable
    public Connection getCategories() {
        return mCategories;
    }

    @Nullable
    public Connection getComments() {
        return mComments;
    }

    @Nullable
    public Connection getCredits() {
        return mCredits;
    }

    @Nullable
    public Connection getLikes() {
        return mLikes;
    }

    @Nullable
    public Connection getPictures() {
        return mPictures;
    }

    @Nullable
    public Connection getTexttracks() {
        return mTexttracks;
    }

    @Nullable
    public Connection getActivities() {
        return mActivities;
    }

    @Nullable
    public Connection getAlbums() {
        return mAlbums;
    }

    @Nullable
    public Connection getChannels() {
        return mChannels;
    }

    @Nullable
    public Connection getModeratedChannels() {
        return mModeratedChannels;
    }

    @Nullable
    public Connection getFeed() {
        return mFeed;
    }

    @Nullable
    public Connection getFollowers() {
        return mFollowers;
    }

    @Nullable
    public Connection getFollowing() {
        return mFollowing;
    }

    @Nullable
    public Connection getGroups() {
        return mGroups;
    }

    @Nullable
    public Connection getPortfolios() {
        return mPortfolios;
    }

    @Nullable
    public Connection getShared() {
        return mShared;
    }

    @Nullable
    public Connection getRecommendations() {
        return mRecommendations;
    }

    @Nullable
    public Connection getAppearances() {
        return mAppearances;
    }

    @Nullable
    public Connection getRelated() {
        return mRelated;
    }

    @Nullable
    public Connection getReplies() {
        return mReplies;
    }

    @Nullable
    public Connection getUsers() {
        return mUsers;
    }

    @Nullable
    public Connection getWatchlater() {
        return mWatchlater;
    }

    @Nullable
    public Connection getTvod() {
        return mTvod;
    }

    @Nullable
    public Connection getSeason() {
        return mSeason;
    }

    @Nullable
    public Connection getSeasons() {
        return mSeasons;
    }

    @Nullable
    public Connection getTrailer() {
        return mTrailer;
    }

    @Nullable
    public Connection getPlaybackFailureReason() {
        return mPlaybackFailureReason;
    }

    @Nullable
    public Connection getRecommendedChannels() {
        return mRecommendedChannels;
    }

    @Nullable
    public Connection getRecommendedUsers() {
        return mRecommendedUsers;
    }

    @Nullable
    public Connection getWatchedVideos() {
        return mWatchedVideos;
    }

    @Nullable
    public NotificationConnection getNotifications() {
        return mNotifications;
    }

    @Nullable
    public Connection getContents() {
        return mContents;
    }

    public void setVideos(@Nullable Connection videos) {
        mVideos = videos;
    }

    public void setCategories(@Nullable Connection categories) {
        mCategories = categories;
    }

    public void setComments(@Nullable Connection comments) {
        mComments = comments;
    }

    public void setCredits(@Nullable Connection credits) {
        mCredits = credits;
    }

    public void setLikes(@Nullable Connection likes) {
        mLikes = likes;
    }

    public void setPictures(@Nullable Connection pictures) {
        mPictures = pictures;
    }

    public void setTexttracks(@Nullable Connection texttracks) {
        mTexttracks = texttracks;
    }

    public void setActivities(@Nullable Connection activities) {
        mActivities = activities;
    }

    public void setAlbums(@Nullable Connection albums) {
        mAlbums = albums;
    }

    public void setChannels(@Nullable Connection channels) {
        mChannels = channels;
    }

    public void setModeratedChannels(@Nullable Connection moderatedChannels) {
        mModeratedChannels = moderatedChannels;
    }

    public void setFeed(@Nullable Connection feed) {
        mFeed = feed;
    }

    public void setFollowers(@Nullable Connection followers) {
        mFollowers = followers;
    }

    public void setFollowing(@Nullable Connection following) {
        mFollowing = following;
    }

    public void setGroups(@Nullable Connection groups) {
        mGroups = groups;
    }

    public void setPortfolios(@Nullable Connection portfolios) {
        mPortfolios = portfolios;
    }

    public void setShared(@Nullable Connection shared) {
        mShared = shared;
    }

    public void setRecommendations(@Nullable Connection recommendations) {
        mRecommendations = recommendations;
    }

    public void setAppearances(@Nullable Connection appearances) {
        mAppearances = appearances;
    }

    public void setRelated(@Nullable Connection related) {
        mRelated = related;
    }

    public void setReplies(@Nullable Connection replies) {
        mReplies = replies;
    }

    public void setUsers(@Nullable Connection users) {
        mUsers = users;
    }

    public void setWatchlater(@Nullable Connection watchlater) {
        mWatchlater = watchlater;
    }

    public void setTvod(@Nullable Connection tvod) {
        mTvod = tvod;
    }

    public void setSeason(@Nullable Connection season) {
        mSeason = season;
    }

    public void setSeasons(@Nullable Connection seasons) {
        mSeasons = seasons;
    }

    public void setTrailer(@Nullable Connection trailer) {
        mTrailer = trailer;
    }

    public void setPlaybackFailureReason(@Nullable Connection playbackFailureReason) {
        mPlaybackFailureReason = playbackFailureReason;
    }

    public void setRecommendedChannels(@Nullable Connection recommendedChannels) {
        mRecommendedChannels = recommendedChannels;
    }

    public void setRecommendedUsers(@Nullable Connection recommendedUsers) {
        mRecommendedUsers = recommendedUsers;
    }

    public void setWatchedVideos(@Nullable Connection watchedVideos) {
        mWatchedVideos = watchedVideos;
    }

    public void setNotifications(@Nullable NotificationConnection notifications) {
        mNotifications = notifications;
    }

    public void setContents(@Nullable Connection contents) {
        mContents = contents;
    }
}

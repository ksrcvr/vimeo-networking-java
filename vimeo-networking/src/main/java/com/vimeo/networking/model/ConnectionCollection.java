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

    // -----------------------------------------------------------------------------------------------------
    // Getters and Setters
    // -----------------------------------------------------------------------------------------------------
    // <editor-fold desc="Getters and Setters">
    @Nullable
    public Connection getVideos() {
        return mVideos;
    }

    public void setVideos(@Nullable Connection videos) {
        mVideos = videos;
    }

    @Nullable
    public Connection getCategories() {
        return mCategories;
    }

    public void setCategories(@Nullable Connection categories) {
        mCategories = categories;
    }

    @Nullable
    public Connection getComments() {
        return mComments;
    }

    public void setComments(@Nullable Connection comments) {
        mComments = comments;
    }

    @Nullable
    public Connection getCredits() {
        return mCredits;
    }

    public void setCredits(@Nullable Connection credits) {
        mCredits = credits;
    }

    @Nullable
    public Connection getLikes() {
        return mLikes;
    }

    public void setLikes(@Nullable Connection likes) {
        mLikes = likes;
    }

    @Nullable
    public Connection getPictures() {
        return mPictures;
    }

    public void setPictures(@Nullable Connection pictures) {
        mPictures = pictures;
    }

    @Nullable
    public Connection getTexttracks() {
        return mTexttracks;
    }

    public void setTexttracks(@Nullable Connection texttracks) {
        mTexttracks = texttracks;
    }

    @Nullable
    public Connection getActivities() {
        return mActivities;
    }

    public void setActivities(@Nullable Connection activities) {
        mActivities = activities;
    }

    @Nullable
    public Connection getAlbums() {
        return mAlbums;
    }

    public void setAlbums(@Nullable Connection albums) {
        mAlbums = albums;
    }

    @Nullable
    public Connection getChannels() {
        return mChannels;
    }

    public void setChannels(@Nullable Connection channels) {
        mChannels = channels;
    }

    @Nullable
    public Connection getModeratedChannels() {
        return mModeratedChannels;
    }

    public void setModeratedChannels(@Nullable Connection moderatedChannels) {
        mModeratedChannels = moderatedChannels;
    }

    @Nullable
    public Connection getFeed() {
        return mFeed;
    }

    public void setFeed(@Nullable Connection feed) {
        mFeed = feed;
    }

    @Nullable
    public Connection getFollowers() {
        return mFollowers;
    }

    public void setFollowers(@Nullable Connection followers) {
        mFollowers = followers;
    }

    @Nullable
    public Connection getFollowing() {
        return mFollowing;
    }

    public void setFollowing(@Nullable Connection following) {
        mFollowing = following;
    }

    @Nullable
    public Connection getGroups() {
        return mGroups;
    }

    public void setGroups(@Nullable Connection groups) {
        mGroups = groups;
    }

    @Nullable
    public Connection getPortfolios() {
        return mPortfolios;
    }

    public void setPortfolios(@Nullable Connection portfolios) {
        mPortfolios = portfolios;
    }

    @Nullable
    public Connection getShared() {
        return mShared;
    }

    public void setShared(@Nullable Connection shared) {
        mShared = shared;
    }

    @Nullable
    public Connection getRecommendations() {
        return mRecommendations;
    }

    public void setRecommendations(@Nullable Connection recommendations) {
        mRecommendations = recommendations;
    }

    @Nullable
    public Connection getAppearances() {
        return mAppearances;
    }

    public void setAppearances(@Nullable Connection appearances) {
        mAppearances = appearances;
    }

    @Nullable
    public Connection getRelated() {
        return mRelated;
    }

    public void setRelated(@Nullable Connection related) {
        mRelated = related;
    }

    @Nullable
    public Connection getReplies() {
        return mReplies;
    }

    public void setReplies(@Nullable Connection replies) {
        mReplies = replies;
    }

    @Nullable
    public Connection getUsers() {
        return mUsers;
    }

    public void setUsers(@Nullable Connection users) {
        mUsers = users;
    }

    @Nullable
    public Connection getWatchlater() {
        return mWatchlater;
    }

    public void setWatchlater(@Nullable Connection watchlater) {
        mWatchlater = watchlater;
    }

    @Nullable
    public Connection getTvod() {
        return mTvod;
    }

    public void setTvod(@Nullable Connection tvod) {
        mTvod = tvod;
    }

    @Nullable
    public Connection getSeason() {
        return mSeason;
    }

    public void setSeason(@Nullable Connection season) {
        mSeason = season;
    }

    @Nullable
    public Connection getSeasons() {
        return mSeasons;
    }

    public void setSeasons(@Nullable Connection seasons) {
        mSeasons = seasons;
    }

    @Nullable
    public Connection getTrailer() {
        return mTrailer;
    }

    public void setTrailer(@Nullable Connection trailer) {
        mTrailer = trailer;
    }

    @Nullable
    public Connection getPlaybackFailureReason() {
        return mPlaybackFailureReason;
    }

    public void setPlaybackFailureReason(@Nullable Connection playbackFailureReason) {
        mPlaybackFailureReason = playbackFailureReason;
    }

    @Nullable
    public Connection getRecommendedChannels() {
        return mRecommendedChannels;
    }

    public void setRecommendedChannels(@Nullable Connection recommendedChannels) {
        mRecommendedChannels = recommendedChannels;
    }

    @Nullable
    public Connection getRecommendedUsers() {
        return mRecommendedUsers;
    }

    public void setRecommendedUsers(@Nullable Connection recommendedUsers) {
        mRecommendedUsers = recommendedUsers;
    }

    @Nullable
    public Connection getWatchedVideos() {
        return mWatchedVideos;
    }

    public void setWatchedVideos(@Nullable Connection watchedVideos) {
        mWatchedVideos = watchedVideos;
    }

    @Nullable
    public NotificationConnection getNotifications() {
        return mNotifications;
    }

    public void setNotifications(@Nullable NotificationConnection notifications) {
        mNotifications = notifications;
    }

    @Nullable
    public Connection getContents() {
        return mContents;
    }

    public void setContents(@Nullable Connection contents) {
        mContents = contents;
    }
    // </editor-fold>
}

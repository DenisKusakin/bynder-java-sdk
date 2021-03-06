/*
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.model;

import com.bynder.sdk.api.BynderApi;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/**
 * Media Item model returned by {@link BynderApi#getMediaInfo(Map)}.
 */
public class MediaItem {

    /**
     * Id of the media item.
     */
    private String id;
    /**
     * Filename of the media item.
     */
    @SerializedName(value = "fileName")
    private String name;
    /**
     * Media item type. Possible values are: original, additional, web.
     */
    private String type;
    /**
     * Date created.
     */
    private String dateCreated;
    /**
     * Height of the media item.
     */
    private int height;
    /**
     * Width of the media item.
     */
    private int width;
    /**
     * File size of the media item.
     */
    private long size;
    /**
     * Version number of the media item.
     */
    private int version;
    /**
     * True if it is corresponds to the current version of the media asset.
     */
    private Boolean active;
    /**
     * Generated thumbnails for the media item.
     */
    private Map<String, String> thumbnails;
    /**
     * Focus point of the media item.
     */
    private Map<String, Double> focusPoint = new HashMap<>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public long getSize() {
        return size;
    }

    public int getVersion() {
        return version;
    }

    public Boolean isActive() {
        return active;
    }

    public Map<String, String> getThumbnails() {
        return thumbnails;
    }

    public Map<String, Double> getFocusPoint() {
        return focusPoint;
    }
}

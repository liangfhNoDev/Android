
package com.optimussoftware.api.response.advertising.AdvertisingByCampaign;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File {

    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("file")
    @Expose
    private Object file;

    /**
     * 
     * @return
     *     The filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 
     * @param filename
     *     The filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 
     * @return
     *     The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The contentUrl
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * 
     * @param contentUrl
     *     The content_url
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     * 
     * @return
     *     The file
     */
    public Object getFile() {
        return file;
    }

    /**
     * 
     * @param file
     *     The file
     */
    public void setFile(Object file) {
        this.file = file;
    }

}

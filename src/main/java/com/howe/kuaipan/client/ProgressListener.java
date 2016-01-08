package com.howe.kuaipan.client;

public interface ProgressListener {
    /**
     * be called when uploading/downloading starts.
     */
    void started();

    /**
     * determine at least how long (in milliseconds) between each call {@link ProgressListener#processing(long, long)} .
     */
    int getUpdateInterval();

    /**
     * be called when some amount of bytes is uploaded/downloaded.
     *
     * @param bytes
     */
    void processing(long bytes, long total);

    /**
     * be called when the task is completed.
     */
    void completed();
}

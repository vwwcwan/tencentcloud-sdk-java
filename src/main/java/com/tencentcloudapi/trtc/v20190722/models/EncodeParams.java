/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EncodeParams extends AbstractModel{

    /**
    * 混流-输出流音频采样率。取值为[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
    */
    @SerializedName("AudioSampleRate")
    @Expose
    private Long AudioSampleRate;

    /**
    * 混流-输出流音频码率。取值范围[8,500]，单位为Kbps。
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * 混流-输出流音频声道数，取值范围[1,2]。
    */
    @SerializedName("AudioChannels")
    @Expose
    private Long AudioChannels;

    /**
    * 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
    */
    @SerializedName("VideoWidth")
    @Expose
    private Long VideoWidth;

    /**
    * 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
    */
    @SerializedName("VideoHeight")
    @Expose
    private Long VideoHeight;

    /**
    * 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为Kbps。
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * 混流-输出流帧率，音视频输出时必填。取值为[6,12,15,24,30,48,60]，不在上述帧率值内系统会自动调整。
    */
    @SerializedName("VideoFramerate")
    @Expose
    private Long VideoFramerate;

    /**
    * 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
    */
    @SerializedName("VideoGop")
    @Expose
    private Long VideoGop;

    /**
    * 混流-输出流背景色。
    */
    @SerializedName("BackgroundColor")
    @Expose
    private Long BackgroundColor;

    /**
     * Get 混流-输出流音频采样率。取值为[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。 
     * @return AudioSampleRate 混流-输出流音频采样率。取值为[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
     */
    public Long getAudioSampleRate() {
        return this.AudioSampleRate;
    }

    /**
     * Set 混流-输出流音频采样率。取值为[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
     * @param AudioSampleRate 混流-输出流音频采样率。取值为[96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000]。
     */
    public void setAudioSampleRate(Long AudioSampleRate) {
        this.AudioSampleRate = AudioSampleRate;
    }

    /**
     * Get 混流-输出流音频码率。取值范围[8,500]，单位为Kbps。 
     * @return AudioBitrate 混流-输出流音频码率。取值范围[8,500]，单位为Kbps。
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set 混流-输出流音频码率。取值范围[8,500]，单位为Kbps。
     * @param AudioBitrate 混流-输出流音频码率。取值范围[8,500]，单位为Kbps。
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get 混流-输出流音频声道数，取值范围[1,2]。 
     * @return AudioChannels 混流-输出流音频声道数，取值范围[1,2]。
     */
    public Long getAudioChannels() {
        return this.AudioChannels;
    }

    /**
     * Set 混流-输出流音频声道数，取值范围[1,2]。
     * @param AudioChannels 混流-输出流音频声道数，取值范围[1,2]。
     */
    public void setAudioChannels(Long AudioChannels) {
        this.AudioChannels = AudioChannels;
    }

    /**
     * Get 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。 
     * @return VideoWidth 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     */
    public Long getVideoWidth() {
        return this.VideoWidth;
    }

    /**
     * Set 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     * @param VideoWidth 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     */
    public void setVideoWidth(Long VideoWidth) {
        this.VideoWidth = VideoWidth;
    }

    /**
     * Get 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。 
     * @return VideoHeight 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     */
    public Long getVideoHeight() {
        return this.VideoHeight;
    }

    /**
     * Set 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     * @param VideoHeight 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     */
    public void setVideoHeight(Long VideoHeight) {
        this.VideoHeight = VideoHeight;
    }

    /**
     * Get 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为Kbps。 
     * @return VideoBitrate 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为Kbps。
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为Kbps。
     * @param VideoBitrate 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为Kbps。
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get 混流-输出流帧率，音视频输出时必填。取值为[6,12,15,24,30,48,60]，不在上述帧率值内系统会自动调整。 
     * @return VideoFramerate 混流-输出流帧率，音视频输出时必填。取值为[6,12,15,24,30,48,60]，不在上述帧率值内系统会自动调整。
     */
    public Long getVideoFramerate() {
        return this.VideoFramerate;
    }

    /**
     * Set 混流-输出流帧率，音视频输出时必填。取值为[6,12,15,24,30,48,60]，不在上述帧率值内系统会自动调整。
     * @param VideoFramerate 混流-输出流帧率，音视频输出时必填。取值为[6,12,15,24,30,48,60]，不在上述帧率值内系统会自动调整。
     */
    public void setVideoFramerate(Long VideoFramerate) {
        this.VideoFramerate = VideoFramerate;
    }

    /**
     * Get 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。 
     * @return VideoGop 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     */
    public Long getVideoGop() {
        return this.VideoGop;
    }

    /**
     * Set 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     * @param VideoGop 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     */
    public void setVideoGop(Long VideoGop) {
        this.VideoGop = VideoGop;
    }

    /**
     * Get 混流-输出流背景色。 
     * @return BackgroundColor 混流-输出流背景色。
     */
    public Long getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set 混流-输出流背景色。
     * @param BackgroundColor 混流-输出流背景色。
     */
    public void setBackgroundColor(Long BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioSampleRate", this.AudioSampleRate);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "AudioChannels", this.AudioChannels);
        this.setParamSimple(map, prefix + "VideoWidth", this.VideoWidth);
        this.setParamSimple(map, prefix + "VideoHeight", this.VideoHeight);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "VideoFramerate", this.VideoFramerate);
        this.setParamSimple(map, prefix + "VideoGop", this.VideoGop);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);

    }
}


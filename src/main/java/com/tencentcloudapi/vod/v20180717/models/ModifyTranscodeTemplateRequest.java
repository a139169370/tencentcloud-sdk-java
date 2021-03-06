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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTranscodeTemplateRequest extends AbstractModel{

    /**
    * 转码模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 转码模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 视频流配置参数。
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfoForUpdate VideoTemplate;

    /**
    * 音频流配置参数。
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfoForUpdate AudioTemplate;

    /**
    * 极速高清转码参数。
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfigForUpdate TEHDConfig;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 转码模板唯一标识。 
     * @return Definition 转码模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转码模板唯一标识。
     * @param Definition 转码模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。 
     * @return Container 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。
     * @param Container 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 转码模板名称，长度限制：64 个字符。 
     * @return Name 转码模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 转码模板名称，长度限制：64 个字符。
     * @param Name 转码模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li> 
     * @return RemoveVideo 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
     * @param RemoveVideo 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li> 
     * @return RemoveAudio 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
     * @param RemoveAudio 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get 视频流配置参数。 
     * @return VideoTemplate 视频流配置参数。
     */
    public VideoTemplateInfoForUpdate getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set 视频流配置参数。
     * @param VideoTemplate 视频流配置参数。
     */
    public void setVideoTemplate(VideoTemplateInfoForUpdate VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get 音频流配置参数。 
     * @return AudioTemplate 音频流配置参数。
     */
    public AudioTemplateInfoForUpdate getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set 音频流配置参数。
     * @param AudioTemplate 音频流配置参数。
     */
    public void setAudioTemplate(AudioTemplateInfoForUpdate AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get 极速高清转码参数。 
     * @return TEHDConfig 极速高清转码参数。
     */
    public TEHDConfigForUpdate getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set 极速高清转码参数。
     * @param TEHDConfig 极速高清转码参数。
     */
    public void setTEHDConfig(TEHDConfigForUpdate TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}


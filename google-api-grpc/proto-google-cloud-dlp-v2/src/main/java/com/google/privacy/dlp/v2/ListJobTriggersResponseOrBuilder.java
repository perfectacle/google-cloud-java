// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ListJobTriggersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListJobTriggersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.JobTrigger> getJobTriggersList();
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  com.google.privacy.dlp.v2.JobTrigger getJobTriggers(int index);
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  int getJobTriggersCount();
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.JobTriggerOrBuilder>
      getJobTriggersOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If the next page is available then the next page token to be used
   * in following ListJobTriggers request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If the next page is available then the next page token to be used
   * in following ListJobTriggers request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
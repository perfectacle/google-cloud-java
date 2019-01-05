// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface SentimentAnalysisResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SentimentAnalysisResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
   */
  boolean hasQueryTextSentiment();
  /**
   *
   *
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Sentiment getQueryTextSentiment();
  /**
   *
   *
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Sentiment query_text_sentiment = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SentimentOrBuilder getQueryTextSentimentOrBuilder();
}
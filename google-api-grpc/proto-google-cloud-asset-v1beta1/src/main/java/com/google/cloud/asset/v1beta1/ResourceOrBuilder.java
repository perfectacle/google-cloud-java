// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1beta1/assets.proto

package com.google.cloud.asset.v1beta1;

public interface ResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1beta1.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The API version. Example: "v1".
   * </pre>
   *
   * <code>string version = 1;</code>
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The API version. Example: "v1".
   * </pre>
   *
   * <code>string version = 1;</code>
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * The URL of the discovery document containing the resource's JSON schema.
   * For example:
   * `"https://www.googleapis.com/discovery/v1/apis/compute/v1/rest"`.
   * It will be left unspecified for resources without a discovery-based API,
   * such as Cloud Bigtable.
   * </pre>
   *
   * <code>string discovery_document_uri = 2;</code>
   */
  java.lang.String getDiscoveryDocumentUri();
  /**
   *
   *
   * <pre>
   * The URL of the discovery document containing the resource's JSON schema.
   * For example:
   * `"https://www.googleapis.com/discovery/v1/apis/compute/v1/rest"`.
   * It will be left unspecified for resources without a discovery-based API,
   * such as Cloud Bigtable.
   * </pre>
   *
   * <code>string discovery_document_uri = 2;</code>
   */
  com.google.protobuf.ByteString getDiscoveryDocumentUriBytes();

  /**
   *
   *
   * <pre>
   * The JSON schema name listed in the discovery document.
   * Example: "Project". It will be left unspecified for resources (such as
   * Cloud Bigtable) without a discovery-based API.
   * </pre>
   *
   * <code>string discovery_name = 3;</code>
   */
  java.lang.String getDiscoveryName();
  /**
   *
   *
   * <pre>
   * The JSON schema name listed in the discovery document.
   * Example: "Project". It will be left unspecified for resources (such as
   * Cloud Bigtable) without a discovery-based API.
   * </pre>
   *
   * <code>string discovery_name = 3;</code>
   */
  com.google.protobuf.ByteString getDiscoveryNameBytes();

  /**
   *
   *
   * <pre>
   * The REST URL for accessing the resource. An HTTP GET operation using this
   * URL returns the resource itself.
   * Example:
   * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123`.
   * It will be left unspecified for resources without a REST API.
   * </pre>
   *
   * <code>string resource_url = 4;</code>
   */
  java.lang.String getResourceUrl();
  /**
   *
   *
   * <pre>
   * The REST URL for accessing the resource. An HTTP GET operation using this
   * URL returns the resource itself.
   * Example:
   * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123`.
   * It will be left unspecified for resources without a REST API.
   * </pre>
   *
   * <code>string resource_url = 4;</code>
   */
  com.google.protobuf.ByteString getResourceUrlBytes();

  /**
   *
   *
   * <pre>
   * The full name of the immediate parent of this resource. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * For GCP assets, it is the parent resource defined in the [Cloud IAM policy
   * hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy).
   * For example: `"//cloudresourcemanager.googleapis.com/projects/my_project_123"`.
   * For third-party assets, it is up to the users to define.
   * </pre>
   *
   * <code>string parent = 5;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The full name of the immediate parent of this resource. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * For GCP assets, it is the parent resource defined in the [Cloud IAM policy
   * hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy).
   * For example: `"//cloudresourcemanager.googleapis.com/projects/my_project_123"`.
   * For third-party assets, it is up to the users to define.
   * </pre>
   *
   * <code>string parent = 5;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The content of the resource, in which some sensitive fields are scrubbed
   * away and may not be present.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 6;</code>
   */
  boolean hasData();
  /**
   *
   *
   * <pre>
   * The content of the resource, in which some sensitive fields are scrubbed
   * away and may not be present.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 6;</code>
   */
  com.google.protobuf.Struct getData();
  /**
   *
   *
   * <pre>
   * The content of the resource, in which some sensitive fields are scrubbed
   * away and may not be present.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getDataOrBuilder();
}
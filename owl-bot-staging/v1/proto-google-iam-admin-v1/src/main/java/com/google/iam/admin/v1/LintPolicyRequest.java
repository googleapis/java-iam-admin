// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

/**
 * <pre>
 * The request to lint a Cloud IAM policy object.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.LintPolicyRequest}
 */
public final class LintPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.LintPolicyRequest)
    LintPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LintPolicyRequest.newBuilder() to construct.
  private LintPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LintPolicyRequest() {
    fullResourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LintPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LintPolicyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            fullResourceName_ = s;
            break;
          }
          case 42: {
            com.google.type.Expr.Builder subBuilder = null;
            if (lintObjectCase_ == 5) {
              subBuilder = ((com.google.type.Expr) lintObject_).toBuilder();
            }
            lintObject_ =
                input.readMessage(com.google.type.Expr.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.type.Expr) lintObject_);
              lintObject_ = subBuilder.buildPartial();
            }
            lintObjectCase_ = 5;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_LintPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_LintPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.LintPolicyRequest.class, com.google.iam.admin.v1.LintPolicyRequest.Builder.class);
  }

  private int lintObjectCase_ = 0;
  private java.lang.Object lintObject_;
  public enum LintObjectCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONDITION(5),
    LINTOBJECT_NOT_SET(0);
    private final int value;
    private LintObjectCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LintObjectCase valueOf(int value) {
      return forNumber(value);
    }

    public static LintObjectCase forNumber(int value) {
      switch (value) {
        case 5: return CONDITION;
        case 0: return LINTOBJECT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public LintObjectCase
  getLintObjectCase() {
    return LintObjectCase.forNumber(
        lintObjectCase_);
  }

  public static final int FULL_RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object fullResourceName_;
  /**
   * <pre>
   * The full resource name of the policy this lint request is about.
   * The name follows the Google Cloud Platform (GCP) resource format.
   * For example, a GCP project with ID `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * The resource name is not used to read the policy instance from the Cloud
   * IAM database. The candidate policy for lint has to be provided in the same
   * request object.
   * </pre>
   *
   * <code>string full_resource_name = 1;</code>
   * @return The fullResourceName.
   */
  @java.lang.Override
  public java.lang.String getFullResourceName() {
    java.lang.Object ref = fullResourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullResourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The full resource name of the policy this lint request is about.
   * The name follows the Google Cloud Platform (GCP) resource format.
   * For example, a GCP project with ID `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * The resource name is not used to read the policy instance from the Cloud
   * IAM database. The candidate policy for lint has to be provided in the same
   * request object.
   * </pre>
   *
   * <code>string full_resource_name = 1;</code>
   * @return The bytes for fullResourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFullResourceNameBytes() {
    java.lang.Object ref = fullResourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fullResourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONDITION_FIELD_NUMBER = 5;
  /**
   * <pre>
   * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   * @return Whether the condition field is set.
   */
  @java.lang.Override
  public boolean hasCondition() {
    return lintObjectCase_ == 5;
  }
  /**
   * <pre>
   * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   * @return The condition.
   */
  @java.lang.Override
  public com.google.type.Expr getCondition() {
    if (lintObjectCase_ == 5) {
       return (com.google.type.Expr) lintObject_;
    }
    return com.google.type.Expr.getDefaultInstance();
  }
  /**
   * <pre>
   * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   */
  @java.lang.Override
  public com.google.type.ExprOrBuilder getConditionOrBuilder() {
    if (lintObjectCase_ == 5) {
       return (com.google.type.Expr) lintObject_;
    }
    return com.google.type.Expr.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullResourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fullResourceName_);
    }
    if (lintObjectCase_ == 5) {
      output.writeMessage(5, (com.google.type.Expr) lintObject_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullResourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fullResourceName_);
    }
    if (lintObjectCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, (com.google.type.Expr) lintObject_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.iam.admin.v1.LintPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.LintPolicyRequest other = (com.google.iam.admin.v1.LintPolicyRequest) obj;

    if (!getFullResourceName()
        .equals(other.getFullResourceName())) return false;
    if (!getLintObjectCase().equals(other.getLintObjectCase())) return false;
    switch (lintObjectCase_) {
      case 5:
        if (!getCondition()
            .equals(other.getCondition())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FULL_RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFullResourceName().hashCode();
    switch (lintObjectCase_) {
      case 5:
        hash = (37 * hash) + CONDITION_FIELD_NUMBER;
        hash = (53 * hash) + getCondition().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.LintPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.iam.admin.v1.LintPolicyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request to lint a Cloud IAM policy object.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.LintPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.LintPolicyRequest)
      com.google.iam.admin.v1.LintPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_LintPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_LintPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.LintPolicyRequest.class, com.google.iam.admin.v1.LintPolicyRequest.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.LintPolicyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fullResourceName_ = "";

      lintObjectCase_ = 0;
      lintObject_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_LintPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.LintPolicyRequest getDefaultInstanceForType() {
      return com.google.iam.admin.v1.LintPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.LintPolicyRequest build() {
      com.google.iam.admin.v1.LintPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.LintPolicyRequest buildPartial() {
      com.google.iam.admin.v1.LintPolicyRequest result = new com.google.iam.admin.v1.LintPolicyRequest(this);
      result.fullResourceName_ = fullResourceName_;
      if (lintObjectCase_ == 5) {
        if (conditionBuilder_ == null) {
          result.lintObject_ = lintObject_;
        } else {
          result.lintObject_ = conditionBuilder_.build();
        }
      }
      result.lintObjectCase_ = lintObjectCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.iam.admin.v1.LintPolicyRequest) {
        return mergeFrom((com.google.iam.admin.v1.LintPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.LintPolicyRequest other) {
      if (other == com.google.iam.admin.v1.LintPolicyRequest.getDefaultInstance()) return this;
      if (!other.getFullResourceName().isEmpty()) {
        fullResourceName_ = other.fullResourceName_;
        onChanged();
      }
      switch (other.getLintObjectCase()) {
        case CONDITION: {
          mergeCondition(other.getCondition());
          break;
        }
        case LINTOBJECT_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.iam.admin.v1.LintPolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.admin.v1.LintPolicyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int lintObjectCase_ = 0;
    private java.lang.Object lintObject_;
    public LintObjectCase
        getLintObjectCase() {
      return LintObjectCase.forNumber(
          lintObjectCase_);
    }

    public Builder clearLintObject() {
      lintObjectCase_ = 0;
      lintObject_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object fullResourceName_ = "";
    /**
     * <pre>
     * The full resource name of the policy this lint request is about.
     * The name follows the Google Cloud Platform (GCP) resource format.
     * For example, a GCP project with ID `my-project` will be named
     * `//cloudresourcemanager.googleapis.com/projects/my-project`.
     * The resource name is not used to read the policy instance from the Cloud
     * IAM database. The candidate policy for lint has to be provided in the same
     * request object.
     * </pre>
     *
     * <code>string full_resource_name = 1;</code>
     * @return The fullResourceName.
     */
    public java.lang.String getFullResourceName() {
      java.lang.Object ref = fullResourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullResourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The full resource name of the policy this lint request is about.
     * The name follows the Google Cloud Platform (GCP) resource format.
     * For example, a GCP project with ID `my-project` will be named
     * `//cloudresourcemanager.googleapis.com/projects/my-project`.
     * The resource name is not used to read the policy instance from the Cloud
     * IAM database. The candidate policy for lint has to be provided in the same
     * request object.
     * </pre>
     *
     * <code>string full_resource_name = 1;</code>
     * @return The bytes for fullResourceName.
     */
    public com.google.protobuf.ByteString
        getFullResourceNameBytes() {
      java.lang.Object ref = fullResourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullResourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The full resource name of the policy this lint request is about.
     * The name follows the Google Cloud Platform (GCP) resource format.
     * For example, a GCP project with ID `my-project` will be named
     * `//cloudresourcemanager.googleapis.com/projects/my-project`.
     * The resource name is not used to read the policy instance from the Cloud
     * IAM database. The candidate policy for lint has to be provided in the same
     * request object.
     * </pre>
     *
     * <code>string full_resource_name = 1;</code>
     * @param value The fullResourceName to set.
     * @return This builder for chaining.
     */
    public Builder setFullResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fullResourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full resource name of the policy this lint request is about.
     * The name follows the Google Cloud Platform (GCP) resource format.
     * For example, a GCP project with ID `my-project` will be named
     * `//cloudresourcemanager.googleapis.com/projects/my-project`.
     * The resource name is not used to read the policy instance from the Cloud
     * IAM database. The candidate policy for lint has to be provided in the same
     * request object.
     * </pre>
     *
     * <code>string full_resource_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFullResourceName() {
      
      fullResourceName_ = getDefaultInstance().getFullResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full resource name of the policy this lint request is about.
     * The name follows the Google Cloud Platform (GCP) resource format.
     * For example, a GCP project with ID `my-project` will be named
     * `//cloudresourcemanager.googleapis.com/projects/my-project`.
     * The resource name is not used to read the policy instance from the Cloud
     * IAM database. The candidate policy for lint has to be provided in the same
     * request object.
     * </pre>
     *
     * <code>string full_resource_name = 1;</code>
     * @param value The bytes for fullResourceName to set.
     * @return This builder for chaining.
     */
    public Builder setFullResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fullResourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder> conditionBuilder_;
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     * @return Whether the condition field is set.
     */
    @java.lang.Override
    public boolean hasCondition() {
      return lintObjectCase_ == 5;
    }
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     * @return The condition.
     */
    @java.lang.Override
    public com.google.type.Expr getCondition() {
      if (conditionBuilder_ == null) {
        if (lintObjectCase_ == 5) {
          return (com.google.type.Expr) lintObject_;
        }
        return com.google.type.Expr.getDefaultInstance();
      } else {
        if (lintObjectCase_ == 5) {
          return conditionBuilder_.getMessage();
        }
        return com.google.type.Expr.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     */
    public Builder setCondition(com.google.type.Expr value) {
      if (conditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lintObject_ = value;
        onChanged();
      } else {
        conditionBuilder_.setMessage(value);
      }
      lintObjectCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     */
    public Builder setCondition(
        com.google.type.Expr.Builder builderForValue) {
      if (conditionBuilder_ == null) {
        lintObject_ = builderForValue.build();
        onChanged();
      } else {
        conditionBuilder_.setMessage(builderForValue.build());
      }
      lintObjectCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     */
    public Builder mergeCondition(com.google.type.Expr value) {
      if (conditionBuilder_ == null) {
        if (lintObjectCase_ == 5 &&
            lintObject_ != com.google.type.Expr.getDefaultInstance()) {
          lintObject_ = com.google.type.Expr.newBuilder((com.google.type.Expr) lintObject_)
              .mergeFrom(value).buildPartial();
        } else {
          lintObject_ = value;
        }
        onChanged();
      } else {
        if (lintObjectCase_ == 5) {
          conditionBuilder_.mergeFrom(value);
        }
        conditionBuilder_.setMessage(value);
      }
      lintObjectCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     */
    public Builder clearCondition() {
      if (conditionBuilder_ == null) {
        if (lintObjectCase_ == 5) {
          lintObjectCase_ = 0;
          lintObject_ = null;
          onChanged();
        }
      } else {
        if (lintObjectCase_ == 5) {
          lintObjectCase_ = 0;
          lintObject_ = null;
        }
        conditionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     */
    public com.google.type.Expr.Builder getConditionBuilder() {
      return getConditionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     */
    @java.lang.Override
    public com.google.type.ExprOrBuilder getConditionOrBuilder() {
      if ((lintObjectCase_ == 5) && (conditionBuilder_ != null)) {
        return conditionBuilder_.getMessageOrBuilder();
      } else {
        if (lintObjectCase_ == 5) {
          return (com.google.type.Expr) lintObject_;
        }
        return com.google.type.Expr.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
     * </pre>
     *
     * <code>.google.type.Expr condition = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder> 
        getConditionFieldBuilder() {
      if (conditionBuilder_ == null) {
        if (!(lintObjectCase_ == 5)) {
          lintObject_ = com.google.type.Expr.getDefaultInstance();
        }
        conditionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Expr, com.google.type.Expr.Builder, com.google.type.ExprOrBuilder>(
                (com.google.type.Expr) lintObject_,
                getParentForChildren(),
                isClean());
        lintObject_ = null;
      }
      lintObjectCase_ = 5;
      onChanged();;
      return conditionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.LintPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.LintPolicyRequest)
  private static final com.google.iam.admin.v1.LintPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.LintPolicyRequest();
  }

  public static com.google.iam.admin.v1.LintPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LintPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<LintPolicyRequest>() {
    @java.lang.Override
    public LintPolicyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LintPolicyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LintPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LintPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.LintPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

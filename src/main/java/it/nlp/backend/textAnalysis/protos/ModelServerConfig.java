// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tfmodels.proto

package it.nlp.backend.textAnalysis.protos;

/**
 * Protobuf type {@code tensorflow.serving.ModelServerConfig}
 */
public final class ModelServerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.serving.ModelServerConfig)
    ModelServerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModelServerConfig.newBuilder() to construct.
  private ModelServerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModelServerConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModelServerConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelServerConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelServerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.nlp.backend.textAnalysis.protos.ModelServerConfig.class, it.nlp.backend.textAnalysis.protos.ModelServerConfig.Builder.class);
  }

  public static final int MODEL_CONFIG_LIST_FIELD_NUMBER = 1;
  private it.nlp.backend.textAnalysis.protos.ModelConfigList modelConfigList_;
  /**
   * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
   * @return Whether the modelConfigList field is set.
   */
  @java.lang.Override
  public boolean hasModelConfigList() {
    return modelConfigList_ != null;
  }
  /**
   * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
   * @return The modelConfigList.
   */
  @java.lang.Override
  public it.nlp.backend.textAnalysis.protos.ModelConfigList getModelConfigList() {
    return modelConfigList_ == null ? it.nlp.backend.textAnalysis.protos.ModelConfigList.getDefaultInstance() : modelConfigList_;
  }
  /**
   * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
   */
  @java.lang.Override
  public it.nlp.backend.textAnalysis.protos.ModelConfigListOrBuilder getModelConfigListOrBuilder() {
    return modelConfigList_ == null ? it.nlp.backend.textAnalysis.protos.ModelConfigList.getDefaultInstance() : modelConfigList_;
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
    if (modelConfigList_ != null) {
      output.writeMessage(1, getModelConfigList());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modelConfigList_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getModelConfigList());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof it.nlp.backend.textAnalysis.protos.ModelServerConfig)) {
      return super.equals(obj);
    }
    it.nlp.backend.textAnalysis.protos.ModelServerConfig other = (it.nlp.backend.textAnalysis.protos.ModelServerConfig) obj;

    if (hasModelConfigList() != other.hasModelConfigList()) return false;
    if (hasModelConfigList()) {
      if (!getModelConfigList()
          .equals(other.getModelConfigList())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasModelConfigList()) {
      hash = (37 * hash) + MODEL_CONFIG_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getModelConfigList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig parseFrom(
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
  public static Builder newBuilder(it.nlp.backend.textAnalysis.protos.ModelServerConfig prototype) {
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
   * Protobuf type {@code tensorflow.serving.ModelServerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.serving.ModelServerConfig)
      it.nlp.backend.textAnalysis.protos.ModelServerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelServerConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelServerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.nlp.backend.textAnalysis.protos.ModelServerConfig.class, it.nlp.backend.textAnalysis.protos.ModelServerConfig.Builder.class);
    }

    // Construct using it.nlp.backend.textAnalysis.protos.ModelServerConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      modelConfigList_ = null;
      if (modelConfigListBuilder_ != null) {
        modelConfigListBuilder_.dispose();
        modelConfigListBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelServerConfig_descriptor;
    }

    @java.lang.Override
    public it.nlp.backend.textAnalysis.protos.ModelServerConfig getDefaultInstanceForType() {
      return it.nlp.backend.textAnalysis.protos.ModelServerConfig.getDefaultInstance();
    }

    @java.lang.Override
    public it.nlp.backend.textAnalysis.protos.ModelServerConfig build() {
      it.nlp.backend.textAnalysis.protos.ModelServerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.nlp.backend.textAnalysis.protos.ModelServerConfig buildPartial() {
      it.nlp.backend.textAnalysis.protos.ModelServerConfig result = new it.nlp.backend.textAnalysis.protos.ModelServerConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(it.nlp.backend.textAnalysis.protos.ModelServerConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.modelConfigList_ = modelConfigListBuilder_ == null
            ? modelConfigList_
            : modelConfigListBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof it.nlp.backend.textAnalysis.protos.ModelServerConfig) {
        return mergeFrom((it.nlp.backend.textAnalysis.protos.ModelServerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.nlp.backend.textAnalysis.protos.ModelServerConfig other) {
      if (other == it.nlp.backend.textAnalysis.protos.ModelServerConfig.getDefaultInstance()) return this;
      if (other.hasModelConfigList()) {
        mergeModelConfigList(other.getModelConfigList());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getModelConfigListFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private it.nlp.backend.textAnalysis.protos.ModelConfigList modelConfigList_;
    private com.google.protobuf.SingleFieldBuilderV3<
        it.nlp.backend.textAnalysis.protos.ModelConfigList, it.nlp.backend.textAnalysis.protos.ModelConfigList.Builder, it.nlp.backend.textAnalysis.protos.ModelConfigListOrBuilder> modelConfigListBuilder_;
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     * @return Whether the modelConfigList field is set.
     */
    public boolean hasModelConfigList() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     * @return The modelConfigList.
     */
    public it.nlp.backend.textAnalysis.protos.ModelConfigList getModelConfigList() {
      if (modelConfigListBuilder_ == null) {
        return modelConfigList_ == null ? it.nlp.backend.textAnalysis.protos.ModelConfigList.getDefaultInstance() : modelConfigList_;
      } else {
        return modelConfigListBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     */
    public Builder setModelConfigList(it.nlp.backend.textAnalysis.protos.ModelConfigList value) {
      if (modelConfigListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modelConfigList_ = value;
      } else {
        modelConfigListBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     */
    public Builder setModelConfigList(
        it.nlp.backend.textAnalysis.protos.ModelConfigList.Builder builderForValue) {
      if (modelConfigListBuilder_ == null) {
        modelConfigList_ = builderForValue.build();
      } else {
        modelConfigListBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     */
    public Builder mergeModelConfigList(it.nlp.backend.textAnalysis.protos.ModelConfigList value) {
      if (modelConfigListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          modelConfigList_ != null &&
          modelConfigList_ != it.nlp.backend.textAnalysis.protos.ModelConfigList.getDefaultInstance()) {
          getModelConfigListBuilder().mergeFrom(value);
        } else {
          modelConfigList_ = value;
        }
      } else {
        modelConfigListBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     */
    public Builder clearModelConfigList() {
      bitField0_ = (bitField0_ & ~0x00000001);
      modelConfigList_ = null;
      if (modelConfigListBuilder_ != null) {
        modelConfigListBuilder_.dispose();
        modelConfigListBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     */
    public it.nlp.backend.textAnalysis.protos.ModelConfigList.Builder getModelConfigListBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getModelConfigListFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     */
    public it.nlp.backend.textAnalysis.protos.ModelConfigListOrBuilder getModelConfigListOrBuilder() {
      if (modelConfigListBuilder_ != null) {
        return modelConfigListBuilder_.getMessageOrBuilder();
      } else {
        return modelConfigList_ == null ?
            it.nlp.backend.textAnalysis.protos.ModelConfigList.getDefaultInstance() : modelConfigList_;
      }
    }
    /**
     * <code>.tensorflow.serving.ModelConfigList model_config_list = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        it.nlp.backend.textAnalysis.protos.ModelConfigList, it.nlp.backend.textAnalysis.protos.ModelConfigList.Builder, it.nlp.backend.textAnalysis.protos.ModelConfigListOrBuilder> 
        getModelConfigListFieldBuilder() {
      if (modelConfigListBuilder_ == null) {
        modelConfigListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            it.nlp.backend.textAnalysis.protos.ModelConfigList, it.nlp.backend.textAnalysis.protos.ModelConfigList.Builder, it.nlp.backend.textAnalysis.protos.ModelConfigListOrBuilder>(
                getModelConfigList(),
                getParentForChildren(),
                isClean());
        modelConfigList_ = null;
      }
      return modelConfigListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.serving.ModelServerConfig)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.serving.ModelServerConfig)
  private static final it.nlp.backend.textAnalysis.protos.ModelServerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.nlp.backend.textAnalysis.protos.ModelServerConfig();
  }

  public static it.nlp.backend.textAnalysis.protos.ModelServerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelServerConfig>
      PARSER = new com.google.protobuf.AbstractParser<ModelServerConfig>() {
    @java.lang.Override
    public ModelServerConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ModelServerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelServerConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.nlp.backend.textAnalysis.protos.ModelServerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


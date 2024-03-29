// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tfmodels.proto

package it.nlp.backend.textAnalysis.protos;

/**
 * Protobuf type {@code tensorflow.serving.ModelConfigList}
 */
public final class ModelConfigList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.serving.ModelConfigList)
    ModelConfigListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModelConfigList.newBuilder() to construct.
  private ModelConfigList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModelConfigList() {
    config_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModelConfigList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelConfigList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelConfigList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.nlp.backend.textAnalysis.protos.ModelConfigList.class, it.nlp.backend.textAnalysis.protos.ModelConfigList.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<it.nlp.backend.textAnalysis.protos.ModelConfig> config_;
  /**
   * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
   */
  @java.lang.Override
  public java.util.List<it.nlp.backend.textAnalysis.protos.ModelConfig> getConfigList() {
    return config_;
  }
  /**
   * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends it.nlp.backend.textAnalysis.protos.ModelConfigOrBuilder> 
      getConfigOrBuilderList() {
    return config_;
  }
  /**
   * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
   */
  @java.lang.Override
  public int getConfigCount() {
    return config_.size();
  }
  /**
   * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
   */
  @java.lang.Override
  public it.nlp.backend.textAnalysis.protos.ModelConfig getConfig(int index) {
    return config_.get(index);
  }
  /**
   * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
   */
  @java.lang.Override
  public it.nlp.backend.textAnalysis.protos.ModelConfigOrBuilder getConfigOrBuilder(
      int index) {
    return config_.get(index);
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
    for (int i = 0; i < config_.size(); i++) {
      output.writeMessage(1, config_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < config_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, config_.get(i));
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
    if (!(obj instanceof it.nlp.backend.textAnalysis.protos.ModelConfigList)) {
      return super.equals(obj);
    }
    it.nlp.backend.textAnalysis.protos.ModelConfigList other = (it.nlp.backend.textAnalysis.protos.ModelConfigList) obj;

    if (!getConfigList()
        .equals(other.getConfigList())) return false;
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
    if (getConfigCount() > 0) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfigList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.nlp.backend.textAnalysis.protos.ModelConfigList parseFrom(
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
  public static Builder newBuilder(it.nlp.backend.textAnalysis.protos.ModelConfigList prototype) {
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
   * Protobuf type {@code tensorflow.serving.ModelConfigList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.serving.ModelConfigList)
      it.nlp.backend.textAnalysis.protos.ModelConfigListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelConfigList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelConfigList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.nlp.backend.textAnalysis.protos.ModelConfigList.class, it.nlp.backend.textAnalysis.protos.ModelConfigList.Builder.class);
    }

    // Construct using it.nlp.backend.textAnalysis.protos.ModelConfigList.newBuilder()
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
      if (configBuilder_ == null) {
        config_ = java.util.Collections.emptyList();
      } else {
        config_ = null;
        configBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.nlp.backend.textAnalysis.protos.ModelServerConfigProtos.internal_static_tensorflow_serving_ModelConfigList_descriptor;
    }

    @java.lang.Override
    public it.nlp.backend.textAnalysis.protos.ModelConfigList getDefaultInstanceForType() {
      return it.nlp.backend.textAnalysis.protos.ModelConfigList.getDefaultInstance();
    }

    @java.lang.Override
    public it.nlp.backend.textAnalysis.protos.ModelConfigList build() {
      it.nlp.backend.textAnalysis.protos.ModelConfigList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.nlp.backend.textAnalysis.protos.ModelConfigList buildPartial() {
      it.nlp.backend.textAnalysis.protos.ModelConfigList result = new it.nlp.backend.textAnalysis.protos.ModelConfigList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(it.nlp.backend.textAnalysis.protos.ModelConfigList result) {
      if (configBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          config_ = java.util.Collections.unmodifiableList(config_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
    }

    private void buildPartial0(it.nlp.backend.textAnalysis.protos.ModelConfigList result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof it.nlp.backend.textAnalysis.protos.ModelConfigList) {
        return mergeFrom((it.nlp.backend.textAnalysis.protos.ModelConfigList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.nlp.backend.textAnalysis.protos.ModelConfigList other) {
      if (other == it.nlp.backend.textAnalysis.protos.ModelConfigList.getDefaultInstance()) return this;
      if (configBuilder_ == null) {
        if (!other.config_.isEmpty()) {
          if (config_.isEmpty()) {
            config_ = other.config_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConfigIsMutable();
            config_.addAll(other.config_);
          }
          onChanged();
        }
      } else {
        if (!other.config_.isEmpty()) {
          if (configBuilder_.isEmpty()) {
            configBuilder_.dispose();
            configBuilder_ = null;
            config_ = other.config_;
            bitField0_ = (bitField0_ & ~0x00000001);
            configBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConfigFieldBuilder() : null;
          } else {
            configBuilder_.addAllMessages(other.config_);
          }
        }
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
              it.nlp.backend.textAnalysis.protos.ModelConfig m =
                  input.readMessage(
                      it.nlp.backend.textAnalysis.protos.ModelConfig.parser(),
                      extensionRegistry);
              if (configBuilder_ == null) {
                ensureConfigIsMutable();
                config_.add(m);
              } else {
                configBuilder_.addMessage(m);
              }
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

    private java.util.List<it.nlp.backend.textAnalysis.protos.ModelConfig> config_ =
      java.util.Collections.emptyList();
    private void ensureConfigIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        config_ = new java.util.ArrayList<it.nlp.backend.textAnalysis.protos.ModelConfig>(config_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        it.nlp.backend.textAnalysis.protos.ModelConfig, it.nlp.backend.textAnalysis.protos.ModelConfig.Builder, it.nlp.backend.textAnalysis.protos.ModelConfigOrBuilder> configBuilder_;

    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public java.util.List<it.nlp.backend.textAnalysis.protos.ModelConfig> getConfigList() {
      if (configBuilder_ == null) {
        return java.util.Collections.unmodifiableList(config_);
      } else {
        return configBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public int getConfigCount() {
      if (configBuilder_ == null) {
        return config_.size();
      } else {
        return configBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public it.nlp.backend.textAnalysis.protos.ModelConfig getConfig(int index) {
      if (configBuilder_ == null) {
        return config_.get(index);
      } else {
        return configBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder setConfig(
        int index, it.nlp.backend.textAnalysis.protos.ModelConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigIsMutable();
        config_.set(index, value);
        onChanged();
      } else {
        configBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder setConfig(
        int index, it.nlp.backend.textAnalysis.protos.ModelConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        ensureConfigIsMutable();
        config_.set(index, builderForValue.build());
        onChanged();
      } else {
        configBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder addConfig(it.nlp.backend.textAnalysis.protos.ModelConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigIsMutable();
        config_.add(value);
        onChanged();
      } else {
        configBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder addConfig(
        int index, it.nlp.backend.textAnalysis.protos.ModelConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigIsMutable();
        config_.add(index, value);
        onChanged();
      } else {
        configBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder addConfig(
        it.nlp.backend.textAnalysis.protos.ModelConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        ensureConfigIsMutable();
        config_.add(builderForValue.build());
        onChanged();
      } else {
        configBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder addConfig(
        int index, it.nlp.backend.textAnalysis.protos.ModelConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        ensureConfigIsMutable();
        config_.add(index, builderForValue.build());
        onChanged();
      } else {
        configBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder addAllConfig(
        java.lang.Iterable<? extends it.nlp.backend.textAnalysis.protos.ModelConfig> values) {
      if (configBuilder_ == null) {
        ensureConfigIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, config_);
        onChanged();
      } else {
        configBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        configBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public Builder removeConfig(int index) {
      if (configBuilder_ == null) {
        ensureConfigIsMutable();
        config_.remove(index);
        onChanged();
      } else {
        configBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public it.nlp.backend.textAnalysis.protos.ModelConfig.Builder getConfigBuilder(
        int index) {
      return getConfigFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public it.nlp.backend.textAnalysis.protos.ModelConfigOrBuilder getConfigOrBuilder(
        int index) {
      if (configBuilder_ == null) {
        return config_.get(index);  } else {
        return configBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public java.util.List<? extends it.nlp.backend.textAnalysis.protos.ModelConfigOrBuilder> 
         getConfigOrBuilderList() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(config_);
      }
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public it.nlp.backend.textAnalysis.protos.ModelConfig.Builder addConfigBuilder() {
      return getConfigFieldBuilder().addBuilder(
          it.nlp.backend.textAnalysis.protos.ModelConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public it.nlp.backend.textAnalysis.protos.ModelConfig.Builder addConfigBuilder(
        int index) {
      return getConfigFieldBuilder().addBuilder(
          index, it.nlp.backend.textAnalysis.protos.ModelConfig.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.serving.ModelConfig config = 1;</code>
     */
    public java.util.List<it.nlp.backend.textAnalysis.protos.ModelConfig.Builder> 
         getConfigBuilderList() {
      return getConfigFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        it.nlp.backend.textAnalysis.protos.ModelConfig, it.nlp.backend.textAnalysis.protos.ModelConfig.Builder, it.nlp.backend.textAnalysis.protos.ModelConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            it.nlp.backend.textAnalysis.protos.ModelConfig, it.nlp.backend.textAnalysis.protos.ModelConfig.Builder, it.nlp.backend.textAnalysis.protos.ModelConfigOrBuilder>(
                config_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.serving.ModelConfigList)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.serving.ModelConfigList)
  private static final it.nlp.backend.textAnalysis.protos.ModelConfigList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.nlp.backend.textAnalysis.protos.ModelConfigList();
  }

  public static it.nlp.backend.textAnalysis.protos.ModelConfigList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelConfigList>
      PARSER = new com.google.protobuf.AbstractParser<ModelConfigList>() {
    @java.lang.Override
    public ModelConfigList parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModelConfigList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelConfigList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.nlp.backend.textAnalysis.protos.ModelConfigList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


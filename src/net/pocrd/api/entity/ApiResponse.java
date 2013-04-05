// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: net/pocrd/api/entity/Api_Response.proto

package net.pocrd.api.entity;

public final class ApiResponse {
  private ApiResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Api_ResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 systime = 1;
    boolean hasSystime();
    long getSystime();
    
    // repeated .net.pocrd.api.entity.Api_CallStatus status = 2;
    java.util.List<net.pocrd.api.entity.ApiCallStatus.Api_CallStatus> 
        getStatusList();
    net.pocrd.api.entity.ApiCallStatus.Api_CallStatus getStatus(int index);
    int getStatusCount();
    java.util.List<? extends net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder> 
        getStatusOrBuilderList();
    net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder getStatusOrBuilder(
        int index);
  }
  public static final class Api_Response extends
      com.google.protobuf.GeneratedMessage
      implements Api_ResponseOrBuilder {
    // Use Api_Response.newBuilder() to construct.
    private Api_Response(Builder builder) {
      super(builder);
    }
    private Api_Response(boolean noInit) {}
    
    private static final Api_Response defaultInstance;
    public static Api_Response getDefaultInstance() {
      return defaultInstance;
    }
    
    public Api_Response getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pocrd.api.entity.ApiResponse.internal_static_net_pocrd_api_entity_Api_Response_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pocrd.api.entity.ApiResponse.internal_static_net_pocrd_api_entity_Api_Response_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 systime = 1;
    public static final int SYSTIME_FIELD_NUMBER = 1;
    private long systime_;
    public boolean hasSystime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getSystime() {
      return systime_;
    }
    
    // repeated .net.pocrd.api.entity.Api_CallStatus status = 2;
    public static final int STATUS_FIELD_NUMBER = 2;
    private java.util.List<net.pocrd.api.entity.ApiCallStatus.Api_CallStatus> status_;
    public java.util.List<net.pocrd.api.entity.ApiCallStatus.Api_CallStatus> getStatusList() {
      return status_;
    }
    public java.util.List<? extends net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder> 
        getStatusOrBuilderList() {
      return status_;
    }
    public int getStatusCount() {
      return status_.size();
    }
    public net.pocrd.api.entity.ApiCallStatus.Api_CallStatus getStatus(int index) {
      return status_.get(index);
    }
    public net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder getStatusOrBuilder(
        int index) {
      return status_.get(index);
    }
    
    private void initFields() {
      systime_ = 0L;
      status_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSystime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getStatusCount(); i++) {
        if (!getStatus(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, systime_);
      }
      for (int i = 0; i < status_.size(); i++) {
        output.writeMessage(2, status_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, systime_);
      }
      for (int i = 0; i < status_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, status_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pocrd.api.entity.ApiResponse.Api_Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pocrd.api.entity.ApiResponse.Api_Response prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements net.pocrd.api.entity.ApiResponse.Api_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pocrd.api.entity.ApiResponse.internal_static_net_pocrd_api_entity_Api_Response_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pocrd.api.entity.ApiResponse.internal_static_net_pocrd_api_entity_Api_Response_fieldAccessorTable;
      }
      
      // Construct using net.pocrd.api.entity.ApiResponse.Api_Response.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStatusFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        systime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (statusBuilder_ == null) {
          status_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          statusBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pocrd.api.entity.ApiResponse.Api_Response.getDescriptor();
      }
      
      public net.pocrd.api.entity.ApiResponse.Api_Response getDefaultInstanceForType() {
        return net.pocrd.api.entity.ApiResponse.Api_Response.getDefaultInstance();
      }
      
      public net.pocrd.api.entity.ApiResponse.Api_Response build() {
        net.pocrd.api.entity.ApiResponse.Api_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pocrd.api.entity.ApiResponse.Api_Response buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pocrd.api.entity.ApiResponse.Api_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pocrd.api.entity.ApiResponse.Api_Response buildPartial() {
        net.pocrd.api.entity.ApiResponse.Api_Response result = new net.pocrd.api.entity.ApiResponse.Api_Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.systime_ = systime_;
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            status_ = java.util.Collections.unmodifiableList(status_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pocrd.api.entity.ApiResponse.Api_Response) {
          return mergeFrom((net.pocrd.api.entity.ApiResponse.Api_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pocrd.api.entity.ApiResponse.Api_Response other) {
        if (other == net.pocrd.api.entity.ApiResponse.Api_Response.getDefaultInstance()) return this;
        if (other.hasSystime()) {
          setSystime(other.getSystime());
        }
        if (statusBuilder_ == null) {
          if (!other.status_.isEmpty()) {
            if (status_.isEmpty()) {
              status_ = other.status_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureStatusIsMutable();
              status_.addAll(other.status_);
            }
            onChanged();
          }
        } else {
          if (!other.status_.isEmpty()) {
            if (statusBuilder_.isEmpty()) {
              statusBuilder_.dispose();
              statusBuilder_ = null;
              status_ = other.status_;
              bitField0_ = (bitField0_ & ~0x00000002);
              statusBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStatusFieldBuilder() : null;
            } else {
              statusBuilder_.addAllMessages(other.status_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSystime()) {
          
          return false;
        }
        for (int i = 0; i < getStatusCount(); i++) {
          if (!getStatus(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              systime_ = input.readInt64();
              break;
            }
            case 18: {
              net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder subBuilder = net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addStatus(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 systime = 1;
      private long systime_ ;
      public boolean hasSystime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getSystime() {
        return systime_;
      }
      public Builder setSystime(long value) {
        bitField0_ |= 0x00000001;
        systime_ = value;
        onChanged();
        return this;
      }
      public Builder clearSystime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        systime_ = 0L;
        onChanged();
        return this;
      }
      
      // repeated .net.pocrd.api.entity.Api_CallStatus status = 2;
      private java.util.List<net.pocrd.api.entity.ApiCallStatus.Api_CallStatus> status_ =
        java.util.Collections.emptyList();
      private void ensureStatusIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          status_ = new java.util.ArrayList<net.pocrd.api.entity.ApiCallStatus.Api_CallStatus>(status_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pocrd.api.entity.ApiCallStatus.Api_CallStatus, net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder, net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder> statusBuilder_;
      
      public java.util.List<net.pocrd.api.entity.ApiCallStatus.Api_CallStatus> getStatusList() {
        if (statusBuilder_ == null) {
          return java.util.Collections.unmodifiableList(status_);
        } else {
          return statusBuilder_.getMessageList();
        }
      }
      public int getStatusCount() {
        if (statusBuilder_ == null) {
          return status_.size();
        } else {
          return statusBuilder_.getCount();
        }
      }
      public net.pocrd.api.entity.ApiCallStatus.Api_CallStatus getStatus(int index) {
        if (statusBuilder_ == null) {
          return status_.get(index);
        } else {
          return statusBuilder_.getMessage(index);
        }
      }
      public Builder setStatus(
          int index, net.pocrd.api.entity.ApiCallStatus.Api_CallStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusIsMutable();
          status_.set(index, value);
          onChanged();
        } else {
          statusBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setStatus(
          int index, net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          status_.set(index, builderForValue.build());
          onChanged();
        } else {
          statusBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addStatus(net.pocrd.api.entity.ApiCallStatus.Api_CallStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusIsMutable();
          status_.add(value);
          onChanged();
        } else {
          statusBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addStatus(
          int index, net.pocrd.api.entity.ApiCallStatus.Api_CallStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusIsMutable();
          status_.add(index, value);
          onChanged();
        } else {
          statusBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addStatus(
          net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          status_.add(builderForValue.build());
          onChanged();
        } else {
          statusBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addStatus(
          int index, net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          status_.add(index, builderForValue.build());
          onChanged();
        } else {
          statusBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllStatus(
          java.lang.Iterable<? extends net.pocrd.api.entity.ApiCallStatus.Api_CallStatus> values) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          super.addAll(values, status_);
          onChanged();
        } else {
          statusBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        return this;
      }
      public Builder removeStatus(int index) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          status_.remove(index);
          onChanged();
        } else {
          statusBuilder_.remove(index);
        }
        return this;
      }
      public net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder getStatusBuilder(
          int index) {
        return getStatusFieldBuilder().getBuilder(index);
      }
      public net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder getStatusOrBuilder(
          int index) {
        if (statusBuilder_ == null) {
          return status_.get(index);  } else {
          return statusBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder> 
           getStatusOrBuilderList() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(status_);
        }
      }
      public net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder addStatusBuilder() {
        return getStatusFieldBuilder().addBuilder(
            net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.getDefaultInstance());
      }
      public net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder addStatusBuilder(
          int index) {
        return getStatusFieldBuilder().addBuilder(
            index, net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.getDefaultInstance());
      }
      public java.util.List<net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder> 
           getStatusBuilderList() {
        return getStatusFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pocrd.api.entity.ApiCallStatus.Api_CallStatus, net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder, net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder> 
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              net.pocrd.api.entity.ApiCallStatus.Api_CallStatus, net.pocrd.api.entity.ApiCallStatus.Api_CallStatus.Builder, net.pocrd.api.entity.ApiCallStatus.Api_CallStatusOrBuilder>(
                  status_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          status_ = null;
        }
        return statusBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:net.pocrd.api.entity.Api_Response)
    }
    
    static {
      defaultInstance = new Api_Response(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.pocrd.api.entity.Api_Response)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_pocrd_api_entity_Api_Response_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_pocrd_api_entity_Api_Response_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'net/pocrd/api/entity/Api_Response.prot" +
      "o\022\024net.pocrd.api.entity\032)net/pocrd/api/e" +
      "ntity/Api_CallStatus.proto\"U\n\014Api_Respon" +
      "se\022\017\n\007systime\030\001 \002(\003\0224\n\006status\030\002 \003(\0132$.ne" +
      "t.pocrd.api.entity.Api_CallStatus"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_pocrd_api_entity_Api_Response_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_pocrd_api_entity_Api_Response_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_pocrd_api_entity_Api_Response_descriptor,
              new java.lang.String[] { "Systime", "Status", },
              net.pocrd.api.entity.ApiResponse.Api_Response.class,
              net.pocrd.api.entity.ApiResponse.Api_Response.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          net.pocrd.api.entity.ApiCallStatus.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
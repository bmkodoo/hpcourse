package chat.chatserver;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

public final class Message {
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Msg_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Msg_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\rMessage.proto\"1\n\003Msg\022\016\n\006Sender\030\001 \002(\t\022\014" +
                        "\n\004Text\030\002 \002(\t\022\014\n\004Data\030\003 \001(\t"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_Msg_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_Msg_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_Msg_descriptor,
                new java.lang.String[]{"Sender", "Text", "Data",});
    }

    private Message() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    public interface MsgOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Msg)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string Sender = 1;</code>
         * <p/>
         * <pre>
         * &#47;&lt; �?дентификатор отправителя
         * </pre>
         */
        boolean hasSender();

        /**
         * <code>required string Sender = 1;</code>
         * <p/>
         * <pre>
         * &#47;&lt; �?дентификатор отправителя
         * </pre>
         */
        java.lang.String getSender();

        /**
         * <code>required string Sender = 1;</code>
         * <p/>
         * <pre>
         * &#47;&lt; �?дентификатор отправителя
         * </pre>
         */
        com.google.protobuf.ByteString
        getSenderBytes();

        /**
         * <code>required string Text = 2;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Содержание сообщения
         * </pre>
         */
        boolean hasText();

        /**
         * <code>required string Text = 2;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Содержание сообщения
         * </pre>
         */
        java.lang.String getText();

        /**
         * <code>required string Text = 2;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Содержание сообщения
         * </pre>
         */
        com.google.protobuf.ByteString
        getTextBytes();

        /**
         * <code>optional string Data = 3;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
         * </pre>
         */
        boolean hasData();

        /**
         * <code>optional string Data = 3;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
         * </pre>
         */
        java.lang.String getData();

        /**
         * <code>optional string Data = 3;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
         * </pre>
         */
        com.google.protobuf.ByteString
        getDataBytes();
    }

    /**
     * Protobuf type {@code Msg}
     * <p/>
     * <pre>
     * -------------------------------------------------------------------
     * / &#92;brief Message - сообщение, передаваемое между сервером и клиентами
     * -------------------------------------------------------------------
     * </pre>
     */
    public static final class Msg extends
            com.google.protobuf.GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:Msg)
            MsgOrBuilder {
        public static final int SENDER_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int DATA_FIELD_NUMBER = 3;
        private static final Msg defaultInstance;
        private static final long serialVersionUID = 0L;
        public static com.google.protobuf.Parser<Msg> PARSER =
                new com.google.protobuf.AbstractParser<Msg>() {
                    public Msg parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Msg(input, extensionRegistry);
                    }
                };

        static {
            defaultInstance = new Msg(true);
            defaultInstance.initFields();
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        private int bitField0_;
        private java.lang.Object sender_;
        private java.lang.Object text_;
        private java.lang.Object data_;
        private byte memoizedIsInitialized = -1;
        private int memoizedSerializedSize = -1;
        // Use Msg.newBuilder() to construct.
        private Msg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private Msg(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private Msg(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            sender_ = bs;
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            text_ = bs;
                            break;
                        }
                        case 26: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000004;
                            data_ = bs;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static Msg getDefaultInstance() {
            return defaultInstance;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Message.internal_static_Msg_descriptor;
        }

        public static Message.Msg parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static Message.Msg parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static Message.Msg parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static Message.Msg parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static Message.Msg parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static Message.Msg parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Message.Msg parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static Message.Msg parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static Message.Msg parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static Message.Msg parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(Message.Msg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Msg getDefaultInstanceForType() {
            return defaultInstance;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Message.internal_static_Msg_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Message.Msg.class, Message.Msg.Builder.class);
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Msg> getParserForType() {
            return PARSER;
        }

        /**
         * <code>required string Sender = 1;</code>
         * <p/>
         * <pre>
         * &#47;&lt; �?дентификатор отправителя
         * </pre>
         */
        public boolean hasSender() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>required string Sender = 1;</code>
         * <p/>
         * <pre>
         * &#47;&lt; �?дентификатор отправителя
         * </pre>
         */
        public java.lang.String getSender() {
            java.lang.Object ref = sender_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    sender_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string Sender = 1;</code>
         * <p/>
         * <pre>
         * &#47;&lt; �?дентификатор отправителя
         * </pre>
         */
        public com.google.protobuf.ByteString
        getSenderBytes() {
            java.lang.Object ref = sender_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                sender_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>required string Text = 2;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Содержание сообщения
         * </pre>
         */
        public boolean hasText() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>required string Text = 2;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Содержание сообщения
         * </pre>
         */
        public java.lang.String getText() {
            java.lang.Object ref = text_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    text_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string Text = 2;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Содержание сообщения
         * </pre>
         */
        public com.google.protobuf.ByteString
        getTextBytes() {
            java.lang.Object ref = text_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                text_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string Data = 3;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
         * </pre>
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional string Data = 3;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
         * </pre>
         */
        public java.lang.String getData() {
            java.lang.Object ref = data_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    data_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string Data = 3;</code>
         * <p/>
         * <pre>
         * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
         * </pre>
         */
        public com.google.protobuf.ByteString
        getDataBytes() {
            java.lang.Object ref = data_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                data_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            sender_ = "";
            text_ = "";
            data_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasSender()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasText()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getSenderBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getTextBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getDataBytes());
            }
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getSenderBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getTextBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getDataBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code Msg}
         * <p/>
         * <pre>
         * -------------------------------------------------------------------
         * / &#92;brief Message - сообщение, передаваемое между сервером и клиентами
         * -------------------------------------------------------------------
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Msg)
                Message.MsgOrBuilder {
            private int bitField0_;
            private java.lang.Object sender_ = "";
            private java.lang.Object text_ = "";
            private java.lang.Object data_ = "";

            // Construct using Message.Msg.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Message.internal_static_Msg_descriptor;
            }

            private static Builder create() {
                return new Builder();
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Message.internal_static_Msg_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Message.Msg.class, Message.Msg.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                sender_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                text_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                data_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Message.internal_static_Msg_descriptor;
            }

            public Message.Msg getDefaultInstanceForType() {
                return Message.Msg.getDefaultInstance();
            }

            public Message.Msg build() {
                Message.Msg result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Message.Msg buildPartial() {
                Message.Msg result = new Message.Msg(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.sender_ = sender_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.text_ = text_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Message.Msg) {
                    return mergeFrom((Message.Msg) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Message.Msg other) {
                if (other == Message.Msg.getDefaultInstance()) return this;
                if (other.hasSender()) {
                    bitField0_ |= 0x00000001;
                    sender_ = other.sender_;
                    onChanged();
                }
                if (other.hasText()) {
                    bitField0_ |= 0x00000002;
                    text_ = other.text_;
                    onChanged();
                }
                if (other.hasData()) {
                    bitField0_ |= 0x00000004;
                    data_ = other.data_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSender()) {

                    return false;
                }
                if (!hasText()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Message.Msg parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Message.Msg) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>required string Sender = 1;</code>
             * <p/>
             * <pre>
             * &#47;&lt; �?дентификатор отправителя
             * </pre>
             */
            public boolean hasSender() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>required string Sender = 1;</code>
             * <p/>
             * <pre>
             * &#47;&lt; �?дентификатор отправителя
             * </pre>
             */
            public java.lang.String getSender() {
                java.lang.Object ref = sender_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        sender_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>required string Sender = 1;</code>
             * <p/>
             * <pre>
             * &#47;&lt; �?дентификатор отправителя
             * </pre>
             */
            public Builder setSender(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                sender_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string Sender = 1;</code>
             * <p/>
             * <pre>
             * &#47;&lt; �?дентификатор отправителя
             * </pre>
             */
            public com.google.protobuf.ByteString
            getSenderBytes() {
                java.lang.Object ref = sender_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    sender_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string Sender = 1;</code>
             * <p/>
             * <pre>
             * &#47;&lt; �?дентификатор отправителя
             * </pre>
             */
            public Builder setSenderBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                sender_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string Sender = 1;</code>
             * <p/>
             * <pre>
             * &#47;&lt; �?дентификатор отправителя
             * </pre>
             */
            public Builder clearSender() {
                bitField0_ = (bitField0_ & ~0x00000001);
                sender_ = getDefaultInstance().getSender();
                onChanged();
                return this;
            }

            /**
             * <code>required string Text = 2;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Содержание сообщения
             * </pre>
             */
            public boolean hasText() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>required string Text = 2;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Содержание сообщения
             * </pre>
             */
            public java.lang.String getText() {
                java.lang.Object ref = text_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        text_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>required string Text = 2;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Содержание сообщения
             * </pre>
             */
            public Builder setText(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                text_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string Text = 2;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Содержание сообщения
             * </pre>
             */
            public com.google.protobuf.ByteString
            getTextBytes() {
                java.lang.Object ref = text_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    text_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string Text = 2;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Содержание сообщения
             * </pre>
             */
            public Builder setTextBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                text_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string Text = 2;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Содержание сообщения
             * </pre>
             */
            public Builder clearText() {
                bitField0_ = (bitField0_ & ~0x00000002);
                text_ = getDefaultInstance().getText();
                onChanged();
                return this;
            }

            /**
             * <code>optional string Data = 3;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
             * </pre>
             */
            public boolean hasData() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>optional string Data = 3;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
             * </pre>
             */
            public java.lang.String getData() {
                java.lang.Object ref = data_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        data_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string Data = 3;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
             * </pre>
             */
            public Builder setData(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                data_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string Data = 3;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
             * </pre>
             */
            public com.google.protobuf.ByteString
            getDataBytes() {
                java.lang.Object ref = data_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    data_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>optional string Data = 3;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
             * </pre>
             */
            public Builder setDataBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                data_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string Data = 3;</code>
             * <p/>
             * <pre>
             * &#47;&lt; Internal field. Можно использовать для реализации каких-либо
             * </pre>
             */
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000004);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Msg)
        }

        // @@protoc_insertion_point(class_scope:Msg)
    }

    // @@protoc_insertion_point(outer_class_scope)
}

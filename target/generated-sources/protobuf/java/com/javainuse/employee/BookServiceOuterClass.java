// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book-service.proto

package com.javainuse.employee;

public final class BookServiceOuterClass {
  private BookServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BookPostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BookPostRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022book-service.proto\032\024constants/util.pro" +
      "to\"\036\n\013BookRequest\022\017\n\007book_id\030\001 \001(\t\"L\n\014Bo" +
      "okResponse\022\017\n\007book_id\030\001 \001(\t\022\014\n\004name\030\002 \001(" +
      "\t\022\035\n\004type\030\003 \001(\0162\017.constants.Type\">\n\017Book" +
      "PostRequest\022\014\n\004name\030\002 \001(\t\022\035\n\004type\030\003 \001(\0162" +
      "\017.constants.Type2f\n\013BookService\022(\n\007getBo" +
      "ok\022\014.BookRequest\032\r.BookResponse\"\000\022-\n\010pos" +
      "tBook\022\020.BookPostRequest\032\r.BookResponse\"\000" +
      "B\032\n\026com.javainuse.employeeP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.javainuse.constants.Util.getDescriptor(),
        }, assigner);
    internal_static_BookRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BookRequest_descriptor,
        new java.lang.String[] { "BookId", });
    internal_static_BookResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_BookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BookResponse_descriptor,
        new java.lang.String[] { "BookId", "Name", "Type", });
    internal_static_BookPostRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_BookPostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BookPostRequest_descriptor,
        new java.lang.String[] { "Name", "Type", });
    com.javainuse.constants.Util.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

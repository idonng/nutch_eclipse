package org.apache.nutch.storage;

@SuppressWarnings("all")
public class ProtocolStatus extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"ProtocolStatus\",\"namespace\":\"org.apache.nutch.storage\",\"fields\":[{\"name\":\"code\",\"type\":\"int\"},{\"name\":\"args\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"lastModified\",\"type\":\"long\"}]}");
  public int code;
  public org.apache.avro.generic.GenericArray<org.apache.avro.util.Utf8> args;
  public long lastModified;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return code;
    case 1: return args;
    case 2: return lastModified;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: code = (java.lang.Integer)value$; break;
    case 1: args = (org.apache.avro.generic.GenericArray<org.apache.avro.util.Utf8>)value$; break;
    case 2: lastModified = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}

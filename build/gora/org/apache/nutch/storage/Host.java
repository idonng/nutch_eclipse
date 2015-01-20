package org.apache.nutch.storage;

@SuppressWarnings("all")
public class Host extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Host\",\"namespace\":\"org.apache.nutch.storage\",\"fields\":[{\"name\":\"metadata\",\"type\":{\"type\":\"map\",\"values\":\"bytes\"}},{\"name\":\"outlinks\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"inlinks\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  public java.util.Map<org.apache.avro.util.Utf8,java.nio.ByteBuffer> metadata;
  public java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8> outlinks;
  public java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8> inlinks;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return metadata;
    case 1: return outlinks;
    case 2: return inlinks;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: metadata = (java.util.Map<org.apache.avro.util.Utf8,java.nio.ByteBuffer>)value$; break;
    case 1: outlinks = (java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8>)value$; break;
    case 2: inlinks = (java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}

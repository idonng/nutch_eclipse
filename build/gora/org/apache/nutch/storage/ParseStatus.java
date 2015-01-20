package org.apache.nutch.storage;

@SuppressWarnings("all")
public class ParseStatus extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"ParseStatus\",\"namespace\":\"org.apache.nutch.storage\",\"fields\":[{\"name\":\"majorCode\",\"type\":\"int\"},{\"name\":\"minorCode\",\"type\":\"int\"},{\"name\":\"args\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");
  public int majorCode;
  public int minorCode;
  public org.apache.avro.generic.GenericArray<org.apache.avro.util.Utf8> args;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return majorCode;
    case 1: return minorCode;
    case 2: return args;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: majorCode = (java.lang.Integer)value$; break;
    case 1: minorCode = (java.lang.Integer)value$; break;
    case 2: args = (org.apache.avro.generic.GenericArray<org.apache.avro.util.Utf8>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}

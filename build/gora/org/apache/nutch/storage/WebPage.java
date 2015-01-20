package org.apache.nutch.storage;

@SuppressWarnings("all")
public class WebPage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"WebPage\",\"namespace\":\"org.apache.nutch.storage\",\"fields\":[{\"name\":\"baseUrl\",\"type\":[\"null\",\"string\"]},{\"name\":\"status\",\"type\":\"int\"},{\"name\":\"fetchTime\",\"type\":\"long\"},{\"name\":\"prevFetchTime\",\"type\":\"long\"},{\"name\":\"fetchInterval\",\"type\":\"int\"},{\"name\":\"retriesSinceFetch\",\"type\":\"int\"},{\"name\":\"modifiedTime\",\"type\":\"long\"},{\"name\":\"prevModifiedTime\",\"type\":\"long\"},{\"name\":\"protocolStatus\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ProtocolStatus\",\"fields\":[{\"name\":\"code\",\"type\":\"int\"},{\"name\":\"args\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"lastModified\",\"type\":\"long\"}]}]},{\"name\":\"content\",\"type\":[\"null\",\"bytes\"]},{\"name\":\"contentType\",\"type\":[\"null\",\"string\"]},{\"name\":\"prevSignature\",\"type\":[\"null\",\"bytes\"]},{\"name\":\"signature\",\"type\":[\"null\",\"bytes\"]},{\"name\":\"title\",\"type\":[\"null\",\"string\"]},{\"name\":\"text\",\"type\":[\"null\",\"string\"]},{\"name\":\"parseStatus\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ParseStatus\",\"fields\":[{\"name\":\"majorCode\",\"type\":\"int\"},{\"name\":\"minorCode\",\"type\":\"int\"},{\"name\":\"args\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}]},{\"name\":\"score\",\"type\":\"float\"},{\"name\":\"reprUrl\",\"type\":[\"null\",\"string\"]},{\"name\":\"batchId\",\"type\":[\"null\",\"string\"]},{\"name\":\"headers\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"outlinks\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"inlinks\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"markers\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"metadata\",\"type\":{\"type\":\"map\",\"values\":\"bytes\"}}]}");
  public org.apache.avro.util.Utf8 baseUrl;
  public int status;
  public long fetchTime;
  public long prevFetchTime;
  public int fetchInterval;
  public int retriesSinceFetch;
  public long modifiedTime;
  public long prevModifiedTime;
  public org.apache.nutch.storage.ProtocolStatus protocolStatus;
  public java.nio.ByteBuffer content;
  public org.apache.avro.util.Utf8 contentType;
  public java.nio.ByteBuffer prevSignature;
  public java.nio.ByteBuffer signature;
  public org.apache.avro.util.Utf8 title;
  public org.apache.avro.util.Utf8 text;
  public org.apache.nutch.storage.ParseStatus parseStatus;
  public float score;
  public org.apache.avro.util.Utf8 reprUrl;
  public org.apache.avro.util.Utf8 batchId;
  public java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8> headers;
  public java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8> outlinks;
  public java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8> inlinks;
  public java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8> markers;
  public java.util.Map<org.apache.avro.util.Utf8,java.nio.ByteBuffer> metadata;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return baseUrl;
    case 1: return status;
    case 2: return fetchTime;
    case 3: return prevFetchTime;
    case 4: return fetchInterval;
    case 5: return retriesSinceFetch;
    case 6: return modifiedTime;
    case 7: return prevModifiedTime;
    case 8: return protocolStatus;
    case 9: return content;
    case 10: return contentType;
    case 11: return prevSignature;
    case 12: return signature;
    case 13: return title;
    case 14: return text;
    case 15: return parseStatus;
    case 16: return score;
    case 17: return reprUrl;
    case 18: return batchId;
    case 19: return headers;
    case 20: return outlinks;
    case 21: return inlinks;
    case 22: return markers;
    case 23: return metadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: baseUrl = (org.apache.avro.util.Utf8)value$; break;
    case 1: status = (java.lang.Integer)value$; break;
    case 2: fetchTime = (java.lang.Long)value$; break;
    case 3: prevFetchTime = (java.lang.Long)value$; break;
    case 4: fetchInterval = (java.lang.Integer)value$; break;
    case 5: retriesSinceFetch = (java.lang.Integer)value$; break;
    case 6: modifiedTime = (java.lang.Long)value$; break;
    case 7: prevModifiedTime = (java.lang.Long)value$; break;
    case 8: protocolStatus = (org.apache.nutch.storage.ProtocolStatus)value$; break;
    case 9: content = (java.nio.ByteBuffer)value$; break;
    case 10: contentType = (org.apache.avro.util.Utf8)value$; break;
    case 11: prevSignature = (java.nio.ByteBuffer)value$; break;
    case 12: signature = (java.nio.ByteBuffer)value$; break;
    case 13: title = (org.apache.avro.util.Utf8)value$; break;
    case 14: text = (org.apache.avro.util.Utf8)value$; break;
    case 15: parseStatus = (org.apache.nutch.storage.ParseStatus)value$; break;
    case 16: score = (java.lang.Float)value$; break;
    case 17: reprUrl = (org.apache.avro.util.Utf8)value$; break;
    case 18: batchId = (org.apache.avro.util.Utf8)value$; break;
    case 19: headers = (java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8>)value$; break;
    case 20: outlinks = (java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8>)value$; break;
    case 21: inlinks = (java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8>)value$; break;
    case 22: markers = (java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.util.Utf8>)value$; break;
    case 23: metadata = (java.util.Map<org.apache.avro.util.Utf8,java.nio.ByteBuffer>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}

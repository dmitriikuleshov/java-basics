
# Java's IO is build upon streams
IO stream - an abstraction that either produces or consumes information. A stream is linked to a physical device by the java IO system. All streams behave in the same manner. For example, the same methods in IO class that you use to write to the console can also be used to write to a disk file.

Java implements IO streams within class hierarchies in `java.io` package.

1. Byte streams handle IO of bytes.

2. Character streams handle IO of characters (use Unicode)

# The byte stream classes

`InputStream` defines the characteristic common to byte input stream
`OutputStream` describes the behavior of byte output stream

![ByteStreamsTable](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/ByteStreamsTable.png)


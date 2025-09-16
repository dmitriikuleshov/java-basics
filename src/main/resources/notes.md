
# Java's IO is build upon streams
IO stream - an abstraction that either produces or consumes information. A stream is linked to a physical device by the java IO system. All streams behave in the same manner. For example, the same methods in IO class that you use to write to the console can also be used to write to a disk file.

Java implements IO streams within class hierarchies in `java.io` package.

1. Byte streams handle IO of bytes.

2. Character streams handle IO of characters (use Unicode)

# The byte stream classes

`InputStream` defines the characteristic common to byte input stream
`OutputStream` describes the behavior of byte output stream

![ByteStreamsTable](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/ByteStreamsTable.png)

# The character stream classes

Abstract classes on top of their own hierarchies:

 - `Reader` is used for input
 - `Writer` is used for output

![CharacterStreamsTable](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/CharacterStreamsTable.png)

# The Predefined Streams

`System` from `java.lang` package contains predefined stream variables:

- `in`, `out`, `err`

these fields are declared as `public static final` within System


`InputStream System.in` refers to standard input (keyboard by default)

`PrintStream System.out` refers to the standard output stream (console by default)

`PrintStream System.err` refers to the standard error stream (console by default)

All three are byte streams, even though they are typically used to R/W characters from and to the console (they are the part of the original specification of Java, which did not include character streams)


# Byte streams' methods

`InputStream` methods:

![InputStreamMethods](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/InputStreamMethods.png)
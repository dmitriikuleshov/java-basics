
# Java's IO is build upon streams
IO stream - an abstraction that either produces or consumes information. A stream is linked to a physical device by the java IO system. All streams behave in the same manner. For example, the same methods in IO class that you use to write to the console can also be used to write to a disk file.

Java implements IO streams within class hierarchies in `java.io` package.

1. Byte streams handle IO of bytes.

2. Character streams handle IO of characters (use Unicode)

## The byte stream classes

`InputStream` defines the characteristic common to byte input stream
`OutputStream` describes the behavior of byte output stream

![ByteStreamsTable](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/io/ByteStreamsTable.png)

## The character stream classes

Abstract classes on top of their own hierarchies:

 - `Reader` is used for input
 - `Writer` is used for output

![CharacterStreamsTable](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/io/CharacterStreamsTable.png)

## The Predefined Streams

`System` from `java.lang` package contains predefined stream variables:

- `in`, `out`, `err`

these fields are declared as `public static final` within System


`InputStream System.in` refers to standard input (keyboard by default)

`PrintStream System.out` refers to the standard output stream (console by default)

`PrintStream System.err` refers to the standard error stream (console by default)

All three are byte streams, even though they are typically used to R/W characters from and to the console (they are the part of the original specification of Java, which did not include character streams)


## Byte streams' methods

`InputStream` methods:

![InputStreamMethods](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/io/InputStreamMethods.png)

`OutputStream` methods:

![OutputStreamMethods](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/io/OutputStreamMethods.png)

## Reading console input using byte stream (System.in)

`InputStream System.in` has three read methods:

- `int read() throws IOException` read a single character
- `int read(byte[] data) throws IOException` read bytes from the input stream into data until either the array is full, the end of the stream is reached, or an error occurs.
- `int read(byte[] int start, int max) throws IOException` reads input into data beginning at the location specified by start. Up to max bytes are stored.

returns:

- `int` number of bytes read, or 1 when attempt is made to read at the end of the stream.

## Writing console output (System.out)

`PrintStream extends OutputStream`

Using `PrintStream System.out` it is possible to use `print()` and `println()` methods to write into console. It is also possible to use `write()` method of `OutputStream` to write into console.

`printf()` and `format()` are used to format data that you output.

## R/W files using byte streams

Inputting from a File:

`FileInputStream`

`FileInputStream(String fileName) throws FileNotFoundException`

`int rerad() throws FileNotFoundException` to read a single byte from a file

`void close() throws IOException` to close a file

Writing a File:

`FileOutputStream(String fileName) throws FileNotFoundException` - any preexisting file the same name is destroyed

`FileOuptutStream(String fileName, boolean append) throws FileNotFoundException` - if append is true, output is append to the end of the file. Otherwise, the file is overwritten.

`void write(int byteval) throws IOException` - writes `byteval` bytes to the file

`void close() throws IOException` - close file


## Try-with-resources

`try-with-resources` can be used since JDK7, and it is also possible for the resource specification of the try to consist of a variable that has been declared initialized earlier in the program. This variable must be effectively final: it has not been assigned a new value after being given its initial value.

When a `try` block executes it is possible that an exception inside the try block will lead to another exception that occurs when the resource is closed in a `finally` clause.

In the case of normal `try` statement, the original exception is lost, being preempted by the second exception.
However, with a `try-with-resources` statement, the second exception is *suppressed*.
It is not, however, lost. Instead, it is added to the list of suppressed exceptions associated with the first exception.
This list can be obtained by use of the `getSuppressed()` method defined by `Throwable`.

## Reading and writing binary data

It is possible to create a file that contains `ints`, `doubles`, `shorts`.

`DataInputStream` and `DataOutputStream` are used to read and write binary values of the Java primitive types

`DataOutputStream` implements `DataOutput` interface, which provides methods that write all of Java's primitive types to a file.

Data is written using its internal, binary format.

Each method can throw `IOException`

![DataOutputStreamMethods](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/io/DataOutputStream.png)

`DataOutputStream(OutputStream outputStream)` outputStream is a stream to which data is written, e.g. FileOutputStream to write to a file.

![DataInputStreamMethods](https://github.com/dmitriikuleshov/java-basics/blob/main/src/main/resources/static/images/io/DataInputStream.png)

`DataInputStream` implements `DataInput` interface, which provides methods for reading all of Java's primitive types.

`DataInputStream(InputStream inputStream)`, inputStream is the stream that is linked to the instance of DataInputStream being created. To read input from a file, you can use `FileInputStream` object.

# Random-Access Files

`RandomAccessFile` is not derived from `InputStream` or `OutputStream`

but it implements interfaces `DataInput` and `DataOutput` and supports positioning request - position a file pointer within the file.

`RandomAccessPointer(String fileName, String access) throws FileNotFoundException` - access can be 'r', 'w', 'rw', 'rws', 'rwd' last two ensure (for local devices) that changes to the file are immediately written to the physical device.

`void seek(long newPos) throws IOException` - set file pointer position

# Using Java's Character-Based Streams
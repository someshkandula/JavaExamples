# Core Java Examples

#### Concepts

#### Java Serialization

What is serialization

To transfer object 1 from JVM1 to JVM2 then we do serialization.

 JVM1(Serialization)
 
 Object code to bytecode and transfer object over network.
 
 Why do we need serialization?
 Communication
 Persistence - store in file / db (state of the object)
 Deep copy ( Cloning process is made simple by serialization process)
 Caching - The time consumed in building the object is more than deserialize it.
 cross JVM Synchronization - different JVM
 
 How do we serialize an object
 To serialize an object the parent class should implement either of the following interfaces:
 
 java.io.Serializable
 java.io.Externalizable
 
 
Disadvantages:
Objects while deserialization becomes brittle
Serialization results in the failure in the initialization of transient variables resulting in a variation to the standard Java Flow.
Serialization is inefficent in terms of memory utilization
Serialization does not offer any transition control mechanism per every SE.
Serialization procedure fails to offer fine-grained control to access objects.

# Arquillian-on-Wildfly-8.2.0.Final
This project demonstrates how to set up a Maven project in order to:
- have Maven automatically download and unpack Wildfly 8.2.0.Final into target/wildfly-8.2.0.Final
- have Arquillian use target/wildfly-8.2.0.Final as a "managed" container and run a single Arquillian test on it.

There are two suggested uses of this repository:
 1. Clone it and use it as basis for experiments with Java EE and Arquillian on Wildfly 8.2.0.Final. To get started, run the following commands (except the '$'s) in a terminal window:

        $ git clone https://github.com/mikost/Arquillian-on-Wildfly-8.2.0.Final
        $ cd Arquillian-on-Wildfly-8.2.0.Final
        $ mvn test

 2. Browse through the commit history as a tutorial on how to set up this kind of Maven project. 
A very convenient way to do that is through the "Commits" tab above (in Github).
I have made efforts to produce a "nice" (pedagogical) commit history, with appropriately commented commits in (some kind of) logical order.


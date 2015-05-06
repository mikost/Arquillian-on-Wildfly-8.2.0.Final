# Arquillian-on-Wildfly-8.2.0.Final
This project demonstrates how to set up a Maven project in order to:
- have Maven automatically download and unpack Wildfly 8.2.0.Final into target/wildfly-8.2.0.Final
- have Arquillian use target/wildfly-8.2.0.Final as a "managed" container and run a single Arquillian test on it.

There are two suggested uses of this repository:
 1. Fork/Clone it and use as basis for experiments with Java EE and Arquillian on Wildfly 8.2.0.Final.
 2. Read through the commit history as a tutorial on how to set up this kind of Maven project. 
I have made efforts to produce a "nice" commit history, with appropriate comments and commits in (some kind of)
logical order.


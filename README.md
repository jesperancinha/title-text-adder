# Note manager WebApp

*"This web applications was formerly known as title-text-adder"*

## Building notes

### Use docker for your installation:

```
$ docker build -t eg_postgresql .

$ docker run --rm -P -p 5432:5432 --name pg_test eg_postgresql

$ mvn install

```

Solr is required to be running. You will need to configure your collection and how you want it to be attached to your databas

> MacOS

```
$ brew install solr
```

or
> Linux

* You need to manually install it: *See: http://www.apache.org/dyn/closer.lua/lucene/solr/5.5.0*


> Starting
* $ solr start

(*see more details in note-manager-api*)

> Location

* http://localhost:8983/solr

Use bower in the note-manager-web folder:

```
../note-manager-web$ bower install
```

This application is using JETTY in the Maven POM files. (NOTE: It was already been tested in Tomcat7)


```
NOTE: The extra folder for notemanagercol is part of Solr configuration.
This is used for elastic search purposes
```

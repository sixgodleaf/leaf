#!/bin/sh
print_usage ()
{
  echo "Usage: sh run.sh COMMAND"
  exit 1
}

if [ $# = 0 ] || [ $1 = "help" ]; then
  print_usage
fi

COMMAND=$1
shift

if [ "$JAVA_HOME" = "" ]; then
  echo "Error: JAVA_HOME is not set."
  exit 1
fi


JAVA=${JAVA_HOME}/bin/java
HEAP_OPTS="-Xmx10000m"

JAR_NAME=`ls |grep jar|grep -v original-|grep dependencies`

CLASSPATH=${CLASSPATH}:${JAVA_HOME}/lib/tools.jar
CLASSPATH=${CLASSPATH}:conf
CLASSPATH=${CLASSPATH}:${JAR_NAME}
for f in lib/*.jar; do
  CLASSPATH=${CLASSPATH}:${f};
done

params=$@

if [ "$COMMAND" = "Hadoop" ]; then
    CLASS=Hadoop
else
    CLASS=${COMMAND}
fi

"$JAVA" -Djava.io.tmpdir=/var/spark/tmp -Djava.awt.headless=true ${HEAP_OPTS} -classpath "$CLASSPATH" ${CLASS} ${params}
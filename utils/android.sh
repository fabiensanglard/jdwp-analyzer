 #!/bin/bash
 PACKAGE="f.b"
 ACTIVITY="$PACKAGE"/"$PACKAGE"".MainActivity"
 adb shell am start -D  -n "$ACTIVITY"
 JDWP=$(adb shell pidof "$PACKAGE")
 adb forward tcp:8000 jdwp:"$JDWP"
 jdb -sourcepath app/src/main/java -attach localhost:8000

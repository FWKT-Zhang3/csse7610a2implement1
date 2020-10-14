/usr/lib/jvm/java-8-openjdk/bin/java -javaagent:/home/max/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/lib/idea_rt.jar=45441:/home/max/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/rt.jar:/home/max/csse7610/A2/csse7610a2implement1/out/production/csse7610a2implement1 CallCentre1

| W 1 -> Q A | W 2 -> Q B | W 3 -> Q C |
| ---------- | ---------- | ---------- |
| 1#5#       | 0?         | 2#3        |
|            | 0          | 4          |
|            |            |            |
|            |            |            |
|            |            |            |

Worker #1 has chosen Queue A
Worker #2 has chosen Queue B
Worker #3 has chosen Queue C
Call #1 has been appended to Queue A
Call #2 has been appended to Queue C
Worker #1 has answered call #1
Worker #3 has answered call #2
Call #3 has been appended to Queue C
Call #4 has been appended to Queue C
Worker #2 has answered call #0
Worker 1 Buffer{pool=[Call{id=0}, Call{id=5}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=1, id=0}
Call #5 has been appended to Queue A
Worker #1 has answered call #5
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=0, out=1, id=1}
Worker #2 has answered call #0
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=0, out=2, id=1}
Worker 3 Buffer{pool=[Call{id=0}, Call{id=3}, Call{id=4}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=1, id=2}
Worker 1 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=6}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=2, id=0}
Call #6 has been appended to Queue A
Worker #2 has answered call #0
Call #7 has been appended to Queue C
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=0, out=3, id=1}
Call #8 has been appended to Queue B
Worker #3 has answered call #3
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=4}, Call{id=7}, Call{id=0}], poolSize=5, in=4, out=2, id=2}
Call #9 has been appended to Queue B
Worker #1 has answered call #6
Call #10 has been appended to Queue B
Worker #2 has answered call #0
Call #11 has been appended to Queue B
Worker #3 has answered call #4
Worker 1 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=3, id=0}
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=7}, Call{id=0}], poolSize=5, in=4, out=3, id=2}
Call #12 has been appended to Queue A
Worker 2 Buffer{pool=[Call{id=8}, Call{id=9}, Call{id=10}, Call{id=11}, Call{id=0}], poolSize=5, in=4, out=4, id=1}
Call #13 has been appended to Queue A
Worker #3 has answered call #7
Worker #1 has answered call #12
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=4, out=4, id=2}
Call #14 has been appended to Queue A
Worker #2 has answered call #0
Call #15 has been appended to Queue C
Worker #3 has answered call #0
Worker 3 Buffer{pool=[Call{id=16}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=15}], poolSize=5, in=1, out=0, id=2}
Worker #3 has answered call #16
Worker 1 Buffer{pool=[Call{id=14}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=13}], poolSize=5, in=1, out=4, id=0}
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=15}], poolSize=5, in=1, out=1, id=2}
Call #16 has been appended to Queue C
Worker 2 Buffer{pool=[Call{id=8}, Call{id=9}, Call{id=10}, Call{id=11}, Call{id=0}], poolSize=5, in=4, out=0, id=1}
Call #17 has been appended to Queue C
Worker #3 has answered call #17
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=18}, Call{id=0}, Call{id=15}], poolSize=5, in=3, out=2, id=2}
Worker #1 has answered call #13
Call #18 has been appended to Queue C
Worker 1 Buffer{pool=[Call{id=14}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=1, out=0, id=0}
Call #19 has been appended to Queue C
Worker #2 has answered call #8
Worker #3 has answered call #18
Call #20 has been appended to Queue C
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=19}, Call{id=20}], poolSize=5, in=0, out=3, id=2}
Worker 2 Buffer{pool=[Call{id=0}, Call{id=9}, Call{id=10}, Call{id=11}, Call{id=0}], poolSize=5, in=4, out=1, id=1}
Call #21 has been appended to Queue C
Worker #1 has answered call #14
Call #22 has been appended to Queue C
Worker #3 has answered call #19
Call #23 has been appended to Queue C
Worker #2 has answered call #9
Worker 1 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=1, out=1, id=0}
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=10}, Call{id=11}, Call{id=0}], poolSize=5, in=4, out=2, id=1}
Call #24 has been appended to Queue C
Worker 3 Buffer{pool=[Call{id=21}, Call{id=22}, Call{id=23}, Call{id=0}, Call{id=20}], poolSize=5, in=3, out=4, id=2}
Call #25 has been appended to Queue B
Worker #2 has answered call #10
Worker #1 has answered call #0
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=11}, Call{id=25}], poolSize=5, in=0, out=3, id=1}
Worker #3 has answered call #20
Worker 1 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=1, out=2, id=0}
Worker 3 Buffer{pool=[Call{id=21}, Call{id=22}, Call{id=23}, Call{id=24}, Call{id=0}], poolSize=5, in=4, out=0, id=2}

Process finished with exit code 130 (interrupted by signal 2: SIGINT)

<br>

***

<br>

/usr/lib/jvm/java-8-openjdk/bin/java -javaagent:/home/max/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/lib/idea_rt.jar=40119:/home/max/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/rt.jar:/home/max/csse7610/A2/csse7610a2implement1/out/production/csse7610a2implement1 CallCentre1
Worker #1 has chosen Queue A
Worker #2 has chosen Queue B
Worker #3 has chosen Queue C
Call #1 has been appended to Queue A
Call #2 has been appended to Queue A
Call #3 has been appended to Queue A
Call #4 has been appended to Queue A
Call #5 has been appended to Queue A
Call #6 has been appended to Queue B
Call #7 has been appended to Queue B
Call #8 has been appended to Queue B
Worker #2 has answered call #6
Call #9 has been appended to Queue C
Worker #3 has answered call #9
Worker 2 Buffer{pool=[Call{id=0}, Call{id=7}, Call{id=8}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=1, id=1}
Call #10 has been appended to Queue C
Worker 3 Buffer{pool=[Call{id=0}, Call{id=10}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=1, id=2}
Worker #2 has answered call #7
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=8}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=2, id=1}
Call #11 has been appended to Queue C
Worker #3 has answered call #10
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=11}, Call{id=12}, Call{id=0}], poolSize=5, in=4, out=2, id=2}
Call #12 has been appended to Queue C
Worker #2 has answered call #8
Call #13 has been appended to Queue B
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=13}, Call{id=0}], poolSize=5, in=4, out=3, id=1}
Worker #3 has answered call #11
Call #14 has been appended to Queue B
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=12}, Call{id=0}], poolSize=5, in=4, out=3, id=2}
Call #15 has been appended to Queue C
Worker #2 has answered call #13
Worker #3 has answered call #12
Call #16 has been appended to Queue C
Worker 3 Buffer{pool=[Call{id=16}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=15}], poolSize=5, in=1, out=4, id=2}
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=14}], poolSize=5, in=0, out=4, id=1}
Exception in thread "Thread-3" java.util.NoSuchElementException
	at java.util.LinkedList.removeFirst(LinkedList.java:270)
	at java.util.LinkedList.pop(LinkedList.java:801)
	at Sem.signalC(Sem.java:55)
	at Sem.signalS(Sem.java:23)
	at Client.run(Client.java:45)

Process finished with exit code 130 (interrupted by signal 2: SIGINT)

<br>

***

<br>

/usr/lib/jvm/java-8-openjdk/bin/java -javaagent:/home/max/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/lib/idea_rt.jar=35011:/home/max/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/rt.jar:/home/max/csse7610/A2/csse7610a2implement1/out/production/csse7610a2implement1 CallCentre1
Worker #1 has chosen Queue A
Worker #2 has chosen Queue B
Worker #3 has chosen Queue C
Call #1 has been appended to Queue C
[Thread[Thread-0,5,main], Thread[Thread-1,5,main], Thread[Thread-2,5,main]]
Call #2 has been appended to Queue C
[Thread[Thread-1,5,main], Thread[Thread-2,5,main], Thread[Thread-0,5,main]]
Call #3 has been appended to Queue C
[Thread[Thread-2,5,main], Thread[Thread-0,5,main], Thread[Thread-1,5,main]]
Call #4 has been appended to Queue C
Worker #3 has answered call #1
[Thread[Thread-0,5,main], Thread[Thread-1,5,main]]
Call #5 has been appended to Queue C
[Thread[Thread-1,5,main], Thread[Thread-0,5,main]]
Call #6 has been appended to Queue B
[Thread[Thread-0,5,main]]
Worker #2 has answered call #6
Worker 2 Buffer{pool=[Call{id=0}, Call{id=7}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=1, id=1}
Worker 3 Buffer{pool=[Call{id=0}, Call{id=2}, Call{id=3}, Call{id=4}, Call{id=0}], poolSize=5, in=4, out=1, id=2}
Call #7 has been appended to Queue B
[Thread[Thread-0,5,main], Thread[Thread-1,5,main], Thread[Thread-2,5,main]]
Call #8 has been appended to Queue B
[Thread[Thread-1,5,main], Thread[Thread-2,5,main], Thread[Thread-0,5,main]]
Call #9 has been appended to Queue B
Worker #2 has answered call #7
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=8}, Call{id=9}, Call{id=0}], poolSize=5, in=4, out=2, id=1}
[Thread[Thread-2,5,main], Thread[Thread-0,5,main]]
Worker #3 has answered call #2
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=3}, Call{id=4}, Call{id=5}], poolSize=5, in=0, out=2, id=2}
Call #10 has been appended to Queue B
[Thread[Thread-0,5,main], Thread[Thread-1,5,main], Thread[Thread-2,5,main]]
Call #11 has been appended to Queue B
[Thread[Thread-1,5,main], Thread[Thread-2,5,main], Thread[Thread-0,5,main]]
Call #12 has been appended to Queue B
[Thread[Thread-2,5,main], Thread[Thread-0,5,main]]
Worker #2 has answered call #8
Call #13 has been appended to Queue B
Worker 2 Buffer{pool=[Call{id=11}, Call{id=12}, Call{id=13}, Call{id=9}, Call{id=10}], poolSize=5, in=3, out=3, id=1}
[Thread[Thread-0,5,main]]
Worker #3 has answered call #3
Call #14 has been appended to Queue A
[Thread[Thread-1,5,main], Thread[Thread-0,5,main]]
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=4}, Call{id=5}], poolSize=5, in=0, out=3, id=2}
Call #15 has been appended to Queue A
Worker #2 has answered call #9
[Thread[Thread-0,5,main], Thread[Thread-2,5,main]]
Worker 2 Buffer{pool=[Call{id=11}, Call{id=12}, Call{id=13}, Call{id=0}, Call{id=10}], poolSize=5, in=3, out=4, id=1}
Call #16 has been appended to Queue B
[Thread[Thread-2,5,main], Thread[Thread-1,5,main]]
Worker #1 has answered call #14
Worker #3 has answered call #4
Worker 1 Buffer{pool=[Call{id=0}, Call{id=15}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=1, id=0}
Call #17 has been appended to Queue C
Worker 3 Buffer{pool=[Call{id=17}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=5}], poolSize=5, in=1, out=4, id=2}
[Thread[Thread-1,5,main], Thread[Thread-0,5,main]]
Call #18 has been appended to Queue A
Worker #2 has answered call #10
[Thread[Thread-0,5,main], Thread[Thread-2,5,main]]
Worker 2 Buffer{pool=[Call{id=11}, Call{id=12}, Call{id=13}, Call{id=16}, Call{id=0}], poolSize=5, in=4, out=0, id=1}
Call #19 has been appended to Queue C
[Thread[Thread-2,5,main], Thread[Thread-1,5,main]]
Worker #1 has answered call #15
Call #20 has been appended to Queue C
Worker #3 has answered call #5
[Thread[Thread-1,5,main]]
Worker 1 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=18}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=2, id=0}
Call #21 has been appended to Queue C
[Thread[Thread-0,5,main]]
Worker #1 has answered call #18
Worker 1 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=3, id=0}
Worker #2 has answered call #11
Worker 3 Buffer{pool=[Call{id=17}, Call{id=19}, Call{id=20}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=0, id=2}
Worker 2 Buffer{pool=[Call{id=0}, Call{id=12}, Call{id=13}, Call{id=16}, Call{id=0}], poolSize=5, in=4, out=1, id=1}
Call #22 has been appended to Queue C
[Thread[Thread-0,5,main], Thread[Thread-2,5,main], Thread[Thread-1,5,main]]
Call #23 has been appended to Queue B
[Thread[Thread-2,5,main], Thread[Thread-1,5,main], Thread[Thread-0,5,main]]
Worker #3 has answered call #17
Call #24 has been appended to Queue C
Worker 3 Buffer{pool=[Call{id=24}, Call{id=19}, Call{id=20}, Call{id=21}, Call{id=22}], poolSize=5, in=1, out=1, id=2}
[Thread[Thread-1,5,main], Thread[Thread-0,5,main]]
Call #25 has been appended to Queue B
[Thread[Thread-0,5,main], Thread[Thread-2,5,main]]
Worker #2 has answered call #12
Worker 2 Buffer{pool=[Call{id=25}, Call{id=0}, Call{id=13}, Call{id=16}, Call{id=23}], poolSize=5, in=1, out=2, id=1}

Process finished with exit code 130 (interrupted by signal 2: SIGINT)

***

/usr/lib/jvm/java-8-openjdk/bin/java -javaagent:/home/max/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/lib/idea_rt.jar=44885:/home/max/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk/jre/lib/rt.jar:/home/max/csse7610/A2/csse7610a2implement1/out/production/csse7610a2implement1 CallCentre1
Worker #1 has chosen Queue A
Worker #2 has chosen Queue B
Worker #3 has chosen Queue C
Call #1 has been appended to Queue B
[Thread[Thread-1,5,main], Thread[Thread-2,5,main], Thread[Thread-3,5,main], null]
Call #2 has been appended to Queue B
Worker #2 has answered call #1
[Thread[Thread-2,5,main], Thread[Thread-3,5,main], null]
Call #3 has been appended to Queue B
Worker 2 Buffer{pool=[Call{id=0}, Call{id=2}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=1, id=1}
[Thread[Thread-3,5,main], Thread[Thread-2,5,main], null]
Call #4 has been appended to Queue A
[Thread[Thread-3,5,main]]
[Thread[Thread-2,5,main], Thread[Thread-1,5,main], null]
Worker #1 has stolen call #1 from Queue A
[Thread[Thread-4,5,main]]
Call #5 has been appended to Queue A
[Thread[Thread-1,5,main], Thread[Thread-2,5,main], Thread[Thread-3,5,main], null]
Worker #2 has answered call #2
Call #6 has been appended to Queue A
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=3}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=2, id=1}
[Thread[Thread-2,5,main], Thread[Thread-3,5,main], null]
Call #7 has been appended to Queue A
[Thread[Thread-3,5,main], Thread[Thread-1,5,main], Thread[Thread-2,5,main], null]
Call #8 has been appended to Queue C
[Thread[Thread-3,5,main]]
[Thread[Thread-1,5,main], Thread[Thread-2,5,main], null]
Worker #1 has stolen call #1 from Queue A
Worker #2 has answered call #3
[Thread[Thread-4,5,main]]
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=3, id=1}
Call #9 has been appended to Queue C
[Thread[Thread-2,5,main], Thread[Thread-3,5,main], Thread[Thread-1,5,main], null]
Worker #3 has answered call #8
Call #10 has been appended to Queue C
Worker 3 Buffer{pool=[Call{id=0}, Call{id=9}, Call{id=10}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=1, id=2}
[Thread[Thread-3,5,main], Thread[Thread-1,5,main], null]
Call #11 has been appended to Queue B
[Thread[Thread-3,5,main]]
[Thread[Thread-1,5,main], Thread[Thread-2,5,main], null]
Worker #1 has stolen call #1 from Queue A
Worker #2 has answered call #11
[Thread[Thread-4,5,main]]
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=4, out=4, id=1}
Call #12 has been appended to Queue B
[Thread[Thread-2,5,main], Thread[Thread-3,5,main], Thread[Thread-1,5,main], null]
Call #13 has been appended to Queue B
Worker #3 has answered call #9
[Thread[Thread-3,5,main], Thread[Thread-1,5,main], null]
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=10}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=2, id=2}
Call #14 has been appended to Queue B
[Thread[Thread-3,5,main]]
[Thread[Thread-1,5,main], Thread[Thread-2,5,main], null]
Worker #1 has stolen call #1 from Queue A
Worker #2 has answered call #12
[Thread[Thread-4,5,main]]
Worker 2 Buffer{pool=[Call{id=13}, Call{id=14}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=0, id=1}
Call #15 has been appended to Queue C
[Thread[Thread-2,5,main], Thread[Thread-1,5,main], null]
Worker #3 has answered call #10
Call #16 has been appended to Queue B
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=15}, Call{id=0}], poolSize=5, in=4, out=3, id=2}
[Thread[Thread-1,5,main], null]
Worker #2 has answered call #13
Call #17 has been appended to Queue C
Worker 2 Buffer{pool=[Call{id=0}, Call{id=14}, Call{id=16}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=1, id=1}
[Thread[Thread-2,5,main], null]
Call #18 has been appended to Queue C
Worker #3 has answered call #15
[Thread[Thread-1,5,main], null]
Worker 3 Buffer{pool=[Call{id=18}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=17}], poolSize=5, in=1, out=4, id=2}
Call #19 has been appended to Queue C
Worker #2 has answered call #14
[Thread[Thread-2,5,main], null]
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=16}, Call{id=0}, Call{id=0}], poolSize=5, in=3, out=2, id=1}
Call #20 has been appended to Queue A
Worker #3 has answered call #17
[Thread[Thread-1,5,main], null]
Worker 3 Buffer{pool=[Call{id=18}, Call{id=19}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=0, id=2}
Call #21 has been appended to Queue B
Worker #2 has answered call #16
[Thread[Thread-2,5,main], null]
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=21}, Call{id=0}], poolSize=5, in=4, out=3, id=1}
Call #22 has been appended to Queue B
Worker #3 has answered call #18
[Thread[Thread-1,5,main], null]
Worker 3 Buffer{pool=[Call{id=0}, Call{id=19}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=1, id=2}
Call #23 has been appended to Queue A
Worker #2 has answered call #21
[Thread[Thread-2,5,main], null]
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=22}], poolSize=5, in=0, out=4, id=1}
Call #24 has been appended to Queue A
Worker #3 has answered call #19
[Thread[Thread-1,5,main], null]
Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=2, id=2}
Call #25 has been appended to Queue A
Worker #2 has answered call #22
[Thread[Thread-2,5,main], null]
Worker 2 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=0, out=0, id=1}
[Thread[Thread-3,5,main]]

Process finished with exit code 130 (interrupted by signal 2: SIGINT)
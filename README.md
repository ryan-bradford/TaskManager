# TaskManager
An external library that is intended to disperse tasks across Threads in an efficient way.

The library opens up a set amount of threads (either equal to the number of CPU cores or a number specified by the user), 
and each of these threads takes a list of processes to run. The engine tries to disperse the load equally across the threads,
except the only way it determines the load of a process is by a user entered a number. Each task holds a wait, measured in 
milliseconds. The threads measure the wait based on one millisecond long thread.sleeps and it checks how long since the last 
run of each task. 

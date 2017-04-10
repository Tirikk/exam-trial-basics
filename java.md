# TRIAL EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-4. Complete the following tasks: (~180 mins)

- [Seconds](seconds/Seconds.java)
- [Count A-s](countas/CountAs.java)
- [Pirates](pirates/Pirates.java)
- [Box](box/Box.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 5. Question time! (~15 mins) [2p]

### How can you generate a random number? [2p]
#### Your answer:
I can use the Math.random function, and multiply it by the upper bound of the range I want my number to be in.
Or I can import the Random class, and use the .nextInt() function of it.
If I need a random number with different digits (4 of them, for example), I can create a list, fill it with numbers from 0 to 9,
shuffle that list with the collections.shuffle() function, then iterate through the first 4 elements of the list, concat them to a string,
and cast that string to an Integer.

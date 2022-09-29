﻿# CS145_CritterFightSimulation
This project is one of the week long assignment in my CS 145 (Data structure class). I learned about OOP and polymorphism in programming language. I also learned a little bit of GUI programming in Java. For full information about the project, refer to: "\Programming Assignment - CS145 - Critters.pdf" 

Creating a fighting between different critters: Bear, Giant, Lion, etc... Critters will wander around the frame and try to infect each others
Critter properties: 
1. Bear: bear has 50% to be a polar or normal bear they will:
- always infect if an enemy is in front
- otherwise hop if possible
- otherwise turn leff
2. Lion:
- Randomly picks one of four colors (Color.RED, Color.GREEN, Color.YELLOW, 
Color.BLUE) and uses that color for three moves, then randomly picks one of 
those colors again for the next three moves, then randomly picks another one of 
those colors for the next three moves, and so on.
- Make sure the Lion does not pick the same color twice in a row. So really 
there are only three choices each round after the first. 
- always infect if an enemy is in front
- otherwise if a wall is in front or to the right, then turn left
- otherwise if a fellow Lion is in front, then turn right
- otherwise hop.
3. Giant: Color gray
- always infect if an enemy is in front
- otherwise hop if possible
- otherwise turn right.
4. Titan: is a subclass of Giant
 Color.BLACK
 When saying “fee” 
 COLOR.GRAY
 When saying “fie” or “fum”.
 Color.WHITE
 When saying “foe” 
 -It have the same pattern as a Giant, except instead of turning right, it 
should turn left.
5. Gator: Random properties
![image](https://user-images.githubusercontent.com/109646359/193097106-d5cb05ad-73e0-42e5-9089-17a8d6445bbc.png)


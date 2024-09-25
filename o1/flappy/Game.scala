package o1.flappy

import o1.*

class Game:
  val bug = Bug(BugStartingPos)
  val obstacle = Obstacle(ObstacleRadius)
  
  def timePasses() = 
    bug.fall()
    obstacle.approach()
    
  def activateBug() =
    bug.flap(Flap)
    
  def isLost =
    obstacle.touches(bug)
  
end Game

package o1.flappy

import o1.*

class Game:
  val bug = Bug(BugStartingPos)
  val obstacles = Vector(Obstacle(70), Obstacle(30), Obstacle(20))

  def timePasses() = 
    bug.fall()
    obstacles.foreach(_.approach())
    
  def activateBug() =
    bug.flap(Flap)
    
  def isLost =
    val obstacleTouches = obstacles.exists(_.touches(bug))
    !bug.isInBounds || obstacleTouches
    
end Game

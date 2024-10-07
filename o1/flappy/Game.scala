package o1.flappy

import o1.*

class Game:
  val bug = Bug(BugStartingPos)
  val obstacles = Vector(Obstacle(70), Obstacle(30), Obstacle(20))

  def timePasses() = 
    bug.fall()
    for obstacle <- obstacles do
      obstacle.approach()
    
  def activateBug() =
    bug.flap(Flap)
    
  def isLost =
    var obstacleTouches = false
    for obstacle <- obstacles do
        if obstacle.touches(bug) then
          obstacleTouches = true
    !bug.isInBounds || obstacleTouches
    
end Game
